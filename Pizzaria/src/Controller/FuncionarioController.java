/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ClienteBeans;
import Beans.FuncionarioBeans;
import DAO.FuncionarioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leandro Marques
 */
public class FuncionarioController {
    
    FuncionarioDAO funcionarioD;
    
    public FuncionarioController(){
        funcionarioD = new FuncionarioDAO();
        
    }
    
    public boolean verificarDados(FuncionarioBeans funcionario){
        if(funcionario.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(funcionario.getCargo().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo CARGO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        
        funcionarioD.cadastrarFuncionario(funcionario);
         return true;
    }
     public boolean verificarDadosEditar(FuncionarioBeans funcionario){
        if(funcionario.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(funcionario.getCargo().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo CARGO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        
        funcionarioD.editarFuncionario(funcionario);
         return true;
    }
   
    public String controleDeCodigo() {
        return funcionarioD.proximoFuncionario();
    }
    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        funcionarioD.buscarFuncionario(pesquisa, modelo);
    }
    public FuncionarioBeans controlePreencherCampos(int codigo) {
        return funcionarioD.preencherCampos(codigo);
    }

}
