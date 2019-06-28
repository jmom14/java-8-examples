package com.example.dates;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LocalDateApp {
	
	public static void main(String[] args) {
		
		LocalDate dateToTest = LocalDate.now();
		LocalDate startDate = LocalDate.of(2018,12,22);
		LocalDate finishDate = LocalDate.of(2019, 6, 21);
		
		System.out.println(isWithinRange(dateToTest, startDate, finishDate));	
	}
	
	public static boolean isWithinRange(LocalDate date, LocalDate start, LocalDate finish) {
		return !date.isAfter(finish) && !date.isBefore(start);
	}
	
	public static LocalDate toLocalDate(java.util.Date date) {
		return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
		//return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static LocalDate toLocalDate(java.sql.Date date) {
		return date.toLocalDate();
	}
	
	public static LocalDate toLocalDate(Timestamp date) {
		return date.toLocalDateTime().toLocalDate();
	}
	
	public static LocalDateTime toLocalDate(Calendar date) {
		if (date == null) {
		      return null;
		  }
		  TimeZone tz = date.getTimeZone();
		  ZoneId zid = tz == null ? ZoneId.systemDefault() : tz.toZoneId();
		  return LocalDateTime.ofInstant(date.toInstant(), zid);
	}
	
	public static LocalDateTime toLocalDate(GregorianCalendar date) {
		if (date == null) {
		      return null;
		  }
		  TimeZone tz = date.getTimeZone();
		  ZoneId zid = tz == null ? ZoneId.systemDefault() : tz.toZoneId();
		  return LocalDateTime.ofInstant(date.toInstant(), zid);
	}
	
	public static Calendar getCalendarDate(String date) {
	return Calendar.getInstance();
	}
	
	public static java.util.Date getUtilDate(String date){
	return new java.util.Date();
	}
		
	public static java.sql.Date getSqlDate(){
	return new java.sql.Date(100000L);
	}
	
	
	public enum Pattern{

		PATTERN1("DDMMYYYY"), PATTERN2("MMDDYYYY"), PATTERN3("DD-MM-YYYY"), PATTERN4("DD/MM/YYYY");
		
		private String pattern;
		
		private Pattern(final String pattern) {
		this.pattern = pattern;
		}
		
		public String getPattern(){
		return this.pattern;
		}
			
	}
}