
package br.com.controleconvidados.view;
import br.com.controleconvidados.utils.*;

public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        
        LookAndFeelUtils.setLookAndFeelUtils();
        LookAndFeelUtils.setWindowIcon(this,"/br/com/controleconvidados/images/home.png");
        
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        jMenuCadTpEvento = new javax.swing.JMenuItem();
        menuCon = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuConsultTpEvento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        menuCad.setText("Cadastrar");

        menuItemCliente.setText("Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuCad.add(menuItemCliente);

        jMenuCadTpEvento.setText("Tipo de Evento");
        jMenuCadTpEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadTpEventoActionPerformed(evt);
            }
        });
        menuCad.add(jMenuCadTpEvento);

        jMenuBar1.add(menuCad);

        menuCon.setText("Consultar");
        menuCon.add(jSeparator1);

        jMenuConsultTpEvento.setText("Tipo de Evento");
        jMenuConsultTpEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultTpEventoActionPerformed(evt);
            }
        });
        menuCon.add(jMenuConsultTpEvento);

        jMenuBar1.add(menuCon);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Menu");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        setVisible(false);
        FormCadCliente cadCli = new FormCadCliente();
        cadCli.setVisible(true);
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void jMenuCadTpEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadTpEventoActionPerformed
        setVisible(false);
        FormCadTipoEvento cad_tpEvento = new FormCadTipoEvento();
        cad_tpEvento.setVisible(true);
    }//GEN-LAST:event_jMenuCadTpEventoActionPerformed

    private void jMenuConsultTpEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultTpEventoActionPerformed
        setVisible(false);
        FormConsultaTipoEvento cons_tpEvento = new FormConsultaTipoEvento();
        cons_tpEvento.setVisible(true);
    }//GEN-LAST:event_jMenuConsultTpEventoActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadTpEvento;
    private javax.swing.JMenuItem jMenuConsultTpEvento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenu menuCon;
    private javax.swing.JMenuItem menuItemCliente;
    // End of variables declaration//GEN-END:variables
}
