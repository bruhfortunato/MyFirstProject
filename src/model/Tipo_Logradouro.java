package model;

import java.util.ArrayList;

public class Tipo_Logradouro {
    int id_tipo_logradouro;
    String descricao;

    public static ArrayList<Tipo_Logradouro> TipoL = new ArrayList<Tipo_Logradouro>();
    
    public int getId_tipo_logradouro() {
        return id_tipo_logradouro;
    }

    public void setId_tipo_logradouro(int id_tipo_logradouro) {
        this.id_tipo_logradouro = id_tipo_logradouro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
