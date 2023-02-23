package com.signify.bean;
import java.util.Date;
public class SemesterRegistration {
	
	
	private int semester;
	private Date date;
    
	public SemesterRegistration(int studentId, int semester, Date date) {
        //this.studentId = studentId;
        this.semester = semester;
        this.date = date;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
