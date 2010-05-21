/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.gui;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danilo
 */
public class GenericModel extends AbstractTableModel {

    Class c;
    List data;
    List<String> columns;

    public GenericModel(List data){
        columns = new ArrayList<String>();

        c = data.get(0).getClass();

        for( Method m: c.getDeclaredMethods() ){
            if(m.getName().startsWith("get")){
                String columnName = m.getName().substring(3);
                columns.add(columnName);
            }
        }

        this.data = data;
    }

    public GenericModel(List<String> columns, List data){

    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columns.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Map<String, Object> obj = toMap( data.get(rowIndex) );

        String columnName = columns.get(columnIndex);

        return obj.get(columnName);
    }

    private Map<String, Object> toMap( Object o ){
        Map<String, Object> map = new HashMap<String, Object>();
        Class c = o.getClass();

        for( String column: columns ){
            try {

                Method m = c.getMethod("get" + column, null);
                map.put( column, m.invoke(o, null));

            } catch (Exception ex) {
               ex.printStackTrace();
            }

        }

        return map;
    }

    @Override
    public String getColumnName(int index){
        return columns.get(index);
    }

}
