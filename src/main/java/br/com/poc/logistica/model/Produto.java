package br.com.poc.logistica.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto extends PocEntidade<Integer> {

	private static final long serialVersionUID = -3734080102364867587L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduto;
	private String descProduto;
	
	@Column(nullable = false)
	private BigDecimal valorProduto;
	
	@ManyToOne
	@JoinColumn(name="codCategoria")
	private Categoria categoria;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public void setId(Integer pk) {
		setIdProduto(pk);
	}

	@Override
	public Integer getId() {
		return getIdProduto();
	}

}
