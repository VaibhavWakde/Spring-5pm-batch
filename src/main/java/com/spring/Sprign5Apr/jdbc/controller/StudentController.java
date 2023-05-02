package com.spring.Sprign5Apr.jdbc.controller;

import com.spring.Sprign5Apr.jdbc.entity.Student;
import com.spring.Sprign5Apr.jdbc.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getStudentCount")
    public Integer getStudentCount() {
        return studentRepository.getStudentCount();
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        return studentRepository.saveStudent(student);
    }

    @PutMapping("/updateStudent/{rno}/{phone}")
    public String updateStudent(@PathVariable String phone, @PathVariable Integer rno) {
        return studentRepository.updateStudent(phone,rno);
    }

    @DeleteMapping("/deleteStudent/{rno}")
    public String deleteStudent(@PathVariable Integer rno) {
        return studentRepository.deleteStudent(rno);
    }

    @GetMapping("/getStudentById/{rno}")
    public Student getStudentById(@PathVariable Integer rno) {
        return studentRepository.findByRno(rno);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/getByLetter/{letter}")
    public List<Map<String, Object>> getStudentByLetter(@PathVariable String letter) {
        return studentRepository.findByFirstNameLetter(letter);
    }
}
