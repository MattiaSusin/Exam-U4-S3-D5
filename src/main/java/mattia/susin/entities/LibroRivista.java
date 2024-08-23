package mattia.susin.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "libri_riviste")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class LibroRivista {
    @Id
    @GeneratedValue
    private UUID isbn;


    @Column(name = "titolo")
    private String titolo;


    @Column(name = "anno_pubblicazione")
    private int annoPubblicazione;

    @Column(name = "numero_pagine")
    private int numeroPagine;

    //COSTRUTTORI

    public LibroRivista() {

    }

    public LibroRivista(String titolo, int annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
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

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    //TO STRING

    @Override
    public String toString() {
        return "LibroRivista{" +
                "isbn=" + isbn +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
