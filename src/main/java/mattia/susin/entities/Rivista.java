package mattia.susin.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue("riviste")
public class Rivista extends LibroRivista {

    //ATTRIBUTI

    @Enumerated(EnumType.STRING)
    protected PeriodicitàRiviste periodicitàRiviste;

    //COSTRUTTORI

    protected Rivista() {
        //COSTRUTTORE DI DEFAULT
    }

    public Rivista(String titolo, int annoPubblicazione, int numeroPagine, PeriodicitàRiviste periodicitàRiviste) {
        super(titolo, annoPubblicazione, numeroPagine);
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
                ", periodicitàRiviste=" + periodicitàRiviste +
                '}';
    }
}
