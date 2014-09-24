package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Contato;
import model.Tipo_Logradouro;

public class CRUD_Contato extends Conexao{
    
    public void inserir(Contato contato, Integer id) {
        try{
            PreparedStatement pst = con.prepareStatement("INSERT INTO tb_contato " +
                       "(id_tipo_contato, id_cliente, descricao, fg_ativo) VALUES (?,?,?,?)");
            pst.setInt(1, contato.getId_tipo_contato());
            pst.setInt(2, id);
            pst.setString(3, contato.getDescricao());
            pst.setBoolean(4, true);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro OK", "", 1);
            pst.close();
            super.FecharConexao();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
}
