package com.example.app4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }


}
