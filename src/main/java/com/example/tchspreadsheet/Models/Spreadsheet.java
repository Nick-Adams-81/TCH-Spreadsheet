package com.example.tchspreadsheet.Models;


import javax.persistence.*;

@Entity
@Table(name = "spreadsheet")
public class Spreadsheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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



    public Spreadsheet() {}

}
