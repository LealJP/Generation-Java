package aula5;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b, c, r, s, d;
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextFloat();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextFloat();
		
		r = Math.pow((a+b), 2.0);
		s = Math.pow((b+c), 2.0);
		d = (r+s)/2;
		
		System.out.println("\nValor da variável R: " + r);
		System.out.println("\nValor da variável S: " + s);
		System.out.println("\nValor da variável D: " + d);
		
	}

}
