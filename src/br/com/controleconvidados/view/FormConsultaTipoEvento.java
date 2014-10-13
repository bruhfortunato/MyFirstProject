package br.com.controleconvidados.view;

import br.com.controleconvidados.controller.CRUD_TipoEvento;
import br.com.controleconvidados.model.TipoEvento;
import br.com.controleconvidados.utils.Conexao;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormConsultaTipoEvento extends javax.swing.JFrame {
   DefaultTableModel modelo = new DefaultTableModel();
   List<TipoEvento> lista_tpEvento = new ArrayList<TipoEvento>();
   CRUD_TipoEvento crud_tpEvento = new CRUD_TipoEvento();
   String descricao =  "";
             
   public void limparTela(){
       jTextFieldDescricao.setText(null);
        jTextFieldTpEvento.setText(null);
        jTextFieldCodigo.setText(null);
        
   }
   
    public void preencherTabelaTodos(){
        modelo = (DefaultTableModel) jTableTipoEvento.getModel();
        modelo.setRowCount(0);
        
        try {
            lista_tpEvento = crud_tpEvento.listarDescricao();
                
                for(int i = 0; i<lista_tpEvento.size(); i++){
                
                if(lista_tpEvento.get(i).isFg_ativo()){
                
                    modelo.addRow(new Object[]{
                    lista_tpEvento.get(i).getId_tipo_evento(),
                    lista_tpEvento.get(i).getDescricao()
                    
                    });
                }}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na busca" + e.getMessage());
    }
    }
    
    public void preencherTabelaDescricao() {
        
        modelo = (DefaultTableModel) jTableTipoEvento.getModel();
        modelo.setRowCount(0);
                    
        try {
                   
            for(TipoEvento tpEvento : crud_tpEvento.listarPorNome(descricao)){
                if (tpEvento.isFg_ativo()){
                    Object linha[] = new Object[2];
                    linha[0] = tpEvento.getId_tipo_evento();
                    linha[1] = tpEvento.getDescricao();
                     
                    modelo.addRow(linha);
                    
                }}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na busca" + e.getMessage());
        }
    }
                    
    public FormConsultaTipoEvento() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Descrição = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoEvento = new javax.swing.JTable();
        btnExibirTodos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTpEvento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnAlterar = new javax.swing.JButton();
        btnVoltar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Tipo de Evento"));

        Descrição.setText("Descricao");

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/magnifier.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTableTipoEvento.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTableTipoEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ));
        jTableTipoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoEventoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTipoEvento);
        if (jTableTipoEvento.getColumnModel().getColumnCount() > 0) {
            jTableTipoEvento.getColumnModel().getColumn(0).setMinWidth(50);
            jTableTipoEvento.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnExibirTodos.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        btnExibirTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/Pesquisar.png"))); // NOI18N
        btnExibirTodos.setText("Exibir Todos");
        btnExibirTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Descrição)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addGap(39, 39, 39)
                        .addComponent(btnExibirTodos)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descrição)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExibirTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));

        jLabel1.setText("Tipo de Evento");

        jTextFieldTpEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTpEventoKeyReleased(evt);
            }
        });

        jLabel2.setText("Codigo");

        jTextFieldCodigo.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTpEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTpEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setRollover(true);

        btnAlterar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/tick.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar);

        btnVoltar1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/edit-clear.png"))); // NOI18N
        btnVoltar1.setText("Limpar");
        btnVoltar1.setFocusable(false);
        btnVoltar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVoltar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVoltar1);

        btnExcluir.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/cross-circle.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);

        btnVoltar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVoltar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        setVisible(false);
        FormMenu menu = new FormMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExibirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirTodosActionPerformed
        preencherTabelaTodos();
    }//GEN-LAST:event_btnExibirTodosActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
    descricao = jTextFieldDescricao.getText();
       
            if(!"".equals(crud_tpEvento.buscarTipoEvento(descricao))){
            System.out.println("Tipo de Evento Encontrado !");
           
            preencherTabelaDescricao();
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de evento não encontrado! ");
        }         
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jTableTipoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoEventoMouseClicked
        int lin = jTableTipoEvento.getSelectedRow();
        jTextFieldCodigo.setText(jTableTipoEvento.getValueAt(lin, 0).toString());
        jTextFieldTpEvento.setText(jTableTipoEvento.getValueAt(lin, 1).toString());
            

    }//GEN-LAST:event_jTableTipoEventoMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
        
        if(!"".equals(crud_tpEvento.buscarTipoEvento(jTextFieldTpEvento.getText()))){
            JOptionPane.showMessageDialog(this, "Tipo de Evento já existe !");
            limparTela();
        } else {
            TipoEvento tpEvento = new TipoEvento();
        
        tpEvento.setId_tipo_evento(Integer.parseInt(jTextFieldCodigo.getText()));
        tpEvento.setDescricao(jTextFieldTpEvento.getText());
        
        crud_tpEvento.alterar(tpEvento);
        
        limparTela();
        preencherTabelaTodos();
       }
        
       }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
     }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jTextFieldTpEventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTpEventoKeyReleased
        jTextFieldTpEvento.setText(jTextFieldTpEvento.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldTpEventoKeyReleased

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
    
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       try {
        TipoEvento tpEvento = new TipoEvento();
        
        tpEvento.setId_tipo_evento(Integer.parseInt(jTextFieldCodigo.getText()));
        tpEvento.setFg_ativo(false);
        
        crud_tpEvento.excluir(tpEvento);
        
        
        
       }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
       limparTela();
       preencherTabelaTodos();
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        limparTela();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormConsultaTipoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsultaTipoEvento().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descrição;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExibirTodos;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoEvento;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldTpEvento;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
