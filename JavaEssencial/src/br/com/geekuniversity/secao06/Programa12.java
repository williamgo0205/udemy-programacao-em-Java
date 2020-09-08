package br.com.geekuniversity.secao06;
// Tipos de dados
// Números Reais
public class Programa12 {

	public static void main(String[] args) {

		// Tipos primários/primitivos
		// Por padrão os números reais em Java são considerados double
		float preco1 = 23.4f; // 23.40
		double preco2 = 23.4; // 23.4012345678904567890123456789
		
		// Tipos não primários / Não primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float  -> preco1: " + preco1);
		System.out.println("double -> preco2: " + preco2);
		System.out.println("Float  -> preco3: " + preco3);
		System.out.println("Double -> preco4: " + preco4);
		
		//Ocupação em memória das variáveis
		System.out.println("float/Float "   + Float.SIZE    + " bits");
		System.out.println("double/Double " + Double.SIZE   + " bits");
		
		// Valores Mínimos e máximos dos tipos
		System.out.println("Valor Minimo float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Máximo float/Float " + Float.MAX_VALUE);
		
		System.out.println("Valor Minimo double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Máximo double/Double " + Double.MAX_VALUE);

	}
}
