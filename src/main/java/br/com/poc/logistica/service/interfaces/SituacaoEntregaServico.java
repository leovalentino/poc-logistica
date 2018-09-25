package br.com.poc.logistica.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.SituacaoEntrega;

@Local
public interface SituacaoEntregaServico {

	List<SituacaoEntrega> listarSituacaoEntrega();
	
}
