package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

// Method References

/*
 - Podem ser consideradas simplificações das expressões lambdas 
*/
public class Programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");

		System.out.println(palavras);
		
        // Expressão Lambda
//		Comparator<String> comparador = Comparator.comparing(new Function<String, Integer>() {
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		});
//		
//      palavras.sort(comparator);
		
		// Expressão Lambda Simplificada
		//palavras.sort(Comparator.comparing(s -> s.length()));

		// Usando Method Reference (String::length) - Forma 1
		//palavras.sort(Comparator.comparing(String::length));
		
		//System.out.println(palavras);
		
		// Usando Method Reference (String::length) - Forma 2
		//Function<String, Integer> tamanho = String::length; // Usando Method Reference
		Function<String, Integer> tamanho = s -> s.length(); // Usando expressão lambda
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		
		//System.out.println(palavras);
		
		// Imprimindo pelo ForEach usando Method Reference
		palavras.forEach(System.out::println); // Method Reference System.out::println

	}

}
