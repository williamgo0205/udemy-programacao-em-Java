package br.com.geekuniversity.secao11;

//Protected

// � o modificador de acesso default (Padr�o)
/*
- O modificador de acesso protected faz qcom que o elemento de acesso seja vis[uvel somente dentro do mesmo
  pacote onde o elemento foi declarado
*/
public class Cliente implements Comparable {
	private int idade;
	private String nome;
	private String endereco;

	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	protected void dizer_oi() {
		System.out.println(this.nome + " est� dizendo Oi...");
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object object) {
		Cliente aux = (Cliente) object;

		if (this.idade < aux.idade) {
			return -1;
		} else if (this.idade > aux.idade) {
			return 1;
		} else {
			return 0;
		}
	}

}
