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
             pst.setString(8, end.getCep());
             pst.setBoolean(9, true);
             
             pst.execute();
             pst.close();
             
             c.FecharConexao();
             System.out.println("Endereco ok");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
         
    }
     
    public int buscarUltimoID(){
        c.conectar();
        
        int codEnd=0;
        try {
            PreparedStatement stmt = c.con.prepareStatement(" SELECT MAX(id_endereco) " +
                                                    "FROM tb_endereco");
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            codEnd= rs.getInt(1);        
            Endereco end = new Endereco();
            
        stmt.close();
        
        c.FecharConexao();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Endereco", 0);
        }
        return codEnd;
               
    }
     
        
    }
