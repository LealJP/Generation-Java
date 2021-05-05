
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2; 
		boolean acompanhado; //tem q ser criada aqui para que a linha 20 acesse a variável
		
		if (quantidadePessoas >= 2) {
			// boolean acompanhado = true; se criar aqui a variavel morre nesse escopo (trecho)
			acompanhado = true;			
		}else {
			//boolean acompanhado = false; se criar aqui a variavel tmb morre nesse escopo
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado); 
		
		if (idade >= 18 && acompanhado) { 
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");	
		}
	}

}
