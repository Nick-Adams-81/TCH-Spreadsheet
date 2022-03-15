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
    private String startTime;

    @Column
    private String endTime;

    public LoginTimes(LoginTimes copy) {
        id = copy.id;
        date = copy.date;
        startTime = copy.startTime;
        endTime = copy.endTime;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
