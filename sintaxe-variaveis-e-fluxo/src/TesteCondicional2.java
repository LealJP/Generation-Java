
public class TesteCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; //vari�vel boolean aceita s� 2 valores true ou false
							// (quantidadePessoas >= 2) tem valores poss�veis verdadeiro ou falso
		
		System.out.println("Valor de acompanhado = " + acompanhado); //transforma a sa�da da
							//vari�vel booleana acompanhada em string
		
		if (idade >= 18 || quantidadePessoas >= 2) { // || = or (operador l�gico ou)
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");	
		}
		
		if (idade >= 18 && acompanhado) { // && = and (operador l�gico e)
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");	
		}
	}
}
