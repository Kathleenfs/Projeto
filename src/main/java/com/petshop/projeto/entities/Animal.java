package com.petshop.projeto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_animal")
public class Animal {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;
	private String nome;
	private int idade;
	private float peso;
	
	public Animal(Long id, String nome, int idade, float peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	
}
