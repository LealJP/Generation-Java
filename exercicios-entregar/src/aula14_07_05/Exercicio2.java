package aula14_07_05;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */
		
		Scanner leia = new Scanner(System.in);
		int[] vetor = new int[6];
		int  somaPar = 0, qtdImpar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número inteiro: ");
			vetor[i] = leia.nextInt();
			if (vetor[i] % 2 == 0) {
				System.out.println("Esse número é par!\n");
				somaPar = somaPar + vetor[i];
			} else {
				System.out.println("Esse número é ímpar!\n");
				qtdImpar++;
			}
		}
		System.out.println("\tSoma dos números pares: " + somaPar);
		System.out.println("\tSoma dos números ímpares: "+qtdImpar);
	}

}
