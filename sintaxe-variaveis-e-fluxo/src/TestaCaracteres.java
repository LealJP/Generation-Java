
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66; //na tabela de c?digos o valor 66 corresponde ao c?digo letra 'B'
		System.out.println(valor);//sa?da = B 
		
		//valor = valor + 1; ? compila, pq 'valor' ? do tipo char e 1 ? do tipo 'inteiro'
		// assim a soma ? o inteiro '67' que n?o cabe na vari?vel char 'valor']
		
		valor = (char) (valor + 1); //type casting o numero inteiro 67 em char
		System.out.println(valor); //sa?da = C
		
		String palavra = "alura cursos online tecnologia"; //String ? uma refer?ncia a um objeto
		System.out.println(palavra);
		
		palavra = palavra + 2020; //ir? concatenar '2020' ao texto dentro da vari?vel palavra
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";

		System.out.println(parcela1 + parcela2);//Sa?da --> 1020
		
	}

}
