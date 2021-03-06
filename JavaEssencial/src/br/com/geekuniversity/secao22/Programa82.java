package br.com.geekuniversity.secao22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Datas

public class Programa82 {

	public static void main(String[] args) {

		// Data do dia atual ano-mes-dia (Formato ISO - Internacional)
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		// Criando uma data nova (Formato ISO - Internacional)
		LocalDate anoNovo = LocalDate.of(2021, Month.JANUARY, 1);
		System.out.println(anoNovo);

		int ano = anoNovo.getYear(); // Devolve o ano
		Month mes = anoNovo.getMonth(); // Devolve o m�s
		int dia = anoNovo.getDayOfMonth(); // Devolve o primeiro dia do m�s

		System.out.println("O ano novo ser� em: " + dia + " de " + mes + " de " + ano);

		// Quantos dias faltam da data atual at� o ano novo?
		Period periodo = Period.between(hoje, anoNovo);
		System.out.println(periodo);

		System.out.println("Faltam: " + periodo.getYears() + " anos " + periodo.getMonths() + " meses "
				+ periodo.getDays() + " dias para o ano novo.");

		// Formatar Datas para o formato Brasileiro
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));

		// Data e hora
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora); // Data/Hora formato ISO (Internacional)

		// Formatando data e Hora padr�o Brasileiro
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Formato 24 Horas "dd/MM/yyyy HH:mm:ss"
																								// Formato 12 Horas "dd/MM/yyyy hh:mm:ss"
		System.out.println(agora.format(formatadorHoras));

		// Colocando um hr�rio de intervalo
		LocalTime intervalo = LocalTime.of(9, 30);
		System.out.println(intervalo);
	}

}
