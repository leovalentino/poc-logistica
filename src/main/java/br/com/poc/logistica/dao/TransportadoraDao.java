package br.com.poc.logistica.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.poc.logistica.model.Transportadora;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class TransportadoraDao extends PocCrudDao<Transportadora, Integer> {

	public TransportadoraDao() {
		super(Transportadora.class);
	}
	
	public List<Transportadora> listarTranportadora() {
		return em.createQuery(FabricaQuery.criarQueryListarTransportadora(), Transportadora.class).getResultList();
	}
	
}
