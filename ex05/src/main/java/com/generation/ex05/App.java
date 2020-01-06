/*
Ex05
	Faça um programa para pagamento de comissão de vendedores de peças,
	levando-se em consideração que sua comissão será de 5% do total da venda e

	que você tem os seguintes dados: - Identificação do vendedor - Código da peça
	- Preço unitário da peça - Quantidade vendida.
 */

package com.generation.ex05;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Integer idSeller, idProduct, quantProduct;
		double valueProduct, comissionSeller;
		Scanner reader = new Scanner(System.in);

		System.out.println("Seja bem-vindo ao sistema de comissão!");
		
		System.out.println("Digite a identificação do vendedor:");
		idSeller = reader.nextInt();
		
		System.out.println("Digite a identificação da peça:");
		idProduct = reader.nextInt();
		
		System.out.println("Digite o valor da peça:");
		valueProduct = reader.nextFloat();
		
		System.out.println("Digite a quantidade de peças:");
		quantProduct = reader.nextInt();
		
		comissionSeller = (quantProduct*valueProduct) * 0.05;
		
		System.out.println("Valor da comissão do vendedor " + idSeller + " é de : R$ " + comissionSeller);
	}
}
