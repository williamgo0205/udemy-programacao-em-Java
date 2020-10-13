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
	 * Calcula o �ndice do nome para cria��o das listas de cada letra
	 * 
	 * @param nome
	 * @return
	 */
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}

	/**
	 * Adiciona o nome a lista correta pelo �ndice
	 * 
	 * @param nome
	 * 
	 * Na implementa��o do Java para Conjuntos (Set) este m�todo chama-se add
	 */
	public void adiciona(String nome) {
		// 1 - Verifica se o nome n�o existe na lista
		if (!contem(nome)) {
			// 2 - Calculando o �ndice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegando a lista de acordo com o �ndice
			List<String> lista = tabela.get(indice);
			// 4 - Adicionando o nome a lista correta
			lista.add(nome);
		}
	}

	/**
	 * Verifica se o nome cont�m ou n�o na lista especifica selecionada pelo nome
	 * 
	 * @param nome
	 * @return
	 */
	private boolean contem(String nome) {
		// 1 - Calculando o �ndice do nome
		int indice = calculaIndice(nome);
		// 2 - Buscamos na tabela espec�fica do �ndice o nome
		return tabela.get(indice).contains(nome);
	}

	/**
	 * Remove o nome da lista espec�fica caso exista
	 * 
	 * @param nome
	 * 
	 * Na implementa��o do Java para Conjuntos (Set) este m�todo chama-se remove
	 */
	public void remove(String nome) {
		// 1 - Verificamos se o nome existe em alguma lista
		if (contem(nome)) {
			// 2 - Calculamos o �ndice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegamos a lista espec�fica do nome
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
