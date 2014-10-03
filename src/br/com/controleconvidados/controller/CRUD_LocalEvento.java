package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.LocalEvento;
import br.com.controleconvidados.utils.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUD_LocalEvento {
    Conexao c = new Conexao();
    
    List<LocalEvento> lista_localEvento = new ArrayList<LocalEvento>();
    
    public void inserir (LocalEvento localEvento){
        try {
            c.conectar();
            
            PreparedStatement pst = c.con.prepareStatement("INSERT INTO tb_local_evento "
                    + "(id_endereco, id_contato, nome_local, proprietario, cnpj, fg_ativo) "
                    + "VALUES (?,?,?,?,?,?)");
            
            pst.setInt(1, localEvento.getId_endereco());
            pst.setInt(2, localEvento.getId_contato());
            pst.setString(3, localEvento.getNome_local());
            pst.setString(4, localEvento.getProprietario());
            pst.setString(5, localEvento.getCnpj());
            pst.setBoolean(6, true);
            
            pst.execute();
            pst.close();
            
            c.FecharConexao();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        
        }
    }
    
public void listar(){
    try {
        c.conectar();
        
        PreparedStatement pst = c.con.prepareStatement("SELECT * "
                                                + "FROM tb_Tipo_Evento");
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            LocalEvento localEvento = new LocalEvento();
            
            localEvento.setId_local_evento(rs.getInt("id_local_evento"));
            localEvento.setId_endereco(rs.getInt("id_endereco"));
            localEvento.setId_contato(rs.getInt("id_contato"));
            localEvento.setNome_local(rs.getString("nome_local"));
            localEvento.setProprietario(rs.getString("proprietaro"));
            localEvento.setCnpj(rs.getString("cnpj"));
            localEvento.setFg_ativo(true);
            
            lista_localEvento.add(localEvento);
        }
        pst.close();
        c.FecharConexao();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Local do Evento", 0);
    }
      
    }
}


