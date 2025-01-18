package net.kanth.datetime_algo;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		LocalDate dobDate     = LocalDate.parse("1999-10-08");
		Period period = Period.between(dobDate, currentDate);
		
		System.out.println("Your Age is\n"+period.getYears()+" years, "+period.getMonths()+ " months "+period.getDays()+" days");
		
	}
	
}
