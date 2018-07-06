/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro.endereco;

import com.topicos.comum.Cadastro;

public class Endereco extends Cadastro {

    private String UF;
    private String rua;
    private String cidade;
    private int numeroCasa;
    private Integer Pessoa_idPessoa;

    public Endereco(String UF,String cidade, String rua, int numeroCasa) {
        this.cidade=cidade;
        this.UF = UF;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public Integer getPessoa_idPessoa() {
        return Pessoa_idPessoa;
    }

    public void setPessoa_idPessoa(Integer pessoa_idPessoa) {
        Pessoa_idPessoa = pessoa_idPessoa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Cidade : "+ cidade + " UF " + UF + "\n"+
                "Rua: " + rua + " numero da casa " + numeroCasa;
    }
}
