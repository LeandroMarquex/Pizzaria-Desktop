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
        return  0;
        
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
        return  0;
        
    }
     public void cadastrarPedido(String codigoCliente, String codigoFuncionario, String total){
         String SQLInsert = "insert into pedido(ped_cod, ped_data, ped_hora, ped_total, ped_cli_cod,ped_fun_cod, ped_ent_cod, ped_status_) values(?,?,?,?,?,?,?)";
     }

}
