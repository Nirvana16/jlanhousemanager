/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.gui.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteModel extends AbstractTableModel{

    List<Cliente> list;

    public ClienteModel(List<Cliente> list){
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 12;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente c = list.get(rowIndex);

        return getAttribute( c, columnIndex );

    }

    private Object getAttribute(Cliente c, int columnIndex) {
        Object o = null;
        switch( columnIndex ){
            case 0:
                o = c.getNome();
                break;
            case 1:
                o = c.getCpf();
                break;
            case 2:
                o = c.getDatanascimento();
                break;
            case 3:
                o = c.getEmail();
                break;
            case 4:
                o = c.getTelcelular();
                break;
            case 5:
                o = c.getTelresidencial();
                break;
            case 6:
                o = c.getEndrua();
                break;
            case 7:
                o = c.getEndnumero();
                break;
            case 8:
                o = c.getEndbairro();
                break;
            case 9:
                o = c.getEndcidade();
                break;
            case 10:
                o = c.getEndestado();
                break;
            case 11:
                o = c.getEndcep();
                break;
        }

        return o;
    }

}
