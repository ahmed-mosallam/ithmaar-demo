package com.ithmaar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithmaar.demo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
