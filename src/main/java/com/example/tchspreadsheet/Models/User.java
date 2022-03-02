package com.example.tchspreadsheet.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    // users table values
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean isAdmin;

    // authentication copy constructor
    public User(User copy) {
        id = copy.id;
        email = copy.email;
        username = copy.username;
        password = copy.password;
        isAdmin = copy.isAdmin;
    }

    // empty User constructor required for class to work properly
    public User() {}



    // setting up the many-to-many relationship with spreadsheet table //
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_spreadsheet_bridge",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "spreadsheet_id")}
    )
    private List<Spreadsheet> spreadsheet;


    // getters and setters for users table values
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Spreadsheet> getSpreadsheet() {
        return spreadsheet;
    }

    public void setSpreadsheet(List<Spreadsheet> spreadsheet) {
        this.spreadsheet = spreadsheet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
