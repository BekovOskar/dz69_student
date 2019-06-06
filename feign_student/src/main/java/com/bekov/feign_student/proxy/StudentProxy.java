package com.bekov.feign_student.proxy;

import com.bekov.feign_student.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient("student-main")
public interface StudentProxy {

    @GetMapping("/getStudent/{id}")
    Student getStuden(@PathVariable("id") int id);

    @GetMapping("/getStudent")
    Map<Integer, Student> getStudentMap();
}
