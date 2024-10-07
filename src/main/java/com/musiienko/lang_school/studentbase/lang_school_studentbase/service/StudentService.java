package com.musiienko.lang_school.studentbase.lang_school_studentbase.service;

import com.musiienko.lang_school.studentbase.lang_school_studentbase.model.Student;
import com.musiienko.lang_school.studentbase.lang_school_studentbase.repo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentsRepo repo;
    public Student addStudentApplication(Student student){
        return repo.save(student);
    }


    public boolean isStudentAlreadyApplied(Student student){
        Optional<Student> ifStudentExist=repo.findByEmailAndPhonenumberAndNameAndLanguage(student.getEmail(),student.getPhonenumber(),student.getName(),student.getLanguage());
        return ifStudentExist.isPresent();



    }

}
