// Tipos Booleanos
public class Programa14 {

	public static void main(String[] args) {
		// Tipos Primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		// Tipos não primitivos
        Boolean	v = true;
        Boolean f = false;
        
		System.out.println("verdadeiro: " + verdadeiro);
		System.out.println("falso: " + falso);
		System.out.println("v: " + v);
		System.out.println("f: " + f);
		
		//Ocupação em memória das variáveis
		// 0 -> False
		// 1 -> Verdadeiro
		
		if (verdadeiro) {
			System.out.println("É Verdadeiro");
		}else {
			System.out.println("É Falso");
		}
	}

}
