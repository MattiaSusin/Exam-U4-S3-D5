package mattia.susin.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "libri")
public class Libro {
    @Id
    @GeneratedValue
    private UUID isbn;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "anno_pubblicazione")
    private Date annoPubblicazione;

    @Column(name = "numero_pagine")
    private int numeroPagine;

    @Column(name = "autori")
    private String autore;

    @Column(name = "genere")
    private String genere;
    
}
