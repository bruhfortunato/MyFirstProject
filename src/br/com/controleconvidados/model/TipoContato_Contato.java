package br.com.controleconvidados.model;

public class TipoContato_Contato {

    int id_contato, id_tipo_contato;
    String descTipo, descContato;

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
    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }

    public String getDescContato() {
        return descContato;
    }

    public void setDescContato(String descContato) {
        this.descContato = descContato;
    }

    
}