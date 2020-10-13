package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	private List<String> nomes = new LinkedList<String>();
	
	/**
	 * Adiciona um elemento a fila
	 * @param nome
	 * 
	 * Na implementa��o do Java para filas (Queue) este m�todo chama-se add
	 */
	public void adiciona(String nome) {
		this.nomes.add(nome);		
	}
	
	/**
	 * Remove o primeiro elemento da fila
	 * @return
	 * 
	 * Na implementa��o do Java para Filas (Queue) este m�todo chama-se pop
	 */
	public String remove() {
		try {
			return this.nomes.remove(0);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("A fila j� est� vazia");
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
