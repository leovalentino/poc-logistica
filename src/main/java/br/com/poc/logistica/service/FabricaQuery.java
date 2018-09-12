package br.com.poc.logistica.service;

import org.apache.commons.lang3.StringUtils;

public class FabricaQuery {

	public static String criarQueryPesquisarTarifa() {
		StringBuilder jpql = new StringBuilder();
		jpql.append("Select t from br.com.poc.logistica.model.Tarifa t ");
		jpql.append("where (:descTarifa is null or t.descTarifa like :descTarifa) ");
		jpql.append("and (:valorTarifa is null or t.valorTarifa > :valorTarifa) ");
		return jpql.toString();
	}

	public static String tratarParametroLike(String descTarifa) {
		return StringUtils.isEmpty(descTarifa) ? "" : descTarifa.toUpperCase();
	}
	
	public static String criarQueryPesquisarDevolucao() {
		StringBuilder jpql = new StringBuilder();
		jpql.append("Select t from br.com.poc.logistica.model.Devolucao d ");
		jpql.append("where (:idPedido is null or d.pedido.idPedido like :idPedido) ");
		jpql.append("and (:valorPedido is null or d.pedido.valorPedido = :valorPedido) ");
		jpql.append("and (:dataDevolucao is null or d.dataDevolucao = :dataDevolucao) ");
		return jpql.toString();
	}

}
