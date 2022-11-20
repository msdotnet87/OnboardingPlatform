package pl.msi.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column
    private String emailAdress;

    @NotNull
    @Column
    private String adress;

    @NotNull
    @Column
    private String city;

    @NotNull
    @Column
    private String phoneNumber;

    @OneToOne
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
