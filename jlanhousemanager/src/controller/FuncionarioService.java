/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.persistence.EntityManager;
import model.Funcionario;

/**
 *
 * @author Danilo
 */
class FuncionarioService {

    private EntityManager em;

    FuncionarioService(EntityManager em) {
        this.em = em;
    }
    public void addFuncionario(Funcionario func){
        em.getTransaction().begin();
        em.persist(func);
        em.getTransaction().commit();
    }

}
