package com.epam.pavel_senin.java.lesson4.type;

/**
 * Class for Corses
 */
public class Course {

	private String nameCourse;
	private int durationHours;

	/**
	 * @param nameCourse
	 *            - Name of Course
	 * @param durationHours
	 *            - Duration Cours in hours
	 */
	public Course(String nameCourse, int durationHours) {
		this.nameCourse = nameCourse;
		this.durationHours = durationHours;
	}

	/**
	 * @return the nameCourse
	 */
	public String getNameCourse() {
		return nameCourse;
	}

	/**
	 * @param nameCourse
	 *            the nameCourse to set
	 */
	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	/**
	 * @return the durationHours
	 */
	public int getDurationHours() {
		return durationHours;
	}

	/**
	 * @param durationHours
	 *            the durationHours to set
	 */
	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}

	@Override
	public String toString() {
		return "Course [nameCourse=" + nameCourse + ", durationHours=" + durationHours + "]";
	}

}
