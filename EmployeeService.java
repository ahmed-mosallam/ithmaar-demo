package com.ithmaar.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ithmaar.demo.models.Employee;
import com.ithmaar.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
     @Autowired
	EmployeeRepository empRepo;
     
     public Employee addEmployee(Employee employee) {
    	 return empRepo.save(employee);
     }
     
     public List<Employee> getEmployees(){
    	 return empRepo.findAll();
     }
     
     public Employee getEmployee(int id) {
    	 return empRepo.getOne(id);
     }
     
     public String deleteEmployee(int id) {
    	 Employee employee=getEmployee(id);
    	 empRepo.delete(employee);
    	 return "deleted";
     }
     
     public Employee updateEmployee(Employee newEmployee , int id) {
    	 Employee selectedEmployee = getEmployee(id);
    	 selectedEmployee.setEmpId(newEmployee.getEmpId());
    	 selectedEmployee.setEmpName(newEmployee.getEmpName());
    	 selectedEmployee.setFlexField(newEmployee.getFlexField());
    	 selectedEmployee.setJsonValue(newEmployee.getJsonValue());
    	 return empRepo.save(selectedEmployee);
     }
}
