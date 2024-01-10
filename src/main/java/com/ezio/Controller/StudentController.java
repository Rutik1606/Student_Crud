package com.ezio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ezio.Entity.Student;
import com.ezio.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService ser;

	@PostMapping("/saved-Data")
	public String saved(@RequestBody Student s) { 
		System.out.println(s);
		ser.SaveStudent(s);
		return "Saved";
	}

	@GetMapping("/Read-Student")

	public List<Student> getStudent() {

		return ser.getStudents();

	}

	@GetMapping("/Find-By-Id/{id}")
	public Student getStudent(@PathVariable("id") Long id) {
		return ser.getStudent1(id);

	}

	@DeleteMapping("/Delete-By-Id/{id}")
	public Student getStudent1(@PathVariable("id") Long id) {
		return ser.delStudent1(id);

	}
	@PutMapping("/Update-By-Id")
	public String getString(@RequestBody Student s)
	{
		ser.SaveStudent(s);
		return "Saved";
	}

}
