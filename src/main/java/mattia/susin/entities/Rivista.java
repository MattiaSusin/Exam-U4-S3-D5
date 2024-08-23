package mattia.susin.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "riviste")
public class Rivista {

    //ATTRIBUTI

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
                "periodicitàRiviste=" + periodicitàRiviste +
                '}';
    }
}
