package br.com.poc.logistica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends PocEntidade<Integer> {

	private static final long serialVersionUID = 209087360056393959L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCliente;
	
	@Column(nullable = false)
	private String nomeCliente;
	
	@Column(nullable = false)
	private String cpfCnpj;

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

	@Override
	public void setId(Integer pk) {
		setIdCliente(pk);
	}

	@Override
	public Integer getId() {
		return getIdCliente();
	}

}
