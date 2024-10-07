package com.musiienko.lang_school.studentbase.lang_school_studentbase.repo;

import com.musiienko.lang_school.studentbase.lang_school_studentbase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentsRepo extends JpaRepository<Student,Integer> {
    Optional<Student> findByEmailAndPhonenumberAndNameAndLanguage(String email, String phonenumber, String name,String language);

}
