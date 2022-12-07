/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CardapioBeans;
import DAO.CardapioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leandro Marques
 */
public class CardapioController {

    CardapioDAO cardapioD;

    public CardapioController() {
        cardapioD = new CardapioDAO();

    }

    public boolean verificarDados(CardapioBeans cardapio) {
        if (cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DESCRIÇÃO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (cardapio.getTipo().equals("Selecione um item")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TIPO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Digite o  VALOR ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        cardapioD.cadastrarCardapio(cardapio);
        return true;
    }

    public boolean verificarDadosEditar(CardapioBeans cardapio) {
        if (cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo DESCRIÇÃO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (cardapio.getTipo().equals("Selecione um item")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo TIPO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        if (cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Digite VALOR ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }

        cardapioD.editarCardapio(cardapio);
        return true;
    }

    public String controleDeCodigo() {
        return cardapioD.proximoCardapio();
    }

    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        cardapioD.buscarCardapio(pesquisa, modelo);
    }

    public CardapioBeans controlePreencherCampos(int codigo) {
        return cardapioD.preencherCampos(codigo);
    }

}
