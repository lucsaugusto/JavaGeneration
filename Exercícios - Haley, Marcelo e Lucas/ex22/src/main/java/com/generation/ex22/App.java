/*
Ex22
	Escreva um programa que calcule e retorne o valor da hipotenusa através do método
	HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo.
	Fórmulas: hipotenusa² = base² + altura²
	
	área = base x altura / 2
*/
package com.generation.ex22;

import java.util.Scanner;

public class App {
	
	static double base, altura, hipotenusa, area;
	
	public static void main(String[] args) {	
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo a calculadora de hipotenusa!");
		System.out.print("Digite a base: ");
		base = reader.nextFloat();
		System.out.print("Digite a altura: ");
		altura = reader.nextFloat();
		
		Hipotenusa();
		Area();

		System.out.printf("Hipotenusa: %.2f\nÁrea: %.2f", hipotenusa, area);
	}
	
	static void Hipotenusa() {
		hipotenusa = Math.pow(base, 2) + Math.pow(altura, 2);
		hipotenusa = Math.sqrt(hipotenusa);
	}
	
	static void Area() {
		area = (base * altura) / 2;
	}
}

