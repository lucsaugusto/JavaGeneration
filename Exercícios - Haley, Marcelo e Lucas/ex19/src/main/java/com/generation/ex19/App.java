/*
Ex19
	Fazer um programa que leia uma frase e imprima somente as vogais.
*/
package com.generation.ex19;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String frase = "", vogais = "", consoantes = "";
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao separador de vogais e consoantes!\nDigite sua frase:");
		frase = reader.nextLine();
		vogais = frase.replaceAll("[^AEIOUaeiou]", "");
		consoantes = frase.replaceAll("[AEIOUaeiou ]", "");
		
		System.out.println("Frase: " + frase);
		System.out.println("Vogais: " + vogais);
		System.out.println("Consoantes: " + consoantes);
	}
}