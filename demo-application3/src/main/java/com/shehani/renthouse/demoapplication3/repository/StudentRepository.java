package com.shehani.renthouse.demoapplication3.repository;


import com.shehani.renthouse.demoapplication3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student save(Student student);
}
