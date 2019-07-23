package com.techstack.problems;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FindALastFirdayInEachMonthForAYear {

	// What is the date of the particular last Friday of every month?
	public static void main(String[] args) {

		for (int i = 0; i < 12; i++)
			System.out.println(usingCalendar(i, 2019));

		for (int i = 1; i <= 12; i++)
			usingLocalDate(i, 2019);
	}

	public static Date usingCalendar(int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 1);
		cal.set(GregorianCalendar.DAY_OF_WEEK, Calendar.FRIDAY);
		cal.set(GregorianCalendar.DAY_OF_WEEK_IN_MONTH, -1);
		return cal.getTime();
	}

	public static void usingLocalDate(int month, int year) {
		LocalDate now = LocalDate.of(year, month, 1);
		LocalDate lastInMonth = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
		System.out.println(lastInMonth);
	}
}
