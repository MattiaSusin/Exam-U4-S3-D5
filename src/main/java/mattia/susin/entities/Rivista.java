package mattia.susin.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "riviste")
public class Rivista {

    //ATTRIBUTI

    @Id
    @GeneratedValue
    private UUID isbn;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "anno_pubblicazione")
    private Date annoPubblicazione;

    @Column(name = "numero_pagine")
    private int numeroPagine;

    @Enumerated(EnumType.STRING)
    private PeriodicitàRiviste periodicitàRiviste;

    //COSTRUTTORI

    public Rivista() {
        //COSTRUTTORE DI DEFAULT 
    }

    public Rivista(String titolo, Date annoPubblicazione, int numeroPagine, PeriodicitàRiviste periodicitàRiviste) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicitàRiviste = periodicitàRiviste;
    }


    //SETTER E GETTER

    public UUID getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Date annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public PeriodicitàRiviste getPeriodicitàRiviste() {
        return periodicitàRiviste;
    }

    public void setPeriodicitàRiviste(PeriodicitàRiviste periodicitàRiviste) {
        this.periodicitàRiviste = periodicitàRiviste;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Rivista{" +
                "isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", periodicitàRiviste=" + periodicitàRiviste +
                '}';
    }
}
