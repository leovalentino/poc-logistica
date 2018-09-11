package br.com.poc.logistica.model;

import java.io.Serializable;

public abstract class PocEntidade<PK extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public abstract void setId(PK pk);

	public abstract PK getId();
	
}
