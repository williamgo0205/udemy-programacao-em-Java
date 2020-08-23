// Tipo de dados Alfanuméricos
// Caracteres e Strings
public class Programa13 {

	public static void main(String[] args) {
		// Tipos Primitivos
		char letra1 = 'a'; // representa com aspas simples
		char letra2 = 97; // 97 em deciaml é o caractere "a" na tabela ASCII
		// Observação: Não existe tipo primitivo string somente, String 
		
		System.out.println("Letra1: " + letra1);
		System.out.println("Letra2: " + letra2);
		
		letra2 = (char) (letra2 + 1); // cast		
		System.out.println("Letra2: " + letra2);
		
		// Tipos não primitivos
		Character letra3 = 'a';
		String nome = "Geek University";
		
		System.out.println("Letra3: " + letra3);
		System.out.println("nome: "   + nome);
		
		//Ocupação em memória das variáveis
		System.out.println("char/Character "    + Character.SIZE                 + " bits");
		System.out.println("Tamanho da String " + nome.length() + " caracteres");
		System.out.println("String "            + Character.SIZE *nome.length()  + " bits");
		
		// Valores Mínimos e máximos dos tipos
		System.out.println("Valor Minimo char/Character " + Character.MIN_VALUE); // 0
		System.out.println("Valor Máximo char/Character " + Character.MAX_VALUE); // 65535
		
		//System.out.println("Valor Minimo String " + String.MIN_VALUE);
		//System.out.println("Valor Máximo String " + String.MAX_VALUE); 
		
	}

}
