package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Endereco;

public class CRUD_Endereco extends Conexao{
    public void buscarLogradouro(){
         
     }
     public void inserir (Endereco end){
         try{
             PreparedStatement pst = con.prepareStatement("INSERT INTO tb_endereco  " +
             "(id_cidade, id_tipo_logradouro, descricao, num, complemento, bairro, cep, fg_ativo, num_apto) "+
             "VALUES (?,?,?,?,?,?,?,?,?)");
            
             pst.setInt(1, end.getId_cidade());
             pst.setInt(2, end.getId_tipo_logradouro());
             pst.setString(3, end.getDescricao());
             pst.setInt(4, end.getNum());
             pst.setString(5, end.getComplemento());
             pst.setString(6, end.getBairro());
             pst.setString(7, end.getCep());
             pst.setBoolean(8, true);
             pst.setString(9, end.getNum_apto());
             
             pst.execute();
             pst.close();
             super.FecharConexao();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
     
        
    }
