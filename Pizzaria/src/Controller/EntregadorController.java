/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.EntregadoresBeans;
import DAO.EntregadorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leandro Marques
 */
public class EntregadorController {
    
    EntregadorDAO entregadorD;
    
    public EntregadorController(){
        entregadorD = new EntregadorDAO();
        
    }
    
    public boolean verificarDados(EntregadoresBeans entregador){
        if(entregador.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        
        entregadorD.cadastrarEntregador(entregador);
         return true;
    }
     public boolean verificarDadosEditar(EntregadoresBeans entregador){
        if(entregador.getNome().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo NOME ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        if(entregador.getStatus().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha o campo STATUS ", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                        return false;
        }
        
        entregadorD.editarEntregador(entregador);
         return true;
    }
   
    public String controleDeCodigo() {
        return entregadorD.proximoEntregador();
    }
    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        entregadorD.buscarEntregador(pesquisa, modelo);
    }
    public EntregadoresBeans controlePreencherCampos(int codigo) {
        return entregadorD.preencherCampos(codigo);
    }

}
