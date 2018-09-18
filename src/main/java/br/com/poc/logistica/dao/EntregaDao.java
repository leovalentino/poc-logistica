package br.com.poc.logistica.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.poc.logistica.controller.GerenciarEntregaVo;
import br.com.poc.logistica.model.Entrega;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class EntregaDao extends PocCrudDao<Entrega, Integer> {

	public EntregaDao() {
		super(Entrega.class);
	}
	
	public List<Entrega> pesquisarEntregas(GerenciarEntregaVo vo) {
		TypedQuery<Entrega> query = em.createQuery(FabricaQuery.criarQueryPesquisarEntrega(), Entrega.class);
		query.setParameter("vo", vo);
		
		return query.getResultList();
	}

	public List<Entrega> pesquisarEntregas(Integer numPedido, String nomeTransportadora, Date datePedido,
			String descProduto, String descSituacaoEntrega, String nomeCliente) {
		TypedQuery<Entrega> query = em.createQuery(FabricaQuery.criarQueryPesquisarEntrega(), Entrega.class);
		query.setParameter("numPedido", numPedido);
		query.setParameter("nomeTransportadora", nomeTransportadora);
		query.setParameter("datePedido", datePedido);
		query.setParameter("descProduto", descProduto);
		query.setParameter("descSituacaoEntrega", descSituacaoEntrega);
		query.setParameter("nomeCliente", "%" + FabricaQuery.tratarParametroLike(nomeCliente) + "%");
		
		return query.getResultList();
	}

}
