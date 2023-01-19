/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utilitarios.FundoTela;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Leandro Marques
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    // ALTERADO DA WEB 01/09/2022
    // ALTERADO DA NETBEANS 01/09/2022
    FundoTela tela;
    ClienteTela clienteTela;
    FuncionarioTela funcionarioTela;
    EntregadorTela entregadorTela;
    CardapioTela cardapioTela;
    PedidoTela pedidoTela;

    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("imagens/pizza-fundo.jpg");
        getContentPane().add(tela);

        menuCliente.setIcon(new ImageIcon("Imagens/ico_clientes.png"));
        menuFuncionarios.setIcon(new ImageIcon("Imagens/ico_func.png"));
        menuCardapio.setIcon(new ImageIcon("Imagens/ico_cardapio.png"));
        menuEntregador.setIcon(new ImageIcon("Imagens/ico_boy.png"));
        menuCadastro.setIcon(new ImageIcon("Imagens/inserir-32.png"));
        menuCaixa.setIcon(new ImageIcon("Imagens/ico_caixa.png"));
        menuRelatorio.setIcon(new ImageIcon("Imagens//ico_rel.png"));
        menuSair.setIcon(new ImageIcon("Imagens/ico_sair.png"));
        menuPedido.setIcon(new ImageIcon("Imagens/ico_pedidos.png"));

        ImageIcon icone = new ImageIcon("Imagens/ico_cardapio.png");
        setIconImage(icone.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuCardapio = new javax.swing.JMenuItem();
        menuEntregador = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuPedido = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PIZZARIA MARQUES");

        menuCadastro.setText("CADASTRO");

        menuCliente.setText("CLIENTES");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuFuncionarios.setText("FUNCIONÁRIOS");
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionarios);

        menuCardapio.setText("CARDÁPIO");
        menuCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCardapioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCardapio);

        menuEntregador.setText("ENTREGADOR");
        menuEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntregadorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEntregador);

        jMenuBar1.add(menuCadastro);

        menuCaixa.setText("CAIXA");

        menuPedido.setText("PEDIDO");
        menuPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidoActionPerformed(evt);
            }
        });
        menuCaixa.add(menuPedido);

        jMenuBar1.add(menuCaixa);

        menuRelatorio.setText("RELATÓRIO");
        jMenuBar1.add(menuRelatorio);

        menuSair.setText("SAIR");
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        setBounds(0, 0, 516, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
        clienteTela = new ClienteTela();
        tela.add(clienteTela);
        clienteTela.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidoActionPerformed
        // TODO add your handling code here:
        pedidoTela = new PedidoTela();
        tela.add(pedidoTela);
        pedidoTela.setVisible(true);
    }//GEN-LAST:event_menuPedidoActionPerformed

    private void menuEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntregadorActionPerformed
        // TODO add your handling code here:
        entregadorTela = new EntregadorTela();
        tela.add(entregadorTela);
        entregadorTela.setVisible(true);
    }//GEN-LAST:event_menuEntregadorActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        // TODO add your handling code here:
        funcionarioTela = new FuncionarioTela();
        tela.add(funcionarioTela);
        funcionarioTela.setVisible(true);


    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void menuCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCardapioActionPerformed
        // TODO add your handling code here:
        cardapioTela = new CardapioTela();
        tela.add(cardapioTela);
        cardapioTela.setVisible(true);
    }//GEN-LAST:event_menuCardapioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenuItem menuCardapio;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEntregador;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenuItem menuPedido;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
