/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gui;

import controller.ClienteService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteView extends GUICadastro<Cliente> {

    ClienteService cService;

    public ClienteView(List<Cliente> data, EntityPanel<Cliente> p ,ClienteService c) {
        super(data, p);
        cService = c;

    }

    @Override
    protected void salvar() {
    }

    @Override
    protected void excluir() {
    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jlanhousemanagerPU");
        EntityManager em = emf.createEntityManager();
        ClienteService c = new ClienteService(em);
        EntityPanel<Cliente> p = new ClientePanel();
        List<Cliente> list = c.getClients();

        System.out.println( list.size());
        for( Cliente cli: list ){
            System.out.println( cli );
        }

        ClienteView cview = new ClienteView(list, p, c);
        cview.pack();
        cview.setVisible(true);
    }
}
