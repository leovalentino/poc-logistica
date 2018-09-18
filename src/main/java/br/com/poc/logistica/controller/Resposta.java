package br.com.poc.logistica.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Resposta implements Serializable {

	private static final long serialVersionUID = -8545406863634588093L;

	private List<Object> listaObjeto;

	public Resposta() {
		this.listaObjeto = new ArrayList<>();
	}

	public void addListaObjeto(Object objeto) {
		this.listaObjeto.add(objeto);
	}

	public List<Object> getListaObjeto() {
		return listaObjeto;
	}

	public void setListaObjeto(List<Object> listaObjeto) {
		this.listaObjeto = listaObjeto;
	}

}
