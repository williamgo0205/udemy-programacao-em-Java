package br.com.geekuniversity.secao09;

import br.com.geekuniversity.secao09.classes.Pessoa;
import br.com.geekuniversity.secao09.classes.Produto;

// Objetos

/*
- Objetos são produtos/instaâncias da classe.
*/
public class Programa22 {

	public static void main(String[] args) {
		
		// Declaração de um objeto
		Produto p0;
		
		// Declaração e instanciação/iniciação do objeto
		// p1 -> instância do objeto / Objeto
		Produto p1 = new Produto();	// Construtor	
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("=================== Produtos ===================");
		System.out.println("Nome: " + p1.nome);
		System.out.println("Preço R$ " + p1.preco );
		System.out.println("Desconto: " + p1.desconto + "%");
		
		p0 = new Produto(); // Construtor
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5;
		
		System.out.println("");
		System.out.println("Nome: " + p0.nome);
		System.out.println("Preço R$ " + p0.preco );
		System.out.println("Desconto: " +p0.desconto + "%");
		
		Pessoa pessoa1 = new Pessoa(); // Construtor
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;
		
		System.out.println("=================== Pessoa ===================");	
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email );
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);
		
	}

}
