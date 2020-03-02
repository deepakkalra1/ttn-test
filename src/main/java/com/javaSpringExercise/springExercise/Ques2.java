package com.javaSpringExercise.springExercise;


import org.springframework.stereotype.Component;

//demonstrating loosely coupled code
@Component
public class Ques2 {

    public void callingAllFunctions(Ques2InterfaceToMakeItLooselyCoupled obj1,Ques2InterfaceToMakeItLooselyCoupled obj2 ){
        System.out.println("this method is called from ques 2 ");
        obj1.doSomething();
        obj2.doSomething();

    }


}
