package org.example.models;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "enrollment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID enrollmentID;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
