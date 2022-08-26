package com.petshop.projeto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nome;
	private  int telefone;
	
	
	public Cliente(Long id, String nome, int telefone) {
		super();
		Id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
