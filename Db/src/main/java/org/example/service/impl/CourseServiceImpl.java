package org.example.service.impl;

import org.example.models.Course;
import org.example.models.Teacher;
import org.example.service.CourseService;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Optional;
import java.util.UUID;

public class CourseServiceImpl implements CourseService {

    private final EntityManager entityManager;

    public CourseServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Course createCourse(Course courseDto) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

//            Course course = new Course();
//            course.setCourseName(course.getCourseName());
//            course.setTeacher(courseDto.getTeacher());
//            course.setRooms(courseDto.getRooms());
//
//            entityManager.merge(course);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return courseDto;
    }

    @Override
    public Course getAllCourse() {
        return null;
    }

    @Override
    public Optional<Course> getCourseById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Course updateCourse(Course courseDto, UUID id) {
        return null;
    }

    @Override
    public void deleteCourse(UUID id) {

    }
}
