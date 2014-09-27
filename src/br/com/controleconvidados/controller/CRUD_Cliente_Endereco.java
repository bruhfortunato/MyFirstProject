package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.Cliente_Endereco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Cliente_Endereco {
    Conexao c = new Conexao();
    
    public void inserir (Cliente_Endereco cli_end){
        c.conectar();
        try{
            PreparedStatement pst = c.con.prepareStatement
                                        ("INSERT INTO tb_cliente_endereco " +
                                         "(id_cliente, id_endereco) VALUES (?,?)");
            pst.setInt(1, cli_end.getId_cliente());
            pst.setInt(2, cli_end.getId_endereco());
            
            pst.execute();
            System.out.println("Cadastro de cliente e endereço realizado com sucesso");
            pst.close();
            
            c.FecharConexao();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
}
