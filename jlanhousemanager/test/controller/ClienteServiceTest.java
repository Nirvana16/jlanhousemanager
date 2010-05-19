/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import junit.framework.Assert;
import model.Cliente;
import org.ini4j.Ini;
import org.ini4j.Profile.Section;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Danilo
 */
public class ClienteServiceTest {

    private List<Cliente> list;
    private ClienteService cs;

    public ClienteServiceTest() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jlanhousemanagerPU");
        EntityManager em = emf.createEntityManager();

        cs = new ClienteService(em);
        
        list = new ArrayList<Cliente>();
        
        carregarClientes("clientes.txt");        
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addClient method, of class ClienteService.
     */
    @Test
    public void testAddClient() {

        List<Cliente> lini = cs.getClients();

        int tamIni = lini.size();

        Cliente c = list.get(0);

        cs.addClient(c);

        List<Cliente> lfinal = cs.getClients();
        int tamFinal = lfinal.size();

        Assert.assertEquals("Não foi adicionado!", (tamIni + 1), (tamFinal));        
    }

    /**
     * Test of findClient method, of class ClienteService.
     */
    @Test
    public void testFindClient() {
        
        cs.addClient(list.get(1));

        Cliente c = list.get(1);
        int id = c.getIdcliente();

        Cliente c2 = cs.findClient(id);

        Assert.assertEquals( "Nomes não são iguais", c.getNome(), c2.getNome() );

    }

    public void carregarClientes(String arquivo) {

        try {
            Ini ini = new Ini(new File(arquivo));

            Set<String> set = ini.keySet();

            for (String key : set) {

                Ini.Section sec = ini.get(key);

                Cliente c = getCliente(sec);

                list.add(c);
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private static Cliente getCliente(Section sec) {
        Cliente c = new Cliente();

        c.setNome(sec.get("nome"));
        c.setCpf(sec.get("cpf"));
        c.setDatanascimento(new Date());
        c.setEmail(sec.get("email"));
        c.setTelcelular(sec.get("telcelular"));
        c.setTelresidencial(sec.get("telresidencial"));
        c.setEndrua(sec.get("endrua"));
        c.setEndnumero(Integer.parseInt(sec.get("endnumero")));
        c.setEndcep(sec.get("endcep"));
        c.setEndbairro(sec.get("endbairro"));
        c.setEndcidade(sec.get("endestado"));
        c.setEndestado(sec.get("endestado"));

        return c;
    }

}
