package com.karainagar.jaffna.backend;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudent(){
        return "Nimal,17,Colombo";
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData) {

        System.out.println("student id: "+studentData.id);
        System.out.println("student Name: "+studentData.name);
        System.out.println("student Age: "+studentData.age);
        System.out.println("student city: "+studentData.city);
        //do anything with the data

    }
}
