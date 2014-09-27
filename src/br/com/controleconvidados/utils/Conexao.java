
package br.com.controleconvidados.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    
    public Connection con;
    
    private static String url = "jdbc:postgresql://localhost:5432/CONTROLE_CONVIDADOS"; //localhost/controle_convidados";
    Properties props ;
    

    public Conexao(){
          PropertiesLoader loader = new PropertiesLoader("app.properties");
         
          StringBuilder sb = new StringBuilder();
          this.url = sb.append("jdbc:postgresql://")
                 .append(loader.getValue("localhost"))
                 .append(":")
                 .append(loader.getValue("5432"))
                 .append("/")
                 .append(loader.getValue("CONTROLE_CONVIDADOS")).toString();
          
          props = new Properties();
          props.setProperty("user",loader.getValue("postgres"));
          props.setProperty("password",loader.getValue("polly1105"));

    }
    
    public void conectar(){
        try{
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK!!!");
            
            System.out.println(url);
            con = DriverManager.getConnection(url,props);
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
