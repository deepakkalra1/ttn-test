package com.javaSpringExercise.springExercise;

import org.springframework.stereotype.Component;

@Component
public class Ques2Dependent2 implements Ques2InterfaceToMakeItLooselyCoupled {
    public void doSomething(){
        System.out.println("hey i belongs from ques2 dependennt 2");
    }
}
