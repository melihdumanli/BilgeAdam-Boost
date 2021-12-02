package com.bilgeadam.boost.java.course01.lesson26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class BirthdayInfo {

	public static void main(String[] args) {
		
		BAUtils.header("Gereksiz Do�umg�n� Bilgileri");
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		DateTimeFormatter inpuFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		do {
			System.out.println("Bug�n, " + LocalDate.now().format(fullFormat) + "\n");
			
//			String aDate = BAUtils.readString("L�tfen do�um g�n�n�z� (YYYY-MM-dd) format�nda giriniz");
//			LocalDate birthDay = LocalDate.parse(aDate);
			String aDate = BAUtils.readString("L�tfen do�um g�n�n�z� (dd.mm.yyyy) format�nda giriniz");
			LocalDate birthDay = LocalDate.parse(aDate, inpuFormat);
			
			if (birthDay.isAfter(LocalDate.now())) {
				System.err.println("Daha do�mad�n�z");
				continue;
			}
			
			System.out.println("---- Bilgiler ----");
			System.out.println(birthDay.format(fullFormat) + " harika bir g�nd�.");
			System.out.println("Bir " + birthDay.getDayOfWeek() + " g�n� do�dunuz");
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS);
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long mileniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			System.out.println("Bug�ne dek " + days + " g�n, " + weeks + " hafta, " + months + " ay, " + years + " y�l, " + decades + " ony�l ve " + mileniums + " biny�l ya�ad�n�z");;
			
			LocalDate nextBDate = birthDay.plusYears(years + 1);
			System.out.println("Bir sonraki do�um g�n�n�z " + nextBDate.format(fullFormat));
			System.out.println("Kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS) + " g�n beklemeniz gerekli");
			
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yar�m ya�lar�n�z� " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
		} while(BAUtils.wantToEnd("Bir daha (Evet/Hay�r)?", "Hay�r"));
		
		BAUtils.footer();
	}
}
