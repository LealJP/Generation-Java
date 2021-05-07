package aula14_07_05;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao 
		 * usuário um menu de opções:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
			Na terceira opção o valor da constante deve ser lido e o resultado da adição 
			da constante deve ser armazenado na própria matriz.
		 */
		
		float [][]A = new float[2][2];
		float [][]B = new float[2][2];
		Scanner leia = new Scanner(System.in);
		int op;
		
		System.out.println("   Construindo a matriz A");
		for(int i = 0; i < 2; i++) {
			for (int j =0; j < 2; j++) {
				System.out.print("Digite um valor para A["+i+"]["+j+"]: ");
				A[i][j] = leia.nextFloat();
			}	
		}
		System.out.println("\n   Construindo a matriz B");
		for(int i = 0; i < 2; i++) {
			for (int j =0; j < 2; j++) {
				System.out.print("Digite um valor para B["+i+"]["+j+"]: ");
				B[i][j] = leia.nextFloat();
			}	
		}
		System.out.println("\n\t::.. Menu de opções ..::");
		System.out.println("\t(1) somar as duas matrizes \n\t(2) subtrair a primeira matriz "
				+ "da segunda \n\t(3) adicionar uma constante as duas matrizes "
				+ "\n\t(4) imprimir as matrizes ");
		System.out.print("\tEscolha uma opção: ");
		op = leia.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("\n\tSOMA DAS MATRIZES A + B = AB");
				float [][]somaAB = new float[2][2];
				for(int i = 0; i < 2; i++) {
					for (int j =0; j < 2; j++) {
						somaAB[i][j] = A[i][j] + B[i][j];
						System.out.println("\tAB["+i+"]["+j+"]: "+somaAB[i][j]);
					}	
				}
			break;
			case 2:
				System.out.println("\n\tSUBTRAÇÃO DAS MATRIZES A - B = C");
				float [][]C = new float[2][2];
				for(int i = 0; i < 2; i++) {
					for (int j =0; j < 2; j++) {
						C[i][j] = A[i][j] - B[i][j];
						System.out.println("\tC["+i+"]["+j+"]: "+C[i][j]);
					}	
				}
			break;
			case 3:
				System.out.println("\n\tSOMA DE CONSTANTE ÀS MATRIZES A E B");
				System.out.println("\tDigite um valor para adicionar as matrizes A e B: ");
				int k = leia.nextInt();
				for(int i = 0; i < 2; i++) {
					for (int j =0; j < 2; j++) {
						A[i][j] = k + A[i][j]; 
						B[i][j] = k + B[i][j]; 
					}	
				}
				System.out.println("\tNovas matrizes A e B com o valor "+k+" adicionado");
				for(int i = 0; i < 2; i++) {
					for (int j =0; j < 2; j++) {
						System.out.print("\tA["+i+"]["+j+"]: " +A[i][j]);
						System.out.println("\tB["+i+"]["+j+"]: " +B[i][j]);
					}	
				}
			break;
			case 4:
				System.out.println("\n\t  MATRIZ A        MATRIZ B");
				for(int i = 0; i < 2; i++) {
					for (int j =0; j < 2; j++) {
						System.out.print("\tA["+i+"]["+j+"]: " +A[i][j]);
						System.out.println("\tB["+i+"]["+j+"]: " +B[i][j]);
					}	
				}
			break;
			default:
				System.out.println("ATENÇÃO: Valor digitado fora do menu de opções!");
		}
	}

}
