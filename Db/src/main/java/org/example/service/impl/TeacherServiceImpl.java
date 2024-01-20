package org.example.service.impl;

import org.example.models.Course;
import org.example.models.Teacher;
import org.example.service.TeacherService;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Optional;
import java.util.UUID;

public class TeacherServiceImpl implements TeacherService {

    private final EntityManager entityManager;

    public TeacherServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Teacher createTeacher(Teacher teacherDto) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Teacher teacher = new Teacher();
            teacher.setName(teacherDto.getName());
            teacher.setCourse(teacherDto.getCourse());

            entityManager.persist(teacher);

            if (teacherDto.getCourse() != null) {
                for (Course course : teacherDto.getCourse()) {
                    course.setTeacher(teacher);
                    entityManager.persist(course);
                }
            }
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return teacherDto;
    }

    @Override
    public Teacher getAllTeacher() {
        return null;
    }

    @Override
    public Optional<Teacher> getTeacherById(UUID id) {
        return null;
    }

    @Override
    public Teacher updateTeacher(Teacher teacherDto, UUID id) {
        return null;
    }

    @Override
    public void deleteTeacher(UUID id) {

    }
}
