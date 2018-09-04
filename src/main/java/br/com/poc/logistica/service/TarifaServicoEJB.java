package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.poc.logistica.model.Tarifa;

@Stateless
public class TarifaServicoEJB implements TarifaServico {

	@PersistenceContext(unitName = "PocLogisticaPU")
	private EntityManager em;
	
	public List<Tarifa> listarTarifas() {
		return em.createQuery("Select t from Tarifa t", Tarifa.class).getResultList();
	}
	
}
