package com.epam.pavel_senin.java.lesson4.type;

import java.util.Calendar;

import com.epam.pavel_senin.java.lesson4.helper.Time;

/** Class for Students */
public class Student {

	private String nameStudent;
	private Curriculum curriculumStudend;
	private Calendar startDate;
	private Calendar endDate;

	/**
	 * @param nameStudent
	 *            - contain name and second name of student
	 * @param curriculumStudend
	 *            - what curriculum student must learn
	 * @param startDate
	 *            - when student must start to learn curriculum
	 */
	public Student(String nameStudent, Curriculum curriculumStudend, Calendar startDate) {
		this.nameStudent = nameStudent;
		this.curriculumStudend = curriculumStudend;
		this.startDate = Time.getStartDate(startDate);
		this.endDate = Time.getEndDate(startDate, curriculumStudend);
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
	 * @return the startDate
	 */
	public Calendar getStartDate() {
		return startDate;
	}

	/**
	 * @return the endDate
	 */
	public Calendar getEndDate() {
		return endDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Student [nameStudent=" + nameStudent + ", curriculumStudend=" + curriculumStudend.getNameCurriculum()
				+ ", startDate=" + startDate.get(Calendar.DAY_OF_YEAR) + ", endDate="
				+ endDate.get(Calendar.DAY_OF_YEAR) + "]";
	}

}
