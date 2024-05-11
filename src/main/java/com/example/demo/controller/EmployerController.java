package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employer;
import com.example.demo.service.EmployerService;

@RestController
public class EmployerController {

	@Autowired
	EmployerService service;

	@GetMapping("/all")
	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> data = service.getAll();
		return data;
	}

	@GetMapping("/getbyid")
	public Employer getById(@RequestParam("id") int id) {
		Employer employer = service.getById(id);
		return employer;
	}

	@PutMapping("/update/name")
	public void updateName(@RequestParam("id") int id, @RequestParam("name") String name) {
		service.updateName(id, name);
	}

	@PutMapping("/update/department")
	public void updateDepartment(@RequestParam("id") int id, @RequestParam("department") String department) {
		service.updateDepartment(id, department);
	}

	@PutMapping("/update/post")
	public void updatePost(@RequestParam("id") int id, @RequestParam("post") String post) {
		service.updatePost(id, post);
	}

	@PutMapping("/update/salary")
	public void updateSalary(@RequestParam("id") int id, @RequestParam("salary") int salary) {
		service.updateSalary(id, salary);
	}

	@PostMapping("/add")
	public void addEmployer(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("department") String department, @RequestParam("post") String post,
			@RequestParam("salary") int salary) {
		service.addData(new Employer(id, name, department, post, salary));
	}
	
	@DeleteMapping("/delete")
	public void deleteEmployer(@RequestParam("id") int id) {
		service.deleteData(id);
	}
}
