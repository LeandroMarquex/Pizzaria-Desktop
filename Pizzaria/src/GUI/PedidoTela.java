/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Beans.ClienteBeans;
import Beans.PedidoBeans;
import Controller.ClienteController;
import Controller.PedidoController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Leandro Marques
 */
public class PedidoTela extends javax.swing.JInternalFrame {

    /**
     * Creates new form PedidoTela
     */
    ClienteBeans clienteB;
    ClienteController clienteC;
    PedidoBeans pedidoB;
    PedidoController pedidoC;
    List<String> lista;
    List<String> listaDeItens;
    DefaultTableModel modelo;

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;

    public PedidoTela() {
        initComponents();
        habilitarCampos(false);
        lista = new ArrayList<>();
        listaDeItens = new ArrayList<>();

        clienteB = new ClienteBeans();
        clienteC = new ClienteController();
        pedidoB = new PedidoBeans();
        pedidoC = new PedidoController();
        PainePedido.setEnabledAt(0, false);
        modelo = (DefaultTableModel)tabela_pedido.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainePedido = new javax.swing.JTabbedPane();
        painelCliente = new javax.swing.JPanel();
        btn_pesquisar = new javax.swing.JButton();
        cb_pesquisa_cliente = new javax.swing.JComboBox<>();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_telefone = new javax.swing.JTextField();
        PainelPedido = new javax.swing.JPanel();
        txt_nome_cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_item = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_selecionar_item = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_codigo_pedido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_adicionar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_valor_total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pedido = new javax.swing.JTable();
        btn_finalizar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        btn_valor_item = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("PEDIDO");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        cb_pesquisa_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquise um CLIENTE ao lado" }));
        cb_pesquisa_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pesquisa_clienteActionPerformed(evt);
            }
        });

        txt_codigo.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CÓDIGO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RUA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("BAIRRO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DATA");

        txt_data.setEditable(false);

        jButton1.setText("Pedido");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addComponent(btn_pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_pesquisa_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClienteLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelClienteLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 236, Short.MAX_VALUE))
                        .addGroup(painelClienteLayout.createSequentialGroup()
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(32, 32, 32)
                                    .addComponent(txt_nome))
                                .addGroup(painelClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(41, 41, 41)
                                    .addComponent(txt_rua)))
                            .addGap(39, 39, 39)))))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_pesquisa_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisar))
                .addGap(100, 100, 100)
                .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClienteLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        PainePedido.addTab("Clientes", painelCliente);

        txt_nome_cliente.setEditable(false);
        txt_nome_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Item");

        txt_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_itemMouseReleased(evt);
            }
        });
        txt_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemActionPerformed(evt);
            }
        });
        txt_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_itemKeyReleased(evt);
            }
        });

        jLabel8.setText("Selecionar");

        cb_selecionar_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Busque um item ao lado" }));
        cb_selecionar_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_selecionar_itemActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor");

        txt_valor.setEditable(false);

        jLabel10.setText("Quantidade");

        txt_quantidade.setText("1");
        txt_quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_quantidadeFocusLost(evt);
            }
        });
        txt_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Código");

        txt_codigo_pedido.setEditable(false);

        btn_adicionar.setText("+");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_remover.setText("-");

        btn_calcular.setText("Calcular");

        jLabel12.setText("Total");

        tabela_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Código Item", "Descrição", "Valor Unitário", "", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_pedido);

        btn_finalizar.setText("Finalizar");

        btn_fechar.setText("Fechar");

        btn_valor_item.setText("Valor");
        btn_valor_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valor_itemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelPedidoLayout = new javax.swing.GroupLayout(PainelPedido);
        PainelPedido.setLayout(PainelPedidoLayout);
        PainelPedidoLayout.setHorizontalGroup(
            PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPedidoLayout.createSequentialGroup()
                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(PainelPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome_cliente)
                            .addGroup(PainelPedidoLayout.createSequentialGroup()
                                .addComponent(btn_adicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_remover)
                                .addGap(125, 125, 125)
                                .addComponent(btn_calcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPedidoLayout.createSequentialGroup()
                                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_valor_item, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelPedidoLayout.createSequentialGroup()
                                        .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_selecionar_item, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PainelPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_codigo_pedido)))))))
                .addContainerGap())
            .addGroup(PainelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_finalizar)
                .addGap(85, 85, 85)
                .addComponent(btn_fechar)
                .addGap(28, 28, 28))
        );
        PainelPedidoLayout.setVerticalGroup(
            PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cb_selecionar_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_codigo_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_valor_item))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar)
                    .addComponent(btn_remover)
                    .addComponent(btn_calcular)
                    .addComponent(jLabel12)
                    .addComponent(txt_valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(PainelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finalizar)
                    .addComponent(btn_fechar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        PainePedido.addTab("Pedido", PainelPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PainePedido)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainePedido)
                .addContainerGap())
        );

        setBounds(200, 100, 616, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        // TODO add your handling code here:
        cb_pesquisa_cliente.removeAllItems();
        lista.clear();
        String pesquisa = JOptionPane.showInputDialog(null, "Digite o nome do cliente", "Pesquisar", 3);
        clienteC.controlePesquisa(pesquisa, lista);
        for (String i : lista) {
            cb_pesquisa_cliente.addItem(i);

        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void cb_pesquisa_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pesquisa_clienteActionPerformed
        // TODO add your handling code here:
        if (!(cb_pesquisa_cliente.getSelectedItem() == null)) {
            String cod = cb_pesquisa_cliente.getSelectedItem().toString();
            cod = cod.substring(0, cod.indexOf(" "));
            clienteB = clienteC.controlePreencherCampos(Integer.parseInt(cod));

            txt_codigo.setText(clienteB.getCodigo() + "");
            txt_nome.setText(clienteB.getNome() + "");
            txt_rua.setText(clienteB.getRua() + "");
            txt_bairro.setText(clienteB.getBairro() + "");
            txt_telefone.setText(clienteB.getTelefone() + "");
            txt_data.setText(clienteB.getDataCadastro() + "");
        }
    }//GEN-LAST:event_cb_pesquisa_clienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PainePedido.setEnabledAt(1, false);
        PainePedido.setEnabledAt(0, true);
        PainePedido.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemActionPerformed
        // TODO add your handling code here
        //  txt_valor.setText("");
        cb_selecionar_item.removeAllItems();
        listaDeItens.clear();
        pedidoC.controleDeItens(txt_item.getText(), listaDeItens);
        for (String i : listaDeItens) {
            cb_selecionar_item.addItem(i);
        }
    }//GEN-LAST:event_txt_itemActionPerformed

    private void txt_itemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_itemMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemMouseReleased

    private void txt_itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyReleased
        // TODO add your handling code here:
        txt_valor.setText(title);
        cb_selecionar_item.removeAllItems();
        listaDeItens.clear();
        pedidoC.controleDeItens(txt_item.getText(), listaDeItens);
        for (String i : listaDeItens) {
            cb_selecionar_item.addItem(i);
    }//GEN-LAST:event_txt_itemKeyReleased

    private void btn_valor_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valor_itemActionPerformed
        // TODO add your handling code here:
       txt_valor.setText(pedidoC.controleDeValor(cb_selecionar_item.getSelectedItem().toString()) + "");
       txt_codigo_pedido.setText(pedidoC.controleDeCodigo(cb_selecionar_item.getSelectedItem().toString()) + "");
    }//GEN-LAST:event_btn_valor_itemActionPerformed

    private void cb_selecionar_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_selecionar_itemActionPerformed
        // TODO add your handling code here:
        txt_valor.setText("");
        txt_quantidade.setText("1");
    }//GEN-LAST:event_cb_selecionar_itemActionPerformed

    private void txt_quantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_quantidadeFocusLost
        // TODO add your handling code here:
        try {
            int x = Integer.parseInt(txt_quantidade.getText());
            if (x==0) {
               JOptionPane.showMessageDialog(null, "A quantidade não pode ser 0 ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));  
               txt_quantidade.setText("1");
               txt_quantidade.requestFocus();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Insira um  número inteiro ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        
    }//GEN-LAST:event_txt_quantidadeFocusLost

    private void txt_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantidadeActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        // TODO add your handling code here:
        if(pedidoC.verificarItens(txt_valor.getText(), txt_codigo.getText(), cb_selecionar_item.getSelectedItem().toString(),txt_quantidade.getText()));
    }//GEN-LAST:event_btn_adicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PainePedido;
    private javax.swing.JPanel PainelPedido;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_valor_item;
    private javax.swing.JComboBox<String> cb_pesquisa_cliente;
    private javax.swing.JComboBox<String> cb_selecionar_item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JTable tabela_pedido;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigo_pedido;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nome_cliente;
    public static javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_valor;
    private javax.swing.JTextField txt_valor_total;
    // End of variables declaration//GEN-END:variables

    final void habilitarCampos(boolean valor) {

        //   txt_codigo.setText("");
        txt_nome.setEnabled(valor);
        txt_rua.setEnabled(valor);
        txt_bairro.setEnabled(valor);
        txt_telefone.setEnabled(valor);
        txt_data.setEnabled(valor);
    }
}
