package com.javaSpringExercise.springExercise;

import org.springframework.stereotype.Component;

// demonstrating tighly coupled code...

@Component
public class Ques1 {

    public void callingAllFuntions(Ques1Dependent1 obj1,Ques1Dependent2 obj2){
        System.out.println("this is from calling method itself");
        obj1.doSomething();
        obj2.doSomething();

    }


}
