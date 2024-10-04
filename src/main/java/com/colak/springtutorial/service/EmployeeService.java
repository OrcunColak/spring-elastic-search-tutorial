package com.colak.springtutorial.service;

import com.colak.springtutorial.model.Employee;
import com.colak.springtutorial.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> saveAll(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    public Employee findById(String id) {
        return employeeRepository.findById(id)
                .orElse(null);
    }

    public boolean existsById(String id) {
        return employeeRepository.existsById(id);
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    // Find multiple employees by their IDs
    public Iterable<Employee> findAllById(List<String> ids) {
        return employeeRepository.findAllById(ids);
    }

    public long count() {
        return employeeRepository.count();
    }

    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    // Delete multiple employees
    public void deleteAll(List<Employee> employees) {
        employeeRepository.deleteAll(employees);
    }

    public void deleteAll() {
        employeeRepository.deleteAll();
    }

}
