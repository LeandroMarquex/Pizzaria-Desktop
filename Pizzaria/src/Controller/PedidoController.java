/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PedidoDAO;
import GUI.PedidoTela;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro Marques
 */
public class PedidoController {

    PedidoDAO pedidoD;

    public PedidoController() {
        pedidoD = new PedidoDAO();
    }

    public void controleDeItens(String pesquisa, List<String> ListaDeItens) {
        pedidoD.pesquisaDeItens(pesquisa, ListaDeItens);
    }

    public double controleDeValor(String pesquisa) {
        return pedidoD.valorDoItem(pesquisa);
    }

    public int controleDeCodigo(String pesquisa) {
        return pedidoD.valorDoCodigo(pesquisa);
    }

    public boolean verificarItens2(String valor, String codigo, String item, String quantidade) {
        if (valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo VALOR ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CODIGO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (item.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo ITEM ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        //    if (quantidade.equals("")) {
        try {
            int x = Integer.parseInt(quantidade);
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "A quantidade não pode ser 0 ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                PedidoTela.txt_quantidade.setText("1");
                PedidoTela.txt_quantidade.grabFocus();

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Insira um  número inteiro ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            PedidoTela.txt_quantidade.setText("1");
            PedidoTela.txt_quantidade.grabFocus();
        }

        //      }
        return true;
    }

    public boolean verificarItens(String Valor, String Quantidade, String Codigo, String Item) {

        try {
            int x = Integer.parseInt(Quantidade);
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "A quantidade não pode ser 0", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                PedidoTela.txt_quantidade.setText("1");
                PedidoTela.txt_quantidade.grabFocus();
            }
        } catch (NumberFormatException Ex) {
            JOptionPane.showMessageDialog(null, "Insira um número inteiro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            PedidoTela.txt_quantidade.setText("1");
            PedidoTela.txt_quantidade.grabFocus();
        }

        if (Quantidade.equals("")) {
            // JOptionPane.showMessageDialog(null, "Preencha o campo Quantidade", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Código", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        if (Item.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        return true;
    }

    public void controleDePedido(String ped_cod, String ped_total, String ped_cli_cod ) {
        pedidoD.cadastrarPedido(ped_cod, ped_total, ped_cli_cod);
    }
}
