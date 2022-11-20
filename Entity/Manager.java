package pl.msi.Entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;


@Entity
public class Manager {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(targetEntity = Departments.class)
    private Departments department;

    @OneToOne
    User user;

    @OneToMany
    private List<Employee> employees;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
