package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionEight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*

QUESTION 8
sending saved user credentails with static filtering
 */

@RestController
public class SaveUserStaticFilteringOnReturn {

    @Autowired
    List<UserCredentials> userCredentials;

    @PostMapping("/save-user-credentials")
    public UserCredentials saveUserCredentials(@RequestBody UserCredentials usrCre){
        System.out.println("worked");

        userCredentials.add(usrCre);

  return userCredentials.get(0);
    }

}
