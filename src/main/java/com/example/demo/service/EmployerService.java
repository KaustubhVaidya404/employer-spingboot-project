package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employer;
import com.example.demo.repository.EmployerRepository;

@Service
public class EmployerService {

	@Autowired
	EmployerRepository repo;
	
	public void addData(Employer employer) {
		repo.addEmployer(employer);
	}
	
	public void updateName(int id, String name) {
		repo.updateName(id, name);
	}
	
	public void updateDepartment(int id, String department) {
		repo.updateDepartment(id, department);
	}
	
	public void updatePost(int id, String post) {
		repo.updatePost(id, post);
	}
	
	public void updateSalary(int id, int salary) {
		repo.updateSalary(id, salary);
	}
	
	public Employer getById(int id) {
		Employer employer = repo.getById(id);
		return employer;
	}
	
	public List<Map<String, Object>> getAll(){
		List<Map<String, Object>> data = repo.getAll();
		return data;
	}
	
	public void deleteData(int id) {
		repo.deleteEmployer(id);
	}
	
}
