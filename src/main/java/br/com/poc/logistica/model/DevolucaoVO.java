package br.com.poc.logistica.model;

import java.math.BigDecimal;

public class DevolucaoVO {

	private Integer idCliente;
	private String nomeCliente;
	private String cpfCnpj;

	private Integer idDevolucao;
	private String dataDevolucao;
	private Integer idProduto;
	private BigDecimal valorProduto;
	private String descProduto;
	private Integer numPedido;
	private String dataPedido;
	private BigDecimal valorPedido;
	private String descMotivo;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Integer getIdDevolucao() {
		return idDevolucao;
	}

	public void setIdDevolucao(Integer idDevolucao) {
		this.idDevolucao = idDevolucao;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

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

	public BigDecimal getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(BigDecimal valorPedido) {
		this.valorPedido = valorPedido;
	}

	public String getDescMotivo() {
		return descMotivo;
	}

	public void setDescMotivo(String descMotivo) {
		this.descMotivo = descMotivo;
	}

}
