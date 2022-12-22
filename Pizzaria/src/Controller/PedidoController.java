/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.PedidoDAO;
import java.util.List;

/**
 *
 * @author Leandro Marques
 */
public class PedidoController {
    
    PedidoDAO pedidoD;
    
    public PedidoController() {
        pedidoD = new PedidoDAO();
    }
    
    public void controleDeItens(String pesquisa, List<String>ListaDeItens) {
        pedidoD.pesquisaDeItens(pesquisa, ListaDeItens);
    }
    
}
