package com.colak.springtutorial.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "employee")

@Getter
@Setter
@ToString
public class Employee {

    @Id
    private String id;

    // Field will be analyzed as full-text data, allowing for full-text search capabilities.
    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Keyword)
    private String department;
}
