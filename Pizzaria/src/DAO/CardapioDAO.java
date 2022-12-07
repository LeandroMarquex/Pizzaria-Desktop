/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.CardapioBeans;
import Beans.CardapioBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Leandro Marques
 */
public class CardapioDAO {

    // CardapioBeans clientes;
    public CardapioDAO() {

        //    clientes = new CardapioBeans();
    }

    public void cadastrarCardapio(CardapioBeans cardapio) {

        String SQLInsertion = "insert into cardapio (car_descricao, car_tipo, car_valor) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, cardapio.getDescricao());
            pst.setString(2, cardapio.getTipo());
            pst.setDouble(3, cardapio.getValor());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "SALVO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao CADASTRAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void editarCardapio(CardapioBeans cardapio) {

        String SQLInsertion = "update cardapio set car_descricao = ?, car_tipo = ?, car_valor = ? where car_cod = ?";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, cardapio.getDescricao());
            pst.setString(2, cardapio.getTipo());
            pst.setDouble(3, cardapio.getValor());
            pst.setInt(4, cardapio.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro EDITADO com Sucesso", "EDITADO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao EDITAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public String proximoCardapio() {

        String SQLselection = "select * from cardapio order by car_cod desc limit 1 ";
        try {

            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("car_cod")) + 1) + " ";
            } else {
                return "1";
            }

        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarCardapio(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLselection = "select * from cardapio where car_descricao like '%" + pesquisa + "%'";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("car_cod"), rs.getString("car_descricao"), rs.getString("car_tipo"), rs.getString("car_valor")});

            }

        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
    }

    public CardapioBeans preencherCampos(int codigo) {

        CardapioBeans cardapio = new CardapioBeans();

        try {
            String SQLselection = "select * from cardapio where car_cod = ?";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cardapio.setCodigo(rs.getInt("car_cod"));
                cardapio.setDescricao(rs.getString("car_descricao"));
                
                cardapio.setTipo(rs.getString("car_tipo"));
                
                cardapio.setValor(rs.getDouble("car_valor"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return cardapio;
    }
}
