/*
URI 1012
	Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.
*/
package com.generation.uri1012;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double a, b, c, pi = 3.14159;
		Scanner reader = new Scanner(System.in);
		DecimalFormat df =  new DecimalFormat("0.000");

		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();

		System.out.println("TRIANGULO: " + df.format((a*c)/2));
		System.out.println("CIRCULO: " + df.format(pi*c*c));
		System.out.println("TRAPEZIO: " + df.format((a+b)*c/2));
		System.out.println("QUADRADO: " + df.format(b*b));
		System.out.println("RETANGULO: " + df.format(a*b));
	}
}
