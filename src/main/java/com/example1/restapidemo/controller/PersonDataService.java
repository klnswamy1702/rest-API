package com.example1.restapidemo.controller;

import com.example1.restapidemo.model.PersonData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/content/persondata")
public class PersonDataService {

    PersonData personData;
    @GetMapping("{personId}")
    public PersonData getpersondetails(String personId){
        //return new PersonData("P1", "Swami", "desc1","stat1", "cat1", "sub1");
        return personData;
    }

    @PostMapping
    public String createPersondetails(@RequestBody PersonData personData){
        this.personData=personData;
        return "Person data Created Successfully";
    }

    @PutMapping
    public String updatePersondetails(@RequestBody PersonData personData){
        this.personData=personData;
        return "Person data Updated successfully";
    }

    @PatchMapping
    public String patchPersondetails(@RequestBody PersonData personData){
        this.personData=personData;
        return "Person data patched successfully";
    }

    @DeleteMapping("{personId}")
    public  String deletePersondetails(String personId){
        this.personData=null;
        return "Person data deleted successfully";
    }


}
