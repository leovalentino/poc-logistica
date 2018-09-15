package br.com.poc.logistica.model;

import java.io.Serializable;

public class PedidoVO implements Serializable {

	private static final long serialVersionUID = -8513257513365284521L;
	
	private Integer numPedido;
	private String dataPedido;
	private String descProduto;

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

}
