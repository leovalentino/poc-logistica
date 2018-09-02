package br.com.poc.logistica.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.TarifaServicoEJB;

@RequestScoped
@Path("/tarifa")
public class TarifaController {

	@Inject
	private TarifaServicoEJB servico;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarifa> listarTarifas() {
		return servico.listarTarifas();
	}
	
}
