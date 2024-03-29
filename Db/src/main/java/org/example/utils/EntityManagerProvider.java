package org.example.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

    private static final String PERSISTENCE_UNIT_NAME = "org.example.testing";

    private static EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        } catch (Exception e) {
            throw new RuntimeException("Error initializing EntityManagerFactory: " + e.getMessage(), e);
        }
    }

    public static EntityManager getEntityManager() {
        try {
            return entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            throw new RuntimeException("Error creating EntityManager: " + e.getMessage(), e);
        }
    }

    public static void close() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
