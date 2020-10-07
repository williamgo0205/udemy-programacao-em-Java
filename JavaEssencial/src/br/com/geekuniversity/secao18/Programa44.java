package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

// Escritas em arquivo 2

public class Programa44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			// Desta maneira n�o � criado um arquiv novo e sim as mensagens s�o adicionadas no arquivo existente
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			
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
