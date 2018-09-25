package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.TarifaDao;
import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.interfaces.TarifaServico;

@Stateless
public class TarifaServicoEJB implements TarifaServico {

	@EJB
	private TarifaDao dao;
	
	@Override
	public List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorMinTarifa, BigDecimal valorMaxTarifa) {
		return dao.pesquisarTarifa(descTarifa, valorMinTarifa, valorMaxTarifa);
	}
	
	@Override
	public void salvar(Tarifa tarifa) {
		dao.salvar(tarifa);
	}
	
	@Override
	public void alterar(Tarifa tarifa) {
		dao.alterar(tarifa);
	}

	@Override
	public void excluir(Integer idTarifa) {
		dao.excluir(idTarifa);
	}
	
	@Override
	public List<Tarifa> listarTarifas() {
		return dao.buscarTodos();
	}
	
}
