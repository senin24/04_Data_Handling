package com.epam.pavel_senin.java.lesson4.studentProgressReport;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.ReportLong;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.ReportShort;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.Source;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.type.Student;

/** Class for Run programm */
public class Runner {

	private static final String REPORT_LONG_RU = "3";
	private static final String REPORT_SHORT_RU = "2";
	private static final String REPORT_LONG_EN = "1";
	private static final String REPORT_SHORT_EN = "0";

	/**
	 * @param arg
	 *            - arguments (0-4)
	 * @param currentTime
	 *            - time when start programm
	 * @see StudentProgressReport#main(String[])
	 */
	public static void startApp(String arg, Calendar currentTime) {

		Student[] students = Source.initializeStudent();		
		
		Calendar [] startDates=Source.initializeStartDates(currentTime);		

		Locale.setDefault(new Locale("en", "EN"));
		Locale localeEN = new Locale("en", "EN");
		ResourceBundle rbEN = ResourceBundle.getBundle("com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.report", localeEN);
		Locale localeRU = new Locale("ru", "RU");
		ResourceBundle rbRU = ResourceBundle.getBundle("com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.report", localeRU);

		switch (arg) {

		case Runner.REPORT_SHORT_EN:
			ReportShort.printReportShort(students, currentTime, startDates, rbEN);
			break;

		case Runner.REPORT_LONG_EN:
			ReportLong.printReportLong(students, currentTime, startDates, rbEN);
			break;

		case Runner.REPORT_SHORT_RU:
			ReportShort.printReportShort(students, currentTime, startDates, rbRU);
			break;

		case Runner.REPORT_LONG_RU:
			ReportLong.printReportLong(students, currentTime, startDates, rbRU);
			break;

		default:
			ReportShort.printReportShort(students, currentTime, startDates, rbEN);
			ReportLong.printReportLong(students, currentTime, startDates, rbEN);
			ReportShort.printReportShort(students, currentTime, startDates, rbRU);
			ReportLong.printReportLong(students, currentTime, startDates, rbRU);

		}

	}

}
