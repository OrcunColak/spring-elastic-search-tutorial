package com.colak.springtutorial.service;

import com.colak.springtutorial.dto.EmployeeDto;
import com.colak.springtutorial.mapper.EmployeeMapper;
import com.colak.springtutorial.model.Employee;
import com.colak.springtutorial.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee createdEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(createdEmployee);
    }

}
