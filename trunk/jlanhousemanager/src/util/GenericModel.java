/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author Danilo
 */
public abstract class GenericModel<T> extends AbstractTableModel{


    List<T> _list;

    String[] _columnNames;
    
    Class _class;

    List<Field> _columns;

    Object[][] data;

    public GenericModel(Class c){
        _class = c;
        _columns = new ArrayList<Field>();

        if( !isEntity(c) ){
            System.out.println(c);
        }

        _list = new ArrayList<T>();

        initModel();
    }

    public GenericModel(List<T> l){

        assert( l.size() > 0 );

        _list = l;
        _class = l.get(0).getClass();

        initModel();
    }

    private void initModel(){

        for( Field f: _class.getDeclaredFields() ){
            
            _columns.add(f);
            
        }
        
    }

    public int getRowCount() {
        return _list.size();
    }

    public int getColumnCount() {
        return _columns.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean isEntity(Class c) {
       for( Annotation a: c.getDeclaredAnnotations() ){
           if( a instanceof Entity )
               return true;
       }

       return false;
    }

    public static void main(String[] args){
      

    }


    public abstract Object[] toObjectArray(T t);
    
}
