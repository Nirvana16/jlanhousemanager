//TODO - Cadastro de Clientes
//TODO - Cadastro de Funcionários
//TODO - Cadastro de Fornecedores
//TODO - Cadastro de Computadores



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIPrincipal.java
 *
 * Created on 16/05/2010, 18:26:53
 */

package view.gui;

/**
 *
 * @author Danilo
 */
public class GUIPrincipal extends javax.swing.JFrame {

    /** Creates new form GUIPrincipal */
    public GUIPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miComputadores = new javax.swing.JMenuItem();
        miFornecedores = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Gerenciar");

        miClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miClientes.setText("Clientes");
        jMenu1.add(miClientes);

        miComputadores.setText("jMenuItem1");
        jMenu1.add(miComputadores);

        miFornecedores.setText("jMenuItem1");
        jMenu1.add(miFornecedores);

        miFuncionario.setText("jMenuItem1");
        jMenu1.add(miFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miComputadores;
    private javax.swing.JMenuItem miFornecedores;
    private javax.swing.JMenuItem miFuncionario;
    // End of variables declaration//GEN-END:variables

}
