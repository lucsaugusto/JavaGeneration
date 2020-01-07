/*
Ex21
	Escreva um programa que calcule e retorne o salário atualizado através do método
	REAJUSTE. O método deve receber o valor do salário e o índice de reajuste.
*/
package com.generation.ex21;

import java.util.Scanner;

public class App {
	
	static float salario, taxa, novoSalario;
	
	public static void main(String[] args) {	
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo a calculadora de salário!");
		System.out.print("Digite o seu salário: ");
		salario = reader.nextFloat();
		System.out.print("Digite a taxa de reajuste(%): ");
		taxa = (reader.nextFloat())/100;
		
		Reajuste();

		System.out.println("Salário reajustado: " + novoSalario);
	}
	
	static void Reajuste() {
		novoSalario = salario * (1 + taxa);
	}
}
