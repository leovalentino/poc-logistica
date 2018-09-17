package br.com.poc.logistica.dao;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.poc.logistica.model.Pedido;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class PedidoDao extends PocCrudDao<Pedido, Integer> {

	public PedidoDao() {
		super(Pedido.class);
	}
	
	public Pedido pesquisarPedidoPorNum(Integer numPedido) {
		try {
			TypedQuery<Pedido> query = em.createQuery(FabricaQuery.criarQueryPesquisarPedidoPorNum(), Pedido.class);
			query.setParameter("numPedido", numPedido);

			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
