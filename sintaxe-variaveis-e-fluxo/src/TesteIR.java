
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario < 2800.0) {
			System.out.println("Al�quota de 7,5%");
			System.out.println("Dedu��o de at� R$ 142,00");
		} else if (salario >= 2800.0 && salario < 3751.0) {
				System.out.println("Al�quota de 15%");
				System.out.println("Dedu��o de at� R$ 350,00");
		} else if (salario >= 3751.0 && salario < 4664.0) {
					System.out.println("Al�quota de 22.5%");
					System.out.println("Dedu��o de at� R$ 636,00");
		}
	}

}
