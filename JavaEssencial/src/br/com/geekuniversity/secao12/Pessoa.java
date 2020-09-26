package br.com.geekuniversity.secao12;

/*
 - Classe Base
 - Classe M�e
 - Classe Classe
 - Super classe
 - Classe gen�rica
*/

// Agora como classe abstrata
/*
 - Desta forma, impossibilitamos a cria��o de objetos dessa classe
 - Uma classe abstrata pode ter:
   - Atributos;
   - M�todos;
   - M�todos abstratos;
   
 - M�todos Abstratos
   - S�o m�todos que n�o possuem implemeta��o, possuem apenas declara��o, e, 
     obrigatoriamente, as classes que herdarem dessa classe com m�todos abstratos, 
     precisa implementar esses m�todos.
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

	// Overriding / Sobrescrita de m�todo
	public String toString() {
		return "Nome: " + this.nome + ", ano nascimento: " + this.ano_nascimento + ", email: " + this.email;
	}
	
	// Overloading / Sobrecarga de M�todo
	public void mensagem() {
		System.out.println("Esta � a minha mensagem!!!");
	}
	
	// Overloading / Sobrecarga de M�todo
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// Overloading / Sobrecarga de M�todo
	public void mensagem(String msg, int num) {
		System.out.println(msg + "-" + num);
	}
	
	// Declara��o de um m�todo abstrato
	public abstract void outra_Mensagem(String texto);

}
