import java.util.Scanner;

/*
 * Receba dados do usu�rio enquanto a idade for maior que 0
 */

// While e Do While
public class Programa07 {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;		
		
        // Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		// Sempre checa o valor antes de executar o bloco
		while (idade > 0) {			
			System.out.println("Informe seu nome: " );
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			/* Observa��o:
			   Se o sistema recebe uma string e depois uma integer
			   Seguidamente depois do integer recebe uma String novamente
			   O Sistema ignora a Stringe  vai para o inteiro novamente
			   Por esse motivo, � necess�rio realizar a convers�o abaixo
			*/
			//idade = teclado.nextInt(); //Bug
			
			idade = Integer.parseInt(teclado.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
		}
			
		teclado.close();
		
	}

}
