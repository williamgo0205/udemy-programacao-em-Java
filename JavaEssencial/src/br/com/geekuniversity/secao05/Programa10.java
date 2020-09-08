package br.com.geekuniversity.secao05;
import java.util.Scanner;

// Foreach
public class Programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";

		// Para cada um dos caracteres da Strings imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			// System.out.print(letra);
		}

	}

}
