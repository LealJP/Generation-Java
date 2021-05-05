package aula12_05_05;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c, maior, menor, meio;
		
		System.out.println("\t::.. ORDEM CRESCENTE DE NÚMEROS ..::");
		
		System.out.print("\nEntre com valor para a: ");
		a = leia.nextInt();
		System.out.print("Entre com valor para b: ");
		b = leia.nextInt();
		System.out.print("Entre com valor para c: ");
		c = leia.nextInt();
		
		if (a >= b && a >= c) {
			maior = a;
			if (b >= c) {
				menor = c;
				meio = b;
			} else {
				menor = b;
				meio = c;
			}
		} else if (b >= a && b >= c) {
			maior = b;
			if (a >= c) {
				menor = c;
				meio = a;
			} else {
				menor = a;
				meio = c;
			}
		} else {
			maior = c;
			if (a >= b) {
				menor = b;
				meio = a;
			} else {
				menor = a;
				meio = b;
			}
		}
		
		System.out.println("\nOrdem crescente dos valores : " + menor + ", " + meio + ", " + maior);
		
	}

}
