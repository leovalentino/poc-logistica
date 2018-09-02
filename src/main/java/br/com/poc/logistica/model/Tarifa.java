package br.com.poc.logistica.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TARIFA")
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDTARIFA")
	private Integer idTarifa;

	@Column(name = "DESCTARIFA")
	private String descTarifa;

	@Column(name = "VALORTARIFA")
	private BigDecimal valorTarifa;

	public Integer getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	public String getDescTarifa() {
		return descTarifa;
	}

	public void setDescTarifa(String descTarifa) {
		this.descTarifa = descTarifa;
	}

	public BigDecimal getValorTarifa() {
		return valorTarifa;
	}

	public void setValorTarifa(BigDecimal valorTarifa) {
		this.valorTarifa = valorTarifa;
	}

}
