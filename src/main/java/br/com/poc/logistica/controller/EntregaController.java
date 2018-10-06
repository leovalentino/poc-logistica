package br.com.poc.logistica.controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.poc.logistica.service.interfaces.EntregaServico;
import br.com.poc.logistica.service.interfaces.SituacaoEntregaServico;
import br.com.poc.logistica.service.interfaces.TransportadoraServico;
import br.com.poc.logistica.util.UtilDate;

@Path("/entrega")
public class EntregaController {

	@EJB
	private EntregaServico entregaServico;
	
	@EJB
	private SituacaoEntregaServico situacaoEntregaServico;
	
	@EJB
	private TransportadoraServico transportadoraServico;

	@GET
	@Path("/pesquisarentregas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarEntregas(@QueryParam("numPedido") Integer numPedido,
										   @QueryParam("nomeTransportadora") String nomeTransportadora,
										   @QueryParam("dataPedido") String dataPedido,
										   @QueryParam("descProduto") String descProduto,
										   @QueryParam("descSituacaoEntrega") String descSituacaoEntrega,
										   @QueryParam("nomeCliente") String nomeCliente) {
		
		try {
			Date datePedido = UtilDate.converterDataAngularParaJava(dataPedido);
			return Response.ok(entregaServico.pesquisarEntregas(numPedido, nomeTransportadora, datePedido, descProduto,
					descSituacaoEntrega, nomeCliente)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}

	@GET
	@Path("/listarsituacaoentrega")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarSituacaoEntrega() {
		try {
			return Response.ok(situacaoEntregaServico.listarSituacaoEntrega()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/listartransportadora")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTransportadora() {
		try {
			return Response.ok(transportadoraServico.listarTranportadora()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
