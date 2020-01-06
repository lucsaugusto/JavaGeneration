/*
Ex03
	Faça um programa para calcular o estoque médio de uma peça, sendo que:
	ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 */
package com.generation.ex03;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Integer minStock, maxStock;
		float media;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao estoque!");
		System.out.println("Digite a quantidade mínima no estoque:");
		minStock = reader.nextInt();
		
		System.out.println("Digite a quantidade máxima no estoque:");
		maxStock = reader.nextInt();
		
		media = (minStock+maxStock)/2;
		
		System.out.println("A média do seu estoque é de " + media + " itens.");
	}
}
