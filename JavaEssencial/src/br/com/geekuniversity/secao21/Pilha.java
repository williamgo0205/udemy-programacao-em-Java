package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	
	
	/**
	 * Em uma pilha inserimos elementos sempre no topo
	 * @param nome
	 * 
	 * Na implementação do Java para pilhas (Stack) este método chama-se push
	 */
	public void insere(String nome) {
		this.nomes.add(nome);		
	}
	
	/**
	 * Em uma pilha removemos sempre o elemento que está no topo
	 * @return
	 * 
	 * Na implementação do Java para pilhas (Stack) este método chama-se pop
	 */
	public String remove() {
		try {
			return this.nomes.remove(nomes.size() -1);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("A Pilha já está vazia");
			return "";
		}	
	}
	
	public boolean vazia() {
		return this.nomes.size() == 0;
	}
	
	
	public String pegaTopo() {
		return this.nomes.get(nomes.size() -1);
	}
	
	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
