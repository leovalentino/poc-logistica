package br.com.poc.logistica.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TARIFA")
public class Tarifa extends PocEntidade<Integer> {

	private static final long serialVersionUID = -5565283961775771044L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDTARIFA")
	private Integer idTarifa;

	@Column(name = "DESCTARIFA", nullable = false)
	private String descTarifa;

	@Column(name = "VALORTARIFA", nullable = false)
	private BigDecimal valorTarifa;

	public Tarifa() {
	}
	
	public Tarifa(Integer idTarifa, String descTarifa, BigDecimal valorTarifa) {
		super();
		this.idTarifa = idTarifa;
		this.descTarifa = descTarifa;
		this.valorTarifa = valorTarifa;
	}
	
	public Integer getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Integer idTarifa) {
		this.idTarifa = idTarifa;
	}

	@Override
	public void setId(Integer pk) {
		this.idTarifa = pk;
	}

	@Override
	public Integer getId() {
		return idTarifa;
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
