package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

// Streams

public class Programa78 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Programa��o para Leigos", 170));
		cursos.add(new Curso("Algor�timos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em Java: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		// Como fazer para imprimir o "somat�rio quantidade de alunos" somente para cursos com mais de 100 alunos?
		int soma = 	cursos.stream()
					    .filter(c -> c.getAlunos() >= 100)
					    .mapToInt(Curso::getAlunos) // Mapeia para inte e permite que possamos efetuar c�lculs com o resultado
					    .sum(); // Sum -> Soma os valores por�m n�o permite express�o lambda

		System.out.println("A soma de todos os cursos com mais de 100 alunos �: " + soma);

	}

}
