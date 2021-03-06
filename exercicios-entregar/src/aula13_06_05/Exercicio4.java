package aula13_06_05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/**
		 * Uma empresa desenvolveu uma pesquisa para saber as caracter?sticas psicol?gicas 
		 * dos indiv?duos de uma regi?o. Para tanto, a cada uma das pessoas era perguntado: 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op??es 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa 
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados 
		 * de 150 pessoas, calcule e mostre: 
			?	o n?mero de pessoas calmas; 
			?	o n?mero de mulheres nervosas; 
			?	o n?mero de homens agressivos; 
			?	o n?mero de outros calmos;
			?	o n?mero de pessoas nervosas com mais de 40 anos; 
			?	o n?mero de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner leia = new Scanner(System.in);
		int idade, genero, status, somaCalma=0, somaMulherNervosa=0, somaHomemAgressivo=0, somaOutroCalmos=0, somaCalma18=0, somaNervosa40=0, i =0;
		
		while (i <= 150) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("G?nero:\n1 - Feminino\n2 - Masculino\n3 - Outro");
			genero = leia.nextInt();
			System.out.println("Status:\n1 - Calma\n2 - Nervosa\n3 - Agressiva");
			status = leia.nextInt();
			
			if (status == 1) {
				somaCalma++;
			}
			if (genero == 1 && status == 2 ) {
				somaMulherNervosa++;
			}
			if (genero == 2 && status == 3) {
				somaHomemAgressivo++;
			}
			if (genero == 3 && status == 1) {
				somaOutroCalmos++;
			}
			if (status == 2 && idade > 40) {
				somaNervosa40++;
			}
			if (status == 1 && idade < 18) {
				somaCalma18++;
			}
			i++;
		}
		System.out.println("Quantidade de pessoas calmas: "+somaCalma);
		System.out.println("Quantidade de mulheres nervosas: "+somaMulherNervosa);
		System.out.println("Quantidade de homens agressivos: "+somaHomemAgressivo);
		System.out.println("Quantidade de pessoas calmas n?o definidas como fem/masc: "+somaOutroCalmos);
		System.out.println("Quantidade de pessoas nervosas maiores de 40 anos: "+somaNervosa40);
		System.out.println("Quantidade de pessoas calmas menores de 18 anos: "+somaCalma18);
	}
}
