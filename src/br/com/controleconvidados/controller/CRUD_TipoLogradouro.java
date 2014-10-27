package br.com.controleconvidados.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Tipo_Logradouro;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_TipoLogradouro{

   List<Tipo_Logradouro> lista_tpLogradouro = new ArrayList<Tipo_Logradouro>();
   Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();
   Conexao c = new Conexao();
   
   public void inserir(Tipo_Logradouro tpLogradouro){
       try {
           
           c.conectar();
           PreparedStatement pst = c.con.prepareStatement("INSERT INTO "
                                              + "tb_tipo_logradouro "
                                              + "(descricao, fg_ativo) VALUES (?,?)");
           
           pst.setString(1, tpLogradouro.getDescricao());
           pst.setBoolean(2, true);
           
           pst.execute();
           pst.close();
           
           c.FecharConexao();
                      
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
           
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
    }
   }
   
    public void excluir(Tipo_Logradouro tpLogradouro) throws Exception {
        try {
            c.conectar();

            PreparedStatement stmt = c.con.prepareStatement("UPDATE tb_tipo_logradouro "
                    + "set fg_ativo = ? "
                    + "WHERE id_tipo_logradouro = ?");
            stmt.setBoolean(1, false);
            stmt.setInt(2, tpLogradouro.getId_tipo_logradouro());

            stmt.execute();
            c.FecharConexao();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }

    public void alterarDescricao(Tipo_Logradouro tpLogradouro) throws Exception{
        try {
            c.conectar();PreparedStatement stmt = c.con.prepareStatement(
                      "UPDATE tb_tipo_logradouro "
                    + "set descricao = ? "
                    + "WHERE id_tipo_logradouro = ?");

            stmt.setString(1, tpLogradouro.getDescricao());
            stmt.setInt(2, tpLogradouro.getId_tipo_logradouro());

            stmt.execute();
            c.FecharConexao();

            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }

    }
    
    public void alterarFgAtivo(Tipo_Logradouro tpLogradouro) throws Exception {
        try {
            c.conectar();

            PreparedStatement stmt = c.con.prepareStatement("UPDATE tb_tipo_logradouro "
                    + "set fg_ativo = ? "
                    + "WHERE id_tipo_logradouro = ?");

            stmt.setBoolean(1, true);
            stmt.setInt(2, tpLogradouro.getId_tipo_logradouro());

            stmt.execute();
            c.FecharConexao();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    public Integer buscarCodigoPorDescricaoInativo(String descricao) {
        c.conectar();
        int codigo = 0;
        try {
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT * "
                    + "FROM tb_tipo_logradouro "
                    + "WHERE descricao = '" + descricao + "'"
                    + "AND fg_ativo = false");

//    
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                codigo = (rs.getInt(1));

            }
            stmt.close();
            c.FecharConexao();

            return codigo;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Evento", 0);
        }
        return null;
    }

    public Tipo_Logradouro TipoLogradouroAtivos(String descricao) {
        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT * "
                    + "FROM tb_tipo_logradouro "
                    + "WHERE descricao = '" + descricao + "'"
                    + "AND fg_ativo = true");
    
            ResultSet rs = stmt.executeQuery();

            Tipo_Logradouro tpLogradouroTeste = new Tipo_Logradouro();
            
            while (rs.next()) {

                tpLogradouroTeste.setId_tipo_logradouro(rs.getInt("id_tipo_logradouro"));
                tpLogradouroTeste.setDescricao(rs.getString("descricao"));
                tpLogradouroTeste.setFg_ativo(rs.getBoolean("fg_ativo"));
                
            }
            stmt.close();
            c.FecharConexao();
            return tpLogradouroTeste;
            
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Logradouro", 0);
        }
        return null;
    }
    
    public Tipo_Logradouro buscarTipoLogradouroInativos(String descricao) {
            c.conectar();
        
            String desc = null;
            
        try {
            
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT * "
                    + "FROM tb_tipo_logradouro "
                    + "WHERE descricao = '" + descricao + "'"
                    + "AND fg_ativo = false");

            ResultSet rs = stmt.executeQuery();

            Tipo_Logradouro tpLogradouroTeste = new Tipo_Logradouro();
            
            while (rs.next()) {
                
                desc = (rs.getString("descricao"));
//
//                tpLogradouroTeste.setId_tipo_logradouro(rs.getInt("id_tipo_logradouro"));
//                tpLogradouroTeste.setDescricao(rs.getString("descricao"));
//                tpLogradouroTeste.setFg_ativo(rs.getBoolean("fg_ativo"));
//                
            }
            stmt.close();
            c.FecharConexao();
            return tpLogradouroTeste;
            
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Logradouro", 0);
        }
        return null;
    }

   public List<Tipo_Logradouro> listarPorNome(String descricao) throws Exception {
        c.conectar();

        PreparedStatement stmt = c.con.prepareStatement("SELECT * "
                + "FROM tb_tipo_logradouro "
                + "WHERE descricao ILIKE '" +descricao+ "'"
                + "AND fg_ativo = true");

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

            tpLogradouro.setId_tipo_logradouro(rs.getInt("id_tipo_logradouro"));
            tpLogradouro.setDescricao(rs.getString("descricao"));
            tpLogradouro.setFg_ativo(rs.getBoolean("fg_ativo"));

            lista_tpLogradouro.add(tpLogradouro);
        }
        c.FecharConexao();
        return lista_tpLogradouro;
    }

   public List listarDescricao() {
        c.conectar();
        List<Tipo_Logradouro> lista_tpLogradouroDesc = new ArrayList<Tipo_Logradouro>();

        try {

            PreparedStatement pst = c.con.prepareStatement("SELECT * "
                    + "FROM tb_tipo_logradouro "
                    + "WHERE fg_ativo = true "
                    + "ORDER BY descricao");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Tipo_Logradouro tpLogradouro = new Tipo_Logradouro();

            tpLogradouro.setId_tipo_logradouro(rs.getInt("id_tipo_logradouro"));
            tpLogradouro.setDescricao(rs.getString("descricao"));
            tpLogradouro.setFg_ativo(rs.getBoolean("fg_ativo"));
            lista_tpLogradouroDesc.add(tpLogradouro);
            
            }
            c.FecharConexao();

            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Evento", 0);
        }

        return lista_tpLogradouroDesc;

    }

public int buscarIdTpLogradouro(String descTpLogradouro){
    
        int codTpLogradouro=0;
    try {
        c.conectar();
        PreparedStatement stmt = c.con.prepareStatement(
                "SELECT id_tipo_logradouro "+
                "FROM tb_tipo_logradouro " +
                "WHERE descricao ILIKE '" + descTpLogradouro + "'");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
           codTpLogradouro = rs.getInt("id_tipo_logradouro");
        }
        stmt.close();
        c.FecharConexao();
   
        
    } catch (SQLException e){
          
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cidade", 0);
    }
        return codTpLogradouro;
    
}
public String buscarTipoLogradouro(String descricao) {
    c.conectar();
        String desc = null;
        try {
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT * "
                    + "FROM tb_tipo_logradouro "
                    + "WHERE descricao = '" + descricao + "'");

            ResultSet rs = stmt.executeQuery();

            Tipo_Logradouro tpLogradouroTeste = new Tipo_Logradouro();

            while (rs.next()) {

                desc = (rs.getString("descricao"));

            }

            stmt.close();
            c.FecharConexao();
            return desc;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Logradouro", 0);
        }
        return null;
    }
}

