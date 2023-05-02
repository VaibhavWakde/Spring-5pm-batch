package com.spring.Sprign5Apr.di;

import com.spring.Sprign5Apr.ioc.TeacherImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@ToString
public class Student {
    //Property based AutoWiring
    @Autowired
    TeacherImpl teacher;

    //Constructor based AutoWiring
//    @Autowired
//    StudentImpl(TeacherImpl teacher) {
//        this.teacher = teacher;
//    }

    // setter based autowiring
//    @Autowired
//    public void setTeacher(TeacherImpl teacher) {
//        this.teacher = teacher;
//    }
}
