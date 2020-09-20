package br.com.geekuniversity.secao12;

/*
 - Classe Base
 - Classe M�e
 - Classe Classe
 - Super classe
 - Classe gen�rica
*/
public class Pessoa {
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
}
