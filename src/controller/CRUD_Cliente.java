package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

public class CRUD_Cliente extends Conexao{
    
    List<Cliente> listaCliente = new ArrayList<Cliente>();
    
    public void inserir(Cliente cli){
        try{
            PreparedStatement pst = con.prepareStatement("INSERT INTO tb_cliente  " +
                      "(tipo_pessoa, nome_cliente, cpf_cnpj, fg_ativo) VALUES (?,?,?,?)");
            pst.setString(1, cli.getTipo_pessoa());
            pst.setString(2, cli.getNome_cliente());
            pst.setString(3, cli.getCpf_cnpj());
            pst.setBoolean(4, true);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de Cliente OK", "", 1);
            pst.close();
            
            } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    public int buscarUltimoID(){
        int codCli=0;
        try {
            PreparedStatement stmt = con.prepareStatement(" SELECT MAX(id_cliente) " +
                                                    "FROM tb_cliente");
            ResultSet rs = stmt.executeQuery();
            Cliente cli = new Cliente();
            
            if(rs.next()){
              cli.setId_cliente(rs.getInt(1));
              codCli=cli.getId_cliente();
            } 
            
        stmt.close();
        super.FecharConexao();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cliente", 0);
        }
        return codCli;
               
    }
    public List listar(){
        try {
            PreparedStatement stmt = con.prepareStatement(
            "SELECT * FROM tb_cliente "+
            "ORDER BY nome_cliente");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente cli = new Cliente();
                
                cli.setId_cliente(rs.getInt("id_cliente"));
                cli.setTipo_pessoa(rs.getString("tipo_pessoa"));
                cli.setNome_cliente(rs.getString("nome_cliente"));
                cli.setCpf_cnpj(rs.getString("cpf_cnpj"));
                cli.setFg_ativo(rs.getBoolean("true"));
                listaCliente.add(cli);
                }
            stmt.close();
            super.FecharConexao();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cliente", 0);
      
        }
        return listaCliente;
    }
       
    }
              

