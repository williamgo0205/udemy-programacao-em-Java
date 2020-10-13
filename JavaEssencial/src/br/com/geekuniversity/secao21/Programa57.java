package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

// Lista Ligada / LinkedList

/*
 - Em um vetor os elementos estão um do lado do outro, enquanto que em uma lista ligada
   eles estão em lugares diferentes, porém um aponta para o outro indicando o próximo elemento.
   
   [0][3][1][2][5][4][null]
*/
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

// Testando o método adicionaNoComeço		
//		System.out.println(lista);		
//		lista.adicionaNoComeco("Maria");		
//		System.out.println(lista);
//		lista.adicionaNoComeco("Angelina");
//		System.out.println(lista);
//		lista.adicionaNoComeco("Felicity");
//		System.out.println(lista);
//		
//		String nome = "Pedro";
//		lista.adicionaNoComeco(nome);		
//		System.out.println(lista);
//		
//		int numero = 42;
//		lista.adicionaNoComeco(numero);
//		System.out.println(lista);
//		
//		Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
//		lista.adicionaNoComeco(cli1);
//		System.out.println(lista);
		
		
// Testando o método Adiciona   		
//		System.out.println(lista);
//		
//		lista.adiciona("Angela");
//		System.out.println(lista);
//		lista.adiciona("Maria");
//		System.out.println(lista);
//		
//		lista.adicionaNoComeco("Felicity");
//		System.out.println(lista);
		
// Testando o método Adiciona (no meio)		
//		lista.adiciona(1, "Xuxa");
//		System.out.println(lista);

// Testando o método Pega
//		Object ret = lista.pega(1);
//		System.out.println(ret);
		
// Testando o Método referente ao tamanho da lista
//		System.out.println(lista.tamanho());
		
// Testando o método removeDoComeco
		System.out.println(lista);
		
		lista.adiciona("Angelina");		
		lista.adiciona("Maria");		
		lista.adiciona("Felicity");
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);
		
	}

}
