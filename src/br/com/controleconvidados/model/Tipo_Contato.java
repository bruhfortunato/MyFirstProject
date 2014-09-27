package br.com.controleconvidados.model;

public class Tipo_Contato {

int id_tipo_contato;
String descricao;

    public int getId_tipo_contato() {
        return id_tipo_contato;
    }

    public void setId_tipo_contato(int id_tipo_contato) {
        this.id_tipo_contato = id_tipo_contato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }

}
