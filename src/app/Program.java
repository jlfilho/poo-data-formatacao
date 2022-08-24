package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

		// Data-hora ➞ Texto formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d01 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d01));

		// Data-hora ➞ Texto formato customizado
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02.format(fmt2));

		// Data-hora global ➞ Texto formato customizado
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant d03 = Instant.now();
		System.out.println("d03 = " + fmt3.format(d03));

		// Data-hora global ➞ Formato padrão 
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
		Instant d04 = Instant.now();
		System.out.println("d04 = " + fmt4.format(d04));

	}

}
