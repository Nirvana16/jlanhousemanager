/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testandooo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.DespesaVariavel;
import model.DespesaFixa;

/**
 *
 * @author Tales
 */
public class Teste {

    public static void main(String[] args ){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jlanhousemanagerPU");
        EntityManager em = emf.createEntityManager();

        DespesaVariavel d = new DespesaVariavel();
        d.setData(new Date());
        d.setDescricao("xxx");
        d.setValor(new BigDecimal("100"));
        
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();

    }

}
