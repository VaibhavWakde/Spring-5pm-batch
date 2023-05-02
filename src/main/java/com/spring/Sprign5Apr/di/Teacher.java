package com.spring.Sprign5Apr.di;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Teacher {
    public Teacher() {
        System.out.println("In Teacher Class ****** ");
    }

    public void doWork() {
        System.out.println("Teacher is working");
    }
}
