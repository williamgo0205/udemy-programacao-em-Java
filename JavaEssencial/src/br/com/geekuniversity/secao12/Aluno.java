package br.com.geekuniversity.secao12;

/* Beneficios da Heran�a
- Evita a repeti��o de c�digo;
- Facilita a manuten��o do Programa;
- ...... 
- Classe Especifica;
- Sub-classe;
- Classe filha
*/
// Aluno � uma pessoa
/*
 - Quado uma classe herda de outra classe ela ganha:
   - Todos os atrubutos e m�todos da classe herdada
*/
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		this.ra = ra;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRA(String ra) {
		this.ra = ra;
	}
	
	// Overriding / Sobrescrita de m�todo
	public String getNome() {
		return "Aluno: " + super.getNome();
	}

	// Overriding / Sobrescrita de m�todo
	public String toString() {
		return super.toString() + ", R.A.: " + this.ra + "]";
	}

	@Override
	public void outra_Mensagem(String texto) {
		System.out.println(texto);
	}
	
	
	
}
