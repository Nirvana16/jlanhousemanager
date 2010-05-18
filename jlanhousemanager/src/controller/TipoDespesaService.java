/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.TipoDespesa;

/**
 *
 * @author Tales
 */
class TipoDespesaService {

    private EntityManager em;

    TipoDespesaService(EntityManager em) {
        this.em = em;
    }

    void addTipoDespesa(TipoDespesa tipo) {
        em.getTransaction().begin();
        em.persist(tipo);
        em.getTransaction().commit();
    }

    TipoDespesa findTipoDespesa(int id) {
        return em.find(TipoDespesa.class, id);
    }

}
