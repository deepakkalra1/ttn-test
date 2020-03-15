package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionTen;

import org.springframework.stereotype.Component;

@Component
public class UserInfoOne {

    String name;


    public UserInfoOne() {
        this.name = "deeppak";
    }

    public UserInfoOne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
