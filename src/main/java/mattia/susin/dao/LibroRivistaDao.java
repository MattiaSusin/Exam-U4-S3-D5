package mattia.susin.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import mattia.susin.entities.Libro;
import mattia.susin.entities.LibroRivista;

import java.util.List;

public class LibroRivistaDao {
    private EntityManager em;

    public LibroRivistaDao(EntityManager em) {
        this.em = em;
    }

    // RICERCA PER TITOLO O PARTE DI ESSO
    public static void ricercaPerTitolo(LibroRivistaDao libroRivistaDao, String titolo) {
        System.out.println("Ricerca per titolo o parte di esso: " + titolo);
        List<LibroRivista> libriTrovati = libroRivistaDao.findByTitolo(titolo);
        for (LibroRivista lr : libriTrovati) {
            System.out.println(lr);
        }
    }

    // RICERCA PER AUTORE DI PUBBLICAZIONE UN LIBRO
    public static void ricercaPerAutore(LibroDao libroDao, String autore) {
        System.out.println("Ricerca per autore: " + autore);
        List<Libro> libriAutore = libroDao.findByAutore(autore);
        for (Libro libro : libriAutore) {
            System.out.println(libro);
        }
    }

    // RICERCA PER ANNO DI PUBBLICAZIONE
    public static void ricercaPerAnnoPubblicazione(LibroRivistaDao libroRivistaDao, int anno) {
        System.out.println("Ricerca per anno di pubblicazione: " + anno);
        List<LibroRivista> results = libroRivistaDao.findByAnnoPubblicazione(anno);
        for (LibroRivista lr : results) {
            System.out.println(lr);
        }
    }

    // Corretto il tipo di ritorno a List<LibroRivista>
    public List<LibroRivista> findByAnnoPubblicazione(int anno) {
        TypedQuery<LibroRivista> query = em.createQuery("SELECT lr FROM LibroRivista lr WHERE lr.annoPubblicazione = :anno", LibroRivista.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<LibroRivista> findByTitolo(String titolo) {
        TypedQuery<LibroRivista> query = em.createQuery("SELECT lr FROM LibroRivista lr WHERE lr.titolo LIKE :titolo", LibroRivista.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }
}
