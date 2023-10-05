package com.example.Java_Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Java_Demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
