package br.com.controleconvidados.view;

import br.com.controleconvidados.controller.CRUD_TipoLogradouro;
import br.com.controleconvidados.model.Tipo_Logradouro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormConsultaTipoLofradouro extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    List<Tipo_Logradouro> lista_tpLogradouro = new ArrayList<Tipo_Logradouro>();
    CRUD_TipoLogradouro crud_tpLogradouro = new CRUD_TipoLogradouro();
    String desc = "";
    
    public void limparTela() {
        jTextFieldDescricao.setText(null);
        jTextFieldTpLogradouro.setText(null);
        jTextFieldCodigo.setText(null);

    }

    public void preencherTabelaTodos() {
        modelo = (DefaultTableModel) jTableTipoLogradouro.getModel();
        modelo.setRowCount(0);

        try {
            modelo.setRowCount(0);
            lista_tpLogradouro = crud_tpLogradouro.listarDescricao();

            for (int i = 0; i < lista_tpLogradouro.size(); i++) {

                if (lista_tpLogradouro.get(i).isFg_ativo()) {

                    modelo.addRow(new Object[]{
                        lista_tpLogradouro.get(i).getId_tipo_logradouro(),
                        lista_tpLogradouro.get(i).getDescricao()

                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na busca" + e.getMessage());
        }
    }

    public void preencherTabelaDescricao() throws Exception {

        modelo = (DefaultTableModel) jTableTipoLogradouro.getModel();
        modelo.setRowCount(0);

        try {
            
            for (Tipo_Logradouro tpLogradouro : crud_tpLogradouro.listarPorNome(desc)) {
                modelo.setRowCount(0);
                Object linha[] = new Object[2];
                linha[0] = tpLogradouro.getId_tipo_logradouro();
                linha[1] = tpLogradouro.getDescricao();

                modelo.addRow(linha);

            };
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na busca" + e.getMessage());
        }
    }

    public FormConsultaTipoLofradouro() {

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
        jTableTipoLogradouro = new javax.swing.JTable();
        btnExibirTodos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTpLogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Tipo de Logradouro"));

        Descrição.setText("Descricao");

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413608667_search-16.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTableTipoLogradouro.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTableTipoLogradouro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTipoLogradouro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoLogradouroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTipoLogradouro);
        if (jTableTipoLogradouro.getColumnModel().getColumnCount() > 0) {
            jTableTipoLogradouro.getColumnModel().getColumn(0).setMinWidth(50);
            jTableTipoLogradouro.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnExibirTodos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExibirTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413608871_list-edit.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Descrição)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExibirTodos))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnExibirTodos)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar e Cadastrar"));

        jLabel1.setText("Tipo de Logradouro");

        jTextFieldTpLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTpLogradouroKeyReleased(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTpLogradouro)))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTpLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setRollover(true);

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413607705_plus_16.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setFocusable(false);
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrar);

        btnAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413607932_Refresh.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar);

        btnVoltar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413608197_eraser.png"))); // NOI18N
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

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413608271_Delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);

        btnVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/1413608415_go-back.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExibirTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirTodosActionPerformed

        preencherTabelaTodos();

    }//GEN-LAST:event_btnExibirTodosActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            desc = jTextFieldDescricao.getText();

            Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

            if ("".equals(jTextFieldDescricao.getText())) {
                modelo.setRowCount(0);
                JOptionPane.showMessageDialog(null, "A pesquisa não foi digitada!");
                limparTela();

            } else {

                if (desc.equals(crud_tpLogradouro.buscarTipoLogradouro(desc))) {
                    
                    modelo.setRowCount(0);
                    preencherTabelaDescricao();

                }else{
                   
                    JOptionPane.showMessageDialog(null, "Tipo de Logradouro não encontrado! ");
                    modelo.setRowCount(0);
                
                }
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jTableTipoLogradouroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoLogradouroMouseClicked
        int lin = jTableTipoLogradouro.getSelectedRow();
        jTextFieldCodigo.setText(jTableTipoLogradouro.getValueAt(lin, 0).toString());
        jTextFieldTpLogradouro.setText(jTableTipoLogradouro.getValueAt(lin, 1).toString());


    }//GEN-LAST:event_jTableTipoLogradouroMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {

            if (!"".equals(crud_tpLogradouro.buscarTipoLogradouro(jTextFieldTpLogradouro.getText()))) {
                
                Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

                tpLogradouro.setId_tipo_logradouro(Integer.parseInt(jTextFieldCodigo.getText()));
                tpLogradouro.setDescricao(jTextFieldTpLogradouro.getText());

                crud_tpLogradouro.alterarDescricao(tpLogradouro);

                limparTela();
                preencherTabelaTodos();

            } else {
                JOptionPane.showMessageDialog(this, "Tipo de Logradouro já existe !");
                limparTela();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jTextFieldTpLogradouroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTpLogradouroKeyReleased
        jTextFieldTpLogradouro.setText(jTextFieldTpLogradouro.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldTpLogradouroKeyReleased

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            
            Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

            tpLogradouro.setId_tipo_logradouro(Integer.parseInt(jTextFieldCodigo.getText()));
            tpLogradouro.setFg_ativo(false);

            crud_tpLogradouro.excluir(tpLogradouro);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        limparTela();
        preencherTabelaTodos();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        limparTela();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {

            
            Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

            String descricao = jTextFieldTpLogradouro.getText();
            int codigo = 0;
           
                if ("".equals(jTextFieldTpLogradouro.getText())) {
                    JOptionPane.showMessageDialog(null, "O tipo de logradouro não foi digitado!");
                    limparTela();
                    modelo.setRowCount(0);
                }
                else if (jTextFieldTpLogradouro.getText().equals(crud_tpLogradouro.buscarTipoLogradouro(descricao))) {
                     
                     tpLogradouro.setId_tipo_logradouro(crud_tpLogradouro.buscarCodigoPorDescricaoInativo(jTextFieldTpLogradouro.getText()));
                     tpLogradouro.setFg_ativo(true);
                     
                     crud_tpLogradouro.alterarFgAtivo(tpLogradouro);               
                } 
                
                else if (!jTextFieldTpLogradouro.getText().equals(crud_tpLogradouro.buscarTipoLogradouroInativos(descricao))) {
                    
                    tpLogradouro.setDescricao(jTextFieldTpLogradouro.getText());
                    tpLogradouro.setFg_ativo(true);

                    crud_tpLogradouro.inserir(tpLogradouro);
                    limparTela();
                    preencherTabelaTodos();
              }
                else {
                       JOptionPane.showMessageDialog(null, "Tipo de logradouro já existe! ");
                    }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
            preencherTabelaTodos();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped

    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

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
            java.util.logging.Logger.getLogger(FormConsultaTipoLofradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoLofradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoLofradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConsultaTipoLofradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConsultaTipoLofradouro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descrição;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
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
    private javax.swing.JTable jTableTipoLogradouro;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldTpLogradouro;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
