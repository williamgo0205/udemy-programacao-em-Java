package view;

import java.util.Scanner;

import model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();
	}

	public static void jogar() {
		System.out.println("Informe o n�vel de dificuldade desejada [1, 2, 3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();

		Game.calc = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seguinte opera��o: ");

		// Somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				// Correto, ganha um ponto
				Game.pontos += 1;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			}
		}

		// Diminuir
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.diminuir(resposta)) {
				// Correto, ganha um ponto
				Game.pontos += 1;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			}
		}

		// Multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.multiplicar(resposta)) {
				// Correto, ganha um ponto
				Game.pontos += 1;
				System.out.println("Voc� tem " + Game.pontos + " ponto(s).");
			}
		}

		// Caso seja uma opera��o inv�lida
		else {
			System.out.println("A Opera��o " + calc.getOperacao() + " n�o � reconhecida.");
		}

		System.out.println("Deseja continuar? [1 - Sim, 0 - N�o]");
		int continuar = Game.teclado.nextInt();

		if (continuar == 1) {
			Game.jogar();
		} else {
			System.out.println("Voc� fez " + Game.pontos + " ponto(s).");
			System.out.println("At� a pr�xima!");
			System.exit(0);
		}
	}

}
