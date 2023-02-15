/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro Marques
 */
public class PedidoDAO {

    PedidoDAO pedidoD;

    public void pesquisaDeItens(String pesquisa, List<String> listaDeItens) {
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao like '%" + pesquisa + "%'";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                listaDeItens.add(rs.getString("car_descricao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }

    }

    public double valorDoItem(String pesquisa) {
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, pesquisa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getDouble("car_valor");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return 0;

    }

    public int valorDoCodigo(String pesquisa) {
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            st.setString(1, pesquisa);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("car_cod");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return 0;

    }

//    public void cadastrarPedido(String ped_cod, String ped_data, String ped_hora, String ped_total, String ped_cli_cod, String ped_fun_cod, String ped_ent_cod, String ped_status) {
           public void cadastrarPedido(String ped_cod, String ped_total, String ped_cli_cod ) {
        Date data = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        try {
            String SQLInsert = "insert into pedidos(ped_cod, ped_data, ped_hora, ped_total, ped_cli_cod, ped_fun_cod, ped_ent_cod, ped_status) values(?,?,?,?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsert);
            st.setString(1, ped_cod);
            st.setString(2, formatoData.format(data));
            st.setString(3, formatoHora.format(data));
            st.setString(4, ped_total.replace(',', '.'));
            st.setString(5, ped_cli_cod);
            st.setString(6, "1");
            st.setString(7, "2");
            st.setString(8, "Pedido Aberto");

            st.execute();
            codigoPedido();
            Conexao.getConnection().commit();
            
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "SALVO", 1, new ImageIcon("Imagens/ok.png"));
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "ERRO", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
     public String codigoPedido(){
         String cod = "0";
         
          try {
            String SQLSelection = "select ped_cod from pedidos order by ped_cod desc limit 1 ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
             ResultSet rs = st.executeQuery();
            if (rs.next()) {
                cod = rs.getString("ped_cod");
                JOptionPane.showMessageDialog(null, cod, "ERRO", 0, new ImageIcon("Imagens/btn_sair.png"));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Erro ao PESQUISAR registro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return cod;
     }
}
