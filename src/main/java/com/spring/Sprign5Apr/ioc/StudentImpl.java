package com.spring.Sprign5Apr.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements SchoolService {
    @Override
    public void doWork() {
        System.out.println("in Student Impl");
    }


}
