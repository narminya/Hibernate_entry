package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
//@Entity
//@Table(name = "courses")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID courseID;

    @Column(name = "course_name")
    private String courseName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany ()
    @JoinColumn(name = "room_id")
    private List<Classroom> rooms;

}
