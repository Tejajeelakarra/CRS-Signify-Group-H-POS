/**
 * 
 */
package com.signify.client;

import com.signify.service.StudentService;

/**
 * @author palak
 *
 */
public class CRSStudentMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service3 = new StudentService();
		service3.register(20);
		service3.changePassword(10);
		service3.viewGradeCard(10);
		service3.addCourse("m01");
		service3.dropCourse("m01");
		service3.payfees(10);
		service3.viewCourseDetails();
		service3.viewRegisteredCourses();
	}

}
