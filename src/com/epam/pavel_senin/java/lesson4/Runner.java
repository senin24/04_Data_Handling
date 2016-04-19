package com.epam.pavel_senin.java.lesson4;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import com.epam.pavel_senin.java.lesson4.helper.ReportLong;
import com.epam.pavel_senin.java.lesson4.helper.ReportShort;
import com.epam.pavel_senin.java.lesson4.helper.Source;
import com.epam.pavel_senin.java.lesson4.type.Student;

/** Class for Run programm */
public class Runner {

	/**
	 * @param arg
	 *            - arguments (0-4)
	 * @param currentTime
	 *            - time when start programm
	 * @see StudentProgressReport#main(String[])
	 */
	public static void startApp(String arg, Calendar currentTime) {

		Student[] students = Source.initialize(currentTime);

		Locale.setDefault(new Locale("en", "EN"));
		Locale localeEN = new Locale("en", "EN");
		ResourceBundle rbEN = ResourceBundle.getBundle("com.epam.pavel_senin.java.lesson4.helper.report", localeEN);
		Locale localeRU = new Locale("ru", "RU");
		ResourceBundle rbRU = ResourceBundle.getBundle("com.epam.pavel_senin.java.lesson4.helper.report", localeRU);

		switch (arg) {

		case "0":
			ReportShort.printReportShort(students, currentTime, rbEN);

			break;

		case "1":
			ReportLong.printReportLong(students, currentTime, rbEN);
			break;

		case "2":
			ReportShort.printReportShort(students, currentTime, rbRU);
			break;

		case "3":
			ReportLong.printReportLong(students, currentTime, rbRU);

			break;

		default:
			ReportShort.printReportShort(students, currentTime, rbEN);
			ReportLong.printReportLong(students, currentTime, rbEN);
			ReportShort.printReportShort(students, currentTime, rbRU);
			ReportLong.printReportLong(students, currentTime, rbRU);

		}

	}

}
