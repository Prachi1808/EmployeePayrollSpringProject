package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeepayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class EmployeeController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get Call Success", OK);
    }

    @GetMapping(value = "/get/empId")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get Call Success for id:" + empId, OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(EmployeepayrollDTO employeepayrollDTO) {
        return new ResponseEntity<String>("Create Employee Payroll Data for:" + employeepayrollDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(EmployeepayrollDTO employeepayrollDTO) {
        return new ResponseEntity<String>("Updated Employee Payroll Data for:" + employeepayrollDTO, OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete Call Success for id:" + empId, OK);

    }
}