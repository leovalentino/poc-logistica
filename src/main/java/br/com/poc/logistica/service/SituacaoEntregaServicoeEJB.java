package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.SituacaoEntregaDao;
import br.com.poc.logistica.model.SituacaoEntrega;
import br.com.poc.logistica.service.interfaces.SituacaoEntregaServico;

@Stateless
public class SituacaoEntregaServicoeEJB implements SituacaoEntregaServico {

	@EJB
	private SituacaoEntregaDao dao;
	
	@Override
	public List<SituacaoEntrega> listarSituacaoEntrega() {
		return dao.listarSituacaoEntrega();
	}

}
