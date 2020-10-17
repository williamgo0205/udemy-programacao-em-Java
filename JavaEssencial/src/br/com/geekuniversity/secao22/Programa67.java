package br.com.geekuniversity.secao22;

// Default methods
public class Programa67 {

	public static void main(String[] args) {
		Teste t = new MinhaClasse();
		
		System.out.println(t.mensagem());
		
		// Default Method ao qual não precisou ser implementado na Minhaclasse que implementa a interface Teste
		t.meu_metodo();
		
	}

}
