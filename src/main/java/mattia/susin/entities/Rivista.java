package mattia.susin.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "riviste")
public class Rivista {

    //ATTRIBUTI

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    private PeriodicitàRiviste periodicitàRiviste;

    //COSTRUTTORI

    public Rivista() {
        //COSTRUTTORE DI DEFAULT
    }

    public Rivista(PeriodicitàRiviste periodicitàRiviste) {

        this.periodicitàRiviste = periodicitàRiviste;
    }


    //SETTER E GETTER

    public UUID getId() {
        return id;
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
                "id=" + id +
                ", periodicitàRiviste=" + periodicitàRiviste +
                '}';
    }
}
