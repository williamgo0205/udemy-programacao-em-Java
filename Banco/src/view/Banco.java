package view;

import java.util.ArrayList;
import java.util.Scanner;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Banco {
	
	static String nome = "Geek Bank";
	static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;
	
	public static void main(String[] args) {
		Banco.contas = new ArrayList<Conta>();
		Banco.menu();
	}

	public static void menu() {
		int opcao = 0;
		System.out.println("=========================================");
		System.out.println("================== ATM ==================");
		System.out.println("=============== " + Banco.nome + " ===============");
		System.out.println("=========================================");
		System.out.println("Selecione uma op��o no menu: ");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Efetuar Saque");
		System.out.println("3 - Efetuar Dep�sito");
		System.out.println("4 - Efetuar Transfer�ncia");
		System.out.println("5 - Listar Contas");
		System.out.println("6 - Sair do Sistema");
		
		try {
			opcao = Integer.parseInt(Banco.teclado.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Por favor informe uma op��o v�lda");
			Utils.pausar(1);
			Banco.menu();
		}
		
		switch (opcao) {
		case 1:
			Banco.criarConta();
			break;
		case 2:
			Banco.efetuarSaque();
			break;
		case 3:
			Banco.efetuarDeposito();
			break;
		case 4:
			Banco.efetuarTransferencia();
			break;
		case 5:
			Banco.listarContas();
			break;
		case 6:
			System.out.println("At� a pr�xima!");
			Utils.pausar(2);
			System.exit(0); // Para o sistema
			break;		
		default:
			System.out.println("Op��o inv�lida.");
			Utils.pausar(2);
			Banco.menu();
			break;
		}
	}

	public static void criarConta() {
		
		System.out.println("=========================================");
		System.out.println("=========== Criando uma conta ===========");
		System.out.println("=========================================");
		
		System.out.println("Informe os dados do Cliente: ");
		
		System.out.println("Nome do Cliente: ");
		String nome = Banco.teclado.nextLine();
		
		System.out.println("E-mail do Cliente: ");
		String email = Banco.teclado.nextLine();
		
		System.out.println("CPF do Cliente: ");
		String cpf = Banco.teclado.nextLine();
		
		System.out.println("Data de Nascimento do Cliente: ");
		String dataNascimento = Banco.teclado.nextLine();
		
		Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaDate(dataNascimento));
				
		Conta conta = new Conta(cliente);
		
		contas.add(conta);
		
		System.out.println("Conta criada com sucesso!");
		System.out.println("Dados da conta criada: ");
		System.out.println(conta);
		System.out.println();
		
		Utils.pausar(4);
		Banco.menu();
	}
	
	public static void efetuarSaque() {
		System.out.println("=========================================");
		System.out.println("============ Efetuando Saque ============");
		System.out.println("=========================================");
		
		System.out.println("Informe o n�mero da Conta: ");
		int numero = Banco.teclado.nextInt();
		
		Conta conta = Banco.buscarContaPorNumero(numero);
		
		if(conta != null) {
			System.out.println("Informe o valor do saque: ");
			Double valor = Banco.teclado.nextDouble();
			
			conta.sacar(valor);
		}else {
			System.out.println("N�o foi encontrada a conta n�mero: " + numero);
		}
		
		Utils.pausar(3);
		Banco.menu();
	}
	
	public static void efetuarDeposito() {
		System.out.println("========================================");
		System.out.println("========== Efetuando Dep�sito ==========");
		System.out.println("========================================");
		
		System.out.println("Informe o n�mero da Conta: ");
		int numero = Banco.teclado.nextInt();
		
		Conta conta = Banco.buscarContaPorNumero(numero);
		
		if(conta != null) {
			System.out.println("Informe o valor de dep�sito: ");
			Double valor = Banco.teclado.nextDouble();
			
			conta.depositar(valor);
		}else {
			System.out.println("N�o foi encontrada a conta n�mero: " + numero);
		}
		
		Utils.pausar(3);
		Banco.menu();
	}
	
	public static void efetuarTransferencia() {
		System.out.println("========================================");
		System.out.println("======= Efetuando Tranafer�ncia ========");
		System.out.println("========================================");
		
		System.out.println("Informe o n�mero da sua Conta: ");
		int numero_o = Banco.teclado.nextInt();
		
		Conta conta_o = Banco.buscarContaPorNumero(numero_o);
		
		if(conta_o != null) {
			System.out.println("Informe o n�mero da conta destino: ");
			int numero_d = Banco.teclado.nextInt();
			
			Conta conta_d = Banco.buscarContaPorNumero(numero_d);
			
			if(conta_d != null) {			
				System.out.println("Informe o valor de transfer�ncia: ");
				Double valor = Banco.teclado.nextDouble();
				
				conta_o.transferir(conta_d, valor);
			}else {
				System.out.println("A conta destino numero: " + numero_d + " n�o foi encontrada!");
			}
			
		}else {
			System.out.println("N�o foi encontrada a conta n�mero: " + numero_o);
		}
		
		Utils.pausar(3);
		Banco.menu();
	}
	
	public static void listarContas() {	
		if(Banco.contas.size() > 0) {
			System.out.println("========================================");
			System.out.println("=========== Listando Contas ============");
			System.out.println("========================================");
			
			for(Conta conta : Banco.contas) {
				System.out.println(conta);
				System.out.println();
				Utils.pausar(1);
			}
			
			System.out.println();
			
		}else {
			System.out.println("N�o existem contas cadastradas ainda.");
		}
		
		Utils.pausar(3);
		Banco.menu();
	}
	
	
	private static Conta buscarContaPorNumero(int numero) {
		Conta c = null;
		
		if (Banco.contas.size() > 0) {
			for(Conta conta : Banco.contas) {
				if(conta.getNumero() == numero) {
					c = conta;
				}
			}
		}

		return c;
	}
	
}
