/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.gui;

import javax.swing.JPanel;

/**
 *
 * @author Danilo
 */
public abstract class EntityPanel<T> extends JPanel{
    public abstract T getEntity();
    public abstract void setEntity(T t);
}
