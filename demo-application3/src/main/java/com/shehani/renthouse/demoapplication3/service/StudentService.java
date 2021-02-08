package com.shehani.renthouse.demoapplication3.service;

import com.shehani.renthouse.demoapplication3.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}
