package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.TipoContato_Contato;

public class CRUD_TipoContato_Contato {
    Conexao c = new Conexao();
    List<TipoContato_Contato> listaTipoContato_Contato = new ArrayList<TipoContato_Contato>();

    public List listar(){
          try{
              
          c.conectar();
              
          PreparedStatement stmt = c.con.prepareStatement(
                "SELECT t.id_tipo_contato, t.descricao, c.id_contato, c.descricao " +
                "FROM tb_tipo_contato t " +
                "JOIN tb_contato c ON(t.id_tipo_contato = c.id_tipo_contato) " +
                "ORDER BY t.descricao;");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

          TipoContato_Contato tpc_contato = new TipoContato_Contato();
          
          tpc_contato.setId_tipo_contato(rs.getInt("id_tipo_contato"));
          tpc_contato.setId_contato(rs.getInt("id_contato"));
          tpc_contato.setDescTipo(rs.getString("descricao"));
          tpc_contato.setDescContato(rs.getString("descricao"));
          listaTipoContato_Contato.add(tpc_contato);
       }
        stmt.close();
        c.FecharConexao();

      }catch(SQLException e){
          
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Contatos", 0);
      }
      return listaTipoContato_Contato;
    }
    }

