package br.com.poc.logistica.controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.poc.logistica.service.interfaces.SolicitacaoEntregaServico;
import br.com.poc.logistica.util.UtilDate;

@Path("/solicitacaoEntrega")
public class SolicitacaoEntregaController {

	@EJB
	private SolicitacaoEntregaServico servico;
	
	@POST
	@Path("/solicitarEntrega")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response solicitarEntrega(@QueryParam("dataSolicitacao") String dataSolicitacao, 
					   @QueryParam("cnpjTranportadoraSolicitante") String cnpjTranportadoraSolicitante) {
		try {
			Date dataSolicitacaoFormatoBD = UtilDate.getStringToDate(dataSolicitacao, UtilDate.FORMATO_DD_MM_YYYY);
			servico.salvarSolicitacaoDeEntrega(dataSolicitacaoFormatoBD , cnpjTranportadoraSolicitante);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}
