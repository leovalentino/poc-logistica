package br.com.poc.logistica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSPORTADORA")
public class Transportadora extends PocEntidade<Integer> {

	private static final long serialVersionUID = 7715903847610319303L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idTransportadora;
	private String nomeTransportadora;
	private String cnpj;

	public Integer getIdTransportadora() {
		return idTransportadora;
	}

	public void setIdTransportadora(Integer idTransportadora) {
		this.idTransportadora = idTransportadora;
	}

	public String getNomeTransportadora() {
		return nomeTransportadora;
	}

	public void setNomeTransportadora(String nomeTransportadora) {
		this.nomeTransportadora = nomeTransportadora;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void setId(Integer pk) {
		setIdTransportadora(pk);
	}

	@Override
	public Integer getId() {
		return getIdTransportadora();
	}

}
