package com.yamlProject.demo.yamlProject.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yamlProject.demo.yamlProject.entity.Student;
import com.yamlProject.demo.yamlProject.entity.Student_all;

@Component
@Service
public class yamlProjectService {
	
	public List<Student> student = new ArrayList<Student>();
	public Student_all details = new Student_all();
	
	public List<Student> getFromYaml() {
		return student;
	}
	
	public String AddYaml(Student st) {
		student.add(st);
		System.out.println(student);
		return "Successfully Added";
	}

}
