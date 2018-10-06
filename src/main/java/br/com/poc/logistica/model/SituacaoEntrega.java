package br.com.poc.logistica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SITUACAOENTREGA")
public class SituacaoEntrega extends PocEntidade<Short> {

	private static final long serialVersionUID = 5808952621355670441L;
	
	@Id
	private Short codSituacaoEntrega;
	
	@Column(nullable = false)
	private String descSituacaoEntrega;

	public Short getCodSituacaoEntrega() {
		return codSituacaoEntrega;
	}

	public void setCodSituacaoEntrega(Short codSituacaoEntrega) {
		this.codSituacaoEntrega = codSituacaoEntrega;
	}

	public String getDescSituacaoEntrega() {
		return descSituacaoEntrega;
	}

	public void setDescSituacaoEntrega(String descSituacaoEntrega) {
		this.descSituacaoEntrega = descSituacaoEntrega;
	}

	@Override
	public void setId(Short pk) {
		setCodSituacaoEntrega(pk);
	}

	@Override
	public Short getId() {
		return getCodSituacaoEntrega();
	}

}
