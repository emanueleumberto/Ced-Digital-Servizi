package org.example;

import org.example.dao.CompanyDAO;
import org.example.dao.CourseDAO;
import org.example.dao.PassportDAO;
import org.example.dao.UserDAO;
import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main( String[] args ) {

//         EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectJPA");
//         EntityManager em = emf.createEntityManager();

//        Company c1 = new Company("Samsung S.p.a.");
//        CompanyDAO.saveCompany(c1);
//
//        Company c2 = new Company("Apple S.r.l.");
//        CompanyDAO.saveCompany(c2);
//
//         Address a1 = new Address("Via Marconi 53", "Roma", "Italia");
//         User u1 = new User("Mario", "Rossi", 45, "m.rossi@example.com", "Pa$$w0rd!", a1);
//         u1.setCompany(c1);
//         UserDAO.saveUser(u1);
//
//         Passport p1 = new Passport(1, LocalDate.now(), u1);
//         PassportDAO.savePassport(p1);
//
//         Address a2 = new Address("Corso Italia 25", "Milano", "Italia");
//         User u2 = new User("Giuseppe", "Verdi", 22, "g.verdi@example.com", "Pa$$w0rd!", a2);
//         UserDAO.saveUser(u2);
//
//         Address a3 = new Address("Via Manzoni 3", "Napoli", "Italia");
//         User u3 = new User("Francesca", "Neri", 34, "f.neri@example.com", "Pa$$w0rd!", a3);
//         u3.setCompany(c2);
//         UserDAO.saveUser(u3);
//
//         Address a4 = new Address("Via Vittorio Emanuele 1", "Roma", "Italia");
//         User u4 = new User("Antonio", "Bianchi", 59, "a.bianchi@example.com", "Pa$$w0rd!", a4);
//         u4.setCompany(c1);
//         UserDAO.saveUser(u4);
//
//         Passport p4 = new Passport(2, LocalDate.now(), u4);
//         PassportDAO.savePassport(p4);

//        Course c1 = new Course("Java", 50);
//        CourseDAO.saveCourse(c1);
//
//        Course c2 = new Course("Oracle DB", 25);
//        CourseDAO.saveCourse(c2);

//        User u = UserDAO.findUser(10);
//        System.out.println(u.getAddress().getCity());
//        System.out.println(u.getPassport().getDatePassport());
//        System.out.println(u.getCompany().getEmployees());


//        u.getAddress().setStreet("Corso Italia 3");
//        u.setAge(49);
//        UserDAO.saveUser(u);
//
//        UserDAO.removeUser(u);
//
//        UserDAO.findAll().forEach(System.out::println);
//        UserDAO.findAllByCity("Roma").forEach(System.out::println);

    // Relazione ManyToMany
//        User u1 = UserDAO.findUser(10);
//        System.out.println(u1);
//
//        User u2 = UserDAO.findUser(11);
//        System.out.println(u2);
//
//        Course c1 =CourseDAO.findCourse(1);
//        System.out.println(c1);
//        c1.getUserList().forEach(e -> System.out.println(e.getName() + " " + e.getLastname()));
//
//        u1.getCourses().add(c1);
//        UserDAO.saveUser(u1);
//
//        u2.getCourses().add(c1);
//        UserDAO.saveUser(u2);
//
//        Course c2 =CourseDAO.findCourse(2);
//        System.out.println(c2);
//
//        u1.getCourses().add(c2);
//        UserDAO.saveUser(u1);

    }
}
