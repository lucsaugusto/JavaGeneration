/*
Ex12
	Faça um programa que leia um número. Se positivo armazene-o em A, 
	se for negativo, em B. No final mostrar o resultado.
*/
package com.generation.ex12;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Integer number, a = 0, b = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao positivo ou negativo 2.0!");
		
		do {
			System.out.println("Digite um número diferente de 0");
			number = reader.nextInt();
			if (number >= 1)
				a = number;
			else if (number <= -1)
				b = number;
			else
				System.out.println("Inválido! Tente novamente.");
		} while(number == 0);
		
		if(number == a)
			System.out.println(a + " é positivo.");
		else
			System.out.println(b + " é negativo.");
    }
}