/*
Ex15
	Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.
*/
package com.generation.ex15;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer i;

		System.out.println("Seja bem-vindo ao verificador de ímpares!");
		
		for(i=100; i<=200; i++) {
			if(i % 2 != 0)
				System.out.println(i);
		}
	}
}