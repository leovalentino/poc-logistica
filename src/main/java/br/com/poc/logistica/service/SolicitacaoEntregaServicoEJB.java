package br.com.poc.logistica.service;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.SolicitacaoEntregaDao;
import br.com.poc.logistica.model.SolicitacaoEntrega;
import br.com.poc.logistica.model.Transportadora;
import br.com.poc.logistica.service.interfaces.SolicitacaoEntregaServico;

@Stateless
public class SolicitacaoEntregaServicoEJB implements SolicitacaoEntregaServico {

	@EJB
	private SolicitacaoEntregaDao dao;
	
	@Override
	public void salvarSolicitacaoDeEntrega(Date dataSolicitacao, String nomeTransportadora, String cnpjTranportadora) {
		SolicitacaoEntrega solicitacao = new SolicitacaoEntrega();
		solicitacao.setDataSolicitacao(dataSolicitacao);
		Transportadora transportadora = new Transportadora();
		transportadora.setNomeTransportadora(nomeTransportadora);
		transportadora.setCnpj(cnpjTranportadora);
		solicitacao.setTransportadora(transportadora);
		dao.salvar(solicitacao);
	}
	
}
