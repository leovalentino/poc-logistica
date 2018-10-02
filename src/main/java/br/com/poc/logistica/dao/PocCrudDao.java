package br.com.poc.logistica.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.apache.log4j.Logger;

import br.com.poc.logistica.model.PocEntidade;

@SuppressWarnings("rawtypes")
public abstract class PocCrudDao<T extends PocEntidade, I extends Serializable> {

	private final static Logger LOGGER = Logger.getLogger(PocCrudDao.class);
	
	private Class<T> entidadeAserPersistida;
	
	public PocCrudDao() {}
	
	public PocCrudDao(Class<T> entidadeAserPersistida) {
		this();
		this.entidadeAserPersistida = entidadeAserPersistida;
	}
	
	@PersistenceContext(unitName = "PocLogisticaPU")
	public EntityManager em;
	
	public void salvar(T entidade) {
		try {
			LOGGER.info("Salvando item no banco de dados");
			em.persist(entidade);
			em.flush();
			LOGGER.info("Item " + entidade.getClass().getSimpleName() + " com id " + entidade.getId() + " salvo com sucesso!");
		} catch (PersistenceException e) {
			LOGGER.error("Ocorreu um erro durante a persistência do item no banco de dados");
		}
	}

	public void alterar(T entidade) {
		try {
			LOGGER.info("Alterando item no banco de dados");
			em.merge(entidade);
			em.flush();
			LOGGER.info("Item " + entidade.getClass().getSimpleName() + " com id " + entidade.getId() + " alterado com sucesso!");
		} catch (PersistenceException e) {
			LOGGER.error("Ocorreu um erro durante a persistência do item no banco de dados");
		}
	}
	
	public void excluir(I i) {
		try {
			T entidade = em.find(entidadeAserPersistida, i);
			T entidadeMerged = em.merge(entidade);
			LOGGER.info("Excluindo item " + entidade.getClass().getSimpleName() + " com id " + entidade.getId() + " do banco de dados");
			em.remove(entidadeMerged);
			em.flush();
			LOGGER.info("Item excluído com sucesso!");
		} catch (PersistenceException e) {
			LOGGER.error("Ocorreu um erro durante a persistência do item no banco de dados");
		}
	}
	
	public List<T> buscarTodos() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(entidadeAserPersistida);
		query.from(entidadeAserPersistida);
		return em.createQuery(query).getResultList();
	}
	
}
