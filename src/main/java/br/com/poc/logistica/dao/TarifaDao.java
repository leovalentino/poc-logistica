package br.com.poc.logistica.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class TarifaDao extends PocCrudDao<Tarifa, Integer> {

	public TarifaDao() {
		super(Tarifa.class);
	}

	public List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorMinTarifa, BigDecimal valorMaxTarifa) {
		 TypedQuery<Tarifa> query = em.createQuery(FabricaQuery.criarQueryPesquisarTarifa(), Tarifa.class);
		 query.setParameter("descTarifa", "%" + FabricaQuery.tratarParametroLike(descTarifa) + "%");
		 query.setParameter("valorMinTarifa", valorMinTarifa);
		 query.setParameter("valorMaxTarifa", valorMaxTarifa);
		 return query.getResultList();
	}
	
}
