package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Transportadora;

@Local
public interface TransportadoraServico {

	List<Transportadora> listarTranportadora();

}
