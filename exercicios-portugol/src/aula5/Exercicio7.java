package aula5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		
		System.out.println("\t::.. SISTEMA DE EQUA??ES LINEARES..::");
		System.out.print("\nEntre com o valor de a: ");
		a = leia.nextFloat();
		System.out.print("Entre com o valor de b: ");
		b = leia.nextFloat();
		System.out.print("Entre com o valor de c: ");
		c = leia.nextFloat();
		System.out.print("Entre com o valor de d: ");
		d = leia.nextFloat();
		System.out.print("Entre com o valor de e: ");
		e = leia.nextFloat();
		System.out.print("Entre com o valor de f: ");
		f = leia.nextFloat();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.println("\nA solu??o da equa??o linear ? S = {" + x + "," + y + "}");
	}
	
	/*
	real a, b, c, d, E, f, x, y

	escreva("Sistema de Equa??es Lineares")
	
	escreva("\nEntre com o valor de a: ")
	leia(a)
	escreva("\nEntre com o valor de b: ")
	leia(b)
	escreva("\nEntre com o valor de c: ")
	leia(c)
	escreva("\nEntre com o valor de d: ")
	leia(d)
	escreva("\nEntre com o valor de e: ")
	leia(E)
	escreva("\nEntre com o valor de f: ")
	leia(f)
	
	x = (c*E - b*f)/(a*E - b*d)
	y = (a*f - c*d)/(a*E - b*d)

	escreva("A solu??o da equa??o linear ? S = {", x, "," ,y, "}") */
}
