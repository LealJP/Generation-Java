
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
	        
	        n�o compila porque a vari�vel salario foi criada
	        dentro do if e else e morre nesse escopo (ap�s as chaves a vari�vel 
	        salario deixa de existir e n�o pode ser acessada pelo sysout
	             * 
	             Solu��o abaixo:*/
	        
	        double salario;
	        if (foiPromovido) {
	        	salario = 4200.0;
	        } else {
	        	salario = 3800.0;
	        }
	        System.out.println(salario);
	    }
	
}
