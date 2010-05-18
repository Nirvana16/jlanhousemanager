/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.Produto;

/**
 *
 * @author Tales
 */
class ProdutoService {

    private EntityManager em;
    
    ProdutoService(EntityManager em) {
        this.em = em;
    }

    void addProduto(Produto produto) {
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
    }

}
