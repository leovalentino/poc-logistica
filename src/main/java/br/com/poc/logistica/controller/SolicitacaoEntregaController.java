package br.com.poc.logistica.controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.poc.logistica.service.interfaces.SolicitacaoEntregaServico;
import br.com.poc.logistica.util.UtilDate;

@Path("/solicitacaoEntrega")
public class SolicitacaoEntregaController {

	@EJB
	private SolicitacaoEntregaServico servico;
	
	@POST
	@Path("/incluirtarifa")
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(@QueryParam("dataSolicitacao") String dataSolicitacao, 
					   @QueryParam("cnpjTranportadoraSolicitante") String cnpjTranportadoraSolicitante,
					   @QueryParam("nomeTranportadoraSolicitante") String nomeTranportadoraSolicitante) {
		Date dataSolicitacaoFormatoBD = UtilDate.getStringToDate(dataSolicitacao, UtilDate.FORMATO_YYYY_MM_DD);
		servico.salvarSolicitacaoDeEntrega(dataSolicitacaoFormatoBD , cnpjTranportadoraSolicitante, nomeTranportadoraSolicitante);
	}
	
}
