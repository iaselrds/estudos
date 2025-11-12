//AULA 111 a 113 - Data e Hora

package section11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Lesson107 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // É necessário definir o fuso do Formatter para tratar datas e horas com fusos horários especificados
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2018-02-02");
		LocalDateTime d05 = LocalDateTime.parse("2018-02-02T13:45:28");
		Instant d06 = Instant.parse("2018-02-02T01:45:28Z");
		Instant d07 = Instant.parse("2018-02-02T13:45:28-06:00");
		
		LocalDate d08 = LocalDate.parse("02/02/2018", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("02/02/2018 13:45", fmt2);
		LocalDate d10 = LocalDate.of(2018, 2, 02);
		LocalDateTime d11 = LocalDateTime.of(2018, 02, 02, 13, 45);
		
		LocalDate c1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate c2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime c3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime c4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // Necessário usar ChronoUnit no tipo Instant, pois não há métodos para dados específicos
		
		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t2 = Duration.between(pastWeekDate.atStartOfDay(), nextWeekDate.atStartOfDay()); // Métodos convertem tipo LocalDate para LocalDateTime
		
		System.out.println(d01);
		System.out.println(d02); 
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("MM-yyyy-dd")));
		System.out.println(d05.format(fmt2));
		System.out.println(fmt3.format(d06)); //Retorna um horário formatado em UTC-02:00, pois o horário de verão ainda existia no Brasil em 2018.
		System.out.println(d05.format(fmt4));
		System.out.println(fmt5.format(d06));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getDayOfYear());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());
		System.out.println(d05.getHour());
		System.out.println(d05.getMinute());
		System.out.println(d05.getSecond());
		System.out.println(pastWeekDate);
		System.out.println(nextWeekDate);
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		System.out.println(t1.toHours());
		System.out.println(t2.toDays());
	}

}
