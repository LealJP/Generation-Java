package aula12_05_05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Faça um programa em que permita a entrada de um número qualquer e exiba 
		 * se este número é par ou ímpar. Se for par exiba também a raiz quadrada 
		 * do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("\t::.. NÚMERO É PAR OU ÍMPAR ..::");
		System.out.print("\nEntre com um valor: ");
		num = leia.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O número é par!");
			double raiz = Math.sqrt(num);
			System.out.printf("Raíz quadrada do número é %1.1f",raiz);
		} else {
			System.out.println("O número é ímpar!");
			double quadrado = Math.pow(num, 2);
			System.out.printf("O quadrado do número é %1.1f", quadrado );
		}

	}

}
