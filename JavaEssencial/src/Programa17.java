// Vetores Parte 2
public class Programa17 {

	public static void main(String[] args) {
		// Declara��o e defini��o de tamanhp do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
			System.out.println("N�mero na posi��o [" + i + "] tem o valor de " + numeros[i]);
		}
		
		System.out.println("Primeiro Elemento do vetor " + numeros[0]); // Primeiro Elemento
		System.out.println("�ltimo Elemento do vetor " + numeros[9]); // Ultimo Elemento
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
			System.out.println("N�mero na posi��o [" + i + "] tem o valor de " + numeros[i]);
		}
		
		System.out.println("Primeiro Elemento do vetor " + numeros[0]); // Primeiro Elemento
		System.out.println("�ltimo Elemento do vetor " + numeros[9]); // Ultimo Elemento
		
		System.out.println("N�mero Randomico " + Math.random()); 
		System.out.println("N�mero Randomico Arredondado " + Math.round(Math.random())); 
		
		// Imprimindo n�meros sem parada
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
