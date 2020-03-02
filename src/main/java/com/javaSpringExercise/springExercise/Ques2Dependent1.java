package com.javaSpringExercise.springExercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Ques2Dependent1 implements Ques2InterfaceToMakeItLooselyCoupled {
    public void doSomething(){
        System.out.println("hey i belongs from ques2 dependennt 1");
    }
}
