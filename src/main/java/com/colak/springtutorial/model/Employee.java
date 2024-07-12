package com.colak.springtutorial.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employee")

@Getter
@Setter
@ToString
public class Employee {

    @Id
    private String id;

    private String name;

    private String department;

    public Employee() {
    }

    public Employee(String id, String name, String department) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
