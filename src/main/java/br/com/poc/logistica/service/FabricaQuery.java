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
		jpql.append("Select d from br.com.poc.logistica.model.Devolucao d ");
		jpql.append("where (:numPedido is null or d.pedido.idPedido = :numPedido) ");
		jpql.append("and (:valorPedido is null or d.pedido.valorPedido = :valorPedido) ");
		jpql.append("and ( CAST(:dataPedido AS date) is null or d.pedido.dataPedido = :dataPedido) ");
		return jpql.toString();
	}

	public static String criarQueryPesquisarPedidoPorNum() {
		StringBuilder jpql = new StringBuilder();
		jpql.append("Select p from br.com.poc.logistica.model.Pedido p ");
		jpql.append("where p.idPedido = :numPedido ");
		return jpql.toString();
	}

	public static String criarQueryPesquisarEntrega() {
		StringBuilder jpql = new StringBuilder();
		jpql.append("Select e from br.com.poc.logistica.model.Entrega e ");
		jpql.append("where (:numPedido is null or e.pedido.idPedido = :numPedido) ");
		jpql.append("and (:nomeTransportadora is null or e.transportadora.nomeTransportadora = :nomeTransportadora) ");
		jpql.append("and ( CAST(:datePedido AS date) is null or e.pedido.dataPedido = :datePedido) ");
		jpql.append("and (:descProduto is null or e.pedido.produto.descProduto = :descProduto) ");
		jpql.append("and (:descSituacaoEntrega is null or e.situacaoEntrega.descSituacaoEntrega = :descSituacaoEntrega) ");
		jpql.append("and (:nomeCliente is null or e.pedido.cliente.nomeCliente = :nomeCliente) ");
		return jpql.toString();
	}

}
