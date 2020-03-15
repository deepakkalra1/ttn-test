package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionThreeAndFour;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




//QUESTION 3 and 4

/*
send data in xml format
i have added the dependency of jackson to support for xml
make sure to send data in body
with name and age as fields
 */

@Api(value = "question 3 and 4 controller",description = "Will help to create users and send user which has been created that too in xml format")
@RestController
public class creatingUserWithXmlAndSendingUser {


    @Autowired
    List<users> userLs;


    //QUESTION 3
    //this uri is to create users
    @ApiOperation(value="To create the user and you can send the xml format as well")
    @PostMapping("/createuser")
    public String createUser(@RequestBody users users){

        userLs.add(users);
        System.out.println(users.getName());

        return "successful";
    }


//QUESTION 4
//this uri is to send the user details in xml format

    @ApiOperation(value = "this will send the created users in xml format")
    @GetMapping("/sendusers")
    public ResponseEntity sendUser(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);

    ResponseEntity responseEntity = new ResponseEntity(userLs,headers, HttpStatus.OK);


        return responseEntity;
    }

}



@Component
class users{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
