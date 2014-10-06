package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.TipoEvento;
import br.com.controleconvidados.utils.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;
public class CRUD_TipoEvento {
    
    Conexao c = new Conexao();
    List<TipoEvento> lista_tpEvento = new ArrayList<TipoEvento>();
    
    public void inserir(TipoEvento tpEvento){
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
            
            JOptionPane.showMessageDialog(null, " Cadastrado realizado com sucesso!");
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    public String buscarDescricao(String descricao){
        String desc = null;
        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement("SELECT descricao "
                                        + "FROM tb_tipo_evento "
                                        + "WHERE descricao ILIKE '" 
                                        + descricao + "'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                desc = rs.getString("descricao");
            }
            stmt.close();
            c.FecharConexao();

        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Tipo de Eventos", 0);
        }
        
        return desc;
    }
    public void listar(){
        try {
            c.conectar();
                PreparedStatement pst = c.con.prepareStatement("SELECT * "
                        + "FROM tb_tipo_evento "
                        + "ORDER BY descricao");
                
                ResultSet rs = pst.executeQuery();
                
                while(rs.next()){
                    
                    TipoEvento tpEvento = new TipoEvento();
                
                tpEvento.setId_tipo_evento(rs.getInt("id_tipo_evento"));
                tpEvento.setDescricao(rs.getString("descricao"));
                tpEvento.setFg_ativo(rs.getBoolean("true"));
                lista_tpEvento.add(tpEvento);
                
                pst.close();
                c.FecharConexao();
                }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Tipo de Evento", 0);
       }
    }
}
