package br.com.controleconvidados.model;

import java.util.ArrayList;

public class Tipo_Logradouro {
    int id_tipo_logradouro;
    String descricao;
    boolean fg_ativo;

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

    public boolean isFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(boolean fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
}
