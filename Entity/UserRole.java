package pl.msi.Entity;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import org.springframework.context.annotation.Configuration;
import pl.msi.Entity.enums.Permission;

import javax.persistence.*;

@Entity
@Table(name="UserRole")
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;


    @Column
    @Nullable
    private String nameOfRole;

    @ManyToOne
    private User user;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNameOfRole() {
        return nameOfRole;
    }

    public void setNameOfRole(String nameOfRole) {
        this.nameOfRole = nameOfRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
