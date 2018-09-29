package br.com.poc.logistica.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class DevolucaoDao extends PocCrudDao<Devolucao, Integer> {

	public DevolucaoDao() {
		super(Devolucao.class);
	}
	
	public List<Devolucao> pesquisarListaDevolucao(Integer numPedido, Date dataPedidoMin,
			                                       Date dataPedidoMax, BigDecimal valorPedidoMin, BigDecimal valorPedidoMax) {
		TypedQuery<Devolucao> query = em.createQuery(FabricaQuery.criarQueryPesquisarDevolucao(), Devolucao.class);
		query.setParameter("numPedido", numPedido);
		query.setParameter("dataPedidoMin", dataPedidoMin);
		query.setParameter("dataPedidoMax", dataPedidoMax);
		query.setParameter("valorPedidoMin", valorPedidoMin);
		query.setParameter("valorPedidoMax", valorPedidoMax);
		
		return query.getResultList();
	}
	
}
