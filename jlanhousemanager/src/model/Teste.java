/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Danilo
 */
public class Teste {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jlanhousemanagerPU");
        EntityManager em = emf.createEntityManager();

       
        em.close();
    }

}
