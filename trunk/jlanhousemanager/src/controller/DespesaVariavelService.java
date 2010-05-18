/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.DespesaVariavel;

/**
 *
 * @author Tales
 */
class DespesaVariavelService {

    EntityManager em;

    public DespesaVariavelService(EntityManager em) {
        this.em = em;
    }

    void addDespesa(DespesaVariavel desp) {
        em.getTransaction().begin();
        em.persist(desp);
        em.getTransaction().commit();
    }

}
