/*
Ex20
	Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o
	número de caracteres existente entre eles. Assuma que o usuário digite os 2
	caracteres em ordem alfabética. Caso não o estejam, emitir mensagem de erro.
	Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles é: 9
*/
package com.generation.ex20;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		char letra1, letra2, letras;
		Integer cont = -1;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao contador de letras!\nDigite as letras em ordem alfabética.");
		System.out.print("Digite a primeira letra: ");
		letra1 = reader.next().charAt(0);
		System.out.print("Digite a segunda letra: ");
		letra2 = reader.next().charAt(0);
		
		for(letras = letra1; letras < letra2; letras++)
			cont++;

		System.out.println("Letras: " + letra1 + " e " + letra2 + "\nO número de caracteres entre eles é: " + cont);
	}
}