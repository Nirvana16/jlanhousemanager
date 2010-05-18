/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.DespesaFixa;
import model.TipoDespesa;

/**
 *
 * @author Tales
 */
class DespesaFixaService {

    private EntityManager em;
    private SessionFacade session;

    public DespesaFixaService(EntityManager em, SessionFacade session) {
        this.em = em;
        this.session = session;
    }

    void addDespesa(DespesaFixa desp) throws ServiceException {
        TipoDespesa t = session.pegarTipoDespesa(desp.getTipoDespesa().getId());
        if (t == null)
            throw new ServiceException();
        em.getTransaction().begin();
        em.persist(desp);
        em.getTransaction().commit();

    }

}
