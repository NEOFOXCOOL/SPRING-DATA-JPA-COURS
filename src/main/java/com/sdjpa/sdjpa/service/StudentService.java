package com.sdjpa.sdjpa.service;

import com.sdjpa.sdjpa.entity.Student;
import com.sdjpa.sdjpa.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getSortedList(Integer minAge){
        return studentRepository.findAll().stream().filter(student -> student.getAge() > minAge).collect(Collectors.toList());
    }
}
