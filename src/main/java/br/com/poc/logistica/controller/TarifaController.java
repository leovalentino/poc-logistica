package br.com.poc.logistica.controller;

import java.math.BigDecimal;
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

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.interfaces.TarifaServico;

@Path("/tarifa")
public class TarifaController {

	@EJB
	private TarifaServico servico;
	
	@GET
	@Path("/pesquisartarifas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarifa> pesquisarTarifa(@QueryParam("descTarifa") String descTarifa,
										@QueryParam("valorMinTarifa") BigDecimal valorMinTarifa,
										@QueryParam("valorMaxTarifa") BigDecimal valorMaxTarifa) {
		return servico.pesquisarTarifa(descTarifa, valorMinTarifa, valorMaxTarifa);
    }
	
	@GET
	@Path("/listartarifa")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarifa> listarTarifas() {
		return servico.listarTarifas();
	}
	
	@POST
	@Path("/incluirtarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(@Valid Tarifa tarifa) {
		servico.salvar(tarifa);
	}
	
	@PUT
	@Path("/alterartarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public void alterar(@Valid Tarifa tarifa) {		
		servico.alterar(tarifa);
	}
	
	@DELETE
	@Path("/excluirtarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(@QueryParam("idTarifa") Integer idTarifa) {
		servico.excluir(idTarifa);
	}
	
	
}
