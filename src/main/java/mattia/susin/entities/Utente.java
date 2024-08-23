package mattia.susin.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "utenti")
public class Utente {
    //ATTRIBUTI

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_di_nascita")
    private Date dataDiNascita;

    @Column(name = "numero_tessera")
    private UUID numeroTessera;

    //COSTRUTTORI

    public Utente() {

        //DEFAULT LASCIARE VUOTA

    }

    public Utente(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    //SETTER E GETTER

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(UUID numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
