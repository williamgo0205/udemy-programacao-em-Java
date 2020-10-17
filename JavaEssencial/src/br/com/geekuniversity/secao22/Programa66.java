package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Default Methods

/*
 - Default Methods - S�o m�todos concretos implementados em Interfaces. 
   Estes m�todos, como s�o concretos, ou seja, j� possuem implementa��o, 
   n�o precisam ser implementados nas classes que implementarem essa interface.
   
 - Implementada � partir da vers�o 8 Java
*/
public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		Collections.sort(palavras);  // Ordenando as palavras em ordem alfab�tica
		
		System.out.println(palavras);
		
		//Collections.sort(palavras, comparador); // Ordenando pelo comparador (ComparadorPorTamanho) criado para ordenar por tamanho de palavras
			
		palavras.sort(comparador); // Ordenando as palavraspelo comparador (ComparadorPorTamanho) criado para ordenar por tamanho de palavras 
		
		System.out.println(palavras);
		
	}

}
