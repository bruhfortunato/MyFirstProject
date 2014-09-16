package model;

public class Endereco {

    int id_cidade, id_tipo_logradouro, num;
    String descricao, complemento, bairro, cep, num_apto;
    boolean fg_ativo;

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public int getId_tipo_logradouro() {
        return id_tipo_logradouro;
    }

    public void setId_tipo_logradouro(int id_tipo_logradouro) {
        this.id_tipo_logradouro = id_tipo_logradouro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNum_apto() {
        return num_apto;
    }

    public void setNum_apto(String num_apto) {
        this.num_apto = num_apto;
    }

    public boolean isFg_ativo() {
        return fg_ativo;
    }

    public void setFg_ativo(boolean fg_ativo) {
        this.fg_ativo = fg_ativo;
    }
    
    
}
