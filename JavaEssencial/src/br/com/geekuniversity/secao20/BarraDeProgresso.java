package br.com.geekuniversity.secao20;

/*
  - Para executar m�todos em paralelos a classe deve implementar a interface Runnable e,
    o m�todo que precisar ser executadi em paralelo deve ser executado dentro do m�todo Run
 */
public class BarraDeProgresso implements Runnable{
	
	public void executa() {
		// For de 0 at� 10 milh�es
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso...Aguarde");
		}
	}

	@Override
	public void run() {
		executa();		
	}
}
