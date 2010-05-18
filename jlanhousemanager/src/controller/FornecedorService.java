/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.Fornecedor;

/**
 *
 * @author Tales
 */
class FornecedorService {
    
    private EntityManager em;

    FornecedorService(EntityManager em) {
        this.em = em;
    }

    void addFornecedor(Fornecedor fornecedor) {
        em.getTransaction().begin();
        em.persist(fornecedor);
        em.getTransaction().commit();
    }

}
