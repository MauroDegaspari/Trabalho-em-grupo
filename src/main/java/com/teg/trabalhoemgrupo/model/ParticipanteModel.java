package com.teg.trabalhoemgrupo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="participante")
@SequenceGenerator(name="seq_participante", sequenceName = "seq_participante", initialValue = 1, allocationSize = 1)
public class ParticipanteModel {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "seq_participante")
	@Column(name="idparticipante")
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
