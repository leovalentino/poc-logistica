package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.DevolucaoDao;
import br.com.poc.logistica.model.Devolucao;

@Stateless
public class DevolucaoServicoEJB implements DevolucaoServico {

	@EJB
	private DevolucaoDao dao;
	
	public List<Devolucao> pesquisarDevolucao(Integer numPedido, Date dataDevolucao,
            BigDecimal valorPedido) {
		return dao.pesquisarListaDevolucao(numPedido, dataDevolucao, valorPedido);
	}
	
	@Override
	public void salvar(Devolucao tarifa) {
		dao.salvar(tarifa);
	}
	
	@Override
	public void alterar(Devolucao tarifa) {
		dao.alterar(tarifa);
	}

	@Override
	public void excluir(Integer idDevolucao) {
		dao.excluir(idDevolucao);
	}
	
}
