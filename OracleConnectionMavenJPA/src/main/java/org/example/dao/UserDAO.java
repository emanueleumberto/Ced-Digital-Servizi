package org.example.dao;

import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectJPA");
    private static EntityManager em = emf.createEntityManager();

    public static void saveUser(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public static User findUser(long id) {
        return em.find(User.class, id);
    }

    public static void removeUser(User user) {
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }

    public static List<User> findAll() {
        // Query q = em.createQuery("SELECT u FROM User u");
        Query q = em.createNamedQuery("User.findAll", User.class);
        return q.getResultList();
    }

    public static List<User> findAllByCity(String city) {
        Query q = em.createNamedQuery("User.findAllCity", User.class);
        q.setParameter("city", city);
        return q.getResultList();
    }
}
