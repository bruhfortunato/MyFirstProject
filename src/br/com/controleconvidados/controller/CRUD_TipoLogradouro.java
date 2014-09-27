package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Tipo_Logradouro;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_TipoLogradouro{
   Conexao c = new Conexao();
   
   public List listar(){
       
       List<Tipo_Logradouro> listaTipoLogradouro = new ArrayList<Tipo_Logradouro>();
       try{
           c.conectar();
           PreparedStatement stmt = c.con.prepareStatement(
                "SELECT * FROM tb_tipo_logradouro "
                        + "ORDER BY descricao");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

          Tipo_Logradouro tipoL = new Tipo_Logradouro();
          
          tipoL.setId_tipo_logradouro(rs.getInt("id_tipo_logradouro"));
          tipoL.setDescricao(rs.getString("descricao"));
          listaTipoLogradouro.add(tipoL);
       }
        stmt.close();
        c.FecharConexao();

      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Logradouro", 0);
      }
      return listaTipoLogradouro;
    }

}
