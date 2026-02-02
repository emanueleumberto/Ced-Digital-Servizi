package org.example.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
@NamedQuery(name = "Company.findAll", query = "SELECT c FROm Company c")
public class Company {

    @Id
    @SequenceGenerator(
            name = "company_seq",
            sequenceName = "COMPANY_SEQ",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
    @Column(name = "company_id", nullable = false)
    private Long id;
    @Column(name = "company_name", nullable = false)
    private String companyName;

    // Solo se voglio una relazione bidirezionale
    @OneToMany(mappedBy = "company")
    private List<User> employees;

    public Company() {}

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public List<User> getEmployees() {
        return employees;
    }
    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", employees=" + employees.size() +
                '}';
    }
}
