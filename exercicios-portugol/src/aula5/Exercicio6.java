package aula5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.println("\t::.. DIST�NCIA ENTRE DOIS PONTOS ..::");
		System.out.print("\nEntre com a coordenada x do ponto P1: ");
		x1 = leia.nextDouble();
		System.out.print("Entre com a coordenada y do ponto P1: ");
		y1 = leia.nextDouble();
		System.out.print("Entre com a coordenada x do ponto P2: ");
		x2 = leia.nextDouble();
		System.out.print("Entre com a coordenada y do ponto P2: ");
		y2 = leia.nextDouble();

		d = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2 - y1), 2.0));
		d = Math.round(d*100.0)/100.0; //forma de arredondar para 2 casas decimais
		System.out.println("\nA dist�ncia entre os 2 pontos � de: " + d + " metros.");
		
	}
}
