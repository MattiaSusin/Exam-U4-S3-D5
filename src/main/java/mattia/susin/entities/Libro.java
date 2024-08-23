package mattia.susin.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro {

    //ATTRIBUTI

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
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
