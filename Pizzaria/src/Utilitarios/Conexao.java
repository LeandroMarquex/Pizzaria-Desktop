/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.Driver;
//import org.gjt.mm.mysql.Driver;

/**
 *
 * @author Leandro Marques
 */
public class Conexao {

    private final String URL = "jdbc:mysql://localhost:3306/dbinfoq";
  //  private final String Driver = "com.mysql.jdbc.Driver;";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "root";
    private final String Senha = "";
    private static Connection Con;

    public Conexao() {
        try {

            Con = DriverManager.getConnection(URL, Usuario, Senha);
            Con.setAutoCommit(false);
         //   JOptionPane.showMessageDialog(null, "Conectado com Sucesso", "Conectado", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco", "Erro", 0);
        }

    }

    public static Connection getConnection() {

        if (Con == null) {
            new Conexao();
        }
        return Con;
    }

    public static void fecharConexao() {
        try {
            if (!Con.isClosed()) {
                Con.close();
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static void main(String args[]) {
        Conexao.getConnection();
    }
}
