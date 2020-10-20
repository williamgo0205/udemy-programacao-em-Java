package helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utils {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
	
	// Converte Date para String utilizando o SDF
	public static String dateParaString(Date data) {
		return Utils.sdf.format(data);				
	}
	
	// Converte um valor Double para String utilizando o NF
	public static String doubleParaString(Double valor) {
		return Utils.nf.format(valor);
	}
	
	// Converte um valor String para Double utilizando o NF
	public static Double StringParaDouble(String valor) {
		try {
			return (Double)Utils.nf.parse(valor);
		}catch(ParseException e) {
			return null;
		}
	}
	
	// Exibe uma mensagem e pausa o programa alguns segundos
	public static void pausar(int segundos) {
		try {
			TimeUnit.SECONDS.sleep(segundos);
		}catch(InterruptedException e) {
			System.out.println("Erro ao pausar por " + segundos + " segundos.");
		}
	}
}
