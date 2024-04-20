package com.springsecuritymysql.entity.service;

import com.springsecuritymysql.entity.Student;
import com.springsecuritymysql.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student register(Student student) {
        return studentRepo.save(student);
    }

    public Student getDetails(String username) {
        return studentRepo.findByUsername(username);
    }

    public String getRoles(String username) {
        return studentRepo.findByUsername(username).getRole();
    }
}