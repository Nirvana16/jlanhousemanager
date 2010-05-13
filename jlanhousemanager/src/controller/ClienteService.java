/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.persistence.EntityManager;
import model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteService extends Service{

    private EntityManager em;

    public void addClient(Cliente c) {

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

    }

    public Cliente findClient(int id) {
        return em.find(Cliente.class, id);
    }


    
}
