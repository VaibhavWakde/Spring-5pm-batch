package com.spring.Sprign5Apr.ioc;

import org.springframework.stereotype.Component;

@Component
public class TeacherImpl implements SchoolService {

    @Override
    public void doWork() {
        System.out.println("in Teacher Impl");
    }
}
