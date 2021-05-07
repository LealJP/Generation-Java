package aula5;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, meses, dias, resultado;
		
		System.out.println("\n::..CONVERTENDO ANOS VIVIDOS EM DIAS..::");	
		
		System.out.println("\nEscreva sua idade em anos: ");
		idade = leia.nextInt();
		System.out.println("\nO mês atual representa quantos meses após seu aniversário: ");
		meses = leia.nextInt();
		System.out.println("\nO dia atual representa quantos dias após seu aniversário? ");
		dias = leia.nextInt();
		
		resultado = idade*365 + meses*30 + dias;
		System.out.println("\nVocê têm "+ resultado + " dias vividos!!") ;
	}

}
