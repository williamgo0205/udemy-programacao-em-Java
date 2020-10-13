package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	private List<String> nomes = new LinkedList<String>();
	
	/**
	 * Adiciona um elemento a fila
	 * @param nome
	 * 
	 * Na implementação do Java para filas (Queue) este método chama-se add
	 */
	public void adiciona(String nome) {
		this.nomes.add(nome);		
	}
	
	/**
	 * Remove o primeiro elemento da fila
	 * @return
	 * 
	 * Na implementação do Java para Filas (Queue) este método chama-se pop
	 */
	public String remove() {
		try {
			return this.nomes.remove(0);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("A fila já está vazia");
			return "";
		}		
	}
	
	public boolean vazia() {
		return this.nomes.size() == 0;
	}
	
	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
