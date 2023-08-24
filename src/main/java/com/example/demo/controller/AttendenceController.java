package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.courseModel.Course;

@RestController
public class AttendenceController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveCourse(){
	
		return Arrays.asList(
				new Course(1,"Science","Physics"),
				new Course(2,"Arts","History"),
				new Course(3,"Commerce","Accounts"),
				new Course(4,"Bio","Zoology"),
				new Course(5,"Law","IPC")	
				);
	}
}
