/*
	Faça um programa que: - Leia a cotação do dólar - Leia um valor em dólares
	- Converta esse valor para Real - Mostre o resultado
*/
package com.generation.ex04;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		float valueDollar, cotDollar, valueReal;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo a calculadora de moedas!");
		System.out.println("Digite a cotação do Dólar:");
		cotDollar = reader.nextFloat();
		
		System.out.println("Digite o valor em dólares:");
		valueDollar = reader.nextFloat();
		
		valueReal = cotDollar*valueDollar;
		
		System.out.println("Valor em reais  " + valueReal);
	}
}
