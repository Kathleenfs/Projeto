package com.petshop.projeto.entities;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="tb_ordem")
public class OrdemServico {
	
	
	private Long id;
	private double valor;
	private Time hora_entrada;
	private Time hora_saida;
	
	
	
	public OrdemServico(Long id, double valor, Time hora_entrada, Time hora_saida) {
		super();
		this.id = id;
		this.valor = valor;
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Time getHora_entrada() {
		return hora_entrada;
	}
	public void setHora_entrada(Time hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public Time getHora_saida() {
		return hora_saida;
	}
	public void setHora_saida(Time hora_saida) {
		this.hora_saida = hora_saida;
	}
	
	

}
