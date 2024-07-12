package com.colak.springtutorial.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class EmployeeDto {

    private final String id;
    private final String name;
    private final String department;
}
