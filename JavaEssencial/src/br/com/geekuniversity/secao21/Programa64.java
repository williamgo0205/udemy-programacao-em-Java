package br.com.geekuniversity.secao21;

import java.util.LinkedList;

// Conjuntos

/*
 - Uma das caracter�sticas dos conjuntos � a n�o aceita��o de elementos repetidos. 
 - Gera Performance
   A ["Angelina", "Angela", "Adriano", ...]
   B ["Barbara", "Beatriz", "Barnab�", ...]
   C ["Cassia", "Camila", "Carlos", ...]
   D ["Daniela", "Daniel", "Danilo", ...]
   E ["Elisa", "Elisabete", "Elias", ...]
   F ["Fabiana", "Fracisca", "Fabio", ...]
   .
   .
   .
   Z ["Zuleica", "Zagalo", "Zamael", ...]
   
   String "angelina" -> [a][n][g][e][l][i][n][a]
*/
public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriel");
		conjunto.adiciona("Julia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); // N�o entra na lista

		System.out.println(conjunto);
		
		conjunto.remove("Julia");
		
		System.out.println(conjunto);
		
	}

}
