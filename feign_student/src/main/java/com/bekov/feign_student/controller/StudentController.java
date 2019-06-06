package com.bekov.feign_student.controller;

import com.bekov.feign_student.model.Student;
import com.bekov.feign_student.proxy.StudentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentProxy studentProxy;

    @GetMapping("/fing_Student")
    public Map<Integer, Student> getStudentMap(){

        return studentProxy.getStudentMap();
    }

    @GetMapping("/fing_Student/{id}")
    public Student getStudentMap(@PathVariable("id") int id){
        return studentProxy.getStuden(id);
    }

}
