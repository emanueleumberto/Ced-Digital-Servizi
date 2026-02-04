package org.example.dao;

import org.example.entities.Course;
import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CourseDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectJPA");
    private static EntityManager em = emf.createEntityManager();

    public static void saveCourse(Course course) {
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
    }

    public static Course findCourse(long id) {
        return em.find(Course.class, id);
    }

    public static void removeCourse(Course course) {
        em.getTransaction().begin();
        em.remove(course);
        em.getTransaction().commit();
    }

    public static List<Course> findAll() {
        Query q = em.createNamedQuery("Course.findAll", Course.class);
        return q.getResultList();
    }
}
