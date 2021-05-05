
public class TesteSalario {


	    public static void main(String[] args) {

	        boolean foiPromovido = true;
	        
	        /*
	        if(foiPromovido) {
	            double salario = 4200.0;
	        } else {
	            double salario = 3800.0;
	        }

	        System.out.println(salario); 
	        
	        não compila porque a variável salario foi criada
	        dentro do if e else e morre nesse escopo (após as chaves a variável 
	        salario deixa de existir e não pode ser acessada pelo sysout
	             * 
	             Solução abaixo:*/
	        
	        double salario;
	        if (foiPromovido) {
	        	salario = 4200.0;
	        } else {
	        	salario = 3800.0;
	        }
	        System.out.println(salario);
	    }
	
}
