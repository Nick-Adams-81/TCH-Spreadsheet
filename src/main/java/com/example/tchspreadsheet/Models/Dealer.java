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

    public Dealer(Dealer copy) {
        id = copy.id;
        name = copy.name;
        pin = copy.pin;
    }

    public Dealer() {}

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_dealer_bridge",
            joinColumns = {@JoinColumn(name = "dealer_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    private List<User> user;

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

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<DealerTokes> getDealerTokes() {
        return dealerTokes;
    }

    public void setDealerTokes(List<DealerTokes> dealerTokes) {
        this.dealerTokes = dealerTokes;
    }
}
