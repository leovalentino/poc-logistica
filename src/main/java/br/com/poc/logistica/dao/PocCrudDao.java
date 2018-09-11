package br.com.poc.logistica.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.poc.logistica.model.PocEntidade;

@SuppressWarnings("rawtypes")
public abstract class PocCrudDao<T extends PocEntidade, I extends Serializable> {

	private Class<T> entidadeAserPersistida;
	
	public PocCrudDao() {}
	
	public PocCrudDao(Class<T> entidadeAserPersistida) {
		this();
		this.entidadeAserPersistida = entidadeAserPersistida;
	}
	
	@PersistenceContext(unitName = "PocLogisticaPU")
	public EntityManager em;
	
	public void salvar(T entidade) {
		em.persist(entidade);
		em.flush();
	}
	
	public void alterar(T entidade) {
		em.merge(entidade);
		em.flush();
	}
	
	public void excluir(I i) {
		T entidade = em.find(entidadeAserPersistida, i);
		T entidadeMerged = em.merge(entidade);
		em.refresh(entidadeMerged);
		em.flush();
	}
	
}
