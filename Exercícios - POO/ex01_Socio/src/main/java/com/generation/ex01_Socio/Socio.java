package com.generation.ex01_Socio;

import java.util.Scanner;

public class Socio {
	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	private String telefone;
	private String endereco;

	public Socio() {
		
	}

	public Socio(String nome, String cpf, String rg, String nascimento, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	Scanner reader = new Scanner(System.in);
	String input;
	
	public void cadastrar() {
		System.out.println("Bem-vindo ao Cadastro de Sócios.");
		System.out.print("\nNome: ");
		this.nome = reader.nextLine();
		System.out.print("\nCPF: ");
		this.cpf = reader.nextLine();
		System.out.print("\nRG: ");
		this.rg = reader.nextLine();
		System.out.print("\nNascimento: ");
		this.nascimento = reader.nextLine();
		System.out.print("\nTelefone: ");
		this.telefone = reader.nextLine();
		System.out.print("\nEndereco: ");
		this.endereco = reader.nextLine();
	}

	public void confirmarCadastro() {
		System.out.println("Confirmando o cadastro do sócio.");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereco: " + this.endereco);
	}
	
	public void validarSocio() {
		System.out.println("Validando o sócio " + this.nome + ".");
	}
	
	public void alterar() {
		if(this.nome != null) {
			System.out.println("Alterar o Cadastro do Sócio ");
			System.out.print("\nNome: ");
			this.nome = reader.nextLine();
			System.out.print("\nCPF: ");
			this.cpf = reader.nextLine();
			System.out.print("\nRG: ");
			this.rg = reader.nextLine();
			System.out.print("\nNascimento: ");
			this.nascimento = reader.nextLine();
			System.out.print("\nTelefone: ");
			this.telefone = reader.nextLine();
			System.out.print("\nEndereco: ");
			this.endereco = reader.nextLine();
		}
		else {
			System.out.print("Sócio não cadastrado.\nDeseja cadastrar um novo sócio? (s/n)");
			input = reader.next();
			if(input.equals("s")) {
				cadastrar();
			}
			else {
				System.out.print("Obrigado, volte sempre.");
			}
		}
	}
}
