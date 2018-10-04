package br.com.poc.logistica.service.interfaces;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface SolicitacaoEntregaServico {

	void salvarSolicitacaoDeEntrega(Date dataSolicitacao, String nomeTransportadora, String cnpjTranportadora);

	
	
}
