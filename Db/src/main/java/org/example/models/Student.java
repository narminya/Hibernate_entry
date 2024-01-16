package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

//@Entity
//@Table(name = "students")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID studentID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}

