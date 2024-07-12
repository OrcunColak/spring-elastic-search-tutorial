package com.colak.springtutorial.mapper;

import com.colak.springtutorial.dto.EmployeeDto;
import com.colak.springtutorial.model.Employee;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getName(), employee.getDepartment());
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getDepartment());
    }

}
