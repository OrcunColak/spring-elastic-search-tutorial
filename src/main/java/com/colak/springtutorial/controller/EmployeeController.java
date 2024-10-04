package com.colak.springtutorial.controller;

import com.colak.springtutorial.dto.EmployeeDto;
import com.colak.springtutorial.mapper.EmployeeMapper;
import com.colak.springtutorial.model.Employee;
import com.colak.springtutorial.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/employee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        employee = employeeService.save(employee);
        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(employee);
        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }
}
