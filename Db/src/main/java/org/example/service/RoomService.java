package org.example.service;

import org.example.models.Classroom;

import java.util.Optional;
import java.util.UUID;

public interface RoomService {
    Classroom createClassroom(Classroom classroomDto);
    Classroom getAllClassroom();
    Optional<Classroom> getClassroomById(UUID id);
    Classroom updateClassroom(Classroom classroomDto, UUID id);
    void deleteClassroom(UUID id);
}
