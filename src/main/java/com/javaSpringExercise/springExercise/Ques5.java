package com.javaSpringExercise.springExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques5 {
    @Autowired
    Ques2InterfaceToMakeItLooselyCoupled q2objInterface;

    public void doSomething(){
        System.out.println("question 5 method is this");
        q2objInterface.doSomething();

    }
}
