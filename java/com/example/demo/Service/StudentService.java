package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public Student addStudent(Student obj) {
		return repo.save(obj);
	}
	
	public List<Student> getStudents(){
		List<Student> arr = new ArrayList<>();
		arr = (List<Student>) repo.findAll();
		return arr;
	}
	
	public void delStudent(Long id) {
		repo.deleteById(id);
	}
	
	public Student findById(Long id) {
		Student obj = repo.findById(id).get();
		return obj;
	}
}
