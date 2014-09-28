package br.com.controleconvidados.controller;

import java.sql.*;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Endereco;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Endereco {
Conexao c = new Conexao();

     public void inserir (Endereco end){
         try{
             c.conectar();
             PreparedStatement pst = c.con.prepareStatement("INSERT INTO tb_endereco  " +
             "(id_cidade, id_tipo_logradouro, descricao, num, complemento, num_apto, bairro, cep, fg_ativo) "+
             "VALUES (?,?,?,?,?,?,?,?,?)");
            
             pst.setInt(1, end.getId_cidade());
             pst.setInt(2, end.getId_tipo_logradouro());
             pst.setString(3, end.getDescricao());
             pst.setInt(4, end.getNum());
             pst.setString(5, end.getComplemento());
             pst.setString(6, end.getNum_apto());
             pst.setString(7, end.getBairro());
             pst.setString(9, end.getCep());
             pst.setBoolean(8, true);
             
             pst.execute();
             pst.close();
             
             c.FecharConexao();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
         
    }
     
    public int buscarUltimoID(){
        c.conectar();
        
        int codEnd=0;
        try {
            PreparedStatement stmt = c.con.prepareStatement(" SELECT MAX(id_cliente) " +
                                                    "FROM tb_cliente");
            ResultSet rs = stmt.executeQuery();
            Endereco end = new Endereco();
            
            if(rs.next()){
              end.setId_endereco(rs.getInt(1));
              codEnd = end.getId_endereco();
            } 
            
        stmt.close();
        
        c.FecharConexao();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Endereco", 0);
        }
        return codEnd;
               
    }
     
        
    }
