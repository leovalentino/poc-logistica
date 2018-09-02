package br.com.poc.logistica.service;

import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Tarifa;

@Local
public interface TarifaServico {

	List<Tarifa> listarTarifas();

}
