package section14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);
		LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);
		
		long duration = ChronoUnit.DAYS.between(checkIn, checkOut);
		
		System.out.println("Duração entre as datas: "+ duration +" dias.");
		
		if(checkIn.isAfter(checkOut)) {
			System.out.println("A data de check-in não pode ser posterior a de check-out");
		}
		sc.close();
	}
}
