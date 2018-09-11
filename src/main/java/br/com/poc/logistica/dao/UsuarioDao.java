package br.com.poc.logistica.dao;

import javax.ejb.Stateless;

import br.com.poc.logistica.model.Usuario;

@Stateless
public class UsuarioDao extends PocCrudDao<Usuario, Integer> {

	public UsuarioDao() {
		super(Usuario.class);
	}

}
