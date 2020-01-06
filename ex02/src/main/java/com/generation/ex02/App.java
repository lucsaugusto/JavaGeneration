/*
Ex02
	Desenvolva um pequeno programa de login e senha. Para isso, peça ao
	usuário para digitar o seu login e armazene o que o usuário digitou em uma
	variável. Em seguida, peça para o usuário digitar a sua senha e armazena em
	uma outra variável. Por fim, verifique se o login e a senha são iguais àquele
	definido por você.
 */
package com.generation.ex02;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		String login, password, loginTry, passwordTry;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo! \nCadastre-se abaixo.");
		System.out.println("Crie seu login:");
		login = reader.nextLine();
		
		System.out.println("Crie sua senha:");
		password = reader.nextLine();
		
		System.out.println("Faça seu login.");
		
		do {
			System.out.println("login:");
			loginTry = reader.nextLine();
			
			System.out.println("senha:");
			passwordTry = reader.nextLine();
			
			if ( !login.equals(loginTry) || !password.equals(passwordTry) )
				System.out.println("Credenciais incorretas, tente novamente!");
			if ( login.equals(loginTry) && password.equals(passwordTry) )
				System.out.println("Usuário " + login + " logado com sucesso!");
		} while ( !login.equals(loginTry) || !password.equals(passwordTry) );
	}
}
