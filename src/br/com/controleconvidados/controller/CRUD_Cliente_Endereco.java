package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.Cliente_Endereco;
import java.sql.*;
import javax.swing.JOptionPane;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Cliente_Endereco {
    Conexao c = new Conexao();
    
    public void inserir (int idCli, int idEnd){
        c.conectar();
        try{
            PreparedStatement pst = c.con.prepareStatement
                                        ("INSERT INTO tb_cliente_endereco " +
                                         "(id_cliente, id_endereco) VALUES (?,?)");
            pst.setInt(1, idCli);
            pst.setInt(2, idEnd);
            
            pst.execute();
            System.out.println("Cadastro de cliente e endereço realizado com sucesso");
            pst.close();
            
            c.FecharConexao();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    
    
    
}
