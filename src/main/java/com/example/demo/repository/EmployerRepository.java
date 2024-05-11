package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employer;

@Repository
public class EmployerRepository {

	@Autowired
	JdbcTemplate jdbc;

	public void addEmployer(Employer employer) {
		jdbc.update("insert into employ values(?,?,?,?,?)", employer.getId(), employer.getName(),
				employer.getDepartment(), employer.getPost(), employer.getSalary());
	}

	public void updateName(int id, String name) {
		jdbc.update("update employ set name=? where id=?", name, id);
	}

	public void updateDepartment(int id, String department) {
		jdbc.update("update employ set department=? where id=?", department, id);
	}

	public void updatePost(int id, String post) {
		jdbc.update("update employ set post=? where id=?", post, id);
	}

	public void updateSalary(int id, int salary) {
		jdbc.update("update employ set salary=? where id=?", salary, id);
	}

	public Employer getById(int id) {
		Employer employer = jdbc.queryForObject("select * from employ where id=" + id,
				(rs, row) -> new Employer(rs.getInt("id"), rs.getString("name"), rs.getString("department"),
						rs.getString("post"), rs.getInt("salary")));
		return employer;
	}
	
	public List<Map<String, Object>> getAll(){
		List<Map<String, Object>> employer = jdbc.queryForList("select * from employ");
		return employer;
	}
	
	public void deleteEmployer(int id) {
		jdbc.update("delete from employ where id=?", id);
	}
}
