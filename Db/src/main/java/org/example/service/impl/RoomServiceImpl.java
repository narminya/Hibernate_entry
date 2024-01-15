package org.example.service.impl;

import org.example.models.Classroom;
import org.example.models.Course;
import org.example.service.RoomService;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.Optional;
import java.util.UUID;

public class RoomServiceImpl implements RoomService {

    private final EntityManager entityManager;

    public RoomServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Classroom createClassroom(Classroom classroomDto) {
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Classroom room = new Classroom();
           room.setRoomNumber(classroomDto.getRoomNumber());
            entityManager.merge(room);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return classroomDto;
    }

    @Override
    public Classroom getAllClassroom() {
        return null;
    }

    @Override
    public Optional<Classroom> getClassroomById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Classroom updateClassroom(Classroom classroomDto, UUID id) {
        return null;
    }

    @Override
    public void deleteClassroom(UUID id) {

    }
}
