import java.util.Scanner;

// Criando npssas pr�prias fun��es

/*
Fa�a um programa, que receba diversos nomes 
de frutas do usu�rio e no final imprima essas 
frutas em ordem contr�ria. 

Exemplo:

O programa deve
solicitar ao usu�rio quantas frutas ele quer 
informar. 

Informe quantas frutas deseja Cadastrar:
2

Informe o nome de uma fruta:
Manga

Informe o nome de uma fruta:
Goiaba

Goiaba
Manga
*/

public class Programa20 {
	// Vari�veis Globais
	// Declara��o do vetor 
	private static String frutas[];	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Vari�vel Local
		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());

		cadastrar_dados(qtd);

		mostrar_dados(qtd);
		
		teclado.close();

	}

    /*
     Uma fun��o deve ter o seguinte
     a) Tipo de retorno (Tipo de dado que a fun��o vai retornar)
     b) nome (Corresponde a a��o que a fun��o realiza)
     c) Par�metros/Argumentos de entrada (Opcional)
     d) retorno (Opcional - Depende do tipo de etorno)
     */
	//Void = Vazio
	private static void cadastrar_dados(int quantidade) {
		// Definindo Tamanho do vetor
		frutas = new String[quantidade];
		
		for (int i = 0; i < quantidade; i++) { //i++ -> i = i + 1
			System.out.println("Informa a " + (i + 1) + "� fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	private static void mostrar_dados(int quantidade) {
		for (int i = quantidade-1; i >= 0; i--) { //i-- -> i = i - 1
			System.out.println(frutas[i]);
		}
	}
}
