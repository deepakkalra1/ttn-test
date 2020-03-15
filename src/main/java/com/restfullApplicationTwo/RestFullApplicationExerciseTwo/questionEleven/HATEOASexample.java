//package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionEleven;
//
//import com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionEight.UserCredentials;
//import com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionTen.UserInfoTwo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.mvc.ControllerLinkBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.lang.reflect.Method;
//import java.util.List;
//
///*
//
//Since hateoas is not working with swagger so i have commented the entire file
// and hateoas dependency is also commented...
// uncomment it to use this and also comment swagger things in order to use it
// */
//
//
//@RestController
//public class HATEOASexample {
//
//    @Autowired
//    List<UserInfoTwo> userInfoTwoList;
//    public HATEOASexample(){
//        userInfoTwoList.add(new UserInfoTwo("deepak",24,"delhi"));
//
//        userInfoTwoList.add(new UserInfoTwo("rahul",24,"meerut"));
//
//        userInfoTwoList.add(new UserInfoTwo("ankur",24,"punjab"));
//    }
//
//    @GetMapping("adding-userinfo")
//    public String addingUserInfo(@RequestBody UserInfoTwo userInfoTwo){
//        userInfoTwoList.add(userInfoTwo);
//        return "success";
//
//    }
//
//    @GetMapping("all-userinfo")
//    public List<UserInfoTwo> returningAllUserInfo(){
//
//        return userInfoTwoList;
//
//    }
//
//
//    @GetMapping("/one-user-return-hateoas")
//    public Resource oneUSerReturn(@RequestParam String name){
//
//        UserInfoTwo fuser;
//
//        ControllerLinkBuilder linkto = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(this.getClass()).returningAllUserInfo());
//
//        for (UserInfoTwo uinfo: userInfoTwoList){
//            if (uinfo.getName()==name){
//                fuser=uinfo;
//
//
//                Resource<UserInfoTwo> res= new Resource<UserInfoTwo>(fuser);
//                res.add(linkto.withRel("all-users"));
//
//
//
//                return res;
//            }
//        }
//
//        return null;
//
//
//    }
//
//
//    }
