package aula13_06_05;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		/**
		 * Crie um programa que leia um n�mero do teclado at� que encontre um 
		 * n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		 */
		int num, soma = 0;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			soma = soma + num;
		} while (num != 0);
		System.out.println("Quantidade de n�mreos digitados: "+soma);
	}
}
