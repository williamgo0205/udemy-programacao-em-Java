// Opera��es Matem�ticas
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A Soma de " + num1 + "+" + num2 + " � " + res);
		
		//subtra��o
		res = num2 - num1;
		System.out.println("A Subtra��o de " + num2 + "-" + num1 + " � " + res);
		
		//Multiplica��o
		res = num1 * num2;
		System.out.println("A Multiplica��o de " + num1 + "*" + num2 + " � " + res);
		
		//Divis�o (Inteira)
		res = num2 / num1;
		System.out.println("A Divis�o de " + num2 + "/" + num1 + " � " + res);
		
		//Divis�o (Real)
		res2 = (float) num2 / num1;
		System.out.println("A Divis�o de " + num2 + "/" + num1 + " �  " + res2);
		
		// M�dulo
		/*
		 * Se o resto do m�dulo da vari�vel por 2 for zero
		 * a vari�vel � par, sen�o ela � �mpar
		 */
		res = num1 % 2;
		System.out.println("O Resto da divis�o de num1 " + num2 + " por 2 � " + res);
		
		// Verifica se um n�mero � divis�vel por outro n�mero, nesse caso "3"
		res = num2 % 3;
		System.out.println(num2 + " � divis�vel por 3? " + res);
	}

}
