package br.com.poc.logistica.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import br.com.poc.logistica.controller.DevolucaoController;
import br.com.poc.logistica.controller.EntregaController;
import br.com.poc.logistica.controller.TarifaController;
import br.com.poc.logistica.controller.UsuarioController;

public class PocApplication extends Application {

	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();

	public PocApplication() {
		classes.add(TarifaController.class);
		classes.add(DevolucaoController.class);
		classes.add(EntregaController.class);
		classes.add(UsuarioController.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
