package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Contato;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Contato {
    
    Conexao c = new Conexao();
    
    public void inserir(Contato contato) {
        try{
           c.conectar();
            PreparedStatement pst = c.con.prepareStatement("INSERT INTO tb_contato " +
                       "(id_tipo_contato, id_cliente, descricao, fg_ativo) VALUES (?,?,?,?)");
            pst.setInt(1, contato.getId_tipo_contato());
            pst.setInt(2, contato.getId_cliente());
            pst.setString(3, contato.getDescricao());
            pst.setBoolean(4, true);
            
            pst.execute();
            pst.close();
            
             System.out.println("Contato ok");
            c.FecharConexao();
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
}
