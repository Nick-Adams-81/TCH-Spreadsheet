package com.example.tchspreadsheet.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dealers")
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 4)
    private int pin;

    @ManyToMany(mappedBy = "dealers")
    private List<User> users;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "dealers_dealer_tokes_bridge",
            joinColumns = {@JoinColumn(name = "dealer_id")},
            inverseJoinColumns = {@JoinColumn(name = "dealer_tokes_id")}
    )
    private List<DealerTokes> dealerTokes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<DealerTokes> getDealerTokes() {
        return dealerTokes;
    }

    public void setDealerTokes(List<DealerTokes> dealerTokes) {
        this.dealerTokes = dealerTokes;
    }
}
