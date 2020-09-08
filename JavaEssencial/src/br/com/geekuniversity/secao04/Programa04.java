package br.com.geekuniversity.secao04;
// If, else, if else
public class Programa04 {

	public static void main(String[] args) {

		int numero = 3;

		// Faz as validações em cima do número informado.
		if (numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5.");
		} else if (numero == 5) {
			System.out.println("O numero " + numero + " é igual a 5.");
		} else {
			System.out.println("Não, o número " + numero + " não é maior que 5.");
		}

		// Verifica se o número é par ou ímpar
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}else {
			System.out.println("O número " + numero + " é ímpar.");
		}
	}

}
