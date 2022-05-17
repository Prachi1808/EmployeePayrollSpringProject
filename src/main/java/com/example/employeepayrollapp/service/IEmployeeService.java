package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IEmployeeService extends JpaRepository<Employee, Integer> {

}