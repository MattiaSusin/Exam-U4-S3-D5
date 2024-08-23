package mattia.susin.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "libri")
public class Libro {

    //ATTRIBUTI

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "autori")
    private String autore;

    @Column(name = "genere")
    private String genere;

    //COSTRUTTORI

    public Libro() {
        //COSTRUTTORE DI DEFAULT
    }

    public Libro(String autore, String genere) {
        this.autore = autore;
        this.genere = genere;
    }

    //SETTER GETTER


    public UUID getId() {
        return id;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }


    //TO STRING


    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
