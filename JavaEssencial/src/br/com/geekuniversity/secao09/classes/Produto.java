// Aula Classes

/*
- O nome da classe se inicia com letra maiúscula.
- O nome não deveconter acentuação, caracteres especiais, espaço.
- Nas classes Java não eiste a implementação da função Main()
- O nome da classe Java DEVE ser o mesmo nome do arquivo Java.
- Tuso o que estiver dentro das "chaves" {} faz parte da classe.
- Toda classe Java possui a seguinte forma:

public class NomeDaClasse{

}
*/

// Atributos

/*
- São as características da classe/molde/modelo de dados.
- Podemos entender atributos como variáveis da classe.
- Uma outra forma de moneclatura para os atributos são estados.
- Atributos são nomeados em letra niníscula, sem espaços, sem caractere especial, sem acentuação
*/

// Metodos

/*
- Podemos entender os métodos como ação que é realizada por um objeto da classe.
- Podemos entender também que os métodos são comportamentos dos objetos da classe.

- Mesmos requisitos para funções
    Uma função deve ter o seguinte
    a) Tipo de retorno (Tipo de dado que a função vai retornar)
    b) nome (Corresponde a ação que a função realiza)
    c) Parâmetros/Argumentos de entrada (Opcional)
    d) retorno (Opcional - Depende do tipo de etorno)
*/

package br.com.geekuniversity.secao09.classes;

public class Produto {
	public String nome;
	public float preco;
	public float desconto;
	
	// Método para aumentar o preço do produto conforme "valor" repassado
	void aumentar_preço(float valor) {
		this.preco = this.preco + valor;
	}

}
