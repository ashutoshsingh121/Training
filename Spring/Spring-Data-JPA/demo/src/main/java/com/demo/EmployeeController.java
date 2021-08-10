package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/all")
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@PutMapping("/save")
	public Employee editEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@DeleteMapping("/delete/{id}")
	public Status deleteEmployee(@PathVariable int id) {
		
		try {
			employeeRepository.deleteById(id);
		} catch (Exception e) {
			return new Status(false);
		}
		
		return new Status(true);
		
	}

}
