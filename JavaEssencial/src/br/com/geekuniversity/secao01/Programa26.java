package br.com.geekuniversity.secao01;

// Public

/*
Publico - pode ser utilizado em todo projeto
*/
import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cli = new Cliente(18, "Angelina Jolie", "Rua da Barra, 256");
//		cli.dizer_oi(); // Protected
 
// Tornaram-se m�todos privados		
//		System.out.println("Nome: " + cli.nome);
//		System.out.println("Endere�o: " + cli.Endereco);
	}

}
