/*
Ex11
	Faça um programa que leia um número inteiro e mostre uma mensagem na tela
	indicando se este número é positivo ou negativo. Pare a execução do programa
	quando o usuário requisitar.
*/
package com.generation.ex11;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Integer number;
		Scanner reader = new Scanner(System.in);
		String fim = "";

		System.out.println("Seja bem-vindo ao positivo ou negativo!");
		
		do {
			System.out.println("Digite um número diferente de 0.");
			number = reader.nextInt();
			if(number >= 1)
				System.out.println("Positivo");
			else if(number <= -1)
				System.out.println("Negativo");
			
			System.out.println("Para sair digite 'parar'");
			fim = reader.next();
		} while(!fim.contentEquals("parar"));
		System.out.println("Tchau :)");
    }
}
