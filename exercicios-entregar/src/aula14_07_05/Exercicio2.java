package aula14_07_05;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		
		Scanner leia = new Scanner(System.in);
		int[] vetor = new int[6];
		int  somaPar = 0, qtdImpar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um n�mero inteiro: ");
			vetor[i] = leia.nextInt();
			if (vetor[i] % 2 == 0) {
				System.out.println("Esse n�mero � par!\n");
				somaPar = somaPar + vetor[i];
			} else {
				System.out.println("Esse n�mero � �mpar!\n");
				qtdImpar++;
			}
		}
		System.out.println("\tSoma dos n�meros pares: " + somaPar);
		System.out.println("\tSoma dos n�meros �mpares: "+qtdImpar);
	}

}
