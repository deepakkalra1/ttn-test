package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionTen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Versioning {


    /*
    URI versioning
     */


    @GetMapping("/userinfov1")
    public UserInfoOne versionOneuri(){

        return new UserInfoOne();
    }

    @GetMapping("/userinfov2")
    public UserInfoTwo versionTwouri(){

     return    new UserInfoTwo();
    }



    /*
    param type versioning
     */
    @GetMapping(value = "/userinfo",params = "version=v1")
    public UserInfoOne versionOneparam(){

        return new UserInfoOne();

    }

    @GetMapping(value = "/userinfo",params = "version=v2")
    public UserInfoTwo versionTwoparam(){

        return new UserInfoTwo();
    }




    /*
    Custom header versioning

     */

    @GetMapping(value = "/userinfo",headers = "X-API-V=v1")
    public UserInfoOne versionOneheader(){

        return new UserInfoOne();

    }
//
    @GetMapping(value = "/userinfo",headers = "X-API-V=v2")
    public UserInfoTwo versionTwoheader(){

        return new UserInfoTwo();

    }


    /*
    MIME type versioning
     */

    @GetMapping(value = "/userinfo",produces = "application/ttn-v1+json")
    public UserInfoOne versionOneMime(){

        return new UserInfoOne();

    }


    @GetMapping(value = "/userinfo",produces = "application/ttn-v2+json")
    public UserInfoTwo versionTwoMime(){

        return new UserInfoTwo();

    }



}
