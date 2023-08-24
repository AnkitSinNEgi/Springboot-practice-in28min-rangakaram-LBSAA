package com.example.demo.courseModel;

public class Course {

	 private int id;
	private String courseName;
	private String subject;
	
	//constructor
	public Course(int id, String courseName, String subject) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", subject=" + subject + "]";
	}
	
	//to string method
	
	
	
}
