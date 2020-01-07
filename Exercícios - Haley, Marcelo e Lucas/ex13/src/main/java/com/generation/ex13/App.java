/*
Ex13
	Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:
	1 – Adição
	2 – Subtração
	3 – Multiplicação
	4 – Divisão
*/
package com.generation.ex13;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer opc;
		float n1, n2, result;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo a calculadora!");

		System.out.println("Digite um número:");
		n1 = reader.nextInt();
		System.out.println("Digite outro número:");
		n2 = reader.nextInt();

		System.out.println("Escolha uma das operações abaixo, digitando o número.\n1 – Adição\n2 – Subtração\n3 – Multiplicação\n4 – Divisão\n0 - Sair");
		
		do {
			System.out.println("\nDigite uma opção:");
			opc = reader.nextInt();
			switch (opc) {
			case 1:
				result = n1 + n2;
				System.out.println("Adição | " + n1 + " + " + n2 + " = " + result);
				break;
			case 2:
				result = n1 - n2;
				System.out.println("Subtração | " + n1 + " - " + n2 + " = " + result);
				break;
			case 3:
				result = n1 * n2;
				System.out.println("Multiplicação | " + n1 + " * " + n2 + " = " + result);
				break;
			case 4:
				result = n1 / n2;
				System.out.println("Divisão | " + n1 + " / " + n2 + " = " + result);
				break;
			case 0:
				System.out.println("Tchau :D");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		} while (opc != 0);
	}
}
