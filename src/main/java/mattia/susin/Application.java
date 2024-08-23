package mattia.susin;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exam-U4-S3-D5");

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}
