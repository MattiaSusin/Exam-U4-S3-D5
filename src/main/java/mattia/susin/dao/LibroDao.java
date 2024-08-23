package mattia.susin.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import mattia.susin.entities.Libro;
import mattia.susin.exceptions.NotFoundException;

import java.util.UUID;

public class LibroDao {
    private EntityManager em;

    public LibroDao(EntityManager em) {
        this.em = em;
    }

    public void salva(Libro libro) {
        // 1-->Transazione tramite EM
        EntityTransaction transaction = em.getTransaction();
        // 2--> Facciamo partire la transazione
        transaction.begin();
        // 3--> Aggiungiamo la Libro al PC
        em.persist(libro);
        // 4-->Concludiamo e Salviamo la libro
        transaction.commit();
        // 5-->Stampiamo per vedere se ci ha realmente salvato il tutto
        System.out.println("Il libro " + libro.getTitolo() + " è stato salvato");

    }

    public Libro findById(String libroId) {
        Libro found = em.find(Libro.class, UUID.fromString(libroId));
        if (found == null)
            throw new NotFoundException(libroId);

        return found;
    }

    public void findByIdAndDelete(String libroId) {
        // 0--> Cercare lo studente nel DB
        Libro found = this.findById(libroId);
        // 1--> Chiediamo all'EM una transazione
        EntityTransaction transaction = em.getTransaction();
        // 2--> Facciamo partire la transazione
        transaction.begin();
        // 3--> Aggiungiamo il Libro al PC
        em.remove(found);
        // 4-->Concludiamo e Salviamo il libro
        transaction.commit();
        // 5-->Stampiamo per vedere se ci ha realmente salvato il tutto
        System.out.println("Il Libro " + found.getTitolo() + " è stato eliminato correttamente!");
    }

}
