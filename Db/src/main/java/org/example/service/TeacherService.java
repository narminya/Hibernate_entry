package org.example.service;

import org.example.models.Teacher;

import java.util.Optional;
import java.util.UUID;

public interface TeacherService {
    Teacher createTeacher(Teacher teacherDto);
    Teacher getAllTeacher();
    Optional<Teacher> getTeacherById(UUID id);
    Teacher updateTeacher(Teacher teacherDto, UUID id);
    void deleteTeacher(UUID id);
}
