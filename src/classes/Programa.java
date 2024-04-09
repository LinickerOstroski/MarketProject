package classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Programa extends javax.swing.JFrame {

    List<Cliente> clientes = new ArrayList<Cliente>();
    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
    List<Categorias> categorias = new ArrayList<Categorias>();

    public Programa() {
        initComponents();
        jcb_comboBoxCategorias1.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        btn_cadastrarCliente = new javax.swing.JButton();
        txt_nomeCliente = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        txt_idadeCliente = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        txt_cpfCliente = new javax.swing.JTextField();
        txt_sexoCliente = new javax.swing.JTextField();
        txt_enderecoCliente = new javax.swing.JTextField();
        txt_telefoneCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_numeroEnderecoCliente = new javax.swing.JTextField();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lbl_nomeFornecedor = new javax.swing.JLabel();
        txt_nomeFornecedor = new javax.swing.JTextField();
        lbl_idadeFornecedor = new javax.swing.JLabel();
        txt_idadeFornecedor = new javax.swing.JTextField();
        lbl_cpfFornecedor = new javax.swing.JLabel();
        txt_cpfFornecedor = new javax.swing.JTextField();
        txt_enderecoFornecedor = new javax.swing.JTextField();
        lbl_enderecoFornecedor = new javax.swing.JLabel();
        txt_sexoFornecedor = new javax.swing.JTextField();
        lbl_sexoFornecedor = new javax.swing.JLabel();
        txt_numeroEnderecoFornecedor = new javax.swing.JTextField();
        lbl_numero = new javax.swing.JLabel();
        txt_telefoneFornecedor = new javax.swing.JTextField();
        lbl_telefone = new javax.swing.JLabel();
        btn_cadastrarFornecedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcb_comboBoxCategorias1 = new javax.swing.JComboBox<>();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomeCategoria = new javax.swing.JTextField();
        btn_cadastrarCategoria = new javax.swing.JButton();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_areaClientes = new javax.swing.JTextArea();
        btn_atualizarLista = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_atualizaFornecedores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_areaFornecedores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));

        lbl1.setText("Nome do cliente:");

        btn_cadastrarCliente.setText("Cadastrar");
        btn_cadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarClienteMouseClicked(evt);
            }
        });
        btn_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarClienteActionPerformed(evt);
            }
        });

        txt_nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeClienteActionPerformed(evt);
            }
        });

        lbl2.setText("Idade (anos):");

        lbl3.setText("CPF:");

        lbl4.setText("Sexo:");

        lbl5.setText("Endereço:");

        lbl6.setText("Telefone:");

        jLabel1.setText("n°");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl2)
                                    .addComponent(txt_idadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cpfCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl3)
                                        .addGap(0, 313, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl4)
                                    .addComponent(txt_sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_enderecoCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl5)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(96, 96, 96))
                                    .addComponent(txt_numeroEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_cadastrarCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl2)
                    .addComponent(lbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(lbl5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numeroEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCliente)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Aba - Cadastrar Cliente", jPanel1);

        jTabbedPane3.addTab("Cadastrar Cliente", jTabbedPane6);

        lbl_nomeFornecedor.setText("Nome do fornecedor:");

        txt_nomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeFornecedorActionPerformed(evt);
            }
        });

        lbl_idadeFornecedor.setText("Idade (anos):");

        lbl_cpfFornecedor.setText("CPF:");

        lbl_enderecoFornecedor.setText("Endereço:");

        lbl_sexoFornecedor.setText("Sexo:");

        lbl_numero.setText("n°");

        lbl_telefone.setText("Telefone:");

        btn_cadastrarFornecedor.setText("Cadastrar");
        btn_cadastrarFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarFornecedorMouseClicked(evt);
            }
        });

        jLabel3.setText("Categoria fornecida:");

        jcb_comboBoxCategorias1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_comboBoxCategorias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_comboBoxCategorias1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbl_telefone)
                                .addGap(215, 215, 215)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_telefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_comboBoxCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nomeFornecedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_idadeFornecedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbl_cpfFornecedor)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_cpfFornecedor)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sexoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_sexoFornecedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_enderecoFornecedor)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lbl_enderecoFornecedor)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_numeroEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_numero))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrarFornecedor)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nomeFornecedor)
                    .addComponent(lbl_idadeFornecedor)
                    .addComponent(lbl_cpfFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sexoFornecedor)
                    .addComponent(lbl_enderecoFornecedor)
                    .addComponent(lbl_numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sexoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_enderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numeroEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefone)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_comboBoxCategorias1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btn_cadastrarFornecedor)
                .addContainerGap())
        );

        jTabbedPane7.addTab("Aba - Cadastrar Fornecedor", jPanel3);

        jTabbedPane3.addTab("Cadastrar Fornecedor", jTabbedPane7);
        jTabbedPane3.addTab("Cadastrar Funcionario", jTabbedPane8);

        jLabel2.setText("Nome da categoria:");

        btn_cadastrarCategoria.setText("Cadastrar");
        btn_cadastrarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarCategoriaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(501, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCategoria)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCategoria)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Aba - Cadastro de Categoria", jPanel4);

        jTabbedPane1.addTab("Cadastrar Categoria", jTabbedPane5);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jTabbedPane9.addTab("Aba - Cadastro de Produto", jPanel5);

        jTabbedPane1.addTab("Cadastrar Produto", jTabbedPane9);

        jTabbedPane3.addTab("Cadastrar Produtos", jTabbedPane1);

        jTabbedPane2.addTab("Cadastrar ", jTabbedPane3);

        txt_areaClientes.setColumns(20);
        txt_areaClientes.setRows(5);
        jScrollPane1.setViewportView(txt_areaClientes);

        btn_atualizarLista.setText("Atualizar Lista");
        btn_atualizarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atualizarListaMouseClicked(evt);
            }
        });
        btn_atualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizarLista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizarLista)
                .addGap(7, 7, 7))
        );

        jTabbedPane4.addTab("Clientes", jPanel2);

        btn_atualizaFornecedores.setText("Atualizar Lista");
        btn_atualizaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atualizaFornecedoresMouseClicked(evt);
            }
        });

        txt_areaFornecedores.setColumns(20);
        txt_areaFornecedores.setRows(5);
        jScrollPane2.setViewportView(txt_areaFornecedores);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizaFornecedores)
                .addGap(7, 7, 7))
        );

        jTabbedPane4.addTab("Fornecedores", jPanel7);

        jTabbedPane2.addTab("Visualizar", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeClienteActionPerformed

    }//GEN-LAST:event_txt_nomeClienteActionPerformed

    private void btn_cadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteMouseClicked
        String nome, cpf, sexo, endereco, telefone, numero;
        int idade;

        if (!"".equals(txt_nomeCliente.getText()) && !"".equals(txt_cpfCliente.getText()) && !"".equals(txt_enderecoCliente.getText()) && !"".equals(txt_sexoCliente.getText())
                && !"".equals(txt_telefoneCliente.getText()) && !"".equals(txt_idadeCliente.getText()) && !"".equals(txt_numeroEnderecoCliente.getText())) {

            nome = txt_nomeCliente.getText();
            cpf = txt_cpfCliente.getText();
            endereco = txt_enderecoCliente.getText() + " " + txt_numeroEnderecoCliente.getText();
            sexo = txt_sexoCliente.getText();
            telefone = txt_telefoneCliente.getText();

            try {
                idade = Integer.parseInt(txt_idadeCliente.getText());
                Cliente novoCliente = new Cliente(nome, idade, cpf, sexo, endereco, telefone);
                clientes.add(novoCliente);
                JOptionPane.showMessageDialog(this,
                "Cliente cadastrado!",
                "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter idade. Certifique-se de inserir um número válido.");
            }

        } else {
            JOptionPane.showMessageDialog(this,
                "Informe os campos!",
                "Alerta",
                JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_cadastrarClienteMouseClicked

    private void btn_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cadastrarClienteActionPerformed

    private void txt_nomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeFornecedorActionPerformed

    private void btn_cadastrarFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarFornecedorMouseClicked
        String nome, cpf, endereco, sexo, telefone, categoria;
        int idade;
        Categorias cat = null;

        if (!"".equals(txt_nomeFornecedor.getText()) && !"".equals(txt_cpfFornecedor.getText()) && !"".equals(txt_enderecoFornecedor.getText()) && !"".equals(txt_sexoFornecedor.getText())
                && !"".equals(txt_telefoneFornecedor.getText()) && !"".equals(txt_idadeFornecedor.getText()) && !"".equals(txt_telefoneFornecedor.getText())) {

            nome = txt_nomeFornecedor.getText();
            cpf = txt_cpfFornecedor.getText();
            endereco = txt_enderecoFornecedor.getText();
            sexo = txt_sexoFornecedor.getText();
            categoria = (String) jcb_comboBoxCategorias1.getSelectedItem();
            telefone = txt_telefoneFornecedor.getText();

            for (Categorias c : categorias) {
                if (c.getTipoCategoria().equals(categoria)) {
                    cat = c;
                    break;
                }
            }

            try {
                idade = Integer.parseInt(txt_idadeFornecedor.getText());
                Fornecedor novoFornecedor = new Fornecedor(nome, idade, cpf, sexo, endereco, telefone, cat);
                fornecedor.add(novoFornecedor);
                JOptionPane.showMessageDialog(this,
                "Fornecedor cadastrado!",
                "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter idade. Certifique-se de inserir um número válido.");
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Informe os campos!",
                    "Alerta",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastrarFornecedorMouseClicked

    private void btn_cadastrarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarCategoriaMouseClicked
        String categoria = txt_nomeCategoria.getText();

        Categorias novaCategoria = new Categorias(categoria);

        categorias.add(novaCategoria);
        
        JOptionPane.showMessageDialog(this,
                "Categoria cadastrada!",
                "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE);

        jcb_comboBoxCategorias1.removeAllItems();

        for (Categorias c : categorias) {
            jcb_comboBoxCategorias1.addItem(c.getTipoCategoria());
        }
    }//GEN-LAST:event_btn_cadastrarCategoriaMouseClicked

    private void jcb_comboBoxCategorias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_comboBoxCategorias1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_comboBoxCategorias1ActionPerformed

    private void btn_atualizarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atualizarListaMouseClicked
        String texto;
        texto = clientes.toString();
        txt_areaClientes.setText(texto);
    }//GEN-LAST:event_btn_atualizarListaMouseClicked

    private void btn_atualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atualizarListaActionPerformed

    private void btn_atualizaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atualizaFornecedoresMouseClicked
        String text;
        text = fornecedor.toString();
        txt_areaFornecedores.setText(text);
    }//GEN-LAST:event_btn_atualizaFornecedoresMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizaFornecedores;
    private javax.swing.JButton btn_atualizarLista;
    private javax.swing.JButton btn_cadastrarCategoria;
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JButton btn_cadastrarFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JComboBox<String> jcb_comboBoxCategorias1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl_cpfFornecedor;
    private javax.swing.JLabel lbl_enderecoFornecedor;
    private javax.swing.JLabel lbl_idadeFornecedor;
    private javax.swing.JLabel lbl_nomeFornecedor;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_sexoFornecedor;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JTextArea txt_areaClientes;
    private javax.swing.JTextArea txt_areaFornecedores;
    private javax.swing.JTextField txt_cpfCliente;
    private javax.swing.JTextField txt_cpfFornecedor;
    private javax.swing.JTextField txt_enderecoCliente;
    private javax.swing.JTextField txt_enderecoFornecedor;
    private javax.swing.JTextField txt_idadeCliente;
    private javax.swing.JTextField txt_idadeFornecedor;
    private javax.swing.JTextField txt_nomeCategoria;
    private javax.swing.JTextField txt_nomeCliente;
    private javax.swing.JTextField txt_nomeFornecedor;
    private javax.swing.JTextField txt_numeroEnderecoCliente;
    private javax.swing.JTextField txt_numeroEnderecoFornecedor;
    private javax.swing.JTextField txt_sexoCliente;
    private javax.swing.JTextField txt_sexoFornecedor;
    private javax.swing.JTextField txt_telefoneCliente;
    private javax.swing.JTextField txt_telefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
