package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

// Object: A m�e de todas as classes

/*
 - A Classe object, faz parte do pacote java.lang; 
*/
public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18, "Angelina Jolie", "Rua 1, 234");
		Cliente cli2 = new Cliente(20, "Felicity Jones", "Rua 2, 345");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(1, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1); // Por padr�o a inst�ncia imprime com toString()
		System.out.println(c2);
		
		if (c1.equals(cli1)) {
			System.out.println("S�o a mesma conta");
		}else {
			System.out.println("S�o contas diferentes");
		}

		prateleira.adicionar(c1); // Posi��o 0 -> Tem getSaldo();
		prateleira.adicionar(c2); // Posi��o 1 -> Tem getSaldo();
		
		System.out.println(((Conta) prateleira.pegar(0)).getSaldo());
		
		prateleira.adicionar(cli1); // Posi��o 2 -> N�o Tem getSaldo();
		
		System.out.println(((Cliente) prateleira.pegar(2)).getNome());
		
		if ((Object) cli1 instanceof Conta) {
			System.out.println("O Objeto � do tipo Conta");
		}else {
			System.out.println("O Objeto n�o � do tipo Conta");
		}
	}

}
