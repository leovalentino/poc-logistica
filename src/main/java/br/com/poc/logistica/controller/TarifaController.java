package br.com.poc.logistica.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.TarifaServico;

@Path("/tarifa")
public class TarifaController {

	@EJB
	private TarifaServico servico;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarifa> listarTarifas() {
		return servico.listarTarifas();
	}
	
}
