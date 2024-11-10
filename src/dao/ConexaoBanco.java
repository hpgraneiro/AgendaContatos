
package dao;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class ConexaoBanco {
    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/contatodb";
    private static final String usuario = "root";
    private static final String senha = "";
    
    public static Connection abreConexao(){
        Connection con = null;
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, usuario, senha);
                    JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com banco de dados" + erro);
        }       
        return con;
    }
}
