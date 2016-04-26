package com.epam.pavel_senin.java.lesson4.studentProgressReport.helper;

import java.util.Calendar;
import java.util.ResourceBundle;

import com.epam.pavel_senin.java.lesson4.studentProgressReport.StudentProgressReport;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.type.Student;


/**Class for generate short report. */
public class ReportShort {
	
	
	/**
	 * Procedure print short report.
	 * 
	 * @param students
	 *            - array which contain instances of Student
	 * @param currentTime
	 *            - current time
	 * @param rb
	 *            - Resource Bundle
	 */
	public static void printReportShort (Student [] students, Calendar currentTime, Calendar [] StartDates, ResourceBundle rb) {		
		
	for (int i=0; i<students.length; i++){
		
		System.out.print(students[i].getNameStudent() + " - " + students[i].getCurriculumStudend().getNameCurriculum());
		
		if (Time.timeProgrammPassed(students[i], StartDates[i], currentTime)) {
			System.out.print(rb.getString("complete"));	
		}
		else {
			System.out.print(rb.getString("notcomplete"));
		}
		
		int workhours=Time.getDiffWorkTimeInHours(students[i], StartDates[i], currentTime);
		
		int day=workhours/(StudentProgressReport.ENDTIMEHOUR-StudentProgressReport.STARTTIMEHOUR);
		int hours=workhours%(StudentProgressReport.ENDTIMEHOUR-StudentProgressReport.STARTTIMEHOUR);
		
		System.out.println(day+ rb.getString("day")+ hours + rb.getString("hours"));
		
	}
		
		
		
		
	}
	

}
