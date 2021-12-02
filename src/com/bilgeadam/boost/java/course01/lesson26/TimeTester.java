package com.bilgeadam.boost.java.course01.lesson26;

import java.time.*;

public class TimeTester {
	public static void main(String[] args) {
		System.out.println("\nYerel zaman                : " + LocalTime.now().toString());
		System.out.println("\nYerel tarih ve zaman       : " + LocalDateTime.now().toString());
		System.out.println("\nSaat dilimli tarih ve zaman: " + ZonedDateTime.now().toString());
		System.out.println("\nOfsetli zaman              : " + OffsetTime.now().toString());
		System.out.println("\nOfsetli tarih ve zaman     : " + OffsetDateTime.now().toString());
		System.out.println("\nAy ve gün                  : " + MonthDay.now().toString());
		System.out.println("\nYýl ve ay                  : " + YearMonth.now().toString());
		System.out.println("\nAnlýk                      : " + Instant.now().toString());
		
		
		System.out.println("\nYerel zaman (CET)          : " + LocalTime.now(ZoneId.of("CET")).toString());
		
		System.out.println("\nYerel zaman                : " + LocalTime.now().toString()); 
		
		LocalDate d = LocalDate.parse("2021-10-11");
		
		
//		System.out.println(d.);
		System.out.println(d.toString());
	}
}

