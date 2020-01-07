/*
Ex16
	Faça um programa que leia 10 valores inteiros e positivos e:
	- Encontre o maior valor
	- Encontre o menor valor
	- Calcule a média dos números lidos
*/
package com.generation.ex16;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer[] valores = new Integer[10];
		Integer maior = null, menor = null, i, soma = 0;
		float media;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao  verificador de números!");

		System.out.println("Digite 10 valores:");
		for(i=0; i<10; i++) {
			valores[i] = reader.nextInt();
			if(i == 0) {
				maior = valores[i];
				menor = valores[i];
			}
			if(valores[i] > maior)
				maior = valores[i];
			if(valores[i] < menor)
				menor = valores[i];
			soma = soma + valores[i];
		}
		
		media = soma / 10f;
		
		System.out.println("Maior: " + maior + "\nMenor: " + menor + "\nMédia: " + media);
	}
}

