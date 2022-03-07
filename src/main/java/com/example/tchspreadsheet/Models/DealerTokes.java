package com.example.tchspreadsheet.Models;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dealerTokes")
public class DealerTokes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long totalTokes;

    @Column
    private long twelvePercentTotal;

    @Column
    private long dealerTakeHomeTotal;


    public DealerTokes(DealerTokes copy) {
        id = copy.id;
        totalTokes = copy.totalTokes;
        twelvePercentTotal = copy.twelvePercentTotal;
        dealerTakeHomeTotal = copy.dealerTakeHomeTotal;
    }

    public DealerTokes() {}

    @ManyToMany(mappedBy = "dealerTokes")
    private List<User> user;

    @ManyToMany
    @JoinTable(
            name = "dealerTokes_spreadsheet_bridge",
            joinColumns = {@JoinColumn(name = "dealerTokes_id")},
            inverseJoinColumns = {@JoinColumn(name = "spreadsheet_id")}
    )
    private List<Spreadsheet> spreadsheet;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Spreadsheet> getSpreadsheet() {
        return spreadsheet;
    }

    public void setSpreadsheet(List<Spreadsheet> spreadsheet) {
        this.spreadsheet = spreadsheet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTotalTokes() {
        return totalTokes;
    }

    public void setTotalTokes(long totalTokes) {
        this.totalTokes = totalTokes;
    }

    public long getTwelvePercentTotal() {
        return twelvePercentTotal;
    }

    public void setTwelvePercentTotal(long twelvePercentTotal) {
        this.twelvePercentTotal = twelvePercentTotal;
    }

    public long getDealerTakeHomeTotal() {
        return dealerTakeHomeTotal;
    }

    public void setDealerTakeHomeTotal(long dealerTakeHomeTotal) {
        this.dealerTakeHomeTotal = dealerTakeHomeTotal;
    }
}
