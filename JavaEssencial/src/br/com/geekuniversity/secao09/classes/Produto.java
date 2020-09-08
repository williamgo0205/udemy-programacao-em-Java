// Aula Classes

/*
- O nome da classe se inicia com letra mai�scula.
- O nome n�o deveconter acentua��o, caracteres especiais, espa�o.
- Nas classes Java n�o eiste a implementa��o da fun��o Main()
- O nome da classe Java DEVE ser o mesmo nome do arquivo Java.
- Tuso o que estiver dentro das "chaves" {} faz parte da classe.
- Toda classe Java possui a seguinte forma:

public class NomeDaClasse{

}
*/

// Atributos

/*
- S�o as caracter�sticas da classe/molde/modelo de dados.
- Podemos entender atributos como vari�veis da classe.
- Uma outra forma de moneclatura para os atributos s�o estados.
- Atributos s�o nomeados em letra nin�scula, sem espa�os, sem caractere especial, sem acentua��o
*/

// Metodos

/*
- Podemos entender os m�todos como a��o que � realizada por um objeto da classe.
- Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe.

- Mesmos requisitos para fun��es
    Uma fun��o deve ter o seguinte
    a) Tipo de retorno (Tipo de dado que a fun��o vai retornar)
    b) nome (Corresponde a a��o que a fun��o realiza)
    c) Par�metros/Argumentos de entrada (Opcional)
    d) retorno (Opcional - Depende do tipo de etorno)
*/

package br.com.geekuniversity.secao09.classes;

public class Produto {
	public String nome;
	public float preco;
	public float desconto;
	
	// M�todo para aumentar o pre�o do produto conforme "valor" repassado
	void aumentar_pre�o(float valor) {
		this.preco = this.preco + valor;
	}

}
