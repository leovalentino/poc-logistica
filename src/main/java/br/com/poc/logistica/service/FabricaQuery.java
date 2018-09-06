package br.com.poc.logistica.service;

import org.apache.commons.lang3.StringUtils;

public class FabricaQuery {

	public static String criarQueryPesquisarTarifa() {
		StringBuilder sb = new StringBuilder();
		sb.append("Select t from br.com.poc.logistica.model.Tarifa t ");
		sb.append("where (:descTarifa is null or t.descTarifa like :descTarifa) ");
		sb.append("and (:valorTarifa is null or t.valorTarifa > :valorTarifa) ");
		return sb.toString();
	}

	public static String tratarParametroLike(String descTarifa) {
		return StringUtils.isEmpty(descTarifa) ? "" : descTarifa.toUpperCase();
	}

}
