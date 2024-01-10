package com.ezio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.ezio.Entity.Student;
import com.ezio.Repository.StudentRepository;

@Service

public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public void SaveStudent (Student s) {
		repo.save(s);
		
	}
	public List<Student>getStudents(){
		return repo.findAll();
		
	}
	public Student getStudent1(Long id) {
		return repo.findById(id).get();
		
	}
	public Student  delStudent1(Long id) {
		repo.deleteById(id);
		return null;
	}
	public Student updStudent (Student s) {
		return repo.save(s);
	
		
}
}
