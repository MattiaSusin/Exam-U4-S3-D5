package mattia.susin.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "prestiti")
public class Prestito {

    //ATTRIBUTI

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "isbn", nullable = false)
    private LibroRivista libroRivista; // Questo rappresenta l'elemento prestato, che può essere un libro o una rivista

    @Column(name = "data_inizio_prestito")
    private Date dataInizioPrestito;

    @Column(name = "data_restituzione_prevista")
    private Date dataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private Date dataRestituzioneEffettiva;

    //COSTRUTTORI
    public Prestito() {
        //COSTRUTTORE DI DEFAULT
    }

    public Prestito(Utente utente, LibroRivista libroRivista, Date dataInizioPrestito, Date dataRestituzionePrevista, Date dataRestituzioneEffettiva) {
        this.utente = utente;
        this.libroRivista = libroRivista;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }


//SETTER E GETTER


    public UUID getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LibroRivista getLibroRivista() {
        return libroRivista;
    }

    public void setLibroRivista(LibroRivista libroRivista) {
        this.libroRivista = libroRivista;
    }

    public Date getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(Date dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public Date getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public Date getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }
//TO STRING


    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", utente=" + utente +
                ", libroRivista=" + libroRivista +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}
