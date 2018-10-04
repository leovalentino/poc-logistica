package br.com.poc.logistica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SOLICITACAOENTREGA")
public class SolicitacaoEntrega extends PocEntidade<Integer> {

	private static final long serialVersionUID = 7733524145581801168L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSituacaoEntrega;
	
	@Column(nullable = false)
	private Date dataSolicitacao;
	
	@ManyToOne
	@JoinColumn(name = "idTransportadora")
	private Transportadora transportadora;
	
	public Integer getIdSituacaoEntrega() {
		return idSituacaoEntrega;
	}

	public void setIdSituacaoEntrega(Integer idSitucaoEntrega) {
		this.idSituacaoEntrega = idSitucaoEntrega;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	@Override
	public void setId(Integer pk) {
		setIdSituacaoEntrega(pk);
	}

	@Override
	public Integer getId() {
		return getIdSituacaoEntrega();
	}

}
