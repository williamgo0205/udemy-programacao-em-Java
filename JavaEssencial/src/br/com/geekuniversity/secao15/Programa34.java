package br.com.geekuniversity.secao15;
// Atributos est�ticos

/*
 Atributos est�ticos s�o atibutos onde os valores d�o compartilhados entre as instancias da classe.
 
 Para utilizar um atributo est�tico, colocamos o nome da classe junto ao atributo.
 
 exemplo: 
 NomeDaClasse.atributo;

*/
public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Jolie");		
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Felicity Jones");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Maria da Gra�a Xuxa Meneguel");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(Conta.contador);
		
		Conta.contador = 42;
		
		Conta c4 = new Conta("Outro Cliente");
		System.out.println(c4.getNumero());
		System.out.println(c4.getCliente());
	}

}
