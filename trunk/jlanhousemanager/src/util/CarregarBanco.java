/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import model.Cliente;
import org.ini4j.*;
import org.ini4j.Profile.Section;

/**
 *
 * @author Danilo
 */
public class CarregarBanco {

    public static void carregarClientes(String arquivo) {
        
        try {
            Ini ini = new Ini(new File(arquivo));

            Set<String> set = ini.keySet();

            for (String key : set) {

                Ini.Section sec = ini.get(key);

                Cliente c = getCliente(sec);

                System.out.println(c.getNome());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){
        carregarClientes("clientes.txt");
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
        
        /*
        nome = Danilo Oliveira
        cpf = 1000000003
        datadenascimento = 01/01/1990
        email = danilo@gmail.com
        telresidencial = 1234567890
        telcelular = 1234567890
        endrua = Rua XXX
        endbairro = Centro
        endnumero = 1
        endcidade = Aracaju
        endestado = SE
        endcep = XXX
         */
        
        return c;
    }
}

