/*
Ex17
	Faça um programa que determine o maior e o menor entre N números lidos. A
	condição de parada é a entrada de um valor 0, ou seja, o programa deve ficar
	executando até que a entrada seja igual a 0 (ZERO). 
*/
package com.generation.ex17;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer maior = null, menor = null, number;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao  verificador de números!");

		do {
			System.out.println("Digite um número diferente de 0 | digite 0 para sair");
			number = reader.nextInt();
			if(maior == null) {
				maior = number;
				menor = number;
			}
			if(number > maior && number != 0)
				maior = number;
			if(number < menor && number != 0)
				menor = number;
		} while(number != 0);
		
		System.out.println("Maior: " + maior + "\nMenor: " + menor);
	}
}
