package com.epam.pavel_senin.java.lesson4;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Program for calculate Student Progress Report.
 * 
 * @author pavel_senin@epam.com
 */
public class StudentProgressReport {

	/** In this hour start work time. */
	public static final int STARTTIMEHOUR = 10;
	/** In this hour end work time. */
	public static final int ENDTIMEHOUR = 18; 

	/**
	 * How many days sum to current time for calculate Start time lerning
	 * Student1
	 */
	public static final int START_DATE1 = -3;
	/**
	 * How many days sum to current time for calculate Start time lerning
	 * Student2
	 */
	public static final int START_DATE2 = 10;

	/**
	 * @param args
	 *            - 0 show Short Report in en-en; 1 - show Long Report in en0en;
	 *            2 - show Short Report in ru-ru; 4 - show Long Report in ru-ru;
	 *            Without or other argumet - show all Reports in all locale
	 */
	public static void main(String[] args) {

		Calendar currentTime = new GregorianCalendar();
		if (args.length > 0) {
			Runner.startApp(args[0], currentTime);
		} else {
			Runner.startApp("", currentTime);
		}

	}

}
