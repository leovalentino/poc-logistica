package br.com.poc.logistica.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;
import br.com.poc.logistica.model.PedidoVO;
import br.com.poc.logistica.service.interfaces.DevolucaoServico;
import br.com.poc.logistica.util.Conversor;
import br.com.poc.logistica.util.UtilDate;

@Path("/devolucao")
public class DevolucaoController {

	@EJB
	private DevolucaoServico servico;
	
	@GET
	@Path("/pesquisardevolucoes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DevolucaoVO> pesquisarDevolucao(@QueryParam("numPedido") Integer numPedido, 
											    @QueryParam("dataPedidoMin") String dataPedidoMin,
											    @QueryParam("dataPedidoMax") String dataPedidoMax,
											    @QueryParam("valorPedidoMin") BigDecimal valorPedidoMin,
											    @QueryParam("valorPedidoMax") BigDecimal valorPedidoMax) {
		Date datePedidoMax = UtilDate.converterDataAngularParaJava(dataPedidoMax);
		Date datePedidoMin = UtilDate.converterDataAngularParaJava(dataPedidoMin);
		return servico.pesquisarDevolucao(numPedido, datePedidoMax,datePedidoMin, valorPedidoMin, valorPedidoMax);
    }
	
	@POST
	@Path("/incluirdevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(@Valid DevolucaoVO devolucaoVo) {
		Devolucao devolucao = Conversor.convertDevolucaoVoToEntity(devolucaoVo);
		servico.salvar(devolucao);
	}
	
	@PUT
	@Path("/alterardevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterar(@Valid Devolucao devolucao) {		
		servico.alterar(devolucao);
	}
	
	@DELETE
	@Path("/excluirdevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@QueryParam("idDevolucao") Integer idDevolucao) {
		servico.excluir(idDevolucao);
	}
	
	@GET
	@Path("/pesquisarpedidopornum")
	@Produces(MediaType.APPLICATION_JSON)
	public PedidoVO pesquisarPedidoPorNum(@QueryParam("numPedido") Integer numPedido) {
		return servico.pesquisarPedidoPorNum(numPedido);
	}
	
}
