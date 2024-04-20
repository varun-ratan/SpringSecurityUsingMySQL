package com.springsecuritymysql.repository;

import com.springsecuritymysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

    public Student findByUsername(String username);


}