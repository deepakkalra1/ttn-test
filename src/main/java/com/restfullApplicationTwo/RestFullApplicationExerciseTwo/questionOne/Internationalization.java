package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionOne;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;


//QUESTION 1

// send parameter "lang" in request witth either fr,sw,ge,en
//by default is english
// the message property files are in resources messageDiffernetLanguageProp
@RestController
@Api(value = "question 1 controller",description = "this is the controller which will help in internationalization of greetings. You just have to pass the lang param with en,fr,sw,ge")
public class Internationalization {


    @ApiOperation(value = "this will provide you the message in your provided languae")
    @PostMapping("/hellomessage")
    public String internationlization(@RequestParam(required = false) String lang){
    String lang2 = "en";
        Locale locale ;
        if (lang!=null){
            locale=new Locale(lang);
        }
        else {
            locale=new Locale(lang2);
        }

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messagesDifferentLanguageProp/message",locale);


        return resourceBundle.getString("message");
    }

}
