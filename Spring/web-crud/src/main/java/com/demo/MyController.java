package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/hello")
	public String greet() {
		return "welcome";
	}

	@GetMapping("/add")
	public String addEmployee(Model model, @RequestParam(value = "name") String name,
			@RequestParam(value = "salary") float salary) {
		try {
			Employee emp = new Employee(0, name, salary);
			employeeRepository.save(emp);
			model.addAttribute("msg", "Employee saved successfully !");
			return "success";
		} catch (Exception e) {
			model.addAttribute("msg", "Employee couldn't be saved !");
			e.printStackTrace();
			return "error";
		}
	}

	@GetMapping("/update")
	public String updateEmployee(Model model, @RequestParam(value = "id") int id,
			@RequestParam(value = "name") String name, @RequestParam(value = "salary") float salary) {

		try {
			Employee emp = new Employee(id, name, salary);
			employeeRepository.save(emp);
			model.addAttribute("msg", "Employee updated successfully !");
			return "success";
		} catch (Exception e) {
			model.addAttribute("msg", "Employee couldn't be updated !");
			e.printStackTrace();
			return "error";
		}

	}
	
	@PostMapping("/delete")
	public String deleteEmployee(Model model, @RequestParam(value = "id") int id) {
		
		try {
			employeeRepository.deleteById(id);
			model.addAttribute("msg", "Employee deleted successfully !");
			return "success";
		} catch (Exception e) {
			model.addAttribute("msg", "Employee couldn't be deleted !");
			e.printStackTrace();
			return "error";
		}
		
	}
	
	@GetMapping("/view")
	public String viewEmployees(Model model) {
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		model.addAttribute("emps", employees);
		return "view";
	}

}







