package com.bilgeadam.boost.java.course01.lesson26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class BirthdayInfo {

	public static void main(String[] args) {
		
		BAUtils.header("Gereksiz Doðumgünü Bilgileri");
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		DateTimeFormatter inpuFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		do {
			System.out.println("Bugün, " + LocalDate.now().format(fullFormat) + "\n");
			
//			String aDate = BAUtils.readString("Lütfen doðum gününüzü (YYYY-MM-dd) formatýnda giriniz");
//			LocalDate birthDay = LocalDate.parse(aDate);
			String aDate = BAUtils.readString("Lütfen doðum gününüzü (dd.mm.yyyy) formatýnda giriniz");
			LocalDate birthDay = LocalDate.parse(aDate, inpuFormat);
			
			if (birthDay.isAfter(LocalDate.now())) {
				System.err.println("Daha doðmadýnýz");
				continue;
			}
			
			System.out.println("---- Bilgiler ----");
			System.out.println(birthDay.format(fullFormat) + " harika bir gündü.");
			System.out.println("Bir " + birthDay.getDayOfWeek() + " günü doðdunuz");
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS);
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long mileniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			System.out.println("Bugüne dek " + days + " gün, " + weeks + " hafta, " + months + " ay, " + years + " yýl, " + decades + " onyýl ve " + mileniums + " binyýl yaþadýnýz");;
			
			LocalDate nextBDate = birthDay.plusYears(years + 1);
			System.out.println("Bir sonraki doðum gününüz " + nextBDate.format(fullFormat));
			System.out.println("Kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS) + " gün beklemeniz gerekli");
			
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yarým yaþlarýnýzý " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
		} while(BAUtils.wantToEnd("Bir daha (Evet/Hayýr)?", "Hayýr"));
		
		BAUtils.footer();
	}
}
