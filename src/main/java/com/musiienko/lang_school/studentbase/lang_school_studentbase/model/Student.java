package com.musiienko.lang_school.studentbase.lang_school_studentbase.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    private Integer Id;
    @NotBlank
    private String salutation;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    //@Pattern(regexp = "^[\\w-.+]*[\\w-\\.]+@[\\w]+\\.[a-z]{2,}$",message = "Please enter a valid email address")
    private String email;
    @NotBlank
    //@Pattern(regexp = "^[+]?[0-9\\s().-]*[0-9]+$\n", message = "Please enter a valid email address")
    private String phonenumber;
    @NotBlank
    private String language;
    private String question;


}
