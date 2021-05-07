package aula5;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float custoFab, distribuidor, impostos, custoCons;
		
		System.out.println("\t::.. CUSTO FINAL AO CONSUMIDOR ..::");
		System.out.print("\nEntre com o custo de fábrica: ");
		custoFab = leia.nextFloat();
		distribuidor = (float)0.28*custoFab; //o valor 0.28 em double foi casting para float
		impostos = (float)0.45*custoFab;
		custoCons = custoFab + distribuidor + impostos;
		System.out.println("\nCusto final para o consumidor: " + custoCons);
		
		
	}
	
	/*
	real custoFab, distribuidor, impostos, custoCons
	
	escreva("Custo Final ao Consumidor")

	escreva("\nEntre com o custo de fábrica: ")
	leia(custoFab)

	distribuidor = 0.28*custoFab
	impostos = 0.45*custoFab

	custoCons = custoFab + distribuidor + impostos
	escreva("\nCusto final para o consumidor: ",custoCons)*/

}
