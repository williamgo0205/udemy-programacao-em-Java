package br.com.geekuniversity.secao13;

// Template Method

/*
 - O padr�o chamado de Template Method define o esqueleto de um algoritmo dentro de um m�todo,
   transferindo alguns de seus passos para as subclasses. O templete Method permite que as
   subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do proprio algoritmo.
   
 - Algoritmos s�o "receitas" passo-a-passo para resolver algum problema.

 - Receber do usu�rio um n�mero e devolver o quadrado desse n�mero:
 - Exemplo:
   - receber um n�mero;
   - retornar numero * numero;
   
metodo_principal(){
   passo1();
   passo2();
   passo3();
}
*/
public class Programa32 {

	public static void main(String[] args) {
		
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
	}

}
