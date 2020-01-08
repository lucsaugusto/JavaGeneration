/*
Ex23
	Escreva um programa que deverá ter as seguintes opções:
	1 - Carregar Vetor
	2 - Listar Vetor
	3 - Exibir apenas os números pares do vetor
	4 - Exibir apenas os números ímpares do vetor
	5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
	6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
	7 - Sair
	Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
*/
package com.generation.ex23;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	static Integer vetor[] = new Integer[5];
	static Integer i, cont;
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Integer opc;

		System.out.println("Seja bem-vindo ao manipulador de vetores!");

		do {
			System.out.println("\nDigite uma opção:\n" + "1 - Carregar Vetor\r\n" + "2 - Listar Vetor\r\n"
					+ "3 - Exibir apenas os números pares do vetor\r\n"
					+ "4 - Exibir apenas os números ímpares do vetor\r\n"
					+ "5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor\r\n"
					+ "6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor\r\n"
					+ "7 - Sair");
			System.out.print("> ");
			opc = reader.nextInt();
			switch (opc) {
			case 1:
				CarregaVetor();
				break;
			case 2:
				ListaVetor();
				break;
			case 3:
				ExibirPares();
				break;
			case 4:
				ExibirImpares();
				break;
			case 5:
				ContaPares();
				break;
			case 6:
				ContaImpares();
				break;
			case 7:
				System.out.println("Finalizando...");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
			}
		} while (opc != 7);
	}

	static void CarregaVetor() {
		for(i = 0; i < vetor.length; i++) {
			System.out.print("digite: ");
			vetor[i] = reader.nextInt();
		}
		Arrays.sort(vetor);
	}

	static void ListaVetor() {
		for(i = 0; i < vetor.length; i++) 
			System.out.println("vetor["+ (i + 1) +"]: " + vetor[i]);
	}

	static void ExibirPares() {
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0)
				System.out.println("vetor["+ (i + 1) +"]: " + vetor[i]);
		}
	}

	static void ExibirImpares() {
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 != 0)
				System.out.println("vetor["+ (i + 1) +"]: " + vetor[i]);
		}
	}

	static void ContaPares() {
		cont = 0;
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0)
				cont++;
		}
		System.out.println(cont + " valores pares.");
	}

	static void ContaImpares() {
		cont = 0;
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 != 0)
				cont++;
		}
		System.out.println(cont + " valores impares.");
	}
}
