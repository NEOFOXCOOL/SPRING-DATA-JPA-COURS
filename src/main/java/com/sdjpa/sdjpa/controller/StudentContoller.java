package com.sdjpa.sdjpa.controller;

import com.sdjpa.sdjpa.entity.Student;
import com.sdjpa.sdjpa.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentContoller {
    private final StudentService studentService;
@GetMapping(value = "list", params = "age")
    public List<Student> sortedStudentList(@Param("age") Integer age){
    return studentService.getSortedList(age);
    }
}
