package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

//@Entity
//@Table(name = "classrooms")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID classroomID;

    @Column(name = "room_number")
    private String roomNumber;
//
//    @Column(name = "room_courses")
//    private List<Course> courses;
}

