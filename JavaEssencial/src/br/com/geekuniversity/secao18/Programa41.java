package br.com.geekuniversity.secao18;
// Trabalhando com Strings

/*
 - Em Java Strings s�o imut�veis, ou seja, n�o mudam. 
*/
public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programa��o em Java: Essencial";
		
		System.out.println(curso);
		
		System.out.println(curso.replace("Java", "Python")); // Altera na string, se encontrar, a primeira palavra pela segunda
		
		System.out.println(curso.toLowerCase()); // Converte as letras mai�sculas para min�sculas
		
		System.out.println(curso.toUpperCase()); // Converte as letras Min�sculas para mai�sculas
		
		System.out.println(curso.charAt(12)); //captura a posi��o informada no charAt
		
		System.out.println("\n>>>> Faz um loop em cada caractere do in�cio para o final");
		for (int i = 0; i < curso.length(); i++) {
			System.out.print(curso.charAt(i));
		}
		
		System.out.println("\n>>>> Faz um loop em cada caractere do Final para o in�cio");
		for (int i = curso.length() -1; i >= 0 ; i--) {
			System.out.print(curso.charAt(i));
		}		

	}

}
