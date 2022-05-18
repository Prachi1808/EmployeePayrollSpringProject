package com.example.employeepayrollapp.repository;
import com.example.employeepayrollapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    /**
     * Interface extending JpaRepository - EmployeeRepository
     */
    @Repository
    public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    }

