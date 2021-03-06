// Classes

// Atributos

// Metodos

// Construtotes

/*
- Sempre um construtor vazio tem a seguinte forma:

public NomeDaClasse() {}
*/

package br.com.geekuniversity.secao09.classes;

public class Pessoa {
	public String nome, email;
	public int ano_nascimento;
	
	//Construtir Vazio
	public Pessoa() {}
	
	// Construtor com Parāmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		super();
		// this == Este Objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}

	public void imprime_informacoes() {
		System.out.println("");
		System.out.println("Nome: " + this.nome);
		System.out.println("E-Mail: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_nascimento);
	}
}
