package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Threads Sincronizadas (synchronized)

/*
 - ***Necess�rio sincronizar (synchronized) o m�todo, nesse caso m�todo depositar da classe "Conta"
 
 - O sincronismo ocorre pois durante a execu��o do m�todo a thread executa um 'lock' (bloqueio)
   da fun��o para que outra thread s� possa execut�-la ap�s a finaliza��o da thread inicial.
*/

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); // Saldo Inicial: 200 + 300 = 500

		FazDeposito acao = new FazDeposito(c1);

		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); // Saldo: 500 + 100 = 500?
		t2.start(); // Saldo: 600 + 100 = 700?

		t1.join(); // Avisando que a thread T1 deve "se juntar" a um sincronizador
		t2.join(); // Avisando que a thread T2 deve "se juntar" a um sincronizador

		System.out.println(c1);
	}

}
