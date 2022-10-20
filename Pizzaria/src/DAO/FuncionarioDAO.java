/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ClienteBeans;
import Beans.FuncionarioBeans;
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
public class FuncionarioDAO {

    // ClienteBeans clientes;
    public FuncionarioDAO() {

        //    clientes = new ClienteBeans();
    }

    public void cadastrarFuncionario(FuncionarioBeans funcionario) {

        String SQLInsertion = "insert into funcionarios (fun_nome, fun_cargo, fun_data_cad) values (?,?,?)";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCargo());
            pst.setString(3, Corretores.ConverterParaSQL(funcionario.getDataCad()));

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso", "SALVO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao CADASTRAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void editarFuncionario(FuncionarioBeans funcionario) {

        String SQLInsertion = "update funcionarios set fun_nome = ?, fun_cargo = ?, fun_data_cad = ? where fun_cod = ?";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCargo());
            pst.setString(3, Corretores.ConverterParaSQL(funcionario.getDataCad()));
            pst.setInt(4, funcionario.getCodigo());

            pst.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Registro EDITADO com Sucesso", "EDITADO", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao EDITAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public String proximoFuncionario() {

        String SQLselection = "select * from funcionarios order by fun_cod desc limit 1 ";
        try {

            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("fun_cod")) + 1) + " ";
            } else {
                return "1";
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }

    public void buscarFuncionario(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLselection = "select * from funcionarios where fun_nome like '%" + pesquisa + "%'";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("fun_cod"), rs.getString("fun_nome"), rs.getString("fun_cargo"), Corretores.ConverterParaJava(rs.getString("fun_data_cad"))});

            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
    }

    public FuncionarioBeans preencherCampos(int codigo) {

        FuncionarioBeans funcionarios = new FuncionarioBeans();

        try {
            String SQLselection = "select * from funcionarios where fun_cod = ?";
            PreparedStatement ps = Conexao.getConnection().prepareStatement(SQLselection);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                funcionarios.setCodigo(rs.getInt("fun_cod"));
                funcionarios.setNome(rs.getString("fun_nome"));
                
                funcionarios.setCargo(rs.getString("fun_cargo"));
                
                funcionarios.setDataCad(Corretores.ConverterParaJava(rs.getString("fun_data_cad")));

            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));

        }
        return funcionarios;
    }
}
