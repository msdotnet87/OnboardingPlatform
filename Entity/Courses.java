package pl.msi.Entity;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Courses {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String courseName;

    @Column
    @Nullable
    @Lob
    private String courseDescription;

    @ManyToOne
    private Departments departments;

    @ManyToOne
    private Employee employeeCourses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public Employee getEmployeeCourses() {
        return employeeCourses;
    }

    public void setEmployeeCourses(Employee employeeCourses) {
        this.employeeCourses = employeeCourses;
    }
}

