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

    public void pesquisaDeItens(String pesquisa, List<String> ListaDeItens) {
        try {
            String SQLPesquisa = "select * from cardapio where car_descricao like '%" + pesquisa + "%'";
            PreparedStatement st = Conexao.getConnection().prepareStatement(pesquisa);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                ListaDeItens.add(rs.getString("car_descricao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }

    }

}

