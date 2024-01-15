package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "teachers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID teacherID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Course> courses;

}

