package com.teg.trabalhoemgrupo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="trabalho")
@SequenceGenerator(name="seq_trabalho", sequenceName = "seq_trabalho", initialValue = 1, allocationSize = 1)
public class TrabalhoModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "seq_trabalho")
	@Column(name="idtrabalho")
	private long codigo;
	
	@Column(name="nome", nullable = true)
	private String name;
	@Column(name="lugar")
	private String local;
	@Column(name="dia")
	private String data;
	private String hora;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
}
