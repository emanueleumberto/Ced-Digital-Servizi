package org.example.dao;

import org.example.entities.Company;
import org.example.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CompanyDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectJPA");
    private static EntityManager em = emf.createEntityManager();

    public static void saveCompany(Company company) {
        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();
    }

    public static Company findCompany(long id) {
        return em.find(Company.class, id);
    }

    public static void removeCompany(Company company) {
        em.getTransaction().begin();
        em.remove(company);
        em.getTransaction().commit();
    }

    public static List<Company> findAll() {
        Query q = em.createNamedQuery("Company.findAll", Company.class);
        return q.getResultList();
    }

}
