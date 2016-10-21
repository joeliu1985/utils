package com.github.ichenkaihua.jdk8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class D {
	public static void main(String[] args) {
		final Clock clock = Clock.systemUTC();
		
		System.out.println( clock.instant() );
		System.out.println( clock.getZone() );
		
		
		
		// Get the local date and local time
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now( clock );
		        
		System.out.println( date );
		System.out.println( dateFromClock );
		        
		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now( clock );
		        
		System.out.println( time );
		System.out.println( timeFromClock );
		
		
	}
}
