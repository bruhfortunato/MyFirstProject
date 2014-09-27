
package br.com.controleconvidados.model;

public class Contato {
    
    int id_contato, id_tipo_contato, id_cliente;
    String descricao;
    boolean fg_ativo;

    public int getId_contato() {
        return id_contato;
    }

    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    public int getId_tipo_contato() {
        return id_tipo_contato;
    }

    public void setId_tipo_contato(int id_tipo_contato) {
        this.id_tipo_contato = id_tipo_contato;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(boolean fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
    
}
