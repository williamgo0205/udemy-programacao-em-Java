// Ainda Sobre fun��es
public class Programa21 {

	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
//		res = soma(valor1, valor2);
//		System.out.println("O Resultado �: " + res);
		
		System.out.println("O Resultado �: " + soma(valor1, valor2, "Ol�"));
		
		System.out.println(mensagem());
	}

	static int soma(int v1, int v2, String mensagem) {		
		System.out.println(mensagem);
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Ol� Usu�rio";
	}
}
