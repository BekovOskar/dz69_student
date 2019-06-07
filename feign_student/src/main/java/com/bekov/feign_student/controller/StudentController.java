package com.bekov.feign_student.controller;

import com.bekov.feign_student.model.Student;
import com.bekov.feign_student.proxy.StudentProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentProxy studentProxy;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/fing_Student")
    public Map<Integer, Student> getStudentMap(){
        logger.info("students -> {}", studentProxy.getStudentMap());
        return studentProxy.getStudentMap();
    }

    @GetMapping("/fing_Student/{id}")
    public Student getStudentMap(@PathVariable("id") int id){
        logger.info("student -> {}",studentProxy.getStuden(id) );
        return studentProxy.getStuden(id);
    }

}
