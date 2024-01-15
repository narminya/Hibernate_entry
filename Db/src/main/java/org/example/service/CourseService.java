package org.example.service;

import org.example.models.Course;

import java.util.Optional;
import java.util.UUID;

public interface CourseService {

    Course createCourse(Course courseDto);
    Course getAllCourse();
    Optional<Course> getCourseById(UUID id);
    Course updateCourse(Course courseDto, UUID id);
    void deleteCourse(UUID id);
}
