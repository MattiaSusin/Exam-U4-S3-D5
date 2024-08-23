package mattia.susin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import mattia.susin.dao.LibroDao;
import mattia.susin.dao.RivistaDao;
import mattia.susin.entities.Libro;
import mattia.susin.entities.PeriodicitàRiviste;
import mattia.susin.entities.Rivista;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exam-U4-S3-D5");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        //ATTRIBUTI DOVE SALVARE LE FUNZIONI
        LibroDao ld = new LibroDao(em);
        RivistaDao rd = new RivistaDao(em);

        //CREO E SALVO I LIBRI

        Libro lbnr1 = new Libro("Ombre nel Crepuscolo", 2022, 123, "Giulia Moretti", "Thriller Psicologico");
        Libro lbnr2 = new Libro("Il Segreto dei Draghi", 2019, 420, "Marco Bianchi", "Fantasy");
        Libro lbnr3 = new Libro("Riflessi di Memoria", 2021, 280, "Lorenzo Ricci", "Romanzo Storico");
        Libro lbnr4 = new Libro("Riflessi di Memoria", 2015, 310, "Alessandra Rossi", "Avventura");
        Libro lbnr5 = new Libro("L'Algoritmo dell'Amore", 2023, 275, "Sofia Galli", "Romanzo Contemporaneo");

        ld.salva(lbnr1);
        ld.salva(lbnr2);
        ld.salva(lbnr3);
        ld.salva(lbnr4);
        ld.salva(lbnr5);
        
        //CREO E SALVO LE RIVISTE

        Rivista rvnr1 = new Rivista("Nuova Scienza", 2018, 120, PeriodicitàRiviste.MENSILE);
        Rivista rvnr2 = new Rivista("Rivista di Letteratura Contemporanea", 2020, 230, PeriodicitàRiviste.SEMESTRALE);
        Rivista rvnr3 = new Rivista("Architettura Moderna", 2006, 78, PeriodicitàRiviste.SETTIMANALE);
        Rivista rvnr4 = new Rivista("Storia e Tradizione", 2000, 785, PeriodicitàRiviste.MENSILE);
        Rivista rvnr5 = new Rivista("Tecnologia e Innovazione", 2024, 135, PeriodicitàRiviste.SEMESTRALE);

        rd.salva(rvnr1);
        rd.salva(rvnr2);
        rd.salva(rvnr3);
        rd.salva(rvnr4);
        rd.salva(rvnr5);

        System.out.println("FUNZIONA");
    }
}
