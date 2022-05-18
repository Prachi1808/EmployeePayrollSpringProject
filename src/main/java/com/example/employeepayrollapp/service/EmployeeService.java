package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.entity.Employee;
import com.example.employeepayrollapp.exception.CustomException;
import com.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * Service Class with IEmployeeService implementations.
 */
@Service
public class EmployeeService implements IEmployeeService {
    /**
     * Auto Wired EmployeeRepository - employeeRepository.
     */
    @Autowired
    EmployeeRepository employeeRepository;

    /**
     * Method to add employee to database.
     *
     * @param employee - employee object containing all required fields.
     * @return - implementation of save method from EmployeeRepository by passing employee object.
     */
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    /**
     * Method to get all employees from database.
     *
     * @return - implementation of findAll method from EmployeeRepository.
     */
    public List<Employee> getAllEmployees() {
        if (employeeRepository.findAll().isEmpty()) {
            throw new CustomException("No employee in database.");
        } else return employeeRepository.findAll();
    }


    /**
     * Method to get employees using Id from database.
     *
     * @param id - Id of employee required to get from database.
     * @return - implementation of findById method from EmployeeRepository.
     */
    public Optional<Employee> getById(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            return employeeRepository.findById(id);
        } else throw new CustomException("No employee matches with the given ID");
    }

    /**
     * Method to delete employee using Id from Database.
     *
     * @param id - Id of employee required to delete from database.
     * @return - implementation of deleteById method from EmployeeRepository.
     */
    public String deleteById(int id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee with ID: " + id + " is Deleted Successfully!!";
        } else throw new CustomException("No employee matches with the given ID");
    }

    /**
     * Method to edit existing employee in database.
     * If there is a match by passed id, we create a new employee object using the same id - employee1.
     * Passing the object to the save method.
     *
     * @param employeeDTO - employee object with new field values.
     * @param id          - Id of employee required to delete from database.
     * @return - implementation of save method from EmployeeRepository.
     */
    public Employee editEmployee(EmployeeDTO employeeDTO, int id) {
        if (employeeRepository.findById(id).isPresent()) {
            Employee employee1 = new Employee(id, employeeDTO);
            Employee alpha = employeeRepository.save(employee1);
            return alpha;
        } else throw new CustomException("No employee matches with the given ID");
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public List<Employee> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Employee> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Employee entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Employee> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Employee> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Employee> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Employee getOne(Integer integer) {
        return null;
    }

    @Override
    public Employee getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Employee> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Employee, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}