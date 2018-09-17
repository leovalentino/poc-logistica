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
import br.com.poc.logistica.service.EntregaServico;
import br.com.poc.logistica.service.UtilDate;

@Path("/entrega")
public class EntregaController {

	@EJB
	private EntregaServico servico;
	

	@GET
	@Path("/pesquisarentregas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Entrega> pesquisarEntregas(@QueryParam("numPedido") Integer numPedido,
										   @QueryParam("nomeTranportadora") Integer nomeTranportadora,
										   @QueryParam("dataPedido") String dataPedido,
										   @QueryParam("descProduto") String descProduto,
										   @QueryParam("descSituacaoEntrega") String descSituacaoEntrega,
										   @QueryParam("nomeCliente") String nomeCliente) {
		Date datePedido = converterDataPedidoParaDate(dataPedido);
		return servico.pesquisarEntregas(numPedido, nomeTranportadora, datePedido,
										 descProduto, descSituacaoEntrega, nomeCliente);
	}


	private Date converterDataPedidoParaDate(String dataPedido) {
		return StringUtils.isEmpty(dataPedido) ? null : UtilDate.getStringToDate(dataPedido, UtilDate.FORMATO_DD_MM_YYYY);
	}
	
}
