package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ana", "Magalhães", "ana@gmail.com"));
		students.add(new Student("Zé", "Rosa", "ze@gmail.com"));
		students.add(new Student("Luís", "Fonseca", "luis@gmail.com"));
		students.add(new Student("Carolina", "Reis", "carol@gmail.com"));
		
		return students;
		
	}

}
