package br.com.poc.logistica.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.poc.logistica.model.SituacaoEntrega;
import br.com.poc.logistica.service.FabricaQuery;

@Stateless
public class SituacaoEntregaDao extends PocCrudDao<SituacaoEntrega, Short> {

	public SituacaoEntregaDao() {
		super(SituacaoEntrega.class);
	}
	
	public List<SituacaoEntrega> listarSituacaoEntrega() {
		return em.createQuery(FabricaQuery.criarQueryListarSituacaoEntrega(), 
				                           SituacaoEntrega.class).getResultList();
	}
	
}
