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
public class ClienteService extends Service{

    private EntityManager em;

    public ClienteService(){
    }

    public ClienteService( EntityManager em ) {
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

    public List<Cliente> getClients(){  

        TypedQuery<Cliente> tp = em.createQuery("SELECT c FROM Cliente c", Cliente.class);

        return tp.getResultList();
        
    }
    
}
