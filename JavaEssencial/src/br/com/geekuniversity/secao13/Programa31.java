package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;
import br.com.geekuniversity.secao12.Pessoa;

// Classes abstratas
/*
 - � um recurso que proporciona um bloqueio na cria��o de objetos;
 - N�o conseguimos instanciar objetos de uma c�asse abstrata;
*/
public class Programa31 {

	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");
		
		System.out.println(maria);
		
		maria.outra_Mensagem("Meu nome �: " + maria.getNome());
	}

}
