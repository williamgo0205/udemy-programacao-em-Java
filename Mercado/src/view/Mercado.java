package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import helper.Utils;
import model.Produto;

public class Mercado {

	private static Scanner teclado = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;	
	
	public static void main(String[] args) {	
		produtos = new ArrayList<Produto>(); // Instancia produto
		carrinho = new HashMap<Produto, Integer>(); // Instancia carrinho passando chave (produto) e valor (Integer)
		Mercado.menu();
	}

	private static void menu() {
		System.out.println("==========================================================");
		System.out.println("====================== Bem vindo(a) ======================");
		System.out.println("======================= Geek Shop ========================");
		System.out.println("==========================================================");
		
		System.out.println("Selecione uma opção abaixo: ");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Listar Produtos");
		System.out.println("3 - Comprar Produto");
		System.out.println("4 - Visualizar Carrinho");
		System.out.println("5 - Sair do Sistemao");
		
		int opcao = 0;
		
		try {
			opcao = Integer.parseInt(Mercado.teclado.nextLine());
		}catch(InputMismatchException e) {
			Mercado.menu();
		}catch(NumberFormatException e) {
			Mercado.menu();
		}
		
		switch (opcao) {
		case 1:
			Mercado.cadastrarProduto();
			break;
		case 2:
			Mercado.listarProdutos();
			break;
		case 3:
			Mercado.comprarProduto();
			break;
		case 4:
			Mercado.visualizarCarrinho();
			break;
		case 5:
			System.out.println("Volte sempre!!");
			Utils.pausar(2);
			System.exit(0); // Sair do Sistema
			break;		
		default:
			System.out.println("Opção inválida!!");
			Utils.pausar(2);
			Mercado.menu();
			break;
		}
	}

	private static void cadastrarProduto() {
		System.out.println("=========================================================");
		System.out.println("================== Cadastro de Produto ==================");
		System.out.println("=========================================================");
		
		System.out.println("Informe o nome do produto: ");
		String nome = Mercado.teclado.nextLine();
		
		System.out.println("Informe o preço do produto: ");
		Double preco = Mercado.teclado.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		Mercado.produtos.add(produto);
		
		System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso!!!");
		Utils.pausar(2);
		Mercado.menu();		
	}
	

	private static void listarProdutos() {
		
		if (Mercado.produtos.size() > 0 ) {
			System.out.println("==========================================================");
			System.out.println("================== Listagem de Produtos ==================");
			System.out.println("==========================================================");
			
			for (Produto p : Mercado.produtos ) {
				System.out.println(p);
				System.out.println();
			}
			
		} else {
			System.out.println("Ainda não existem produtos cadastrados!!");
		}
		
		Utils.pausar(2);
		Mercado.menu();
	}
	
	private static void comprarProduto() {
	   if (Mercado.produtos.size() > 0) {
			System.out.println("========================================================");
			System.out.println("================== Comprando Produtos ==================");
			System.out.println("========================================================");	
			
			System.out.println("Informe o código do produto que deseja comprar: ");
			System.out.println();
			System.out.println("================== Produtos disponíveis ==================");
			
			for (Produto p : Mercado.produtos) {
				System.out.println(p);
				System.out.println("========================================================");
			}
			
			int codigo = Integer.parseInt(Mercado.teclado.nextLine());
			boolean tem = false;
			
			for (Produto p : Mercado.produtos) {
				if(p.getCodigo() == codigo) {
					int quant = 0;
				    try {
				    	quant = Mercado.carrinho.get(p);
				    	// Já tem este produto no carrinho, atualiza a quantidade
				    	Mercado.carrinho.put(p, quant + 1);
				    }catch(NullPointerException e) {
				    	// Primeiro Produto no carrinho
				    	Mercado.carrinho.put(p, 1);
				    }
				    
				    System.out.println("O produto: " + p.getNome() + " foi adicionado ao carrinho!");
				    tem = true;
				}
			}
			
			if (tem) {
				System.out.println("Deseja adicionar outros produts ao carrinho?");
				System.out.println("informe [1 - Sim,  0 Não]");
				int op = Integer.parseInt(Mercado.teclado.nextLine());
				
				if (op == 1) {
					Mercado.comprarProduto();
				} else {
					System.out.println("Por favor aguarde enquanto fechamos seu pedido...");
					Utils.pausar(2);
					Mercado.fecharPedido();
				}
			}else {
				System.out.println("Não foi encontrado o produto com o código " + codigo);
				Utils.pausar(2);
				Mercado.menu();
			}
		   
	   }else {
		   System.out.println("Ainda não existe produto cadastrado no mercado!!");
	   }
	   
		Utils.pausar(2);
		Mercado.menu();
	}

	
	private static void visualizarCarrinho() {
		if (Mercado.carrinho.size() > 0 ) {
			System.out.println("============================================================");
			System.out.println("============= Visualizando produtos no carrinho ============");
			System.out.println("============================================================");	
			
			for (Produto p : Mercado.carrinho.keySet() ) {
				System.out.println("Produto: " + p + "\nQuantidade: " + Mercado.carrinho.get(p));
				System.out.println();
			}
		} else {
			System.out.println("Ainda não existem produtos no carrinho!!");
		}
		
		Utils.pausar(2);
		Mercado.menu();
	}

	
	private static void fecharPedido() {
		Double valorTotal = 0.0;
		
		System.out.println("===========================================================");
		System.out.println("=================== Produtos do carrinho ==================");
		System.out.println("===========================================================");	
		
		for (Produto p : Mercado.carrinho.keySet()) {
			int quant = Mercado.carrinho.get(p);
			valorTotal += p.getPreco() * quant;
			System.out.println(p);
			System.out.println("Quantidade: " + quant);
			System.out.println("===========================================================");	
		}
		
		System.out.println("Sua Fatura é: " + Utils.doubleParaString(valorTotal));
		Mercado.carrinho.clear();
		
		System.out.println("Obrigado pela Preferência!!");
		Utils.pausar(5);
		Mercado.menu();
	}

}
