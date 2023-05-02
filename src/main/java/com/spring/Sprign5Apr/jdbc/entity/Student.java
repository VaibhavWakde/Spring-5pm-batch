package com.spring.Sprign5Apr.jdbc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
public class Student {
    private Integer rno;
    private String name;
//    private String class;
    private Integer age;
    private String city;
    private String email;
    private String phone;

}
