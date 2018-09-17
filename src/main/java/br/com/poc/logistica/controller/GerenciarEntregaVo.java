package br.com.poc.logistica.controller;

import java.util.Date;

import br.com.poc.logistica.service.UtilDate;

public class GerenciarEntregaVo {

	private Integer numPedido;
	private String nomeTransportadora;
	private Date dataPedido; 
	private String descProduto;
	private String nomeCliente;
	
	public Integer getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}
	public String getNomeTransportadora() {
		return nomeTransportadora;
	}
	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}
	public String getDataPedido() {
		return UtilDate.getDateString(dataPedido, UtilDate.FORMATO_DD_MM_YYYY);
	}
	public void setDataPedido(String dataTranportadora) {
		this.dataPedido = UtilDate.getStringToDate(dataTranportadora, UtilDate.FORMATO_YYYY_MM_DD);
	}
	public String getDescProduto() {
		return descProduto;
	}
	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	
}
