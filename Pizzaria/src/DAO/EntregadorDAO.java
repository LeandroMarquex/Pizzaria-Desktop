/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.EntregadoresBeans;
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

/**
 *
 * @author Leandro Marques
 */
public class EntregadorDAO {

    // ClienteBeans clientes;
    public EntregadorDAO() {

        //    clientes = new ClienteBeans();
    }

    public void cadastrarEntregador(EntregadoresBeans entregador) {

        String SQLInsertion = "insert into entregador (ent_nome, ent_status, ent_data_cad) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, entregador.getNome());
            pst.setString(2, "Livre");
            pst.setString(3, Corretores.ConverterParaSQL(entregador.getDataCadastro()));

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "SALVO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao CADASTRAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void editarEntregador(EntregadoresBeans entregador) {

       //  String SQLInsertion = "update entregador set ent_nome = ?, ent_satus = ?, ent_data_cad = ? where ent_cod = ?";
        String SQLInsertion = "update entregador set ent_nome = ? where ent_cod = ?";
       try {
            
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, entregador.getNome());
      //      pst.setString(2, entregador.getStatus());
       //     pst.setString(3, Corretores.ConverterParaSQL(entregador.getDataCadastro()));
            pst.setInt(2, entregador.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro EDITADO com Sucesso", "EDITADO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao EDITAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public String proximoEntregador() {

        String SQLselection = "select * from entregador order by ent_cod desc limit 1 ";
        try {

            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("ent_cod")) + 1) + " ";
            } else {
                return "1";
            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarEntregador(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLselection = "select * from entregador where ent_nome like '%" + pesquisa + "%'";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("ent_cod"), rs.getString("ent_nome"), rs.getString("ent_status"), Corretores.ConverterParaJava(rs.getString("ent_data_cad"))});

            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
    }

    public EntregadoresBeans preencherCampos(int codigo) {

        EntregadoresBeans entregador = new EntregadoresBeans();

        try {
            String SQLselection = "select * from entregador where ent_cod = ?";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                entregador.setCodigo(rs.getInt("ent_cod"));
                entregador.setNome(rs.getString("ent_nome"));
                
                entregador.setStatus(rs.getString("ent_status"));
                
                entregador.setDataCadastro(Corretores.ConverterParaJava(rs.getString("ent_data_cad")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return entregador;
    }
}
