package mattia.susin.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import mattia.susin.entities.Rivista;
import mattia.susin.exceptions.NotFoundException;

import java.util.UUID;

public class RivistaDao {
    private EntityManager em;

    public RivistaDao(EntityManager em) {
        this.em = em;
    }

    public void salva(Rivista rivista) {
        // 1-->Transazione tramite EM
        EntityTransaction transaction = em.getTransaction();
        // 2--> Facciamo partire la transazione
        transaction.begin();
        // 3--> Aggiungiamo la Rivista al PC
        em.persist(rivista);
        // 4-->Concludiamo e Salviamo la rivista
        transaction.commit();
        // 5-->Stampiamo per vedere se ci ha realmente salvato il tutto
        System.out.println("La Rivista " + rivista.getTitolo() + " è stata salvata");

    }

    public Rivista findById(String rivistaId) {
        Rivista found = em.find(Rivista.class, UUID.fromString(rivistaId));
        if (found == null)
            throw new NotFoundException(rivistaId);

        return found;
    }

    public void findByIdAndDelete(String rivistaId) {
        // 0--> Cercare lo studente nel DB
        Rivista found = this.findById(rivistaId);
        // 1--> Chiediamo all'EM una transazione
        EntityTransaction transaction = em.getTransaction();
        // 2--> Facciamo partire la transazione
        transaction.begin();
        // 3--> Aggiungiamo la Rivista al PC
        em.remove(found);
        // 4-->Concludiamo e Salviamo la rivista
        transaction.commit();
        // 5-->Stampiamo per vedere se ci ha realmente salvato il tutto
        System.out.println("La Rivista " + found.getTitolo() + " è stata eliminata correttamente!");
    }
}
