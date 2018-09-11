package br.com.poc.logistica.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.poc.logistica.model.Tarifa;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class TarifaDao extends PocCrudDao<Tarifa, Integer> {

	public TarifaDao() {
		super(Tarifa.class);
	}

	public List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorTarifa) {
		 Query query = em.createQuery(FabricaQuery.criarQueryPesquisarTarifa(), Tarifa.class);
		 query.setParameter("descTarifa", "%" + FabricaQuery.tratarParametroLike(descTarifa) + "%");
		 query.setParameter("valorTarifa", valorTarifa);
		 return query.getResultList();
	}
	
}
