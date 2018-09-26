package br.com.poc.logistica.controller;

import javax.ejb.EJB;

import br.com.poc.logistica.service.interfaces.LoginServico;

public class LoginController {

	@EJB
	private LoginServico servico;
	
	public boolean isLogged() {
		return true;
	}
	
}
