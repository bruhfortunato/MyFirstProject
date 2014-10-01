package br.com.controleconvidados.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.controleconvidados.model.Cliente;
import br.com.controleconvidados.utils.Conexao;

public class CRUD_Cliente {    
    
    Conexao c = new Conexao();
    List<Cliente> listaCliente = new ArrayList<Cliente>();
    
    public void inserir(Cliente cli){
        c.conectar();
        try{
            PreparedStatement pst = c.con.prepareStatement("INSERT INTO tb_cliente  " +
                      "(id_endereco, tipo_pessoa, nome_cliente, cpf_cnpj, fg_ativo) VALUES (?,?,?,?,?)");
            pst.setInt(1, cli.getId_endereco());
            pst.setString(2, cli.getTipo_pessoa());
            pst.setString(3, cli.getNome_cliente());
            pst.setString(4, cli.getCpf_cnpj());
            pst.setBoolean(5, true);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro de Cliente OK", "", 1);
            pst.close();
           
            c.FecharConexao();
            
            } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage(), "Alerta", 2);
        }
    }
    
    public int buscarUltimoID(){
        c.conectar();
        
        int codCli=0;
        try {
            PreparedStatement stmt = c.con.prepareStatement(" SELECT MAX(id_cliente) " +
                                                    "FROM tb_cliente");
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            codCli = rs.getInt(1);
            Cliente cli = new Cliente();
            
            /*if(rs.next()){
              cli.setId_cliente(rs.getInt(1));
              codCli=cli.getId_cliente();
            } */
            
        stmt.close();
        
        c.FecharConexao();
        // exactly one result so allowed
    } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cliente", 0);
        }
        return codCli;
               
    }
    public List listar(){
        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement(
            "SELECT * FROM tb_cliente "+
            "ORDER BY nome_cliente");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente cli = new Cliente();
                
                cli.setId_cliente(rs.getInt("id_cliente"));
                cli.setId_endereco(rs.getInt("id_endereco"));
                cli.setTipo_pessoa(rs.getString("tipo_pessoa"));
                cli.setNome_cliente(rs.getString("nome_cliente"));
                cli.setCpf_cnpj(rs.getString("cpf_cnpj"));
                cli.setFg_ativo(rs.getBoolean("true"));
                listaCliente.add(cli);
                }
            stmt.close();
            c.FecharConexao();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..."+e.getMessage(), "Consulta de Cliente", 0);
      
        }
        return listaCliente;
    }
       
    }
              

