package com.colak.springtutorial.repository;

import com.colak.springtutorial.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    // Full-text search by name
    List<Employee> findByNameContaining(String name);

    // Exact match search by department
    List<Employee> findByDepartment(String department);

}
