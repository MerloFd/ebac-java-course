package dao;

import domain.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDAO implements IProdutoDAO {
    @Override
    public Produto cadastrar(Produto produto) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev-UP");

        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();

        return produto;
    }
}
