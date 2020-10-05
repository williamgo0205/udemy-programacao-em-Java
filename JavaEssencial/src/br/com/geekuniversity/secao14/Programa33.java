package br.com.geekuniversity.secao14;
// Interfaces - O que é e quando utilizar

/*
 - Interfaces são conhecidas como "Contratos".
 
Exemplo: 
  Uma empresa criou um contrato 'com regras' para definir a criação de um produto/serviço.
  Quem implementar este contrato, é, OBRIGADO a seguir as regras. 

  O Joaão decidiu implementar um produto/serviço baseado nesse contrato;
  A Maria, também decidiu implementar um produto/serviço baseado no mesmo contrato.

Ex:
  Contrato para a confecção de um bolo
   - O bolo precisa ser de chocolate;
   - O bolo deve ter cobertura;
   - O bolo deve ser recheado.
*/
public class Programa33 {
	
	public static void main(String[] args) {
		Ventilador vent = new Ventilador(); 
		
		System.out.println("A marca do ventilador é: " + vent.MARCA);
		
		vent.desligar(); // Não deve imprimir a mensagem
		vent.ligar(); // Deve imprimir a mensagem
		vent.desligar(); // Deve imprimir a mensagem
		vent.mensagem();
	}
}
