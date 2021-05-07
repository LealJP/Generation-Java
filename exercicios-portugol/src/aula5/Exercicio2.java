package aula5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int totalDias, anos, dias, meses;
		
		System.out.println("Informe a quantidade de dias vividos: ");
		totalDias = leia.nextInt();
		
		anos = totalDias/365;
		dias = totalDias%365;
		meses = dias/30;
		dias = dias%30;
		
		System.out.println("Quantidade de anos :" + anos);
		System.out.println("\nQuantidade de meses: " + meses);
		System.out.println("\nQuantidade de dias: " + dias);
		
	}

}
