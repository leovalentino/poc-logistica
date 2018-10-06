package br.com.poc.logistica.controller;

import java.math.BigDecimal;

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

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.interfaces.TarifaServico;

@Path("/tarifa")
public class TarifaController {

	@EJB
	private TarifaServico servico;
	
	@GET
	@Path("/pesquisartarifas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarTarifa(@QueryParam("descTarifa") String descTarifa,
										@QueryParam("valorMinTarifa") BigDecimal valorMinTarifa,
										@QueryParam("valorMaxTarifa") BigDecimal valorMaxTarifa) {
		try {
			return Response.ok(servico.pesquisarTarifa(descTarifa, valorMinTarifa, valorMaxTarifa)).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
    }
	
	@GET
	@Path("/listartarifa")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTarifas() {
		try {
			return Response.ok(servico.listarTarifas()).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@POST
	@Path("/incluirtarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(@Valid Tarifa tarifa) {
		try {
			servico.salvar(tarifa);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		
	}
	
	@PUT
	@Path("/alterartarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alterar(@Valid Tarifa tarifa) {
		try {
			servico.alterar(tarifa);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@DELETE
	@Path("/excluirtarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("idTarifa") Integer idTarifa) {
		try {
			servico.excluir(idTarifa);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	
}
