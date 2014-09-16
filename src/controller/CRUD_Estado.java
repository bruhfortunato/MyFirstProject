package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;
import model.Estado;

public class CRUD_Estado extends Conexao{   
   
   public List listar(){
       
       List<Estado> listaEstado = new ArrayList<Estado>();
       try{
          PreparedStatement stmt = con.prepareStatement(
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

      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Estados", 0);
      }
      return listaEstado;
    }

   
     
}

