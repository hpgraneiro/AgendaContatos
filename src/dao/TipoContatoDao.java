
package dao;

import dao.ConexaoBanco;
import interfaces.InterfaceDao;
import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.TipoContatoModelo;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class TipoContatoDao implements InterfaceDao{
    String sql;
    PreparedStatement stm; 
    ResultSet resultado;

    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];
        if(tcm.getId()== 0){
            sql = "INSERT INTO tipo_contato (descricao) VALUES (?)";
        }else{
            sql = "UPDATE tipo_contato SET descricao=? WHERE id_tipo_contato=?";
        }
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql); 
            stm.setString(1, tcm.getDescricao());
            if(tcm.getId() > 0) stm.setInt(2, tcm.getId());
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Registro gravado.");
        } catch (Exception e) {
        }
    }

    @Override
    public void excluirDao(int id) {
        sql = "DELETE FROM * tipo_contato WHERE id=?";
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql); 
            stm.setInt(1, id);
            stm.execute();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar excluir o registro."+ e);
        }
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        
        DefaultTableModel tabela = (DefaultTableModel) valor[1];
        
        sql = "SELECT * FROM tipo_contato";
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);
        resultado = stm.executeQuery();
        
        while (resultado.next()){
            tabela.addRow(
                new Object[] {
                    resultado.getInt("id"),
                    resultado.getString("descricao")
                }
            );
        }
        stm.close();
    }

    public void carregarDao(JComboBox itens) throws SQLException {
    
    }

    @Override
    public void carregarComboBoxDao(JComboBox itens) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

