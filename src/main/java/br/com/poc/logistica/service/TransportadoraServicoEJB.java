package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.TransportadoraDao;
import br.com.poc.logistica.model.Transportadora;

@Stateless
public class TransportadoraServicoEJB implements TransportadoraServico {

	@EJB
	private TransportadoraDao dao;
	
	@Override
	public List<Transportadora> listarTranportadora() {
		return dao.listarTranportadora();
	}
	
}
