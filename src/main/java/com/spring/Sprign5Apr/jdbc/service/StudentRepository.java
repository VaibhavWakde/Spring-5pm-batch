package com.spring.Sprign5Apr.jdbc.service;

import com.spring.Sprign5Apr.jdbc.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentRepository {

    Integer getStudentCount();

    String saveStudent(Student student);

    String deleteStudent(Integer rno);

    String updateStudent(String phone, Integer rno);

    Student findByRno(Integer rno);

    List<Map<String, Object>> findByFirstNameLetter(String character);

    List<Student> findAll();

}