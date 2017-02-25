package test;

import entity.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MakeTabelBook {

    public static void main(String[] args) {
        
        /*
        The discriminant is different for each entity, since I changed the discriminant 
        in the entity objects themselfes. Therefore, the tables shown on mysql will not have values of DTYPE, but precise types instead
        */
        
        Persistence.generateSchema("pu", null);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Book b1 = new Book("Læse Fidusen");
        em.persist(b1);
        em.getTransaction().commit();

    }
}
