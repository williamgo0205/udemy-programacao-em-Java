package br.com.geekuniversity.secao04;
// If, else, if else
public class Programa04 {

	public static void main(String[] args) {

		int numero = 3;

		// Faz as valida��es em cima do n�mero informado.
		if (numero > 5) {
			System.out.println("Sim, o n�mero " + numero + " � maior que 5.");
		} else if (numero == 5) {
			System.out.println("O numero " + numero + " � igual a 5.");
		} else {
			System.out.println("N�o, o n�mero " + numero + " n�o � maior que 5.");
		}

		// Verifica se o n�mero � par ou �mpar
		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par.");
		}else {
			System.out.println("O n�mero " + numero + " � �mpar.");
		}
	}

}
