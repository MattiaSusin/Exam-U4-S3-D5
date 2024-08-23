package mattia.susin.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import mattia.susin.entities.Libro;
import mattia.susin.exceptions.NotFoundException;

import java.util.List;
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
        try {
            // Prova a convertire la stringa in UUID
            UUID uuid = UUID.fromString(libroId);
            Libro found = em.find(Libro.class, uuid);
            if (found == null) {
                throw new NotFoundException(libroId);
            }
            return found;
        } catch (IllegalArgumentException e) {
            // Questo errore si verifica se libroId non è un formato valido di UUID
            System.err.println("Errore: ID non valido - " + libroId);
            throw e; // Rilancia l'eccezione o gestiscila come preferisci
        }
    }

    public void findByIdAndDelete(String libroId) {

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


    public List<Libro> findByAutore(String autore) {
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore", Libro.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }
}
