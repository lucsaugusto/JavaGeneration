/*
Ex07
	Escrever um programa que leia dois números inteiros e mostre todos os
	relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis
	são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*/
package com.generation.ex07;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer number1, number2;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao verificador de relacionamentos!");
		
		System.out.println("Digite um número:");
		number1 = reader.nextInt();
		
		System.out.println("Digite mais um número:");
		number2 = reader.nextInt();
		
		System.out.println("Igual ("+ number1 +" = " + number2 + "): " + (number1 == number2));
		System.out.println("Não igual ("+ number1 +" != " + number2 + "): " + (number1 != number2));
		System.out.println("Maior ("+ number1 +" > " + number2 + ") = " + (number1 > number2));
		System.out.println("Menor ("+ number1 +" < " + number2 + ") = " + (number1 < number2));
		System.out.println("Maior ou igual ("+ number1 +" >= " + number2 + ") = " + (number1 >= number2));
		System.out.println("Menor ou igual ("+ number1 +" <= " + number2 + ") = " + (number1 <= number2));		
	}
}
