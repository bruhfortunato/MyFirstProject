package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Estado;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Estado {   
   Conexao c = new Conexao();
   
   public List listar(){
       
       List<Estado> listaEstado = new ArrayList<Estado>();
       
       try{
           c.conectar();
          PreparedStatement stmt = c.con.prepareStatement(
                "SELECT * FROM tb_estado " +
                "ORDER BY sigla");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

          Estado estado = new Estado();
          
          estado.setId_estado(rs.getInt("id_estado"));
          estado.setNome_estado(rs.getString("nome_estado"));
          estado.setSigla(rs.getString("sigla"));
          listaEstado.add(estado);
       }
        stmt.close();
        c.FecharConexao();

      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Estados", 0);
      }
      return listaEstado;
    }


    public int buscarIdEstado(String siglaEstado){
    
        int codEstado=0;
    try {
        c.conectar();
        PreparedStatement stmt = c.con.prepareStatement(
                "SELECT id_estado_ "+
                "FROM tb_estado " +
                "WHERE sigla ILIKE '?'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            codEstado = rs.getInt("id_estado");
        }
        stmt.close();;
   
        
    } catch (SQLException e){
          
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cidade", 0);
    }
        return codEstado;
     
}

}