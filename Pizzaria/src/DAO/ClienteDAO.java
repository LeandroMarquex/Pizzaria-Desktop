/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ClienteBeans;
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
public class ClienteDAO {

    public ClienteDAO() {

    }

    public void cadastrarCliente(ClienteBeans cliente) {

        String SQLInsertion = "insert into clientes (cli_nome, cli_rua, cli_bairro, cli_telefone, cli_data_cad) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getRua());
            pst.setString(3, cliente.getBairro());
            pst.setString(4, cliente.getTelefone());
            pst.setString(5, Corretores.ConverterParaSQL(cliente.getDataCadastro()));

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "SALVO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao CADASTRAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public String proximoCliente() {

        String SQLselection = "select * from clientes order by cli_cod desc limit 1 ";
        try {

            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("cli_cod")) + 1) + " ";
            } else {
                return "1";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarCliente(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLselection = "select * from clientes where cli_nome like '%" + pesquisa + "%'";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[] {rs.getString("cli_cod"), rs.getString("cli_nome"), rs.getString("cli_rua"), rs.getString("cli_bairro"), rs.getString("cli_telefone")});
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
    }

}
