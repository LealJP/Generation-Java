package aula12_05_05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba 
		 * se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
		 * do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("\t::.. N�MERO � PAR OU �MPAR ..::");
		System.out.print("\nEntre com um valor: ");
		num = leia.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero � par!");
			double raiz = Math.sqrt(num);
			System.out.printf("Ra�z quadrada do n�mero � %1.1f",raiz);
		} else {
			System.out.println("O n�mero � �mpar!");
			double quadrado = Math.pow(num, 2);
			System.out.printf("O quadrado do n�mero � %1.1f", quadrado );
		}

	}

}
