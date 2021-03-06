package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Arrays (Vetores/Matrizes) - Problemas dos Arrays
  - Um array tem tamanho fixo. Ou seja, se criarmos um array com 5 elementos, ele ter� sempre no m�ximo 5 elementos.
  - Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros, ele s[o poder� ter inteiros.
  - � dif�cil encontrar um determinado elemento em um array. Precisamos para isso percorrer todo o array, atrav�s do seu �ndice,
    caso n�o seja feita a busca pelo �ndice.
  
 Colections (Cole��es)
  - Java possui diversas classes e interfaces que facilitam muito o trabalho quando se trata de cole��es de dados. 
    Essas classes/interfaces s�o chamadas de colections (cole��es)
    
  -> Listas 
     - Aceitam repeti��o de valores
     - Possuem tamanho 'INFINITO' (Depende da mem�ria)
     - Pode ser adicionado valores de qualquer tipo, desde que n�o seja especificado um tipo na declara��o do array. 
*/

public class Programa45 {


	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); // Sem definir tipo de dado, pode ser colocado qualquer tipo
		List<String> nomes = new ArrayList<String>(); // Definido o tipo String
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		nomes.add("Angelina");
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
			
//		System.out.println(nomes.size()); // Verifica o tamanho do array
		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.sort(nomes); // Ordena o array em ordem alfab�tica
		
		for (Object nome : nomes) {
			System.out.println(nome);
		}
		
//		nomes.stream().filter(r -> r.contains("a")).forEach(r -> System.out.println(r));
	}

}
