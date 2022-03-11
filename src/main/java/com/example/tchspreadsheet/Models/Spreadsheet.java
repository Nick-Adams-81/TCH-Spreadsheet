package com.example.tchspreadsheet.Models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spreadsheet")
public class Spreadsheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // cash values //
    @Column
    private long loseOnes;

    @Column
    private long strappedOnes;

    @Column
    private long loseTwos;

    @Column
    private long strappedTwos;

    @Column
    private long loseFives;

    @Column
    private long strappedFives;

    @Column
    private long loseTens;

    @Column
    private long strappedTens;

    @Column
    private long loseTwenties;

    @Column
    private long strappedTwenties;

    @Column
    private long loseFifties;

    @Column
    private long strappedFifties;

    @Column
    private long loseHundreds;

    @Column
    private long strappedHundreds;

    // chip values //
    @Column
    private long loseOnesChips;

    @Column
    private long rackedOnesChips;

    @Column
    private long loseFivesChips;

    @Column
    private long rackedFivesChips;

    @Column
    private long loseTwentyFives;

    @Column
    private long rackedTwentyFives;

    @Column
    private long loseHundredsChips;

    @Column
    private long rackedHundredsChips;

    @Column
    private long loseFiveHundreds;

    @Column
    private long rackedFiveHundreds;

    @Column
    private long loseThousands;

    @Column
    private long rackedThousands;

    @Column
    private long loseFiveThousands;

    @Column
    private long rackedFiveThousands;

    @Column
    private long targetTotal;

    @Column
    private long boxTotal;

    @Column
    private String varianceExplanation;


    // copy constructor //
    public Spreadsheet(Spreadsheet copy) {
        // cash values
        id = copy.id;
        loseOnes = copy.loseOnes;
        strappedOnes = copy.strappedOnes;
        loseTwos = copy.loseTwos;
        strappedTwos = copy.strappedTwos;
        loseFives = copy.loseFives;
        strappedFives = copy.strappedFives;
        loseTens = copy.loseTens;
        strappedTens = copy.strappedTens;
        loseTwenties = copy.loseTwenties;
        strappedTwenties = copy.strappedTwenties;
        loseFifties = copy.loseFifties;
        strappedFifties = copy.strappedFifties;
        loseHundreds = copy.loseHundreds;

        // chip values
        loseOnesChips = copy.loseOnesChips;
        rackedOnesChips = copy.rackedOnesChips;
        loseFivesChips = copy.loseFivesChips;
        rackedFivesChips = copy.rackedFivesChips;
        loseTwentyFives = copy.loseTwentyFives;
        rackedTwentyFives = copy.rackedTwentyFives;
        loseHundredsChips = copy.loseHundredsChips;
        rackedHundredsChips = copy.rackedHundredsChips;
        loseFiveHundreds = copy.loseFiveHundreds;
        rackedFiveHundreds = copy.rackedFiveHundreds;
        loseThousands = copy.loseThousands;
        rackedThousands = copy.rackedThousands;
        loseFiveThousands = copy.loseFiveThousands;
        rackedFiveThousands = copy.rackedFiveThousands;

        // totals and variance explanation copy constructor
        targetTotal = copy.targetTotal;
        boxTotal = copy.boxTotal;
        varianceExplanation = copy.varianceExplanation;

    }

    // empty constructor for the class to function properly //
    public Spreadsheet() {}

    // setting up relationship with user table
    @ManyToMany(mappedBy = "spreadsheet")
    private List<User> user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "spreadsheet_dealerTokes_bridge",
            joinColumns = {@JoinColumn(name = "spreadsheet_id")},
            inverseJoinColumns = {@JoinColumn(name = "dealerTokes_id")}
    )
    private  List<DealerTokes> dealerTokes;

    // getters and setters //
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getLoseOnes() {
        return loseOnes;
    }

    public void setLoseOnes(long loseOnes) {
        this.loseOnes = loseOnes;
    }

    public long getStrappedOnes() {
        return strappedOnes;
    }

    public void setStrappedOnes(long strappedOnes) {
        this.strappedOnes = strappedOnes;
    }

    public long getLoseTwos() {
        return loseTwos;
    }

    public void setLoseTwos(long loseTwos) {
        this.loseTwos = loseTwos;
    }

    public long getStrappedTwos() {
        return strappedTwos;
    }

    public void setStrappedTwos(long strappedTwos) {
        this.strappedTwos = strappedTwos;
    }

    public long getLoseFives() {
        return loseFives;
    }

    public void setLoseFives(long loseFives) {
        this.loseFives = loseFives;
    }

    public long getStrappedFives() {
        return strappedFives;
    }

    public void setStrappedFives(long strappedFives) {
        this.strappedFives = strappedFives;
    }

    public long getLoseTens() {
        return loseTens;
    }

    public void setLoseTens(long loseTens) {
        this.loseTens = loseTens;
    }

    public long getStrappedTens() {
        return strappedTens;
    }

    public void setStrappedTens(long strappedTens) {
        this.strappedTens = strappedTens;
    }

    public long getLoseTwenties() {
        return loseTwenties;
    }

    public void setLoseTwenties(long loseTwenties) {
        this.loseTwenties = loseTwenties;
    }

    public long getStrappedTwenties() {
        return strappedTwenties;
    }

    public void setStrappedTwenties(long strappedTwenties) {
        this.strappedTwenties = strappedTwenties;
    }

    public long getLoseFifties() {
        return loseFifties;
    }

    public void setLoseFifties(long loseFifties) {
        this.loseFifties = loseFifties;
    }

    public long getStrappedFifties() {
        return strappedFifties;
    }

    public void setStrappedFifties(long strappedFifties) {
        this.strappedFifties = strappedFifties;
    }

    public long getLoseHundreds() {
        return loseHundreds;
    }

    public void setLoseHundreds(long loseHundreds) {
        this.loseHundreds = loseHundreds;
    }

    public long getStrappedHundreds() {
        return strappedHundreds;
    }

    public void setStrappedHundreds(long strappedHundreds) {
        this.strappedHundreds = strappedHundreds;
    }

    public long getLoseOnesChips() {
        return loseOnesChips;
    }

    public void setLoseOnesChips(long loseOnesChips) {
        this.loseOnesChips = loseOnesChips;
    }

    public long getRackedOnesChips() {
        return rackedOnesChips;
    }

    public void setRackedOnesChips(long rackedOnesChips) {
        this.rackedOnesChips = rackedOnesChips;
    }

    public long getLoseFivesChips() {
        return loseFivesChips;
    }

    public void setLoseFivesChips(long loseFivesChips) {
        this.loseFivesChips = loseFivesChips;
    }

    public long getRackedFivesChips() {
        return rackedFivesChips;
    }

    public void setRackedFivesChips(long rackedFivesChips) {
        this.rackedFivesChips = rackedFivesChips;
    }

    public long getLoseTwentyFives() {
        return loseTwentyFives;
    }

    public void setLoseTwentyFives(long loseTwentyFives) {
        this.loseTwentyFives = loseTwentyFives;
    }

    public long getRackedTwentyFives() {
        return rackedTwentyFives;
    }

    public void setRackedTwentyFives(long rackedTwentyFives) {
        this.rackedTwentyFives = rackedTwentyFives;
    }

    public long getLoseHundredsChips() {
        return loseHundredsChips;
    }

    public void setLoseHundredsChips(long loseHundredsChips) {
        this.loseHundredsChips = loseHundredsChips;
    }

    public long getRackedHundredsChips() {
        return rackedHundredsChips;
    }

    public void setRackedHundredsChips(long rackedHundredsChips) {
        this.rackedHundredsChips = rackedHundredsChips;
    }

    public long getLoseFiveHundreds() {
        return loseFiveHundreds;
    }

    public void setLoseFiveHundreds(long loseFiveHundreds) {
        this.loseFiveHundreds = loseFiveHundreds;
    }

    public long getRackedFiveHundreds() {
        return rackedFiveHundreds;
    }

    public void setRackedFiveHundreds(long rackedFiveHundreds) {
        this.rackedFiveHundreds = rackedFiveHundreds;
    }

    public long getLoseThousands() {
        return loseThousands;
    }

    public void setLoseThousands(long loseThousands) {
        this.loseThousands = loseThousands;
    }

    public long getRackedThousands() {
        return rackedThousands;
    }

    public void setRackedThousands(long rackedThousands) {
        this.rackedThousands = rackedThousands;
    }

    public long getFiveThousands() {
        return loseFiveThousands;
    }

    public void setFiveThousands(long loseFiveThousands) {
        this.loseFiveThousands = loseFiveThousands;
    }

    public long getRackedFiveThousands() {
        return rackedFiveThousands;
    }

    public void setRackedFiveThousands(long rackedFiveThousands) {
        this.rackedFiveThousands = rackedFiveThousands;
    }

    public long getLoseFiveThousands() {
        return loseFiveThousands;
    }

    public void setLoseFiveThousands(long loseFiveThousands) {
        this.loseFiveThousands = loseFiveThousands;
    }

    public long getTargetTotal() {
        return targetTotal;
    }

    public void setTargetTotal(long targetTotal) {
        this.targetTotal = targetTotal;
    }

    public long getBoxTotal() {
        return boxTotal;
    }

    public void setBoxTotal(long boxTotal) {
        this.boxTotal = boxTotal;
    }

    public String getVarianceExplanation() {
        return varianceExplanation;
    }

    public void setVarianceExplanation(String varianceExplanation) {
        this.varianceExplanation = varianceExplanation;
    }
}
