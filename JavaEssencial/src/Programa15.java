// Operações Matemáticas
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A Soma de " + num1 + "+" + num2 + " é " + res);
		
		//subtração
		res = num2 - num1;
		System.out.println("A Subtração de " + num2 + "-" + num1 + " é " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A Multiplicação de " + num1 + "*" + num2 + " é " + res);
		
		//Divisão (Inteira)
		res = num2 / num1;
		System.out.println("A Divisão de " + num2 + "/" + num1 + " é " + res);
		
		//Divisão (Real)
		res2 = (float) num2 / num1;
		System.out.println("A Divisão de " + num2 + "/" + num1 + " é  " + res2);
		
		// Módulo
		/*
		 * Se o resto do módulo da variável por 2 for zero
		 * a variável é par, senão ela é ímpar
		 */
		res = num1 % 2;
		System.out.println("O Resto da divisão de num1 " + num2 + " por 2 é " + res);
		
		// Verifica se um número é divisível por outro número, nesse caso "3"
		res = num2 % 3;
		System.out.println(num2 + " é divisível por 3? " + res);
	}

}
