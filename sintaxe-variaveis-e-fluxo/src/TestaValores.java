public class TestaValores {
	
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro; //segundo guardo o valor 5
		primeiro = 10; //atribui novo valor a vari�vel primeiro
		
		System.out.println(segundo); //Sa�da --> 5 porque as vari�veis primitivas guardam
		//valores atribuidos e n�o carregam refer�ncia. Assim mesmo que na linha posterior
		//eu tenha mudado o valor da variavel primeiro para 10, a variavel segundo n�o 
		//recebe essa mudan�a, pq fica com a atribui��o da linha anterior (de cima)
		
		System.out.println(primeiro); //Sa�da --> 10 novo valor que foi atribuido (linha 9)
		
		
		//Atividade - Concatenando String + inteiro --> o inteiro � transformado em string
		String saudacao = "Ol�, meu nome � ";
		String nome = "R�mulo ";
		String continuacao = "e minha idade � ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}	

}
