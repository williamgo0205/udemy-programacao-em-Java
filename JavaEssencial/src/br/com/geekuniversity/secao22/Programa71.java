package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Lambdas

/*
 - Express�es Lambdas, s�o fun��es an�nimas.
 - Atalho do Eclipse para identa��o do c�digo -> "CTRL + Shift + F"
*/
public class Programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");

		palavras.sort(comparador);

		System.out.println("Express�o Lambda - forma 1 repassando tipo (String) e chaves {}");
		// Express�o Lambda - forma 1 repassando tipo (String) e chaves {}
		palavras.forEach((String s) -> {
			System.out.println(s);
		});

		System.out.println("Express�o Lambda - forma 2 (Somente uma linha de execu��o) "
				+ "sem o tipo somente com a vari�vel e sem chaves {}");
		// Express�o Lambda - forma 2 (Somente uma linha de execu��o) sem o tipo somente
		// com a vari�vel e sem chaves {}
		palavras.forEach(s -> System.out.println(s));
	}

}
