package declaraçãoEstruturaVariavel;

public class DeclaraçãoEstruturasVariaveis {
	/*variaveis globais são variaveis para usar em mais de um método e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[]args) {
		boolean logica;
		boolean logica2;
		
		int num;
		int num2;
		
		/*a variavel sempre tem que corresponder ao que o dado representa*/
		/*variaveis locais são variaveis que pertencem somente ao método que ela esta escrita*/
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		
		String cpf = "000.000.000-00";
		
		long num3;
		
		System.out.println("A maior idade é: " + maiorIdade);
		
		System.out.println("A idade do idoso é: " + idosoIdade);
		
		System.out.println("A idade do jovem é: " + jovemIdade);
		
		System.out.println("A idade da criança é: " + criancaIdade);
		
		metodo2();
		
		System.out.println("Valor da variavel Global local é: " + maiorIdadeGlobal);
		
	}
	
	public static void metodo2() {
		System.out.println("Valor da variavel global: " + maiorIdadeGlobal);
	}

}
