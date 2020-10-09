package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Mapas / Map

/*
 - Os mapas são representados em Java pela interface Map e mapeia seus elementos utilizando o conceito de chave/valor
 - Mapas são conhecidos como se fossem;representassem 3 coleções
   - Coleção de chaves;
   - Coleção de valores;
   - Coleção de associações.
*/
public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		// Coleção de chaves
		System.out.println("Coleção de Chaves: " + pessoas.keySet());
		
		// Coleção de valores
		System.out.println("Coleção de Valores: " + pessoas.values());
		
		// Coleção de Associações
		System.out.println("Coleção de Associações: " + pessoas.entrySet());

		// Iterar na coleção de chaves
		
		// Forma 1: Disponibilizado à partir do Java 8 (Lambda)
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
				
		// Forma 2
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade : chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		// Iterar na coleção de valores
		
		// Forma 1: Disponibilizado à partir do Java 8 (Lambda)
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		//Forma 2
		Collection<String> valores = pessoas.values();
		for (String nome : valores) {
			System.out.println(nome);
		}
		
		// Iterar a coleção de associação
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		
		// Forma 1: Disponibilizado à partir do Java 8 (Lambda)
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
		
		// Forma 2
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
	}

}
