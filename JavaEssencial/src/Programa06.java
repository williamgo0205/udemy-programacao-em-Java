// Aula -> Instru��o Switch
public class Programa06 {

	public static void main(String[] args) {
		int numero = 33;

		switch (numero) {
			case 1:
				System.out.println("O N�mero � 1");
				break;
			case 3:
				System.out.println("O N�mero � 3");
				break;
			case 5:
				System.out.println("O n�mero � 5");
				break;
			default:
				System.out.println("[Defaut] O n�mero �: " + numero);
				break;
		}

	}

}
