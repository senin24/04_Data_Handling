package com.epam.pavel_senin.java.lesson4.studentProgressReport.helper;

import java.util.Calendar;
import java.util.GregorianCalendar;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.StudentProgressReport;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.type.Course;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.type.Curriculum;
import com.epam.pavel_senin.java.lesson4.studentProgressReport.type.Student;

/** Class for initialize objects */
public final class Source {
	/**
	 * Procedure return Array which contain some object Students.
	 * 
	 * @return return - array which contain some instances of Student [].
	 */
	public static Student[] initializeStudent() {

		Course courses[] = new Course[] { new Course("Java Servlets", 16), new Course("Struts Framework", 24),
				new Course("Java", 8), new Course("JFC/Swing ", 16), new Course("JDBC", 16), };

		Curriculum j2EEDeveloper = new Curriculum("J2EE Developer", courses[0], courses[1]);
		Curriculum javaDeveloper = new Curriculum("Java Developer", courses[2], courses[3], courses[4]);



		Student students[] = new Student[] { new Student("Ivanov Ivan", j2EEDeveloper),
				new Student("Petrov Petr", javaDeveloper) };

		return students;
	}
	
	/**
	 * Procedure return Array which contain some start time in work hours.
	 * @param currentTime
	 * @return date in work time
	 */
	public static Calendar [] initializeStartDates(Calendar currentTime) {
		
		currentTime.set(Calendar.MILLISECOND, 0);
		currentTime.set(Calendar.SECOND, 0);
		currentTime.set(Calendar.MINUTE, 0);
		
		Calendar startDate1 = new GregorianCalendar();
		Calendar startDate2 = new GregorianCalendar();
		startDate1 = (Calendar) currentTime.clone();
		startDate2 = (Calendar) currentTime.clone();
		startDate1.add(Calendar.DATE, StudentProgressReport.START_DATE1);		
		startDate2.add(Calendar.DATE, StudentProgressReport.START_DATE2);
		startDate1=Time.getStartDate(startDate1);
		startDate2=Time.getStartDate(startDate2);
		
		Calendar[] StartDates=new Calendar [] {
				startDate1,
				startDate2				
		};
		return StartDates;		
	}

}
