package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

// Escrevendo em arquivos

public class Programa42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			// Desta forma, toda vez que o programa for executado o arquivo ser� recriado e toda a informa��o
			// se pre-existente, ser� exclu�da, recome�ando um arquivo zerado. 
			PrintStream escrever = new PrintStream("saida.txt");

			for (int i = 0; i < 5; i++) {
				System.out.println("Escreva Algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}

			escrever.close();
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi poss�vel criar o arquivo.");
		}

		teclado.close();
	}

}
