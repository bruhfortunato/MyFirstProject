package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Tipo_Logradouro;

public class CRUD_TipoLogradouro extends Conexao{
   
   public List listar(){
       
       List<Tipo_Logradouro> listaTipoLogradouro = new ArrayList<Tipo_Logradouro>();
       try{
          PreparedStatement stmt = con.prepareStatement(
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
        super.FecharConexao();

      }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Logradouro", 0);
      }
      return listaTipoLogradouro;
    }

}
