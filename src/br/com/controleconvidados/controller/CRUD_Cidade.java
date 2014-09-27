package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Cidade;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Cidade {
    Conexao c = new Conexao();
 
    public List listar(String sigla){
         List<Cidade> listaCidade = new ArrayList<Cidade>();
         
         try{
         c.conectar();
             PreparedStatement stmt = c.con.prepareStatement("SELECT * " +
                                                       "FROM tb_estado e "+
                                                       "JOIN tb_cidade c ON (c.id_estado = e.id_estado) " +
                                                       "WHERE e.sigla = ? " +
                                                       "ORDER BY nome;");
             stmt.setString(1,sigla);
                  
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Cidade cidade = new Cidade();
            cidade.setId_cidade(rs.getInt("id_cidade"));
            cidade.setId_estado(rs.getInt("id_estado"));
            cidade.setNome(rs.getString("nome"));
            
            listaCidade.add(cidade);
           
             }
        stmt.close();
        c.FecharConexao();
        
      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+ e.getMessage(), "Consulta de Cidades", 0);
      }
      return listaCidade;
      
      
    }
        

    
}
