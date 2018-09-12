package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Devolucao;

@Local
public interface DevolucaoServico {

	List<Devolucao> pesquisarDevolucao(Integer numPedido, Date dataDevolucao,
            BigDecimal valorPedido);
	
	void salvar(Devolucao tarifa);

	void alterar(Devolucao tarifa);

	void excluir(Integer idDevolucao);
	
}