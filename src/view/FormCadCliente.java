
package view;

import controller.CRUD_Cidade;
import controller.CRUD_Cliente;
import controller.CRUD_Contato;
import controller.CRUD_Estado;
import controller.CRUD_TipoContato;
import controller.CRUD_TipoContato_Contato;
import controller.CRUD_TipoLogradouro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Cliente;
import model.Contato;
import model.Estado;
import model.TipoContato_Contato;
import model.Tipo_Contato;
import model.Tipo_Logradouro;


public class FormCadCliente extends javax.swing.JFrame {

    DefaultTableModel tabela = new DefaultTableModel();
    CRUD_Cliente crudCli = new CRUD_Cliente();
    CRUD_TipoContato_Contato crudTpc_contato = new CRUD_TipoContato_Contato();
    
    List<TipoContato_Contato> listaContatoTabela = new ArrayList<TipoContato_Contato>();
      
    public void preencherTabelaContato(String tipocontato, String contato){
        
    tabela = (DefaultTableModel) jTableContato.getModel();
                        
                
                tabela.addRow(new Object[]{
                    tipocontato, contato
                 });
                   
            }
    public FormCadCliente() {
        
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        buscarEstadosResidencial();
        buscarEstadosComercial();
        buscarTipoContato();
        buscarTipoLogradouro();
        
        jPanelEnderecoC.setVisible(false);
        jPanelEnderecoR.setVisible(false);
        jTextFieldEmail.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextCpfCNPJ = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanelContato = new javax.swing.JPanel();
        cBoxTipoContato = new javax.swing.JComboBox();
        btnADD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContato = new javax.swing.JTable();
        jFormatTextContato = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanelTipoEnd = new javax.swing.JPanel();
        rButtonResidencial = new javax.swing.JRadioButton();
        rButtonComercial = new javax.swing.JRadioButton();
        jPanelEnderecoR = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldEndereco1 = new javax.swing.JTextField();
        jTextFieldNum1 = new javax.swing.JTextField();
        jTextFieldNumApto1 = new javax.swing.JTextField();
        jTextFieldBairro1 = new javax.swing.JTextField();
        cBoxUF1 = new javax.swing.JComboBox();
        cBoxCidade1 = new javax.swing.JComboBox();
        cBoxTipoLogradouro1 = new javax.swing.JComboBox();
        cBoxComplemento1 = new javax.swing.JComboBox();
        jFormattedTextFieldCep1 = new javax.swing.JFormattedTextField();
        jPanelCli = new javax.swing.JPanel();
        rButtonFisica = new javax.swing.JRadioButton();
        rButtonJuridica = new javax.swing.JRadioButton();
        jPanelEnderecoC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setName("FrmCadCliente"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais"));

        jLabel2.setText("Cliente:");

        jTextFieldCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldClienteKeyPressed(evt);
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

        getContentPane().add(jPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 290, 160));

        btnSalvar.setText("Salvar Cliente");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, -1, -1));

        jPanelContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contato"));
        jPanelContato.setLayout(null);

        cBoxTipoContato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));
        cBoxTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTipoContatoActionPerformed(evt);
            }
        });
        jPanelContato.add(cBoxTipoContato);
        cBoxTipoContato.setBounds(16, 28, 160, 30);

        btnADD.setText("+");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanelContato.add(btnADD);
        btnADD.setBounds(360, 30, 41, 30);

        jTableContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Contato", "Contato"
            }
        ));
        jScrollPane1.setViewportView(jTableContato);
        if (jTableContato.getColumnModel().getColumnCount() > 0) {
            jTableContato.getColumnModel().getColumn(1).setMinWidth(140);
            jTableContato.getColumnModel().getColumn(1).setMaxWidth(140);
        }

        jPanelContato.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 320, 140);

        try {
            jFormatTextContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelContato.add(jFormatTextContato);
        jFormatTextContato.setBounds(200, 30, 140, 28);

        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyPressed(evt);
            }
        });
        jPanelContato.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(200, 30, 140, 30);

        getContentPane().add(jPanelContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 420, 250));

        jPanelTipoEnd.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Endereço"));

        buttonGroup2.add(rButtonResidencial);
        rButtonResidencial.setText("Residencial");
        rButtonResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonResidencialActionPerformed(evt);
            }
        });

        buttonGroup2.add(rButtonComercial);
        rButtonComercial.setText("Comercial");
        rButtonComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonComercialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoEndLayout = new javax.swing.GroupLayout(jPanelTipoEnd);
        jPanelTipoEnd.setLayout(jPanelTipoEndLayout);
        jPanelTipoEndLayout.setHorizontalGroup(
            jPanelTipoEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonResidencial)
                .addGap(53, 53, 53)
                .addComponent(rButtonComercial)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanelTipoEndLayout.setVerticalGroup(
            jPanelTipoEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoEndLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTipoEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButtonResidencial)
                    .addComponent(rButtonComercial))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanelTipoEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 290, 70));

        jPanelEnderecoR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço Residencial"));

        jLabel4.setText("Estado:");

        jLabel14.setText("Cidade:");

        jLabel15.setText("Endereço:");

        jLabel16.setText("Número:");

        jLabel17.setText("Complemento: ");

        jLabel18.setText("Apto:");

        jLabel19.setText("Bairro:");

        jLabel20.setText("CEP:");

        jTextFieldEndereco1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEndereco1KeyPressed(evt);
            }
        });

        jTextFieldNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNum1KeyPressed(evt);
            }
        });

        jTextFieldBairro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBairro1KeyPressed(evt);
            }
        });

        cBoxUF1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF" }));
        cBoxUF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxUF1ActionPerformed(evt);
            }
        });

        cBoxTipoLogradouro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));

        cBoxComplemento1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APARTAMENTO", "CASA" }));

        try {
            jFormattedTextFieldCep1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelEnderecoRLayout = new javax.swing.GroupLayout(jPanelEnderecoR);
        jPanelEnderecoR.setLayout(jPanelEnderecoRLayout);
        jPanelEnderecoRLayout.setHorizontalGroup(
            jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxTipoLogradouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCep1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxUF1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                        .addComponent(cBoxComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumApto1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelEnderecoRLayout.setVerticalGroup(
            jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoRLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxTipoLogradouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cBoxComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldNumApto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cBoxUF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(cBoxCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jTextFieldBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jFormattedTextFieldCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEnderecoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 900, 120));

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
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButtonFisica)
                    .addComponent(rButtonJuridica))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanelCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 290, 80));

        jPanelEnderecoC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço Comercial"));

        jLabel1.setText("Estado:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Endereço:");

        jLabel8.setText("Número:");

        jLabel9.setText("Complemento: ");

        jLabel10.setText("Apto:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("CEP:");

        jTextFieldEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEnderecoKeyPressed(evt);
            }
        });

        jTextFieldNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumActionPerformed(evt);
            }
        });

        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        cBoxUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF" }));
        cBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxUFActionPerformed(evt);
            }
        });

        cBoxTipoLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE" }));

        cBoxComplemento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APARTAMENTO", "CASA" }));

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelEnderecoCLayout = new javax.swing.GroupLayout(jPanelEnderecoC);
        jPanelEnderecoC.setLayout(jPanelEnderecoCLayout);
        jPanelEnderecoCLayout.setHorizontalGroup(
            jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoCLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumApto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoCLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelEnderecoCLayout.setVerticalGroup(
            jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoCLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxTipoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cBoxComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNumApto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEnderecoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 900, 130));

        setSize(new java.awt.Dimension(1055, 726));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        jPanelEnderecoC.setVisible(false);
        jPanelEnderecoR.setVisible(false);
        
        jFormattedTextCpfCNPJ.setValue(null);
        jFormatTextContato.setValue(null);
        jFormattedTextFieldCep.setValue(null);
        
        jTextFieldCliente.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldNum.setText(null);
        jTextFieldBairro.setText(null);
        jTextFieldNumApto.setText(null);
        
        cBoxTipoContato.setSelectedIndex(0);
        cBoxTipoLogradouro.setSelectedIndex(0);
        cBoxUF.setSelectedIndex(0);
        cBoxCidade.setSelectedIndex(0);
        cBoxComplemento.setSelectedIndex(0);
       
        buttonGroup1.clearSelection();
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
            jTextFieldEmail.setVisible(false);      
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
                 jTextFieldEmail.setVisible(false);
                 jFormatTextContato.setVisible(true);
                jFormatTextContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));  
           } catch (java.text.ParseException ex) {  
                 System.out.println(ex.getMessage());  
           }
       }
       if (cBoxTipoContato.getSelectedItem().toString().equalsIgnoreCase("E-MAIL")) {
           jFormatTextContato.setVisible(false);
           jTextFieldEmail.setVisible(true);
           
       }
    }//GEN-LAST:event_cBoxTipoContatoActionPerformed

    private void cBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxUFActionPerformed
        buscarCidadesComercial();
    }//GEN-LAST:event_cBoxUFActionPerformed

    private void cBoxUF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxUF1ActionPerformed
        buscarCidadesResidencial();
    }//GEN-LAST:event_cBoxUF1ActionPerformed

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

    private void rButtonComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonComercialActionPerformed
        jPanelEnderecoC.setVisible(true);
        jPanelEnderecoR.setVisible(true);
    }//GEN-LAST:event_rButtonComercialActionPerformed

    private void rButtonResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonResidencialActionPerformed
        jPanelEnderecoR.setVisible(true);
        jPanelEnderecoC.setVisible(false);
    }//GEN-LAST:event_rButtonResidencialActionPerformed

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
               (cBoxTipoContato.getSelectedItem().toString().equals("TELEFONE FIXO")) ||
               (cBoxTipoContato.getSelectedItem().toString().equals("TELEFONE MOVEL"))){
                
                tp_contato.setDescContato(jFormatTextContato.getText());
                //idTipoContato = tp_contato.getId_tipo_contato();
            }
            
            listaContatoTabela.add(tp_contato);
            
            preencherTabelaContato(tp_contato.getDescTipo(), tp_contato.getDescContato());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no cadastro de Contato");
        }
    }//GEN-LAST:event_btnADDActionPerformed
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        /*
        int id=0;
        
        try {
            Cliente cli = new Cliente();
          
          cli.setNome_cliente(jTextFieldCliente.getText());
          cli.setCpf_cnpj(jFormattedTextCpfCNPJ.getValue().toString());
          
          if(rButtonFisica.isSelected()){
              cli.setTipo_pessoa("FISICA");
          }
          if(rButtonJuridica.isSelected()){
              cli.setTipo_pessoa("JURIDICA");
          }
          
          CRUD_Cliente clienteCrud = new CRUD_Cliente();
          clienteCrud.inserir(cli);

          CRUD_TipoContato_Contato tpcContato_crud = new CRUD_TipoContato_Contato(); 
          List<TipoContato_Contato> listaTpcContato = tpcContato_crud.listar();
          
          //Popular a lista com as informações da tabela
          
          for ( int i=0; i < listaContatoTabela.size(); i++){
              
              Tipo_Contato t = new Tipo_Contato();
              String tpContato = listaDaTabela.get(i).getDescricao();
              int codTpContato = tipoContato_crud.tipoContatoParaCodigo(tpContato);
              
              t.setId_tipo_contato(codTpContato);
              t.setDescricao(listaDaTabela.get(i).getDescricao());
              
              tipoContato_crud.
          }
          for(int i = 0; i<listaContatoTabela.size(); i++){
              
              String tpContato = listaContatoTabela.get(i).getDescricao();
              System.out.println("descricao = " + tpContato);
              int codtpContato = tipoContato_crud.tipoContatoParaCodigo(tpContato);
              System.out.println("codTipoContato = " + codtpContato);
          }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Erro no cadastro de Contato");
        }
        
       */ 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jTextFieldClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldClienteKeyPressed
        jTextFieldCliente.setText(jTextFieldCliente.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldClienteKeyPressed

    private void jTextFieldEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyPressed
        jTextFieldEmail.setText(jTextFieldEmail.getText().toLowerCase());
    }//GEN-LAST:event_jTextFieldEmailKeyPressed

    private void jTextFieldEndereco1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEndereco1KeyPressed
        jTextFieldEndereco1.setText(jTextFieldEndereco1.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldEndereco1KeyPressed

    private void jTextFieldNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNum1KeyPressed
        jTextFieldNumApto1.setText(jTextFieldNumApto1.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldNum1KeyPressed

    private void jTextFieldBairro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBairro1KeyPressed
        jTextFieldBairro1.setText(jTextFieldBairro1.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldBairro1KeyPressed

    private void jTextFieldEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoKeyPressed
        jTextFieldEndereco.setText(jTextFieldEndereco.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldEnderecoKeyPressed

    private void jTextFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumActionPerformed
        jTextFieldNumApto.setText(jTextFieldNumApto.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldNumActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        jTextFieldBairro.setText(jTextFieldBairro.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldBairroActionPerformed
    
    public void buscarCidadesResidencial(){
        cBoxCidade1.removeAllItems();
        CRUD_Cidade cidadeC = new CRUD_Cidade();
        List<Cidade> listaCidade = new ArrayList<Cidade>();
        listaCidade = cidadeC.listar(cBoxUF1.getSelectedItem().toString());
        
        for(int i=0; i<listaCidade.size();i++){
             cBoxCidade1.addItem(listaCidade.get(i).getNome());
            }
        }
    public void buscarCidadesComercial(){
       
        cBoxCidade.removeAllItems();
        CRUD_Cidade cidadeC = new CRUD_Cidade();
        List<Cidade> listaCidade = new ArrayList<Cidade>();
        listaCidade = cidadeC.listar(cBoxUF.getSelectedItem().toString());
        
        for(int i=0; i<listaCidade.size();i++){
             cBoxCidade.addItem(listaCidade.get(i).getNome());
            }
        }
    
    public void buscarEstadosComercial(){

        CRUD_Estado estadoC = new CRUD_Estado();
        List<Estado> listaEstado = (List<Estado>)
        estadoC.listar();
        
        for(int i=0; i<listaEstado.size();i++){
            cBoxUF.addItem(listaEstado.get(i).getSigla());
       }
      }
    public void buscarEstadosResidencial(){

        CRUD_Estado estadoC = new CRUD_Estado();
        List<Estado> listaEstado = (List<Estado>)
        estadoC.listar();
        
        for(int i=0; i<listaEstado.size();i++){
            
            cBoxUF1.addItem(listaEstado.get(i).getSigla());
            
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
            
        cBoxTipoLogradouro1.addItem(listaTipoLogradouro.get(i).getDescricao());
        cBoxTipoLogradouro.addItem(listaTipoLogradouro.get(i).getDescricao());
        }
    }
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
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cBoxCidade;
    private javax.swing.JComboBox cBoxCidade1;
    private javax.swing.JComboBox cBoxComplemento;
    private javax.swing.JComboBox cBoxComplemento1;
    private javax.swing.JComboBox cBoxTipoContato;
    private javax.swing.JComboBox cBoxTipoLogradouro;
    private javax.swing.JComboBox cBoxTipoLogradouro1;
    private javax.swing.JComboBox cBoxUF;
    private javax.swing.JComboBox cBoxUF1;
    private javax.swing.JFormattedTextField jFormatTextContato;
    private javax.swing.JFormattedTextField jFormattedTextCpfCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCli;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelContato;
    private javax.swing.JPanel jPanelEnderecoC;
    private javax.swing.JPanel jPanelEnderecoR;
    private javax.swing.JPanel jPanelTipoEnd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContato;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldBairro1;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEndereco1;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNumApto;
    private javax.swing.JTextField jTextFieldNumApto1;
    private javax.swing.JRadioButton rButtonComercial;
    private javax.swing.JRadioButton rButtonFisica;
    private javax.swing.JRadioButton rButtonJuridica;
    private javax.swing.JRadioButton rButtonResidencial;
    // End of variables declaration//GEN-END:variables


    


}


