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
import br.com.poc.logistica.service.DevolucaoServico;

@Path("/devolucao")
public class DevolucaoController {

	@EJB
	private DevolucaoServico servico;
	
	
	@GET
	@Path("/pesquisardevolucaos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Devolucao> pesquisarDevolucao(@QueryParam("numPedido") Integer numPedido, 
											  @QueryParam("dataDevolucao")Date dataDevolucao,
											  @QueryParam("valorPedido") BigDecimal valorPedido) {
		return servico.pesquisarDevolucao(numPedido, dataDevolucao, valorPedido);
    }
	
	@POST
	@Path("/incluirdevolucao")
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(@Valid Devolucao devolucao) {
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
	
}
