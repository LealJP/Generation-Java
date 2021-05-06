package aula12_05_05;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/**
		 *Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			•	10-14 infantil
			•	15-17 juvenil
			•	18-25 adulto

		 */
		Scanner leia = new Scanner(System.in);
		int idade, categoria=0;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			categoria = 1;
			System.out.println("Categoria Infantil");
		} else if (idade >= 15 && idade <= 17) {
			categoria = 2;
			System.out.println("Categoria Juvenil");
		} else if (idade >= 18 && idade <= 25) {
			categoria = 3;
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Você digitou uma idade não categorizada/inválida!");
		}
		
		/* Outra forma de fazer, só para testar o switch
		switch(categoria) {	
			case 1:
				System.out.println("Categoria Infantil");
				break;
			case 2:
				System.out.println("Categoria Juvenil");
				break;
			case 3:
				System.out.println("Categoria Adulton");
				break;
			default:
				System.out.println("Você digitou uma idade não categorizada/inválida!");
		} */
	}

}
