package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.TipoEvento;
import br.com.controleconvidados.utils.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

public class CRUD_TipoEvento {
    List<TipoEvento> lista_tpEvento = new ArrayList<TipoEvento>();
    Conexao c = new Conexao();
    

    public void inserir(TipoEvento tpEvento) {
        try {

            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("INSERT INTO "
                    + "tb_tipo_evento "
                    + "(descricao, fg_ativo ) VALUES(?,?)");
            pst.setString(1, tpEvento.getDescricao());
            pst.setBoolean(2, true);

            pst.execute();
            pst.close();

            c.FecharConexao();

          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    public void alterar(TipoEvento tpEvento) throws Exception{
        try {
            c.conectar();
            
            PreparedStatement stmt = c.con.prepareStatement("UPDATE tb_tipo_evento "
                                                + "set descricao = ? "
                                                + "WHERE id_tipo_evento = ?");
            
            stmt.setString(1, tpEvento.getDescricao());
            stmt.setInt(2, tpEvento.getId_tipo_evento());
            
            stmt.execute();
            c.FecharConexao();
            
            JOptionPane.showMessageDialog(null, "Tipo de Evento alterado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
        
    }
    
    public void excluir(TipoEvento tpEvento) throws Exception{
        try {
            c.conectar();
            
            PreparedStatement stmt = c.con.prepareStatement("UPDATE tb_tipo_evento "
                                                        + "set fg_ativo = ? "
                                                        + "WHERE id_tipo_evento = ?");
            stmt.setBoolean(1, false);
            stmt.setInt(2, tpEvento.getId_tipo_evento());
            
            stmt.execute();
            c.FecharConexao();
            
            JOptionPane.showMessageDialog(null, "Tipo de Evento Excluido");
            
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    public String buscarTipoEvento(String descricao) {
        String busca="";
        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT * "
                    + "FROM tb_tipo_evento "
                    + "WHERE descricao LIKE ?");
            
            stmt.setString(1,"%" + descricao + "%");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                TipoEvento tpEvento = new TipoEvento();
                
                busca = rs.getString("descricao");
                tpEvento.setId_tipo_evento(rs.getInt("id_tipo_evento"));
                tpEvento.setFg_ativo(rs.getBoolean("fg_ativo"));
                
                
            }
            stmt.close();
            c.FecharConexao();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Evento", 0);
        }
        return busca;
    }
    
    public List<TipoEvento> listarPorNome(String descricao) throws Exception{
        c.conectar();
        
        PreparedStatement stmt = c.con.prepareStatement("SELECT * "
                                                      + "FROM tb_tipo_evento "
                                                      + "WHERE descricao LIKE ?");
            
            stmt.setString(1,"%" + descricao + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            TipoEvento tpEvento = new TipoEvento();
            
            tpEvento.setId_tipo_evento(rs.getInt("id_tipo_evento"));
            tpEvento.setDescricao(rs.getString("descricao"));
            tpEvento.setFg_ativo(rs.getBoolean("fg_ativo"));
            
            lista_tpEvento.add(tpEvento);
        }
        c.FecharConexao();
        return lista_tpEvento;
    }
    
    public List listarDescricao() {
        c.conectar();
        List<TipoEvento> lista_tpEventoDesc = new ArrayList<TipoEvento>();
   
        try {
            
            PreparedStatement pst = c.con.prepareStatement("SELECT * "
                    + "FROM tb_tipo_evento "
                    + "ORDER BY descricao");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                TipoEvento tpEvento = new TipoEvento();
                
                tpEvento.setId_tipo_evento(rs.getInt("id_tipo_evento"));
                tpEvento.setDescricao(rs.getString("descricao"));
                tpEvento.setFg_ativo(rs.getBoolean("fg_ativo"));
                lista_tpEventoDesc.add(tpEvento);
                
                }
                 c.FecharConexao();
        
                pst.close();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Evento", 0);
        }
        
        return lista_tpEventoDesc;
          

            }
    
}
