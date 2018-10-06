package br.com.poc.logistica.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

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

	public Transportadora obterTranportadoraPorCnpj(String cnpjTranportadora) {
		try {
			TypedQuery<Transportadora> query = em.createQuery(FabricaQuery.criarQueryListarPorCnpj(),
					Transportadora.class);
			query.setParameter("cnpj", cnpjTranportadora);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
}
