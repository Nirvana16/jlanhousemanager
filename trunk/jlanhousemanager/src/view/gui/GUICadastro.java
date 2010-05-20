/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUICadastro.java
 *
 * Created on 18/05/2010, 09:12:29
 */
package view.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public abstract class GUICadastro<T> extends javax.swing.JFrame {

    /** Creates new form GUICadastro */
    private static final int NEW = 0;
    private static final int EDITING = 1;
    private static final int NAVIGATING = 2;
    private int state;
    private int index;
    protected T entity;
    protected List<T> data;
    protected EntityPanel<T> painelEntity;

    public GUICadastro(List<T> data, EntityPanel<T> p) {

        initComponents();

        this.data = data;
        painelEntity = p;
        painel.add(painelEntity);

        loadRecord(0);
        setFormState(NAVIGATING);
    }

    private void setFormState(int state) {
        this.state = state;
        switch (state) {
            case NEW:
                enableButtons(false);
                enableControls(true, painel);
                clearControls(painel);
            case EDITING:
                enableButtons(false);
                enableControls(true, painel);
                break;
            case NAVIGATING:
                enableButtons(true);
                enableControls(false, painel);
                break;
            default:
        }

    }

    private void enableButtons(boolean b) {
        btNovo.setEnabled(b);
        btEditar.setEnabled(b);
        btCancelar.setEnabled(!b);
        btExcluir.setEnabled(b);
        btGravar.setEnabled(!b);
        btFirst.setEnabled(b);
        btNext.setEnabled(b);
        btPrevious.setEnabled(b);
        btLast.setEnabled(b);
    }

    private void clearControls(JPanel p) {
        for (Component comp : p.getComponents()) {
            if (comp instanceof JPanel) {
                clearControls((JPanel) comp);
            } else if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");
            } else if (comp instanceof JComboBox) {
                ((JComboBox) comp).setSelectedIndex(0);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btFirst = new javax.swing.JButton();
        btPrevious = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jToolBar1.setRollover(true);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/document-new.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/apps/accessories-text-editor.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setFocusable(false);
        btEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btEditar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/edit-undo.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/status/dialog-error.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btExcluir);

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/document-save.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.setFocusable(false);
        btGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });
        jToolBar1.add(btGravar);
        jToolBar1.add(jSeparator1);

        btFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/go-first.png"))); // NOI18N
        btFirst.setFocusable(false);
        btFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirstActionPerformed(evt);
            }
        });
        jToolBar1.add(btFirst);

        btPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/go-previous.png"))); // NOI18N
        btPrevious.setFocusable(false);
        btPrevious.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPrevious.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreviousActionPerformed(evt);
            }
        });
        jToolBar1.add(btPrevious);

        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/go-next.png"))); // NOI18N
        btNext.setFocusable(false);
        btNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btNext);

        btLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/go-last.png"))); // NOI18N
        btLast.setFocusable(false);
        btLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btLast);
        jToolBar1.add(jSeparator2);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/32x32/actions/system-log-out.png"))); // NOI18N
        jButton6.setText("Sair");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        painel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painel.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        setFormState(NEW);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        setFormState(EDITING);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        if (state == NEW) {
            loadRecord(index);
        }
        setFormState(NAVIGATING);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed

        salvar();

        setState(NAVIGATING);
    }//GEN-LAST:event_btGravarActionPerformed

    private void btFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirstActionPerformed
        loadRecord(0);
    }//GEN-LAST:event_btFirstActionPerformed

    private void btPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreviousActionPerformed
        loadRecord(index - 1);
    }//GEN-LAST:event_btPreviousActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        loadRecord(index + 1);
    }//GEN-LAST:event_btNextActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        loadRecord(data.size() - 1);
    }//GEN-LAST:event_btLastActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFirst;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPrevious;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel painel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void enableControls(boolean b, JPanel p) {
        for (Component comp : p.getComponents()) {
            if (comp instanceof JPanel) {
                enableControls(b, (JPanel) comp);
            } else if (comp instanceof JTextField) {
                ((JTextField) comp).setEditable(b);
            }
        }
    }

    protected abstract void salvar();

    protected void loadRecord(int index) {
        if (data.size() <= index || index < 0) {
            return;
        }

        this.index = index;
        entity = data.get(index);
        painelEntity.setEntity(entity);
    }

    protected abstract void excluir();
}
