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

import br.com.poc.logistica.util.UtilDate;

@Entity
@Table(name = "ENTREGA")
public class Entrega extends PocEntidade<Integer> {

	private static final long serialVersionUID = -4473807467215271080L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEntrega;

	@ManyToOne
	@JoinColumn(name = "codSituacaoEntrega")
	private SituacaoEntrega situacaoEntrega;

	@ManyToOne
	@JoinColumn(name = "idTransportadora")
	private Transportadora transportadora;

	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedido pedido;

	@Column(nullable = false)
	private Date dataEntregaPrevista;

	public Integer getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(Integer idEntrega) {
		this.idEntrega = idEntrega;
	}

	public SituacaoEntrega getSituacaoEntrega() {
		return situacaoEntrega;
	}

	public void setSituacaoEntrega(SituacaoEntrega situacaoEntrega) {
		this.situacaoEntrega = situacaoEntrega;
	}

	public Transportadora getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(Transportadora transportadora) {
		this.transportadora = transportadora;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getDataEntregaPrevista() {
		return dataEntregaPrevista != null ? 
			   UtilDate.getDateString(dataEntregaPrevista, UtilDate.FORMATO_DD_MM_YYYY) :
			   "";
	}

	public void setDataEntregaPrevista(Date dataEntregaPrevista) {
		this.dataEntregaPrevista = dataEntregaPrevista;
	}

	@Override
	public void setId(Integer pk) {
		setIdEntrega(pk);
	}

	@Override
	public Integer getId() {
		return getIdEntrega();
	}

}
