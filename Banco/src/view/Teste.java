package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {

	public static void main(String[] args) {
		Cliente felicity = new Cliente("Felicity Jones", 
				                       "felicity@gmail.com", 
				                       "123.456.789.01", 
				                       Utils.stringParaDate("17/05/1981")
				                       );
		
		Cliente angelina = new Cliente("Angelina Jolie", 
				                       "angelina@gmail.com", 
				                       "234.567.890.12", 
				                       Utils.stringParaDate("23/02/1978")
				                       );
		
//		System.out.println(felicity);
//		System.out.println();
//		System.out.println(angelina);

		Conta c101 = new Conta(felicity);
		Conta c102 = new Conta(angelina);
		
		// Depositado um valor positivo
		c101.depositar(500.00);
		c102.depositar(500.00);

		// Depositando um valor 0
//		c101.depositar(0.00);
//		c102.depositar(0.00);
		
		// Deppsitando um valor negativo
//		c101.depositar(-500.00);
//		c102.depositar(-500.00);
		
		// Tentando sacar um valor no saldo suficiente
//		c101.sacar(300.00);
//		c102.sacar(300.00);
		
		// Tentando sacar um valor 0
//		c101.sacar(0.00);
//		c102.sacar(0.00);
		
		// Tentando sacar um valor Negativo
//		c101.sacar(-100.00);
//		c102.sacar(-100.00);
		
		// Setando um limite para a C101
		c101.setLimite(200.00);
		
		// Tentando sacar um valor maior que o saldo
//		c101.sacar(600.00);
//		c102.sacar(600.00);
		
		// Testando transferencia de c101 para c102
		c101.transferir(c102, 100.00);
		
		System.out.println(c101);
		System.out.println();
		System.out.println(c102);
				
		
	}

}
