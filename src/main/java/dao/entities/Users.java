package dao.entities;

/**
 * Created by alex on 24.11.16.
 */

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class Users {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "USERNAME")
    private String username;

    @Column(name = "USERROLE")
    private Long userRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserRole() {
        return userRole;
    }

    public void setUserRole(Long userRole) {
        this.userRole = userRole;
    }
}
