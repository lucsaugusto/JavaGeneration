/*
Ex18
	Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada um dos N
	alunos e calcular a média aritmética das notas. Contar quantos alunos estão com a
	nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0, imprimir
	mensagem: Não há nenhum aluno com nota acima de 5.
*/
package com.generation.ex18;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer qtdAlunos, i, contMedia = 0, contNotas7 = 0, contNotas5 = 0;
		float media = 0;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao sistema de notas!\nDeseja calcular a nota de quantos alunos?");
		qtdAlunos = reader.nextInt();
		
		float notasAlunos[] = new float[qtdAlunos];
		
		for(i = 0; i < notasAlunos.length; i++) {
			System.out.print("Nota - Aluno " + (i+1) + ": ");
			notasAlunos[i] = reader.nextFloat();
			media = media + notasAlunos[i];
			if(notasAlunos[i] >= 7)
				contNotas7++;
			if(notasAlunos[i] >= 5)
				contNotas5++;
		}
		media = media / qtdAlunos;
		
		if(contNotas5 == 0)
			System.out.printf("Media: %.2f\nNão há alunos com nota acima de 5.", media);
		else
			System.out.printf("Media: %.2f\nNúmero de alunos acima de 7: %d", media, contNotas7);
	}
}