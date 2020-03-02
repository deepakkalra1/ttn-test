package com.javaSpringExercise.springExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ques3 {
    @Autowired
    Ques2Dependent1 obj;
public void callingOthersMethod(){
    System.out.println("here i m being calling method of ques 2 dependent 1 java file with the help of anotation of autowired");
    obj.doSomething();
}

}
