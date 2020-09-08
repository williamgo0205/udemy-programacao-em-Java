package br.com.geekuniversity.secao06;
// Tipos de dados
// N�meros Reais
public class Programa12 {

	public static void main(String[] args) {

		// Tipos prim�rios/primitivos
		// Por padr�o os n�meros reais em Java s�o considerados double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4; // 23.4012345678904567890123456789
		
		// Tipos n�o prim�rios / N�o primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float  -> preco1: " + preco1);
		System.out.println("double -> preco2: " + preco2);
		System.out.println("Float  -> preco3: " + preco3);
		System.out.println("Double -> preco4: " + preco4);
		
		//Ocupa��o em mem�ria das vari�veis
		System.out.println("float/Float "   + Float.SIZE    + " bits");
		System.out.println("double/Double " + Double.SIZE   + " bits");
		
		// Valores M�nimos e m�ximos dos tipos
		System.out.println("Valor Minimo float/Float " + Float.MIN_VALUE);
		System.out.println("Valor M�ximo float/Float " + Float.MAX_VALUE);
		
		System.out.println("Valor Minimo double/Double " + Double.MIN_VALUE);
		System.out.println("Valor M�ximo double/Double " + Double.MAX_VALUE);

	}
}
