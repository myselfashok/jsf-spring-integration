package com.erp.core.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "studentBean")
@Scope(value = "request")
public class StudentBean {

	private Student student = new Student();
	
	private String sub="1"; 
	
	private List<Student> studentList=new ArrayList<Student>();
	
	//method for adding list of student
	public void addStudent(){
		studentList.add(student);
		student = new Student();
	}
	
	//method for remove
	
	/*public void removeStudent(Student student){
		studentList.remove(student);
	}*/
	
	
	public String removeStudent(Student student) {
        
        studentList.remove(student);
        return null;
    }
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}
