package aula12_05_05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
