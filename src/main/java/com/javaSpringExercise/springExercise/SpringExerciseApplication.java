package com.javaSpringExercise.springExercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SpringExerciseApplication {

	public static void main(String[] args) {

		ApplicationContext appContext= SpringApplication.run(SpringExerciseApplication.class, args);

		//question 1
		Ques1 q1obj=appContext.getBean(Ques1.class);
		Ques1Dependent1 q1obj1 = appContext.getBean(Ques1Dependent1.class);
		Ques1Dependent2 q1obj2 = appContext.getBean(Ques1Dependent2.class);
		System.out.println("Below output is the result of 2 different dependent object where code is tighly coupled");
		q1obj.callingAllFuntions(q1obj1,q1obj2);
		System.out.println("");

		//question 2
		Ques2 q2obj = appContext.getBean(Ques2.class);
		Ques2Dependent2 q2obj1 = appContext.getBean(Ques2Dependent2.class);
		Ques2Dependent2 q2obj2 = appContext.getBean(Ques2Dependent2.class);
		System.out.println("below output is the result of the loosely typed code");
		q2obj.callingAllFunctions(q2obj1,q2obj2);
		System.out.println("");


		//question 3,4
		Ques3 q3obj = appContext.getBean(Ques3.class);
		q3obj.callingOthersMethod();
		System.out.println("");

		//question 5
		Ques5 q5obj = appContext.getBean(Ques5.class);
		q5obj.doSomething();
		System.out.println("");

		//question 6
		Ques6 q6obj = appContext.getBean(Ques6.class);
		q6obj.doSomething();



	}

}
