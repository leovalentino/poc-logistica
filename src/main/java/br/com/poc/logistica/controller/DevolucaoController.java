package br.com.poc.logistica.controller;

import java.math.BigDecimal;
import java.util.Date;

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
import javax.ws.rs.core.Response;

import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;
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
	public Response pesquisarDevolucao(@QueryParam("numPedido") Integer numPedido, 
											    @QueryParam("dataPedidoMin") String dataPedidoMin,
											    @QueryParam("dataPedidoMax") String dataPedidoMax,
											    @QueryParam("valorPedidoMin") BigDecimal valorPedidoMin,
											    @QueryParam("valorPedidoMax") BigDecimal valorPedidoMax) {
		try {
			Date datePedidoMax = UtilDate.converterDataAngularParaJava(dataPedidoMax);
			Date datePedidoMin = UtilDate.converterDataAngularParaJava(dataPedidoMin);
			return Response.ok(
					servico.pesquisarDevolucao(numPedido, datePedidoMin, datePedidoMax, valorPedidoMin, valorPedidoMax))
					.build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/pesquisardevolucoesexterna")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarDevolucaoExterna(@QueryParam("numPedido") Integer numPedido, 
											    @QueryParam("dataPedidoMin") String dataPedidoMin,
											    @QueryParam("dataPedidoMax") String dataPedidoMax,
											    @QueryParam("valorPedidoMin") BigDecimal valorPedidoMin,
											    @QueryParam("valorPedidoMax") BigDecimal valorPedidoMax) {
		try {
			Date datePedidoMax = UtilDate.getStringToDate(dataPedidoMax, UtilDate.FORMATO_DD_MM_YYYY);
			Date datePedidoMin = UtilDate.getStringToDate(dataPedidoMin, UtilDate.FORMATO_DD_MM_YYYY);
			return Response.ok(
					servico.pesquisarDevolucao(numPedido, datePedidoMin, datePedidoMax, valorPedidoMin, valorPedidoMax))
					.build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		
    }
	
	@POST
	@Path("/incluirdevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(@Valid DevolucaoVO devolucaoVo) {
		try {
			Devolucao devolucao = Conversor.convertDevolucaoVoToEntity(devolucaoVo);
			servico.salvar(devolucao);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@PUT
	@Path("/alterardevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alterar(@Valid Devolucao devolucao) {		
		try {
			servico.alterar(devolucao);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@DELETE
	@Path("/excluirdevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("idDevolucao") Integer idDevolucao) {
		try {
			servico.excluir(idDevolucao);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/pesquisarpedidopornum")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarPedidoPorNum(@QueryParam("numPedido") Integer numPedido) {
		try {
			return Response.ok(servico.pesquisarPedidoPorNum(numPedido)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
