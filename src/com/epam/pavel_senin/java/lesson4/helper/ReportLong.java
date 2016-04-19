package com.epam.pavel_senin.java.lesson4.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.ResourceBundle;

import com.epam.pavel_senin.java.lesson4.StudentProgressReport;
import com.epam.pavel_senin.java.lesson4.type.Course;
import com.epam.pavel_senin.java.lesson4.type.Student;

/** Class for print Long report */
public class ReportLong {

	private static int MIN_WIDE_REPORT = 32;
	private static int LENGTH_WORD_CURRENT_DATE = 15;
	private static int LENGTH_HOURSES_COURSE = 4;
	private static int LENGTH_NUMBER_COURSE = 3;

	/**
	 * @param students
	 *            - array which contain instances of Student
	 * @param currentTime
	 *            - current time
	 * @param rb
	 *            - Resource Bundle
	 */
	public static void printReportLong(Student[] students, Calendar currentTime, ResourceBundle rb) {

		int wideReport = getWideReport(students);
		String line = getLine(wideReport);

		StringBuilder sb = new StringBuilder();
		Formatter fmt = new Formatter(sb);

		for (Student currentStudent : students) {

			int minWideSecondColum = wideReport - LENGTH_WORD_CURRENT_DATE;
			String lineFormater = "%-" + LENGTH_WORD_CURRENT_DATE + "s %" + minWideSecondColum + "s\n";

			fmt.format(line + "\n");

			fmt.format(lineFormater, rb.getString("currenttime"), getDateToString(currentTime));

			fmt.format(lineFormater, rb.getString("startdate"), getDateToString(currentStudent.getStartDate()));

			fmt.format(lineFormater, rb.getString("finishdate"), getDateToString(currentStudent.getEndDate()));

			String tmpString = StudentProgressReport.STARTTIMEHOUR + ":00 - " + StudentProgressReport.ENDTIMEHOUR
					+ ":00";
			fmt.format(lineFormater, rb.getString("workingtime"), tmpString);

			fmt.format(lineFormater, rb.getString("student"), currentStudent.getNameStudent());

			fmt.format(lineFormater, rb.getString("CURRICULUM"),
					currentStudent.getCurriculumStudend().getNameCurriculum());
			fmt.format(line + "\n");

			int i = 1;
			lineFormater = "%-" + (wideReport - LENGTH_HOURSES_COURSE - LENGTH_NUMBER_COURSE) + "s %"
					+ LENGTH_HOURSES_COURSE + "s\n";

			for (Course currentCourse : currentStudent.getCurriculumStudend().getCoursesInCurriculum()) {

				fmt.format(i + ". " + lineFormater, currentCourse.getNameCourse(), currentCourse.getDurationHours());
				i++;
			}
			fmt.format(line + "\n");
			fmt.format(rb.getString("TOTAL") + currentStudent.getCurriculumStudend().getSumHours() + "\n");

			if (Time.timeProgrammPassed(currentStudent, currentTime)) {
				fmt.format(rb.getString("completeL"));
			} else {
				fmt.format(rb.getString("notcompleteL"));
			}

			int workhours = Time.getDiffWorkTimeInHours(currentStudent, currentTime);

			int day = workhours / (StudentProgressReport.ENDTIMEHOUR - StudentProgressReport.STARTTIMEHOUR);
			int hours = workhours % (StudentProgressReport.ENDTIMEHOUR - StudentProgressReport.STARTTIMEHOUR);

			fmt.format(day + rb.getString("day") + hours + rb.getString("hours") + "\n\n");

			System.out.println(sb.toString());

			sb.setLength(0);

		}
		fmt.close();
	}

	private static String getDateToString(Calendar time) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		String tmp = dateFormat.format(time.getTime());
		return tmp;
	}

	private static int getWideReport(Student[] students) {
		int wideReport = MIN_WIDE_REPORT;
		int tmpWideReport = 0;

		for (Student currentStudent : students) {

			int lengthNameStudent = currentStudent.getNameStudent().length();
			int lengthCurriculumStudend = currentStudent.getCurriculumStudend().getNameCurriculum().length();

			if (lengthNameStudent > lengthCurriculumStudend) {
				tmpWideReport = lengthNameStudent;
			} else {
				tmpWideReport = lengthCurriculumStudend;
			}

			if ((tmpWideReport + LENGTH_WORD_CURRENT_DATE) > wideReport) {
				wideReport = tmpWideReport + LENGTH_WORD_CURRENT_DATE;
			}
		}
		return wideReport;
	}

	private static String getLine(int wideReport) {

		StringBuilder line = new StringBuilder(wideReport);
		for (int i = 0; i <= wideReport; i++) {
			line.append("-");
		}
		return line.toString();
	}

}
