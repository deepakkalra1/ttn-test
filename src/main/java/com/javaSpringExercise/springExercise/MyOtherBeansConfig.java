package com.javaSpringExercise.springExercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyOtherBeansConfig {
    @Bean
    public Ques6 ques6Bean(){
        return new Ques6(6);
    }
}
