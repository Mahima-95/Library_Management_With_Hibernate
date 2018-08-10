package com.java.march;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatePractice {
	public static void main(String[] args) throws ParseException {

		DatePractice datePractice = new DatePractice();
		datePractice.getDates();
		datePractice.dateConversion();
		datePractice.dateAndTimeArithmetic();
	}

	public void dateConversion() throws ParseException {
		String date = "15-09-2011";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date d = dateFormat.parse(date);
		System.out.println(d);
	}

	public void getDates() {
		Calendar calendar = Calendar.getInstance();
		Date getTime = calendar.getTime();
		System.out.println(getTime);
		System.out.println("current day---->>> " + calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println("current year---->>> " + calendar.get(Calendar.YEAR));

		// Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
		//
		// Date currentTime = localCalendar.getTime();
		// int currentDay = localCalendar.get(Calendar.DATE);
		// int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
		// int currentYear = localCalendar.get(Calendar.YEAR);
		// int currentDayOfWeek = localCalendar.get(Calendar.DAY_OF_WEEK);
		// int currentDayOfMonth = localCalendar.get(Calendar.DAY_OF_MONTH);
		// int CurrentDayOfYear = localCalendar.get(Calendar.DAY_OF_YEAR);
		//
		// System.out.println("Current Date and time details in local
		// timezone");
		// System.out.println("Current Date: " + currentTime);
		// System.out.println("Current Day: " + currentDay);
		// System.out.println("Current Month: " + currentMonth);
		// System.out.println("Current Year: " + currentYear);
		// System.out.println("Current Day of Week: " + currentDayOfWeek);
		// System.out.println("Current Day of Month: " + currentDayOfMonth);
		// System.out.println("Current Day of Year: " + CurrentDayOfYear);
		//
		// // getting time, date, day of week and other details in GMT timezone
		// Calendar gmtCalendar =
		// Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public void dateAndTimeArithmetic() {
		Calendar cal = Calendar.getInstance();
		//cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("current date: " + getDate(cal));

	}

	private static String getDate(Calendar cal) {
		return "" + cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);

	}
}
