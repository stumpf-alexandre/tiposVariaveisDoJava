package declara��oEstruturaVariavel;

public class Declara��oEstruturasVariaveis {
	/*variaveis globais s�o variaveis para usar em mais de um m�todo e o seu valor � compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[]args) {
		boolean logica;
		boolean logica2;
		
		int num;
		int num2;
		
		/*a variavel sempre tem que corresponder ao que o dado representa*/
		/*variaveis locais s�o variaveis que pertencem somente ao m�todo que ela esta escrita*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		
		String cpf = "000.000.000-00";
		
		long num3;
		
		System.out.println("A maior idade �: " + maiorIdade);
		
		System.out.println("A idade do idoso �: " + idosoIdade);
		
		System.out.println("A idade do jovem �: " + jovemIdade);
		
		System.out.println("A idade da crian�a �: " + criancaIdade);
		
		metodo2();
		
		System.out.println("Valor da variavel Global local �: " + maiorIdadeGlobal);
		
	}
	
	public static void metodo2() {
		System.out.println("Valor da variavel global: " + maiorIdadeGlobal);
	}

}
