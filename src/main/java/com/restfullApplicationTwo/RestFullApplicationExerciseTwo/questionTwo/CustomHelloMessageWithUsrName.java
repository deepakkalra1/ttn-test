package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionTwo;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ResourceBundle;

@Api(description = "To have greeting concatinated with your name")
@RestController
public class CustomHelloMessageWithUsrName {

    @ApiOperation(value = "this is return your name with greeting")
    @GetMapping("/username")
    public String customUsernameGreeting(@RequestParam String name){

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messagesDifferentLanguageProp/messageUsername");
        return resourceBundle.getString("message")+" "+name;


    }
}
