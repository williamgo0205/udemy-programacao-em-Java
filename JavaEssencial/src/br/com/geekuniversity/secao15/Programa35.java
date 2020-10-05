package br.com.geekuniversity.secao15;
// M�todos Est�ticos

/*
 - Um m�todo est�tico nao depende de uma inst�ncia da classe para ser utilizado.
 - Pode-se utilizar conforme:
   - NomeDaClasse.metodo();
*/
public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu Cliente");		
		System.out.println("N�mero da Conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		System.out.println("A pr�xima conta ser�: " + Conta.proximaConta());
	}

}
