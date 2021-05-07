
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;		
		System.out.println("Meu salário é " + salario);
		
		double idade = 37; //37 é um inteiro suportado pelo tipo double (ponto flutuante)
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2; //inteiro/inteiro = inteiro
		System.out.println(outraDivisao); //resultado igual a 2 --> numero inteiro
		
		double novaTentativa = 5/2; //vai divividir o inteiro 5 pelo inteiro 2
		System.out.println(novaTentativa); //resultado igual a 2.0 porque "converte" para double
		
		double novaTentativas = 5.0/2; //transformar um valor em double resolve
		System.out.println(novaTentativas); //resultado 2.5
		
		int dia = 4;
		int outroDia = 4 + dia;
		System.out.println(outroDia);
		
	   //int valor = 12.5;             não compila.

	   //int valor2 = 0.0;             não compila.

	    double teste = 125.50;        //compila

	   //int valor3 = teste;     
		
	}

}
