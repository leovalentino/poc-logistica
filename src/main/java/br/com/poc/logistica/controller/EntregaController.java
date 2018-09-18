package br.com.poc.logistica.controller;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import br.com.poc.logistica.model.Entrega;
import br.com.poc.logistica.model.SituacaoEntrega;
import br.com.poc.logistica.service.EntregaServico;
import br.com.poc.logistica.service.SituacaoEntregaServico;
import br.com.poc.logistica.service.UtilDate;

@Path("/entrega")
public class EntregaController {

	@EJB
	private EntregaServico servico;
	
	@EJB
	private SituacaoEntregaServico situacaoEntregaServico;

	@GET
	@Path("/pesquisarentregas")
	@Produces(MediaType.APPLICATION_JSON)
	public Resposta pesquisarEntregas(@QueryParam("numPedido") Integer numPedido,
										   @QueryParam("nomeTranportadora") Integer nomeTranportadora,
										   @QueryParam("dataPedido") String dataPedido,
										   @QueryParam("descProduto") String descProduto,
										   @QueryParam("descSituacaoEntrega") String descSituacaoEntrega,
										   @QueryParam("nomeCliente") String nomeCliente) {
		Resposta resposta = new Resposta();
		
		Date datePedido = converterDataPedidoParaDate(dataPedido);
		List<Entrega> listaEntregas = servico.pesquisarEntregas(numPedido, nomeTranportadora, datePedido,
										 descProduto, descSituacaoEntrega, nomeCliente);
		
		List<SituacaoEntrega> listaSituacao = situacaoEntregaServico.listarSituacaoEntrega();
		
		resposta.addListaObjeto(listaEntregas);
		resposta.addListaObjeto(listaSituacao);
		
		return resposta;
	}


	private Date converterDataPedidoParaDate(String dataPedido) {
		return StringUtils.isEmpty(dataPedido) ? null : UtilDate.getStringToDate(dataPedido, UtilDate.FORMATO_DD_MM_YYYY);
	}
	
}
