package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.SituacaoEntrega;

@Local
public interface SituacaoEntregaServico {

	List<SituacaoEntrega> listarSituacaoEntrega();
	
}
