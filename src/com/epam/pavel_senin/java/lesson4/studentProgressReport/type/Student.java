package com.epam.pavel_senin.java.lesson4.studentProgressReport.type;

import java.util.Calendar;

import com.epam.pavel_senin.java.lesson4.studentProgressReport.helper.Time;

/** Class for Students */
public class Student {

	private String nameStudent;
	private Curriculum curriculumStudend;

	/**
	 * @param nameStudent
	 *            - contain name and second name of student
	 * @param curriculumStudend
	 *            - what curriculum student must learn
	 */
	public Student(String nameStudent, Curriculum curriculumStudend) {
		
		this.nameStudent = nameStudent;
		this.curriculumStudend = curriculumStudend;
	}

	/**
	 * @return the nameStudent
	 */
	public String getNameStudent() {

		return nameStudent;
	}

	/**
	 * @param nameStudent
	 *            the nameStudent to set
	 */
	public void setNameStudent(String nameStudent) {

		this.nameStudent = nameStudent;
	}

	/**
	 * @return the curriculumStudend
	 */
	public Curriculum getCurriculumStudend() {

		return curriculumStudend;
	}

	/**
	 * @param curriculumStudend
	 *            the curriculumStudend to set
	 */
	public void setCurriculumStudend(Curriculum curriculumStudend) {

		this.curriculumStudend = curriculumStudend;
	}

	/**
	 * @return the endDate
	 */
	public Calendar getEndDate(Calendar startDate) {

		Calendar endDate = Time.getEndDate(startDate, curriculumStudend);
		return endDate;
	}

}
