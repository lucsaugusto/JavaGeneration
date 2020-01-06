/*
Ex08
	Faça um programa que dada a idade de um nadador, classifique-o em uma das
	seguintes categorias:
	- Infantil A = 5 a 7 anos
	- Infantil B = 8 a 11 anos
	- Juvenil A = 12 a 13 anos
	- Juvenil B = 14 a 17 anos
	- Adultos = Maiores de 18 anos
*/
package com.generation.ex08;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer age;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao classificador de categoria!");
		
		System.out.println("Digite a idade do nadador:");
		age = reader.nextInt();
		
		if (age >= 5 && age <= 7)
			System.out.println("Categoria Infantil A");
		else if (age >= 8 && age <= 11)
			System.out.println("Categoria Infantil B");
		else if (age >= 12 && age <= 13)
			System.out.println("Categoria Juvenil A");
		else if (age >= 14 && age <= 17)
			System.out.println("Categoria Juvenil B");
		else if (age >= 18)
			System.out.println("Categoria Adultos");
		else
			System.out.println("Idade inválida");
	}
}