package com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionNine;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.restfullApplicationTwo.RestFullApplicationExerciseTwo.questionEight.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SavingUserCredentialsAndReturingItWithDynamicFiltering {

    @Autowired
    List<UserCredentialsTwo> userCredentialsList;

    @PostMapping("dynamic-filtering")
    public MappingJacksonValue savingCredentailsReturningDynamicFilteredObject(@RequestBody UserCredentialsTwo userCredentials){

        userCredentialsList.add(userCredentials);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","age");

        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("myFilter",filter);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userCredentials);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;


    }
}
