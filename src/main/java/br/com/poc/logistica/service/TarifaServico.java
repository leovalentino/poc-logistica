package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Tarifa;

@Local
public interface TarifaServico {

	List<Tarifa> listarTarifas();

	List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorTarifa);

}
