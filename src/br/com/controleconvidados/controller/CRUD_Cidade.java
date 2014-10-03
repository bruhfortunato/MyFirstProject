package br.com.controleconvidados.controller;

import br.com.controleconvidados.model.Cidade;
import br.com.controleconvidados.utils.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

public class CRUD_Cidade {

    Conexao c = new Conexao();

    public List listar(String sigla) {
        List<Cidade> listaCidade = new ArrayList<Cidade>();

        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement("SELECT * "
                    + "FROM tb_estado e "
                    + "JOIN tb_cidade c ON (c.id_estado = e.id_estado) "
                    + "WHERE e.sigla = ? "
                    + "ORDER BY nome;");
            stmt.setString(1, sigla);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cidade cidade = new Cidade();
                cidade.setId_cidade(rs.getInt("id_cidade"));
                cidade.setId_estado(rs.getInt("id_estado"));
                cidade.setNome(rs.getString("nome"));

                listaCidade.add(cidade);

            }
            stmt.close();
            c.FecharConexao();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Cidades", 0);
        }
        return listaCidade;
    }

    public int buscarIdCidade(String nomeCidade) {

        int codCidade = 0;
        try {
            c.conectar();
            PreparedStatement stmt = c.con.prepareStatement(
                    "SELECT id_cidade "
                    + "FROM tb_cidade "
                    + "WHERE nome ILIKE '" + nomeCidade + "'" );
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                codCidade = rs.getInt("id_cidade");
            }
            stmt.close();
            c.FecharConexao();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO..." + e.getMessage(), "Consulta de Cidade", 0);
        }
        return codCidade;
    }
}
