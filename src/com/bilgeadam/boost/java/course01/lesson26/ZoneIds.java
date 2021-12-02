package com.bilgeadam.boost.java.course01.lesson26;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZoneIds {

	public static void main(String[] args) {
//		for (String zoneId : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zoneId);
//		}

		ZoneId zone = ZoneId.of("CET");
		ZonedDateTime dT = ZonedDateTime.of(LocalDateTime.of(2021, 10, 11, 9, 43), zone);
		System.out.println(dT);
//		ZonedDateTime dT = ZonedDateTime.of(2021, Month.OCTOBER, 11, 9, 12, 12, 12, 12, zone);
		
		ZonedDateTime anotherDateTime = ZonedDateTime.of(LocalDateTime.of(2021, 12, 19, 12, 43), zone);
		System.out.println("Yarým Gün sayýsý: " + dT.until(anotherDateTime, ChronoUnit.HALF_DAYS));
		System.out.println("Gün sayýsý: " + dT.until(anotherDateTime, ChronoUnit.DAYS));
	}

}
