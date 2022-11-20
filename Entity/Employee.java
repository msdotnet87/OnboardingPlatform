package pl.msi.Entity;


import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private String firstName;

    @Column
    @NotNull
    private String surname;

    @Column
    @NotNull
    private String jobRole;

    @Column
    @NotNull
    private String department;

    @Column
    @NotNull
    private String workId;

    @OneToOne(targetEntity = EmployeeDetails.class)
    private List<EmployeeDetails> employeeDetails;

    @ManyToOne(targetEntity = Manager.class)
    @JoinColumn(name = "manager_id", referencedColumnName = "id")
    private Manager manager;

    @OneToMany(targetEntity = Courses.class)
    private List<Courses> coursesRequired;

    @OneToMany(targetEntity = Courses.class)
    private List<Courses> coursesCompleted;

    @Column
    @Nullable
    private Integer percentCompleted;

    @Column
    @Nullable
    private String onboardingCompleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public List<EmployeeDetails> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
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

    public List<Courses> getCoursesCompleted() {
        return coursesCompleted;
    }

    public void setCoursesCompleted(List<Courses> coursesCompleted) {
        this.coursesCompleted = coursesCompleted;
    }

    public Integer getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public String getOnboardingCompleted() {
        return onboardingCompleted;
    }

    public void setOnboardingCompleted(String onboardingCompleted) {
        this.onboardingCompleted = onboardingCompleted;
    }
}