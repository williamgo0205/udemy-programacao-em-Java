package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//HashMap

/*
 - A classe HasMap implementa a interface Map e trabalha com o conceito de chave/valor;
 - N�o aceita chaves duplicadas, mas valores sim s�o aceitos;
*/
public class Programa49 {

	public static void main(String[] args) {
	  //Map<chave, valor>  contas =  new HashMap<chave, valor>();  
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(24, "Agelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(34, "Felicity Jones", "Rua 2");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(1, 400, 700, cli2);
		
		contas.put("Pessoa F�sica", c1);
		contas.put("Pessoa Jur�dica", c2);
		contas.put("Pessoa F�sica", c1);
		
		System.out.println(contas.size());
		
		//System.out.println(contas.get("Pessoa F�sica")); // Repassando a chave nesse caso "Pessoa F�sica"
		
	}

}
