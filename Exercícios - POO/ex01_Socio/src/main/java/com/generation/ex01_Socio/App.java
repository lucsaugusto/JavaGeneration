package com.generation.ex01_Socio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Integer opc;
    	Scanner reader = new Scanner(System.in);
        Socio socio = new Socio();
        
        
        System.out.println("-- PROGRAMA DE SÓCIOS --");
        
        do {
        	System.out.println("Selecione uma opção.\n1 - Cadastrar\n2 - Confirmar Cadastro\n3 - Validar Cadastro\n4 - Alterar Cadastro\n");
        	opc = reader.nextInt();
        	switch(opc) {
        	case 1 : 
        		socio.cadastrar();
        		break;
        	case 2 : 
        		socio.confirmarCadastro();
        		break;
        	case 3 : 
        		socio.validarSocio();
        		break;
        	case 4 : 
        		socio.alterar();
        		break;
        	case 0 : 
        		System.out.println("Saindo.");
        		break;
        	default :
        		System.out.println("Opção inválida! Tente novamente.");
        		break;
        	}
        } while(opc != 0);
        
        
    }
}
