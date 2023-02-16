/**
 * 
 */
package com.signify.client;

import com.signify.service.AdminService;
import com.signify.service.CatalogService;
import com.signify.service.GradeCardService;
import com.signify.service.PaymentService;
import com.signify.service.Professorservice;
import com.signify.service.RegisteredCourseService;
import com.signify.service.SemesterRegistrationService;
import com.signify.service.StudentService;
import com.signify.service.Userservice;

/**
 * @author tjkey
 *
 */
public class ApplicationMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCardService service = new GradeCardService();
		
		System.out.println(service.Calculatorcpi(10));
		//palak
		Professorservice service1 = new Professorservice();
		Userservice service2 = new Userservice();
		service1.viewEnrolledStudents();
		service1.addGrade();
		service2.updateDetails(100);
		service2.updatePassword(100);
		//anchal
		StudentService service3 = new StudentService();
		service3.register(20);
		service3.changePassword(10);
		service3.viewGradeCard(10);
		//Nivetha
		PaymentService service4 = new PaymentService();
		service4.sendNotification();
		//sre
		RegisteredCourseService service5= new RegisteredCourseService();
		service5.dropCourse(101);
		service5.viewGrade(701);
		
		AdminService adservice6= new AdminService();
		adservice6.addProfessor(200);
		adservice6.approveStudent(101);
		adservice6.assignCourse(701);
		//amritha
		
		SemesterRegistrationService service7 = new SemesterRegistrationService();
		
		service7.registerCourses();
		service7.addCourse();
		service7.dropCourse();
		service7.payFees();
		service7.viewRegisteredCourses();
		
		CatalogService cservice8 = new CatalogService();
		
		cservice8.addCourse();
		cservice8.deleteCourse();
		cservice8.viewCourseDetails();

	}

}
