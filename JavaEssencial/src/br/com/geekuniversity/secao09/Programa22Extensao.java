package br.com.geekuniversity.secao09;

import br.com.geekuniversity.secao09.classes.Pessoa;

// Construtor

/*
- O Construtor de classe SEMPRE tem o mesmo nome da classe.
- Por padr�o a JVM (Java Virtual Machine), cria em tempo de execu��o o construtir padr�o (Construtor Vazio).
- Podemos ter mais de um construtor na classe.
*/

public class Programa22Extensao {

	public static void main(String[] args) {
		// Construtor vazio
		Pessoa pessoa1 = new Pessoa(); 

		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;

		pessoa1.imprime_informacoes();

		// Construtor recebendo par�metros
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "jolie@gmai.com", 1976);
		pessoa2.imprime_informacoes();
	
	}

}
