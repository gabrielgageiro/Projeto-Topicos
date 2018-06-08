/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro;

public class Endereco {

    private String UF;
    private String rua;
    private String cidade;
    private int numeroCasa;

    public Endereco(String UF,String cidade, String rua, int numeroCasa) {
        this.cidade=cidade;
        this.UF = UF;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
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


}