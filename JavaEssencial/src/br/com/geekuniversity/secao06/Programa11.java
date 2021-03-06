package br.com.geekuniversity.secao06;
// Tipos de dados
// Num�ricos Inteiros
public class Programa11 {
	
	public static void main(String[] args) {
		// tipos prim�rios/primitivos
		long  num0 = 99; // Inteiro 999999999999999999999999999999999999
		int   num1 = 4; // Inteiro 999999999999999999999
		short num2 = 4; // Inteiro (curto/menor/baixo)  9999999
		byte  num3 = 4; // Inteiro
		char  num4 = 34; // Valor da Tabela ASCII
		
		// Tipos n�o prim�rios/n�o primitivos
		Long      num5 = (long) 999999999;
		Integer   num6 = 98; 
		Short     num7 = 7;
		Byte      num8 = 9;
		Character num9 = 35; // Valor da Tabela ASCII	

		System.out.println("long    -> Num0: " + num0);
		System.out.println("int     -> Num1: " + num1);
		System.out.println("short   -> Num2: " + num2);
		System.out.println("byte    -> Num3: " + num3);
		System.out.println("char    -> Num4: " + num4);
		System.out.println("Long    -> Num5: " + num5);
		System.out.println("Integer -> Num6: " + num6);
		System.out.println("Short   -> Num7: " + num7);
		System.out.println("Byte    -> Num8: " + num8);
		System.out.println("Char    -> Num9: " + num9);
	
		//Ocupa��o em mem�ria das vari�veis
		System.out.println("long/Long "        + Long.SIZE      + " bits");
		System.out.println("int/Integer "      + Integer.SIZE   + " bits");
		System.out.println("short/Short "      + Short.SIZE     + " bits");
		System.out.println("byte/Byte "        + Byte.SIZE      + " bits");
		System.out.println("char/Character "   + Character.SIZE + " bits");
		
		// Valores M�nimos e m�ximos dos tipos
		System.out.println("Valor Minimo long/Long "       + Long.MIN_VALUE);
		System.out.println("Valor M�ximo long/Long "       + Long.MAX_VALUE);
		
		System.out.println("Valor Minimo int/Integer "     + Integer.MIN_VALUE);
		System.out.println("Valor M�ximo int/Integer "     + Integer.MAX_VALUE);
		
		System.out.println("Valor Minimo short/Short "     + Short.MIN_VALUE);
		System.out.println("Valor M�ximo short/Short "     + Short.MAX_VALUE);
		
		System.out.println("Valor Minimo byte/Byte "       + Byte.MIN_VALUE);
		System.out.println("Valor M�ximo byte/Byte "       + Byte.MAX_VALUE);

		System.out.println("Valor Minimo char/Character "  + Character.MIN_VALUE); //0
		System.out.println("Valor M�ximo char/Character "  + Character.MAX_VALUE); //65535

	}

}
