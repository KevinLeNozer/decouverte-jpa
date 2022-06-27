package fr.diginamic;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import java.util.List;
import java.util.Map;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("demo-jpa");

        EntityManager et = entityManager.createEntityManager();

        et.getTransaction().begin();

        Auteur auteur = et.find(Auteur.class, 4);
        System.out.println(auteur);

        Auteur aut = new Auteur();
        aut.setId(8);
        aut.setNom("Toto");
        aut.setPrenom("Titi");
        et.persist(aut);

        et.getTransaction().commit();
    }
}
