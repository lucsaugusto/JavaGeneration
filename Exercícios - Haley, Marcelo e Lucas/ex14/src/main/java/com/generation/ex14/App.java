/*
Ex14
	Escreva um programa que leia dois números inteiros e apresente as opções para
	usuário escolher o que deseja realizar:
	1 – Verificar se um dos números lidos é ou não múltiplo do outro
	2 – Verificar se os dois números lidos são pares
	3 – Verificar se a média dos dois números é maior ou igual a 7.
	4 – Sair
*/
package com.generation.ex14;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer opc;
		float n1, n2, media;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao  verificador de números!");

		System.out.println("Digite um número:");
		n1 = reader.nextInt();
		System.out.println("Digite outro número:");
		n2 = reader.nextInt();

		System.out.println("Escolha uma das operações abaixo, digitando o número.\n"
				+ "1 – Verificar se um dos números lidos é ou não múltiplo do outro\n"
				+ "2 – Verificar se os dois números lidos são pares\n"
				+ "3 – Verificar se a média dos dois números é maior ou igual a 7\n" 
				+ "4 – Sair");

		do {
			System.out.println("\nDigite uma opção:");
			opc = reader.nextInt();
			switch (opc) {
			case 1:
				if (n1 % n2 == 0)
					System.out.println(n1 + " é múltiplo de " + n2);
				else if (n2 % n1 == 0)
					System.out.println(n2 + " é múltiplo de " + n1);
				else
					System.out.println("Não são múltiplos.");
				break;
			case 2:
				if (n1 % 2 == 0 && n2 % 2 == 0)
					System.out.println(n1 + " e " + n2 + " são pares.");
				else if (n1 % 2 == 0)
					System.out.println("Apenas " + n1 + " é par.");
				else if (n2 % 2 == 0)
					System.out.println("Apenas " + n2 + " é par.");
				else
					System.out.println("Não são pares.");
				break;
			case 3:
				media = (n1 + n2) / 2;
				if (media >= 7)
					System.out.println("A média é " + media + " e é maior ou igual a 7");
				else
					System.out.println("A média é " + media + " e é menor que 7");
				break;
			case 4:
				System.out.println("Tchau :D");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		} while (opc != 0);
	}
}
