package aula103;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//MANIPULAR DATA COM CALENDAR
		
		//INICIO - SOMAR OU SUBTRAIR UNIDADE DE TEMPO
					
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			Date data = Date.from(Instant.parse("2021-08-05T10:30:07Z"));
			
			System.out.println(data);
			System.out.println(sdf2.format(data));
			
			System.out.println("---------------------------------");
			
			//ADICINANDO 4 HORAS
			Calendar calendario1 = Calendar.getInstance();
			calendario1.setTime(data);
			calendario1.add(Calendar.HOUR_OF_DAY, 4);
			data = calendario1.getTime();
			System.out.println(sdf2.format(data));
			
			System.out.println("---------------------------------");
			
			//ADICINANDO 1 DIA
			Calendar calendario2 = Calendar.getInstance();
			calendario2.setTime(data);
			calendario2.add(Calendar.DAY_OF_MONTH, 1);
			data = calendario2.getTime();
			System.out.println(sdf2.format(data));
			
			System.out.println("---------------------------------");
			
			//PEGANDO O HORA, MINUTOS, E SEGUNDO
			Calendar calendario3 = Calendar.getInstance();
			calendario3.setTime(data);

			int hora = calendario3.get(Calendar.HOUR);
			int minuto = calendario3.get(Calendar.MINUTE);
			int segundos = calendario3.get(Calendar.SECOND);
			System.out.println("Hora: " + hora + "\nMinuto: " + minuto + "\nSegundos: " + segundos);
			
			System.out.println("---------------------------------");
			
			//PEGANDO O DIA, MêS, E ANO (O MÊS COMEÇA COM O NÚMERO 0. PARA RESOLVER É SÓ ADICIONAR +1)
			Calendar calendario4 = Calendar.getInstance();
			calendario4.setTime(data);

			int dia = calendario4.get(Calendar.DAY_OF_MONTH);
			int mes = 1 + calendario4.get(Calendar.MONTH);
			int ano = calendario4.get(Calendar.YEAR);
			System.out.println("Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
			
			System.out.println("---------------------------------");
		
			//SUBTRAINDO 4 HORAS
			Calendar calendario5 = Calendar.getInstance();
			calendario5.setTime(data);
			calendario5.add(Calendar.HOUR_OF_DAY, -4);
			data = calendario5.getTime();
			System.out.println(sdf2.format(data));
			
		//FIM - SOMAR OU SUBTRAIR UNIDADE DE TEMPO

	}
}