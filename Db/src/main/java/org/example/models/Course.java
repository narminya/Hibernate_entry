package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "course_name")
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Teacher teacher;

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    List<StudentCourse> course;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Room room;

}
