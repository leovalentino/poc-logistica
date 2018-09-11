package br.com.poc.logistica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario extends PocEntidade<Integer> {

	private static final long serialVersionUID = 1387683153138102149L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;
	private String login;
	private String senha;

	@Override
	public void setId(Integer pk) {
		this.idUsuario = pk;
	}

	@Override
	public Integer getId() {
		return this.idUsuario;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
