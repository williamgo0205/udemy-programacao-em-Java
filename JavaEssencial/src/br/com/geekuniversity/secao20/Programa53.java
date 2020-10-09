package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Threads não sincronizada (Não é estável)

/*
 - Por padrão as threads não são sincronizadas. pode ocorrer problemas de uma thread acessar 
   o valor de um objeto que ainda não foi atualizado ou, ainda as threads executarem depois 
   do valor já estar impresso.
*/
public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); // Saldo Inicial: 200 + 300 = 500
		
		FazDeposito acao = new FazDeposito(c1);
		
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); // Saldo: 500 + 100 = 500?
		t2.start(); // Saldo: 600 + 100 = 700?
		
		System.out.println(c1);

	}

}
