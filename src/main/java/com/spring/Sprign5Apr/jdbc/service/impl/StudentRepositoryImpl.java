package com.spring.Sprign5Apr.jdbc.service.impl;


import com.spring.Sprign5Apr.jdbc.entity.Student;
import com.spring.Sprign5Apr.jdbc.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentRepositoryImpl implements StudentRepository {
    private final String studCount = "select count(*) from student;";

    private final String insertStudent = "insert into student(rno,name,age,city,phone,email) values(?,?,?,?,?,?);";

    private final String deleteStudent = "delete from student where rno=?";

    private final String updateStudent = "update student set phone=? where rno=?";

    private final String findStudentByRno = "select * from student where rno = ?";

    private final String findAll = "select * from student";

    private final String findByFirstLetter = "select * from student where name like '?%'";


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getStudentCount() {
        return jdbcTemplate.queryForObject(studCount,Integer.class);
    }

    @Override
    public String saveStudent(Student student) {
        try {
            jdbcTemplate.update(insertStudent,student.getRno(),student.getName(),student.getAge(),
                    student.getCity(), student.getPhone(), student.getEmail());
            return "Student Saved Successfully...";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public String deleteStudent(Integer rno) {
        try{
            jdbcTemplate.update(deleteStudent,rno);
            return "Student delete successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public String updateStudent(String phone, Integer rno) {
        try {
            jdbcTemplate.update(updateStudent, phone, rno);
            return "Student Update Successfully";
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    @Override
    public Student findByRno(Integer rno) {
        return jdbcTemplate.queryForObject(findStudentByRno, BeanPropertyRowMapper.newInstance(Student.class),rno);
    }

    @Override
    public List<Map<String, Object>> findByFirstNameLetter(String character) {
        return jdbcTemplate.queryForList(findByFirstLetter,BeanPropertyRowMapper.newInstance(Student.class),character);
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query(findAll,BeanPropertyRowMapper.newInstance(Student.class));
    }
}
