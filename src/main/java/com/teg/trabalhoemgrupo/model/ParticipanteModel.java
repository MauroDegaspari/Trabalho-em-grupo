package com.teg.trabalhoemgrupo.model;

import javax.persistence.ManyToOne;

public class ParticipanteModel {

	private long id;
	private String nome;
	private String celular;
	
	@ManyToOne
	private TrabalhoModel trabalho;

	
	// Gettes & Settes
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public TrabalhoModel getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(TrabalhoModel trabalho) {
		this.trabalho = trabalho;
	}
	
	
}
