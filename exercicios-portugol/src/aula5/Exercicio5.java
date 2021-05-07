package aula5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, media;
		
		System.out.println("Entre com a 1ª nota: ");
		n1 = leia.nextFloat();
		System.out.println("Entre com a 2ª nota: ");
		n2 = leia.nextFloat();
		System.out.println("Entre com a 3ª nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("A média final do aluno é: " + media);
	}
}