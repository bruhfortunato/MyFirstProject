package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Estado;

public class CRUD_Cidade extends Conexao{
    public List listar(String sigla){
         List<Cidade> listaCidade = new ArrayList<Cidade>();
 
         try{
             PreparedStatement stmt = con.prepareStatement("SELECT * " +
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

      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+ e.getMessage(), "Consulta de Cidades", 0);
      }
      return listaCidade;
    }

    @Override
    public void FecharConexao() {
        super.FecharConexao(); //To change body of generated methods, choose Tools | Templates.
    }
 
}
