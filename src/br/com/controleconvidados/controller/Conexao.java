
package br.com.controleconvidados.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection con;
    
    static String usuario = "postgres";
    static String senha = "polly1105";
    static String url = "jdbc:postgresql://localhost/CONTROLE_CONVIDADOS";
    
    public Conexao(){
        
    }
    
    public void conectar(){
        try{
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK!!!");
            
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão OK!!!");
            
        }catch (ClassNotFoundException exc){
            System.out.println("Erro no driver = " +exc.getMessage());
        }catch(SQLException exc){
            System.out.println("Erro de conexão = " +exc.getMessage());
        }
    }
    
    public void FecharConexao(){
        try{
            con.close(); //fechando a conexao
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
    }


    
}
