package com.javaSpringExercise.springExercise;

import org.springframework.stereotype.Component;
public class Ques6 {
    int val;
    Ques6(int val){
        this.val=val;

    }
    public void doSomething(){
        System.out.println("this method is of ques 6 and the setted value by this constructor is : "+this.val);

    }
}
