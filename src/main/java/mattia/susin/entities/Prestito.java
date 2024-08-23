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
    private UUID utenteId;

    @Column(name = "elemento_prestato")
    private String elementoPrestato;

    @Column(name = "data_inizio_prestito")
    private Date dataInizioPrestito;

    @Column(name = "data_restituzione_prevista")
    private Date dataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private Date DataRestituzioneEffettiva;

    //COSTRUTTORI
    public Prestito() {
        //COSTRUTTORE DI DEFAULT
    }

    public Prestito(String elementoPrestato, Date dataInizioPrestito, Date dataRestituzionePrevista, Date dataRestituzioneEffettiva) {
        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        DataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    //SETTER E GETTER


    public UUID getUtenteId() {
        return utenteId;
    }

    public String getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(String elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
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
        return DataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
        DataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Prestito{" +
                "utenteId=" + utenteId +
                ", elementoPrestato='" + elementoPrestato + '\'' +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", DataRestituzioneEffettiva=" + DataRestituzioneEffettiva +
                '}';
    }
}
