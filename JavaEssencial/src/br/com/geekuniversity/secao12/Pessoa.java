package br.com.geekuniversity.secao12;

/*
 - Classe Base
 - Classe Mãe
 - Classe Classe
 - Super classe
 - Classe genérica
*/

// Agora como classe abstrata
/*
 - Desta forma, impossibilitamos a criação de objetos dessa classe
 - Uma classe abstrata pode ter:
   - Atributos;
   - Métodos;
   - Métodos abstratos;
   
 - Métodos Abstratos
   - São métodos que não possuem implemetação, possuem apenas declaração, e, 
     obrigatoriamente, as classes que herdarem dessa classe com métodos abstratos, 
     precisa implementar esses métodos.
*/
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		super();
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return ano_nascimento;
	}
	
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	// Overriding / Sobrescrita de método
	public String toString() {
		return "Nome: " + this.nome + ", ano nascimento: " + this.ano_nascimento + ", email: " + this.email;
	}
	
	// Overloading / Sobrecarga de Método
	public void mensagem() {
		System.out.println("Esta é a minha mensagem!!!");
	}
	
	// Overloading / Sobrecarga de Método
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// Overloading / Sobrecarga de Método
	public void mensagem(String msg, int num) {
		System.out.println(msg + "-" + num);
	}
	
	// Declaração de um método abstrato
	public abstract void outra_Mensagem(String texto);

}
