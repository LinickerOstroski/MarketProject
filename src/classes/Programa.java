package classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Programa extends javax.swing.JFrame {

    List<Cliente> clientes = new ArrayList<Cliente>();
    List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
    List<Categorias> categorias = new ArrayList<Categorias>();
    List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    List<Produto> produtos = new ArrayList<Produto>();

    public Programa() {
        initComponents();
        jcb_comboBoxCategorias1.removeAllItems();
        jcb_comboBoxCategorias2.removeAllItems();
        jcb_comboBoxClientes1.removeAllItems();
        jcb_comboBoxProdutos1.removeAllItems();
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
        jPanel6 = new javax.swing.JPanel();
        lbl7 = new javax.swing.JLabel();
        txt_nomeFuncionario = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        txt_idadeFuncionario = new javax.swing.JTextField();
        lbl9 = new javax.swing.JLabel();
        txt_cpfFuncionario = new javax.swing.JTextField();
        lbl10 = new javax.swing.JLabel();
        txt_enderecoFuncionario = new javax.swing.JTextField();
        txt_sexoFuncionario = new javax.swing.JTextField();
        lbl11 = new javax.swing.JLabel();
        txt_numeroEnderecoFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telefoneFuncionario = new javax.swing.JTextField();
        lbl12 = new javax.swing.JLabel();
        btn_cadastrarFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_salarioMensal = new javax.swing.JTextField();
        txt_funcaoFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomeCategoria = new javax.swing.JTextField();
        btn_cadastrarCategoria = new javax.swing.JButton();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcb_comboBoxCategorias2 = new javax.swing.JComboBox<>();
        txt_nomeProduto = new javax.swing.JTextField();
        txt_precoProduto = new javax.swing.JTextField();
        txt_marcaProduto = new javax.swing.JTextField();
        btn_cadastraProduto = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcb_comboBoxClientes1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcb_comboBoxProdutos1 = new javax.swing.JComboBox<>();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_areaClientes = new javax.swing.JTextArea();
        btn_atualizarLista = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_atualizaFornecedores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_areaFornecedores = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_areaFuncionarios = new javax.swing.JTextArea();
        btn_atualizarFuncionarios = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_areaProdutos = new javax.swing.JTextArea();
        btn_atualizarProdutos = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

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

        lbl2.setText("Idade:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCliente)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Dados do cliente:", jPanel1);

        jTabbedPane3.addTab("Cadastrar Cliente", jTabbedPane6);

        lbl_nomeFornecedor.setText("Nome do fornecedor:");

        txt_nomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeFornecedorActionPerformed(evt);
            }
        });

        lbl_idadeFornecedor.setText("Idade:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btn_cadastrarFornecedor)
                .addContainerGap())
        );

        jTabbedPane7.addTab("Dados do fornecedor:", jPanel3);

        jTabbedPane3.addTab("Cadastrar Fornecedor", jTabbedPane7);

        lbl7.setText("Nome do funcionario:");

        txt_nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeFuncionarioActionPerformed(evt);
            }
        });

        lbl8.setText("Idade:");

        lbl9.setText("CPF:");

        lbl10.setText("Endereço:");

        lbl11.setText("Sexo:");

        jLabel4.setText("n°");

        lbl12.setText("Telefone:");

        btn_cadastrarFuncionario.setText("Cadastrar");
        btn_cadastrarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarFuncionarioMouseClicked(evt);
            }
        });

        jLabel5.setText("Salário Mensal:");

        jLabel6.setText("Função principal do funcionário:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl8)
                            .addComponent(txt_idadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cpfFuncionario)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl9)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl11)
                            .addComponent(txt_sexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_enderecoFuncionario)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(96, 96, 96))
                            .addComponent(txt_numeroEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cadastrarFuncionario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_telefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_salarioMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbl12)
                                .addGap(207, 207, 207)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 78, Short.MAX_VALUE))
                            .addComponent(txt_funcaoFuncionario))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(lbl8)
                    .addComponent(lbl9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl11)
                    .addComponent(lbl10)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_enderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numeroEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl12)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salarioMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_funcaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btn_cadastrarFuncionario)
                .addContainerGap())
        );

        jTabbedPane8.addTab("Dados do funcionário:", jPanel6);

        jTabbedPane3.addTab("Cadastrar Funcionário", jTabbedPane8);

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cadastrarCategoria))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 489, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(btn_cadastrarCategoria)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Dados da categoria:", jPanel4);

        jTabbedPane1.addTab("Cadastrar Categoria", jTabbedPane5);

        jLabel7.setText("Nome do produto:");

        jLabel8.setText("Preço:");

        jLabel9.setText("Marca:");

        jLabel10.setText("Categoria:");

        jcb_comboBoxCategorias2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_cadastraProduto.setText("Cadastrar");
        btn_cadastraProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastraProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txt_precoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jcb_comboBoxCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cadastraProduto)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_marcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_comboBoxCategorias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btn_cadastraProduto)
                .addContainerGap())
        );

        jTabbedPane9.addTab("Dados do produto:", jPanel5);

        jTabbedPane1.addTab("Cadastrar Produto", jTabbedPane9);

        jTabbedPane3.addTab("Cadastrar Produtos", jTabbedPane1);

        jLabel12.setText("Selecione o produto):");

        jLabel13.setText("Selecione o cliente, se cadastrado(plus):");

        jcb_comboBoxClientes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Total da compra: ");

        jButton1.setText("Finalizar Venda");

        jcb_comboBoxProdutos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jcb_comboBoxProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jcb_comboBoxClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_comboBoxProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_comboBoxClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Realizar Venda", jPanel10);

        jTabbedPane2.addTab("Cadastrar ", jTabbedPane3);

        txt_areaClientes.setColumns(20);
        txt_areaClientes.setRows(5);
        jScrollPane1.setViewportView(txt_areaClientes);

        btn_atualizarLista.setText("Atualizar");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizarLista)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jTabbedPane4.addTab("Clientes", jPanel2);

        btn_atualizaFornecedores.setText("Atualizar");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizaFornecedores)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jTabbedPane4.addTab("Fornecedores", jPanel7);

        txt_areaFuncionarios.setColumns(20);
        txt_areaFuncionarios.setRows(5);
        jScrollPane3.setViewportView(txt_areaFuncionarios);

        btn_atualizarFuncionarios.setText("Atualizar");
        btn_atualizarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atualizarFuncionariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizarFuncionarios)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Funcionários", jPanel8);

        txt_areaProdutos.setColumns(20);
        txt_areaProdutos.setRows(5);
        jScrollPane4.setViewportView(txt_areaProdutos);

        btn_atualizarProdutos.setText("Atualizar");
        btn_atualizarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atualizarProdutosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_atualizarProdutos)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atualizarProdutos)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Produtos", jPanel9);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jLabel11.setText("Produtos em estoque:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 590, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Estoque", jPanel11);

        jTabbedPane2.addTab("Visualizar", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                && !"".equals(txt_telefoneFornecedor.getText()) && !"".equals(txt_idadeFornecedor.getText()) && !"".equals(txt_telefoneFornecedor.getText()) && jcb_comboBoxCategorias1.getItemCount() != 0) {

            nome = txt_nomeFornecedor.getText();
            cpf = txt_cpfFornecedor.getText();
            endereco = txt_enderecoFornecedor.getText() + " " + txt_numeroEnderecoFornecedor.getText();
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
        jcb_comboBoxCategorias2.removeAllItems();

        for (Categorias c : categorias) {
            jcb_comboBoxCategorias1.addItem(c.getTipoCategoria());
        }

        for (Categorias c : categorias) {
            jcb_comboBoxCategorias2.addItem(c.getTipoCategoria());
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

    private void txt_nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeFuncionarioActionPerformed

    private void btn_cadastrarFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarFuncionarioMouseClicked
        String nome, cpf, sexo, endereco, telefone, numero, funcao;
        int idade;
        double salario;

        if (!"".equals(txt_nomeFuncionario.getText()) && !"".equals(txt_cpfFuncionario.getText()) && !"".equals(txt_enderecoFuncionario.getText()) && !"".equals(txt_sexoFuncionario.getText())
                && !"".equals(txt_telefoneFuncionario.getText()) && !"".equals(txt_idadeFuncionario.getText()) && !"".equals(txt_numeroEnderecoFuncionario.getText())) {

            nome = txt_nomeFuncionario.getText();
            cpf = txt_cpfFuncionario.getText();
            endereco = txt_enderecoFuncionario.getText() + " " + txt_numeroEnderecoFuncionario.getText();
            sexo = txt_sexoFuncionario.getText();
            telefone = txt_telefoneFuncionario.getText();

            funcao = txt_funcaoFuncionario.getText();

            try {
                idade = Integer.parseInt(txt_idadeFuncionario.getText());
                salario = Double.parseDouble(txt_salarioMensal.getText());
                Funcionarios novoFuncionario = new Funcionarios(nome, idade, cpf, sexo, endereco, telefone, funcao, salario);
                funcionarios.add(novoFuncionario);
                JOptionPane.showMessageDialog(this,
                        "Funcionário cadastrado!",
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


    }//GEN-LAST:event_btn_cadastrarFuncionarioMouseClicked

    private void btn_atualizarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atualizarFuncionariosMouseClicked
        String texto;
        texto = funcionarios.toString();
        txt_areaFuncionarios.setText(texto);
    }//GEN-LAST:event_btn_atualizarFuncionariosMouseClicked

    private void btn_cadastraProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastraProdutoMouseClicked
        String nome, marca, categoria;
        double preco;
        Categorias cat = null;
        categoria = (String) jcb_comboBoxCategorias1.getSelectedItem();

        for (Categorias c : categorias) {
            if (c.getTipoCategoria().equals(categoria)) {
                cat = c;
                break;
            }
        }
        nome = txt_nomeProduto.getText();
        marca = txt_marcaProduto.getText();
        try {
            preco = Double.parseDouble(txt_precoProduto.getText());
            Produto novoProduto = new Produto(cat, nome, marca, preco);
            produtos.add(novoProduto);

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Cadastro de Produto", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter o preço. Insira um valor numérico válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastraProdutoMouseClicked

    private void btn_atualizarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atualizarProdutosMouseClicked

        String texto;
        texto = produtos.toString();
        txt_areaProdutos.setText(texto);

    }//GEN-LAST:event_btn_atualizarProdutosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizaFornecedores;
    private javax.swing.JButton btn_atualizarFuncionarios;
    private javax.swing.JButton btn_atualizarLista;
    private javax.swing.JButton btn_atualizarProdutos;
    private javax.swing.JButton btn_cadastraProduto;
    private javax.swing.JButton btn_cadastrarCategoria;
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JButton btn_cadastrarFornecedor;
    private javax.swing.JButton btn_cadastrarFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcb_comboBoxCategorias1;
    private javax.swing.JComboBox<String> jcb_comboBoxCategorias2;
    private javax.swing.JComboBox<String> jcb_comboBoxClientes1;
    private javax.swing.JComboBox<String> jcb_comboBoxProdutos1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl_cpfFornecedor;
    private javax.swing.JLabel lbl_enderecoFornecedor;
    private javax.swing.JLabel lbl_idadeFornecedor;
    private javax.swing.JLabel lbl_nomeFornecedor;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_sexoFornecedor;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JTextArea txt_areaClientes;
    private javax.swing.JTextArea txt_areaFornecedores;
    private javax.swing.JTextArea txt_areaFuncionarios;
    private javax.swing.JTextArea txt_areaProdutos;
    private javax.swing.JTextField txt_cpfCliente;
    private javax.swing.JTextField txt_cpfFornecedor;
    private javax.swing.JTextField txt_cpfFuncionario;
    private javax.swing.JTextField txt_enderecoCliente;
    private javax.swing.JTextField txt_enderecoFornecedor;
    private javax.swing.JTextField txt_enderecoFuncionario;
    private javax.swing.JTextField txt_funcaoFuncionario;
    private javax.swing.JTextField txt_idadeCliente;
    private javax.swing.JTextField txt_idadeFornecedor;
    private javax.swing.JTextField txt_idadeFuncionario;
    private javax.swing.JTextField txt_marcaProduto;
    private javax.swing.JTextField txt_nomeCategoria;
    private javax.swing.JTextField txt_nomeCliente;
    private javax.swing.JTextField txt_nomeFornecedor;
    private javax.swing.JTextField txt_nomeFuncionario;
    private javax.swing.JTextField txt_nomeProduto;
    private javax.swing.JTextField txt_numeroEnderecoCliente;
    private javax.swing.JTextField txt_numeroEnderecoFornecedor;
    private javax.swing.JTextField txt_numeroEnderecoFuncionario;
    private javax.swing.JTextField txt_precoProduto;
    private javax.swing.JTextField txt_salarioMensal;
    private javax.swing.JTextField txt_sexoCliente;
    private javax.swing.JTextField txt_sexoFornecedor;
    private javax.swing.JTextField txt_sexoFuncionario;
    private javax.swing.JTextField txt_telefoneCliente;
    private javax.swing.JTextField txt_telefoneFornecedor;
    private javax.swing.JTextField txt_telefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
