package com.generation.model;

public class Produto extends Item{

	private String marca;
	private	String referencia;
	private String modelo;
	
	public Produto() {
		super();
	}
	
	public Produto(String marca, String referencia, String modelo) {
		super();
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
