package br.com.poc.logistica.controller;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.poc.logistica.model.Usuario;
import br.com.poc.logistica.service.interfaces.UsuarioServico;

@Path("/usuario")
public class UsuarioController {

	@EJB
	private UsuarioServico servico;
	
	@GET
	@Path("/validarUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario loginESenhaCorrepondem(@QueryParam("login") String login,
			                              @QueryParam("senha") String senha) {
		return null;
	}
	
}
