/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteService {

    private EntityManager em;

    public ClienteService(EntityManager em) {
        this.em = em;
    }

    public void addClient(Cliente c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public Cliente findClient(int id) {
        return em.find(Cliente.class, id);
    }

    public List<Cliente> findClientByName(String name) {
        TypedQuery<Cliente> tp = em.createNamedQuery("Cliente.findByNome", Cliente.class);
        tp.setParameter("nome", name);
        return tp.getResultList();
    }

    public List<Cliente> getClients() {
        TypedQuery<Cliente> query = em.createQuery("SELECT e FROM Cliente e",
                Cliente.class);
        List<Cliente> emps = query.getResultList();

        return emps;
    }
}
