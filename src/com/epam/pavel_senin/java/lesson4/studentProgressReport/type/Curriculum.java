package com.epam.pavel_senin.java.lesson4.studentProgressReport.type;

/**
 * Class for Curriculums
 */
public class Curriculum {

	private String nameCurriculum;
	private Course coursesInCurriculum[];
	//private int sumHours;

	/**
	 * @param nameCurriculum
	 *            - name of Curriculum
	 * @param courses
	 *            - some Courses which must contain in current Curriculum
	 */
	public Curriculum(String nameCurriculum, Course... courses) {
		this.nameCurriculum = nameCurriculum;
		int i = courses.length;
		this.coursesInCurriculum = new Course[i];
		for (int j = 0; j < i; j++) {
			this.coursesInCurriculum[j] = new Course(courses[j].getNameCourse(), courses[j].getDurationHours());			
		}
	}

	/**
	 * @return the nameCurriculum
	 */
	public String getNameCurriculum() {
		return nameCurriculum;
	}

	/**
	 * @param nameCurriculum
	 *            the nameCurriculum to set
	 */
	public void setNameCurriculum(String nameCurriculum) {
		this.nameCurriculum = nameCurriculum;
	}

	/**
	 * @return the courses
	 */
	public Course[] getCoursesInCurriculum() {
		return coursesInCurriculum;
	}

}