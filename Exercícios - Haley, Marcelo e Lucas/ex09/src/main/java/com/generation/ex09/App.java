/*
Ex09
	Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma
	mensagem: "Múltiplo de 10";.
*/
package com.generation.ex09;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer i;

		System.out.println("Seja bem-vindo ao verificador de múltiplos!");
		
		for(i=1; i<101; i++) {
			if(i%10 == 0)
				System.out.println(i + " É múltiplo de 10");
		}
		
	}
}