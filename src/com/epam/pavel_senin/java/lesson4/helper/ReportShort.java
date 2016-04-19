package com.epam.pavel_senin.java.lesson4.helper;

import java.util.Calendar;
import java.util.ResourceBundle;

import com.epam.pavel_senin.java.lesson4.StudentProgressReport;
import com.epam.pavel_senin.java.lesson4.type.Student;


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
	public static void printReportShort (Student [] students, Calendar currentTime,ResourceBundle rb) {		
		
	for (Student currentStudent:students){
		
		System.out.print(currentStudent.getNameStudent() + " - " + currentStudent.getCurriculumStudend().getNameCurriculum());
		
		if (Time.timeProgrammPassed(currentStudent, currentTime)) {
			System.out.print(rb.getString("complete"));	
		}
		else {
			System.out.print(rb.getString("notcomplete"));
		}
		
		int workhours=Time.getDiffWorkTimeInHours(currentStudent, currentTime);
		
		int day=workhours/(StudentProgressReport.ENDTIMEHOUR-StudentProgressReport.STARTTIMEHOUR);
		int hours=workhours%(StudentProgressReport.ENDTIMEHOUR-StudentProgressReport.STARTTIMEHOUR);
		
		System.out.println(day+ rb.getString("day")+ hours + rb.getString("hours"));
		
	}
		
		
		
		
	}
	

}
