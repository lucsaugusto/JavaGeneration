/*
Ex01
	Escreva um pequeno software que peça a sua idade e a idade da sua mãe.
	Em seguida, imprima na tela as 3 informações a seguir:
 */
package com.generation.ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer myAge, momAge, diffAge;
		Scanner reader = new Scanner(System.in);

		System.out.println("Qual a sua idade?");
		myAge = reader.nextInt();
		
		System.out.println("Qual a idade da sua mãe?");
		momAge = reader.nextInt();
		
		diffAge = momAge-myAge;
		
		System.out.println("Sua idade é " + myAge + " anos");
		System.out.println("A idade da sua mãe é " + momAge + " anos");
		System.out.println("A diferença de idade entre vocês é de " + diffAge + " anos");
	}
}
