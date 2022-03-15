package com.example.tchspreadsheet.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loginTimes")
public class LoginTimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String date;

    @Column
    private String time;

    public LoginTimes(LoginTimes copy) {
        id = copy.id;
        date = copy.date;
        time = copy.time;
    }

    public LoginTimes () {}

    @ManyToMany(mappedBy = "loginTimes")
    private List<User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
