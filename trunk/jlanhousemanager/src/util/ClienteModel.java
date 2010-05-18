/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteModel<T> extends GenericModel {

    T t;

    public ClienteModel(){
        super(Cliente.class);
    }

    @Override
    public Object[] toObjectArray(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
