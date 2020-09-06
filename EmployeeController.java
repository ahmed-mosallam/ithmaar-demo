package com.itmaar.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ithmaar.demo.models.Employee;
import com.ithmaar.demo.services.EmployeeService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/employee-api")
public class EmployeeController {
	@Autowired
	 EmployeeService empService;

	 @GetMapping("employees")
	    public List<Employee> findAllEmployees(){
	      	 return empService.getEmployees();
	    }
	 
	 @GetMapping("employee-id/{empId}")
	 public Employee getOneEmployee(@PathVariable("empId") int empId) {
		 return empService.getEmployee(empId);
	 }
	 
	 @PostMapping("employee")
	 public Employee addEmployee(@RequestBody Employee employee){
		 return empService.addEmployee(employee);
	 }
	 
	 @DeleteMapping("employee-id/{empId}")
	 public String deleteEmployee(@PathVariable("empId") int empId) {
		 return empService.deleteEmployee(empId);
	 }
	 
	 @PutMapping("employee-id/{empId}")
	 public Employee updateEmployee(@RequestBody Employee employee , @PathVariable("empId")int empId) {
		 return empService.updateEmployee(employee, empId);
	 }
}
