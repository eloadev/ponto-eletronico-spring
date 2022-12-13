package br.cefet.eloa.pontoeletronico.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departamento_id;
	private String nome;
	
	public Departamento() {
		super();
	}
	
	public long getId() {
		return departamento_id;
	}
	public void setId(long departamento_id) {
		this.departamento_id = departamento_id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
