package br.com.geekuniversity.secao04;
// Operador Tern�rio
public class Programa05 {

	public static void main(String[] args) {
		int valor = -3, numero;

		// If do modo tradicional
        /*
		if (valor > 0) {
			numero = valor;
		} else {
			numero = 7;
		}
        */
		// Operador Tern�rio trabalha como o If acima
		numero = (valor > 0) ? valor : 7;

		System.out.println(numero);
	}
}