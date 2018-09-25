package br.com.poc.logistica.service.interfaces;

import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Transportadora;

@Local
public interface TransportadoraServico {

	List<Transportadora> listarTranportadora();

}
