package com.packet.spring.autowire.di;

public class ExamService {
	private StudentService studentService;
	private String examServiceType;
	
	public ExamService(StudentService studentService, String examServiceType) {
		this.studentService=studentService;
		this.examServiceType = examServiceType;
	}
	
	public void getExamDetails() {
		if(studentService !=null) {
			//Business logic to get exam details.
			
			studentService.getStudentDetail();
		}
	}
}
