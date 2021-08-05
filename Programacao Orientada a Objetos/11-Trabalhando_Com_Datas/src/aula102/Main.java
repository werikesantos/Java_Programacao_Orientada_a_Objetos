package aula102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		//MAPA DO FUSO HOR�RIO -> https://www.timeanddate.com/time/map/
		
		//SEGUIR PADR�O ISO 8601 PARA ARMAZENAMENTO DE DATAS 
		//FORMATO -> yyyy-MM-ddTHH:mm:ssZ (LETRA 'Z' REPRESENTA QUE � UM HORARIO SEGUINDO O PADR�O UTC)
		//ATEN��O: AO ARMAZENAR DATAS, SEMPRE SEGUIR O PADR�O UTC, CONFORME MOSTRA O EXEMPLO ACIMA
		
		//FORMATA��O: SE FOR UMA DATA NO PADR�O UTC, SER� CONVERTIDO PARA O TIPO DATE ATRAVES DA CLASSE INSTANT
		//EXE: Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		//INICIO - FORMATO DE DATA
		
			//ATEM��O: ESSES OBJETOS RETORNAM COMO UMA STRING
		
			//FORMATO DE DIA M�S E ANO
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			
			//FORMATO DE DIA, M�S, ANO, HORA, MINUTOS E SEGUNDOS
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
		//FIM - FORMATO DE DATA
			
		//INICIO - FORMATANDO STRING PARA DATE
			
			//AVISO: GERA ERRO DE EXCE��ES - TRATAR
			
			Date data1 = sdf1.parse("25/08/1993");
			Date data2 = sdf2.parse("25/08/1993 15:42:07");
			
		//FIM - FORMATANDO STRING PARA DATE
			
		//INICIO - IMPRIMIR NO FORMATO PADR�O
			
			System.out.println(data1);
			System.out.println(data2);
			
		//FIM - IMPRIMIR NO FORMATO PADR�O
			
			System.out.println("-----------------------------");
			
		//INICIO - IMPRIMIR NO FORMATO ESPECIFICADO NO SimpleDateFormat
			
			System.out.println(sdf1.format(data1));
			System.out.println(sdf2.format(data2));
			
		//FIM - IMPRIMIR NO FORMATO ESPECIFICADO NO SimpleDateFormat
			
			System.out.println("-----------------------------");
			
		//INICIO - IMPRIMIR O HORARIO DE AGORA
			
			Date dataAgora1 = new Date();
			
			//PEGANDO COM OS MILISEGUNDOS -> VAI FAZER A MESMA COISA QUE O COMANDO ACIMA
			Date dataAgora2 = new Date(System.currentTimeMillis());
			
			System.out.println(sdf1.format(dataAgora1));
			System.out.println(sdf2.format(dataAgora1));
			
			//FORMATO PADR�O SEM O SimpleDateFormat
			System.out.println(dataAgora1);	
			
		//FIM - IMPRIMIR O HORARIO DE AGORA
			
			System.out.println("-----------------------------");
			
		//INICIO - PADR�O ISO 8601
			
			//ATEN��O: COMO FOI DEFINIDO POR PARAMETRO O SEGUINTE HORARIO -> T15:42:07Z <- 'Z' SIGNIFICA PADR�O UTC
			Date padraoUTC = Date.from(Instant.parse("2021-08-04T15:42:07Z"));
			//O 'Instant.parse' NESTE CASO, SE EMCARREGA DE CONVERTER O FORMATO UTC PARA O MEU LOCAL QUE EST� A 3HORAS A MENOS.
			
			//VEJA NO SITE: https://www.timeanddate.com/time/map/
			System.out.println(padraoUTC);
			System.out.println(sdf1.format(padraoUTC));
			System.out.println(sdf2.format(padraoUTC));
			
		//FIM - PADR�O ISO 8601	
			
			System.out.println("-----------------------------");
			
		//INICIO - FORMATO GMT -> UTC MARCO ZERO
			
			SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			System.out.println(sdf3.format(dataAgora1));
			
		//FIM - FORMATO GMT -> UTC MARCO ZERO
	}
}