/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ClienteBeans;
import DAO.ClienteDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leandro Marques
 */
public class ClienteController {
    
    ClienteDAO clienteD;
    
    public ClienteController(){
        clienteD = new ClienteDAO();
        
    }
    
    public boolean verificarDados(ClienteBeans cliente){
        if(cliente.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getBairro().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getRua().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo RUA ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getTelefone().equals("(  )      -    ")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo TELEFONE ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        clienteD.cadastrarCliente(cliente);
         return true;
    }
     public boolean verificarDadosEditar(ClienteBeans cliente){
        if(cliente.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getBairro().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo BAIRRO ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getRua().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo RUA ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(cliente.getTelefone().equals("(  )      -    ")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo TELEFONE ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        clienteD.editarCliente(cliente);
         return true;
    }
   
    public String controleDeCodigo() {
        return clienteD.proximoCliente();
    }
    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        clienteD.buscarCliente(pesquisa, modelo);
    }
    public void controlePesquisa(String pesquisa, List<String> lista) {
        clienteD.buscarCliente(pesquisa, lista);
    }
    public ClienteBeans controlePreencherCampos(int codigo) {
        return clienteD.preencherCampos(codigo);
    }

}
