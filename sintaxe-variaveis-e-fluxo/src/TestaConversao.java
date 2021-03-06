
public class TestaConversao {

		public static void main(String[] args) {
			
			double salario = 1270.50;
			int valor = (int) salario; //(tipo vari?vel) chama type casting --> faz a "conversao" da variavel salario double 
									   //caber na variavel inteira valor
			System.out.println(valor); //saida = 1250 --> um valor inteiro
			
			//Tipos primitivos: int, double, long, short, byte
			
			//int s? "aguenta" numeros de 32 bits (2 bilh?es)
			long numeroGrande = 23659998959556L; //cabe um n?mero bem grande de 64bits (2^64)
			short valorPequeno =  32767; // menor que o int (16bits = 2^16/2 -1);
			byte b = 127; //(2^8)/2 - 1) --> a variavel byte suporta 1 byte (8 bits)
			
			double valor1 = 0.2;
			double valor2 = 0.1;
			double total = valor1 + valor2;
			System.out.println(total); //sa?da = 0.30000000000000004
			
			float pontoFlutuante = 3.14f; //float tamb?m ? uma vari?vel do tipo flutuante
			float pontoFlutuanteExemplo = (float) 3.14; //3.14 ? do tipo double, por tanto
														//devemos transformar em tipo float
			
			float total2 = (float) total;
			System.out.println(total2); //s?ida = 0.3, por tanto ? uma bom recurso para n?o
									    //obter a sa?da "absurda" 0.30000000000000004
			
		}
}
