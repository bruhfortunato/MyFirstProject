package br.com.controleconvidados.view;

import br.com.controleconvidados.controller.CRUD_Cidade;
import br.com.controleconvidados.controller.CRUD_Cliente;
import br.com.controleconvidados.controller.CRUD_Contato;
import br.com.controleconvidados.controller.CRUD_Endereco;
import br.com.controleconvidados.controller.CRUD_Estado;
import br.com.controleconvidados.controller.CRUD_TipoContato;
import br.com.controleconvidados.controller.CRUD_TipoContato_Contato;
import br.com.controleconvidados.controller.CRUD_TipoLogradouro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.controleconvidados.model.Cidade;
import br.com.controleconvidados.model.Cliente;
import br.com.controleconvidados.model.Contato;
import br.com.controleconvidados.model.Endereco;
import br.com.controleconvidados.model.Estado;
import br.com.controleconvidados.model.TipoContato_Contato;
import br.com.controleconvidados.model.Tipo_Contato;
import br.com.controleconvidados.model.Tipo_Logradouro;

public class FormCadCliente extends javax.swing.JFrame {

    //instanciando as classes e declarando variáveis 
    DefaultTableModel tabela = new DefaultTableModel();
    
    CRUD_Contato contato_crud = new CRUD_Contato();    
    Contato contato = new Contato();
    CRUD_Cliente crudCli = new CRUD_Cliente();
    CRUD_TipoContato_Contato tpContato_crud = new CRUD_TipoContato_Contato();
    CRUD_Endereco crudEnd = new CRUD_Endereco();
    CRUD_Cidade crudCidade = new CRUD_Cidade();
    CRUD_Estado crudEstado = new CRUD_Estado();
    CRUD_TipoLogradouro crudTpLogradouro = new CRUD_TipoLogradouro();
    
    int linha;
    
    
    //CRUD_Contato crudCont = new CRUD_Contato();
    
    List<TipoContato_Contato> listaContatoTabela = new ArrayList<TipoContato_Contato>();
    List<Contato> listaContatos = new ArrayList<Contato>();
    List<Cidade> listaCidade = new ArrayList<Cidade>();
    
    //utilizado para incluir a lista na tabela linha por linha
    public void preencherTabelaContato1(String tipocontato, String contato){ 
    tabela = (DefaultTableModel) jTableContato.getModel();
                tabela.addRow(new Object[]{
                      tipocontato, contato
                 });                  
                                 
            }
    
    //utilizado para excluir a linha inteira ou a lista toda
    public void preencherTabelaContato(List<TipoContato_Contato> listaContatoTabela){
        
    tabela = (DefaultTableModel) jTableContato.getModel();
    tabela.setRowCount(0);
              for(int i=0; i<listaContatoTabela.size(); i++)  {
                tabela.addRow(new Object[]{
                    listaContatoTabela.get(i).getDescTipo(),
                    listaContatoTabela.get(i).getDescContato()                    
                 });                  
              }                   
            }
 
    public FormCadCliente() {
        
        initComponents();
        
        //this.setExtendedState(MAXIMIZED_BOTH);
        
        jTextFieldEmail.setEnabled(false);
        
        cBoxComplemento.setSelectedIndex(1);
       
        jLabelAptoCom.setEnabled(false);
        jTextFieldNumApto.setEnabled(false);
        buscarEstados();
        buscarTipoLogradouro();
        buscarTipoContato();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextCpfCNPJ = new javax.swing.JFormattedTextField();
        jPanelContato = new javax.swing.JPanel();
        cBoxTipoContato = new javax.swing.JComboBox();
        btnADD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContato = new javax.swing.JTable();
        jFormatTextContato = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        btnSubt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelCli = new javax.swing.JPanel();
        rButtonFisica = new javax.swing.JRadioButton();
        rButtonJuridica = new javax.swing.JRadioButton();
        jPanelEndereco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelAptoCom = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldNumApto = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        cBoxUF = new javax.swing.JComboBox();
        cBoxCidade = new javax.swing.JComboBox();
        cBoxTipoLogradouro = new javax.swing.JComboBox();
        cBoxComplemento = new javax.swing.JComboBox();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setName("FrmCadCliente"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais"));

        jLabel2.setText("Cliente:");

        jTextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyReleased(evt);
            }
        });

        jLabel13.setText("CPF / CNPJ: ");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel3))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextCpfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextCpfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 290, 160));

        jPanelContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contato"));
        jPanelContato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cBoxTipoContato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        cBoxTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTipoContatoActionPerformed(evt);
            }
        });
        jPanelContato.add(cBoxTipoContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, 160, 30));

        btnADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/plus-circle.png"))); // NOI18N
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanelContato.add(btnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 50, 30));

        jTableContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Contato", "Contato"
            }
        ));
        jTableContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContato);
        if (jTableContato.getColumnModel().getColumnCount() > 0) {
            jTableContato.getColumnModel().getColumn(1).setMinWidth(140);
            jTableContato.getColumnModel().getColumn(1).setMaxWidth(140);
        }

        jPanelContato.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 320, 140));

        try {
            jFormatTextContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelContato.add(jFormatTextContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 28));

        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        jPanelContato.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 30));

        btnSubt.setText("Excluir ");
        btnSubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtActionPerformed(evt);
            }
        });
        jPanelContato.add(btnSubt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, 30));

        jButton1.setText("Excluir Tudo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelContato.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, 30));

        getContentPane().add(jPanelContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 470, 260));

        jPanelCli.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        buttonGroup1.add(rButtonFisica);
        rButtonFisica.setText("Física");
        rButtonFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonFisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rButtonJuridica);
        rButtonJuridica.setText("Jurídica");
        rButtonJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCliLayout = new javax.swing.GroupLayout(jPanelCli);
        jPanelCli.setLayout(jPanelCliLayout);
        jPanelCliLayout.setHorizontalGroup(
            jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonFisica)
                .addGap(54, 54, 54)
                .addComponent(rButtonJuridica)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanelCliLayout.setVerticalGroup(
            jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButtonFisica)
                    .addComponent(rButtonJuridica))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanelCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 290, 80));

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço"));

        jLabel1.setText("Estado:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Endereço:");

        jLabel8.setText("Número:");

        jLabel9.setText("Complemento: ");

        jLabelAptoCom.setText("Apto:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("CEP:");

        jTextFieldEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEnderecoKeyReleased(evt);
            }
        });

        jTextFieldNumApto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumAptoKeyReleased(evt);
            }
        });

        jTextFieldBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBairroKeyReleased(evt);
            }
        });

        cBoxUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF" }));
        cBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxUFActionPerformed(evt);
            }
        });

        cBoxTipoLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));

        cBoxComplemento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APE", "CASA" }));
        cBoxComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxComplementoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(cBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(cBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(cBoxTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(cBoxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAptoCom)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNumApto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBoxTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumApto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabelAptoCom))))
                .addGap(18, 18, 18)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 870, 150));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/tick.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalvar);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/plus.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovo);

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/controleconvidados/images/arrow-180.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVoltar);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpar();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        setVisible(false);
        FormMenu menu = new FormMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cBoxTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxTipoContatoActionPerformed
      jFormatTextContato.setValue(null);

      if (cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("CELULAR")){
            
      try {  
            jTextFieldEmail.setEnabled(false);      
            jFormatTextContato.setVisible(true);
            jFormatTextContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));  
           } catch (java.text.ParseException ex) {  
                 System.out.println(ex.getMessage());  
           }
       }
      if ((cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("TELEFONE COMERCIAL")) ||
          (cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("TELEFONE RESIDENCIAL")) ||
          (cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("FAX"))) {
      try {  
                 jTextFieldEmail.setEnabled(false);
                 jFormatTextContato.setVisible(true);
                 jFormatTextContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));  
           } catch (java.text.ParseException ex) {  
                 System.out.println(ex.getMessage());  
           }
       }
       if (cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("E-MAIL")) {
           jFormatTextContato.setVisible(false);
           jTextFieldEmail.setEnabled(true);
           
       }
    }//GEN-LAST:event_cBoxTipoContatoActionPerformed

    private void rButtonFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonFisicaActionPerformed
        if (rButtonFisica.isSelected()){
        
        jFormattedTextCpfCNPJ.setValue(null);
        
        try {  
                    jFormattedTextCpfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));  
                } catch (java.text.ParseException ex) {  
                 System.out.println(ex.getMessage());  
           }
       }
    }//GEN-LAST:event_rButtonFisicaActionPerformed

    private void rButtonJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonJuridicaActionPerformed
        if (rButtonJuridica.isSelected()){
        
            jFormattedTextCpfCNPJ.setValue(null);
            
            try {  
                    jFormattedTextCpfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));  
                } catch (java.text.ParseException ex) {  
                 System.out.println(ex.getMessage());  
           }
       }
    }//GEN-LAST:event_rButtonJuridicaActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        int idTipoContato; //
        try{
            CRUD_Contato crudC = new CRUD_Contato();
            TipoContato_Contato tp_contato = new TipoContato_Contato();
            
            tp_contato.setDescTipo(cBoxTipoContato.getSelectedItem().toString());
            tp_contato.setId_tipo_contato(cBoxTipoContato.getSelectedIndex());
            
            if(cBoxTipoContato.getSelectedItem().toString().equals("E-MAIL")){
                tp_contato.setDescContato(jTextFieldEmail.getText());
                //idTipoContato = tp_contato.getId_contato();
            }
            if((cBoxTipoContato.getSelectedItem().toString().equals("CELULAR")) ||
               (cBoxTipoContato.getSelectedItem().toString().equals("FAX")) ||
               (cBoxTipoContato.getSelectedItem().toString().equals("TELEFONE COMERCIAL")) ||
               (cBoxTipoContato.getSelectedItem().toString().equals("TELEFONE RESIDENCIAL"))){
                
                tp_contato.setDescContato(jFormatTextContato.getText());
                //idTipoContato = tp_contato.getId_tipo_contato();
            }
            
            listaContatoTabela.add(tp_contato);
            
            preencherTabelaContato1(tp_contato.getDescTipo(), tp_contato.getDescContato());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no cadastro de Contato");
        
    }   
        
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnSubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtActionPerformed
        listaContatoTabela.remove(linha); //removendo a linha selecionada
        preencherTabelaContato(listaContatoTabela);
         
    }//GEN-LAST:event_btnSubtActionPerformed

    private void jTableContatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContatoMouseClicked
        linha = jTableContato.getSelectedRow(); //pegando a linha selecionada
    }//GEN-LAST:event_jTableContatoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyReleased
        jTextFieldCliente.setText(jTextFieldCliente.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldClienteKeyReleased

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        jTextFieldEmail.setText(jTextFieldEmail.getText().toLowerCase());
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void cBoxComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxComplementoActionPerformed
        if (cBoxComplemento.getSelectedItem().toString().equalsIgnoreCase("APE")){
            jLabelAptoCom.setEnabled(true);
            jTextFieldNumApto.setEnabled(true);
        }
        if (cBoxComplemento.getSelectedItem().toString().equalsIgnoreCase("CASA")){
            jLabelAptoCom.setEnabled(false);
            jTextFieldNumApto.setEnabled(false);
        }
    }//GEN-LAST:event_cBoxComplementoActionPerformed

    private void cBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxUFActionPerformed
        buscarCidades();
    }//GEN-LAST:event_cBoxUFActionPerformed

    private void jTextFieldBairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBairroKeyReleased
        jTextFieldBairro.setText(jTextFieldBairro.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldBairroKeyReleased

    private void jTextFieldNumAptoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumAptoKeyReleased
        jTextFieldNumApto.setText(jTextFieldNumApto.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldNumAptoKeyReleased

    private void jTextFieldEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoKeyReleased
        jTextFieldEndereco.setText(jTextFieldEndereco.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldEnderecoKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    //Cadastro de Endereços
        try {
            String descTpLogradouro, nomeCidade;  // vai pegar da combo
            
            descTpLogradouro = cBoxTipoLogradouro.getSelectedItem().toString();
            nomeCidade = cBoxCidade.getSelectedItem().toString(); // pegando o nome
            
            Endereco end = new Endereco();
                       
            int codCidade = crudCidade.buscarIdCidade(nomeCidade); //retornando do metodo para o banco
            int codTpLogradouro = crudTpLogradouro.buscarIdTpLogradouro(descTpLogradouro);
                        
            end.setId_cidade(codCidade);
            end.setId_tipo_logradouro(codTpLogradouro);
            end.setDescricao(jTextFieldEndereco.getText());
            end.setNum(Integer.parseInt(jTextFieldNum.getText()));
            end.setComplemento(cBoxComplemento.getSelectedItem().toString());
            end.setNum_apto(jTextFieldNumApto.getText());
            end.setBairro(jTextFieldBairro.getText());
            end.setCep(jFormattedTextFieldCep.getValue().toString());
            end.setFg_ativo(true);
            
            crudEnd.inserir(end);
            System.out.println("Endereco ok");
        
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro no cadastro de Endereço");
        }
    
     //Cadastro de cliente
        try {
            Cliente cli = new Cliente();
            int idEnd = crudEnd.buscarUltimoID();
            
            cli.setId_endereco(idEnd);
            cli.setNome_cliente(jTextFieldCliente.getText());
            cli.setCpf_cnpj(jFormattedTextCpfCNPJ.getValue().toString());

            //escrever no TipoPessoa no BD o q foi selecionado
            if(rButtonFisica.isSelected()){
                cli.setTipo_pessoa("FISICA");
            }
            if(rButtonJuridica.isSelected()){
                cli.setTipo_pessoa("JURIDICA");
            }
            crudCli.inserir(cli);
            
            
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro de Cliente");
        }
        
        

  //Cadastro de Contatos
        try {
            for ( int i=0; i < listaContatoTabela.size(); i++){
                Contato contato = new Contato();
                // declarando o id_tipo_contato, pegando da lista
                int tpContato = listaContatoTabela.get(i).getId_tipo_contato();
                int idCli = crudCli.buscarUltimoID();
                String descContato = listaContatoTabela.get(i).getDescContato();
                
                contato.setId_tipo_contato(tpContato);
                contato.setId_cliente(idCli);
                contato.setDescricao(descContato);
                contato.setFg_ativo(true);
                contato_crud.inserir(contato);
                
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro do Contato");
        }
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    public void buscarCidades(){
       
        cBoxCidade.removeAllItems();
        CRUD_Cidade crudCidade = new CRUD_Cidade();
        List<Cidade> listaCidade = (List<Cidade>)
        crudCidade.listar(cBoxUF.getSelectedItem().toString());
        
        for(int i=0; i<listaCidade.size();i++){
             cBoxCidade.addItem(listaCidade.get(i).getNome());
            }
        }
    
    public void buscarEstados(){

        CRUD_Estado estadoC = new CRUD_Estado();
        List<Estado> listaEstado = (List<Estado>)
        estadoC.listar();
        
        for(int i=0; i<listaEstado.size();i++){
            cBoxUF.addItem(listaEstado.get(i).getSigla());
       }
      }
    
    public void buscarTipoContato(){
        
        CRUD_TipoContato tipoC = new CRUD_TipoContato();
        List<Tipo_Contato> listaTipoContato = (List<Tipo_Contato>)
        tipoC.listar();
        
        for(int i=0; i<listaTipoContato.size(); i++){
            
        cBoxTipoContato.addItem(listaTipoContato.get(i));
        }
    }
    

    public void buscarTipoLogradouro(){
        
        int id_logradouro;
        CRUD_TipoLogradouro tipoL = new CRUD_TipoLogradouro();
        List<Tipo_Logradouro> listaTipoLogradouro = (List < Tipo_Logradouro>)
        tipoL.listar();
        
        for(int i=0; i<listaTipoLogradouro.size(); i++){
            cBoxTipoLogradouro.addItem(listaTipoLogradouro.get(i).getDescricao());
        }
          
    }
    
    public void limparTabela(){
        listaContatoTabela.removeAll(listaContatoTabela); //apagando todos os dados
        preencherTabelaContato(listaContatoTabela);
    }
    
    public void limpar(){
                 
        jFormattedTextCpfCNPJ.setValue(null);
        jFormatTextContato.setValue(null);
        jFormattedTextFieldCep.setValue(null);
        
        jTextFieldCliente.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldNum.setText(null);
        jTextFieldBairro.setText(null);
        jTextFieldNumApto.setText(null);
        jTextFieldEmail.setText(null);
        
        cBoxTipoContato.setSelectedIndex(0);
        cBoxTipoLogradouro.setSelectedIndex(0);
        cBoxUF.setSelectedIndex(0);
        cBoxComplemento.setSelectedIndex(1);       
        limparTabela();
        buttonGroup1.clearSelection();
        }   
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSubt;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cBoxCidade;
    private javax.swing.JComboBox cBoxComplemento;
    private javax.swing.JComboBox cBoxTipoContato;
    private javax.swing.JComboBox cBoxTipoLogradouro;
    private javax.swing.JComboBox cBoxUF;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormatTextContato;
    private javax.swing.JFormattedTextField jFormattedTextCpfCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAptoCom;
    private javax.swing.JPanel jPanelCli;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelContato;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContato;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldNumApto;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rButtonFisica;
    private javax.swing.JRadioButton rButtonJuridica;
    // End of variables declaration//GEN-END:variables


    


}


