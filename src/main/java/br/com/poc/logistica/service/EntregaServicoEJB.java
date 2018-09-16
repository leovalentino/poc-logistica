package br.com.poc.logistica.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.controller.GerenciarEntregaVo;
import br.com.poc.logistica.dao.EntregaDao;
import br.com.poc.logistica.model.Entrega;

@Stateless
public class EntregaServicoEJB implements EntregaServico {

	@EJB
	private EntregaDao dao;
	
	@Override
	public List<Entrega> pesquisarEntregas(GerenciarEntregaVo vo) {
		return dao.pesquisarEntregas(vo);
	}

	@Override
	public List<Entrega> pesquisarEntregas(Integer numPedido, Integer nomeTranportadora, Date datePedido,
			String descProduto, String descSituacaoEntrega, String nomeCliente) {
		return dao.pesquisarEntregas(numPedido, nomeTranportadora, datePedido,
								     descProduto, descSituacaoEntrega, nomeCliente);
	}

}
