package pl.msi.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departments {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String deptName;

    @OneToOne
    private Manager manager;

    @OneToMany(targetEntity = Courses.class)
    private List<Courses> coursesRequired;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Courses> getCoursesRequired() {
        return coursesRequired;
    }

    public void setCoursesRequired(List<Courses> coursesRequired) {
        this.coursesRequired = coursesRequired;
    }
}
