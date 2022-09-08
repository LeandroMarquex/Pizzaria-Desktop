/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;

/**
 *
 * @author Leandro Marques
 */
public class Conexao {

    private final String URL = "jdbc:mysql://localhost:3306/dbinfoq";
    private final String Driver = "";
    private final String Usuario = "";
    private final String Senha = "";
    
    public Conexao(){
        
    }
    public Connection getConnection() {
        return null;
    }
}