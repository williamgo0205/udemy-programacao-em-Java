package br.com.geekuniversity.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Lista
0 -> a
1 -> b
.
.
.
25 -> z 
*/

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	/**
	 * Cria o construtor de LinkedList para as 26 letras do alfabeto
	 */
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	/**
	 * Calcula o índice do nome para criação das listas de cada letra
	 * 
	 * @param nome
	 * @return
	 */
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}

	/**
	 * Adiciona o nome a lista correta pelo índice
	 * 
	 * @param nome
	 * 
	 * Na implementação do Java para Conjuntos (Set) este método chama-se add
	 */
	public void adiciona(String nome) {
		// 1 - Verifica se o nome não existe na lista
		if (!contem(nome)) {
			// 2 - Calculando o índice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegando a lista de acordo com o índice
			List<String> lista = tabela.get(indice);
			// 4 - Adicionando o nome a lista correta
			lista.add(nome);
		}
	}

	/**
	 * Verifica se o nome contém ou não na lista especifica selecionada pelo nome
	 * 
	 * @param nome
	 * @return
	 */
	private boolean contem(String nome) {
		// 1 - Calculando o índice do nome
		int indice = calculaIndice(nome);
		// 2 - Buscamos na tabela específica do índice o nome
		return tabela.get(indice).contains(nome);
	}

	/**
	 * Remove o nome da lista específica caso exista
	 * 
	 * @param nome
	 * 
	 * Na implementação do Java para Conjuntos (Set) este método chama-se remove
	 */
	public void remove(String nome) {
		// 1 - Verificamos se o nome existe em alguma lista
		if (contem(nome)) {
			// 2 - Calculamos o índice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegamos a lista específica do nome
			List<String> lista = tabela.get(indice);
			// 4 - Removemos o nome da lista
			lista.remove(nome);
		}
	}

	@Override
	public String toString() {
		return tabela.toString();
	}

}
