package com.bekov.main_student.controller;

import com.bekov.main_student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    private static Map<Integer, Student> studentMap = new HashMap<>();

    static {
        int i = 1;
        while(i < 10){
            Student student = new Student("Student_"+i, 1.0 +i);
            studentMap.put(i,student);
            i++;
        }
    }

    @GetMapping("/getStudent")
    public Map<Integer, Student> getStudentMap(){

        return studentMap;
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentMap.get(id);
    }

}
