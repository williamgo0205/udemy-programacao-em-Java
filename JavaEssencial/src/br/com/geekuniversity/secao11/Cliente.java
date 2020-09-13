package br.com.geekuniversity.secao11;

//Protected

// � o modificador de acesso default (Padr�o)
/*
- O modificador de acesso protected faz qcom que o elemento de acesso seja vis[uvel somente dentro do mesmo
  pacote onde o elemento foi declarado
*/
public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		super();
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
	
}