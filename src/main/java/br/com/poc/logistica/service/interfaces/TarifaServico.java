package br.com.poc.logistica.service.interfaces;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Tarifa;

@Local
public interface TarifaServico {

	List<Tarifa> pesquisarTarifa(String descTarifa, BigDecimal valorTarifa, BigDecimal valorMaxTarifa);

	void salvar(Tarifa tarifa);

	void alterar(Tarifa tarifa);

	void excluir(Integer idTarifa);

	List<Tarifa> listarTarifas();

}
