/*
Ex06
	Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
	meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
	Considerar ano com 365 dias e mês com 30 dias.
 */
package com.generation.ex06;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer year, month, day, days;

		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo a calculadora de dias!");
		
		System.out.println("Digite quantos anos você tem:");
		year = reader.nextInt();
		
		System.out.println("Agora os meses:");
		month = reader.nextInt();
		
		System.out.println("Por último os dias:");
		day = reader.nextInt();
		
		days = (year*365) + (month*30) + day;
		
		System.out.println("Idade total em dias: " + days);
	}
}
