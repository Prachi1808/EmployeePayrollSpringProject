package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.entity.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * Interface containing methods from service class - IEmployeeService
 */
public interface IEmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getById(int id);

    String deleteById(int id);

    Employee editEmployee(EmployeeDTO employeeDtO, int id);

    List<Employee> findAll();

    List<Employee> findAll(Sort sort);

    Page<Employee> findAll(Pageable pageable);

    List<Employee> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(Employee entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends Employee> entities);

    void deleteAll();

    <S extends Employee> S save(S entity);

    <S extends Employee> List<S> saveAll(Iterable<S> entities);

    Optional<Employee> findById(Integer integer);

    boolean existsById(Integer integer);

    void flush();

    <S extends Employee> S saveAndFlush(S entity);

    <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities);

    void deleteAllInBatch(Iterable<Employee> entities);

    void deleteAllByIdInBatch(Iterable<Integer> integers);

    void deleteAllInBatch();

    Employee getOne(Integer integer);

    Employee getById(Integer integer);

    <S extends Employee> Optional<S> findOne(Example<S> example);

    <S extends Employee> List<S> findAll(Example<S> example);

    <S extends Employee> List<S> findAll(Example<S> example, Sort sort);

    <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Employee> long count(Example<S> example);

    <S extends Employee> boolean exists(Example<S> example);

    <S extends Employee, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}