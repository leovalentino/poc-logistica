package br.com.poc.logistica.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEVOLUCAO")
public class Devolucao extends PocEntidade<Integer> {
	
	private static final long serialVersionUID = -4310276656113349852L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDevolucao;
	private Date dataDevolucao;
	
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedido pedido;
	
	private String motivo;
	
	public Integer getIdDevolucao() {
		return idDevolucao;
	}

	public void setIdDevolucao(Integer idDevolucao) {
		this.idDevolucao = idDevolucao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public void setId(Integer pk) {
		setIdDevolucao(pk);
	}

	@Override
	public Integer getId() {
		return getIdDevolucao();
	}

}
