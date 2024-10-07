package com.musiienko.lang_school.studentbase.lang_school_studentbase.controller;

import com.musiienko.lang_school.studentbase.lang_school_studentbase.model.Student;
import com.musiienko.lang_school.studentbase.lang_school_studentbase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/student-applications")
    public ResponseEntity<?> addStudentApplication(@ModelAttribute Student student) {
        try {
            if (!service.isStudentAlreadyApplied(student)) {
                Student savedStudent = service.addStudentApplication(student);
                System.out.println(savedStudent.toString());
                return new ResponseEntity<>("Ihre Kontaktdaden wurden erfolgreich gespeichert.", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Sie haben sich schon angemeldet.", HttpStatus.CONFLICT);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}