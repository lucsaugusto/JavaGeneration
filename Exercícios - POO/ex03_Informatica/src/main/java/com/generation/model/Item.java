package com.generation.model;

import java.math.BigDecimal;

public abstract class Item {
	
	public Item() {
		super();
	}
	
	public Item(BigDecimal preco, String nome) {
		super();
		this.preco = preco;
		this.nome = nome;
	}


	private BigDecimal preco;
	private String nome;
	
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
