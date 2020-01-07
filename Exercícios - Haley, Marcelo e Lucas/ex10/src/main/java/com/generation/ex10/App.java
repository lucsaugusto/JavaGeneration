/*
Ex10
	Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
*/
package com.generation.ex10;
import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Integer qtd, i;
    	Integer numbers[];
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao ordenador decrescente!");
		System.out.println("Digite quantos valores deseja ordenar:");
		qtd = reader.nextInt();
		
		System.out.println("Digite " + qtd + " valores inteiros:");
		numbers= new Integer[qtd];
		
		for(i = 0; i < numbers.length; i++)
			numbers[i] = reader.nextInt();
		
		Arrays.sort(numbers);
		
		System.out.println("Valores em ordem decrescente.");
		for(i = numbers.length - 1; i >= 0 ; i--)
			System.out.println(numbers[i]);
    }
}
