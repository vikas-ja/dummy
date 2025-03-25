package com.artifact_test.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class test {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;

}
