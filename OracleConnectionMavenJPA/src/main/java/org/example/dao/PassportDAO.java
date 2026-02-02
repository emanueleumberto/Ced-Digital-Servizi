package org.example.dao;

import org.example.entities.Passport;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PassportDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectJPA");
    private static EntityManager em = emf.createEntityManager();

    public static void savePassport(Passport passport) {
        em.getTransaction().begin();
        em.persist(passport);
        em.getTransaction().commit();
    }

    public static Passport findPassport(long id) {
        return em.find(Passport.class, id);
    }

    public static void removePassport(Passport passport) {
        em.getTransaction().begin();
        em.remove(passport);
        em.getTransaction().commit();
    }
}
