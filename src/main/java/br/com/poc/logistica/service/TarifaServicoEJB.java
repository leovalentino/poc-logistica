package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.poc.logistica.model.Tarifa;

@Stateless
public class TarifaServicoEJB implements TarifaServico {

	@PersistenceContext(unitName = "PocLogisticaPU")
	public EntityManager em;
	
	public List<Tarifa> listarTarifas() {
		return em.createQuery("Select t from Tarifa t", Tarifa.class).getResultList();
	}

	@Override
	public List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorTarifa) {
		 Query query = em.createQuery(FabricaQuery.criarQueryPesquisarTarifa(), Tarifa.class);
		 query.setParameter("descTarifa", "%" + descTarifa.toUpperCase() + "%");
		 query.setParameter("valorTarifa", valorTarifa);
		 return query.getResultList();
	}
	
}
