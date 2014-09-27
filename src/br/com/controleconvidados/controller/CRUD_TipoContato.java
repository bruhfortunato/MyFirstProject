package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Tipo_Contato;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_TipoContato {
    Conexao c = new Conexao();
    
    List<Tipo_Contato> listaTipoContato = new ArrayList<Tipo_Contato>();

   public List listar(){
       
       try{
          c.conectar();
          PreparedStatement stmt = c.con.prepareStatement(
                "SELECT * FROM tb_tipo_contato " +
                "ORDER BY descricao");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

          Tipo_Contato tipo_contato = new Tipo_Contato();
          
          tipo_contato.setId_tipo_contato(rs.getInt("id_tipo_contato"));
          tipo_contato.setDescricao(rs.getString("descricao"));
          listaTipoContato.add(tipo_contato);
       }
        stmt.close();
        c.FecharConexao();

      }catch(SQLException e){
          
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Contatos", 0);
      }
      return listaTipoContato;
    }

   
    /*public int tipoContatoParaCodigo(String descricao){
    
        int codTipoContato=0;
    try {
        c.conectar();
        PreparedStatement stmt = c.con.prepareStatement(
                "SELECT id_tipo_contato "+
                "FROM tb_tipo_contato " +
                "WHERE descricao LIKE '?'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            codTipoContato = rs.getInt("id_tipo_contato");
        }
        stmt.close();;
   
        
    } catch (SQLException e){
          
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Contatos", 0);
    }
        return codTipoContato;
    
}*/
}
