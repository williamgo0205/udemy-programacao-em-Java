package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Mapas / Map

/*
 - Os mapas s�o representados em Java pela interface Map e mapeia seus elementos utilizando o conceito de chave/valor
 - Mapas s�o conhecidos como se fossem;representassem 3 cole��es
   - Cole��o de chaves;
   - Cole��o de valores;
   - Cole��o de associa��es.
*/
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		// Cole��o de chaves
		System.out.println("Cole��o de Chaves: " + pessoas.keySet());
		
		// Cole��o de valores
		System.out.println("Cole��o de Valores: " + pessoas.values());
		
		// Cole��o de Associa��es
		System.out.println("Cole��o de Associa��es: " + pessoas.entrySet());

		// Iterar na cole��o de chaves
		
		// Forma 1: Disponibilizado � partir do Java 8 (Lambda)
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
				
		// Forma 2
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade : chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		// Iterar na cole��o de valores
		
		// Forma 1: Disponibilizado � partir do Java 8 (Lambda)
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Forma 2
		Collection<String> valores = pessoas.values();
		for (String nome : valores) {
			System.out.println(nome);
		}
		
		// Iterar a cole��o de associa��o
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		
		// Forma 1: Disponibilizado � partir do Java 8 (Lambda)
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
		
		// Forma 2
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
	}

}
