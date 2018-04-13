/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.cadastro;

import java.math.BigDecimal;

public class Professor extends Pessoas {

    private BigDecimal salario;
    private String modulos;
    private int numeroPIS;


    public Professor(String nome, String sobrenome, String CEP, String cidade, String UF,
                     String email, String email2, String rua, String telefone, String telefone2,
                     int numeroCasa, int idade, BigDecimal salario,String modulos, int numeroPIS) {

        super(nome, sobrenome, CEP, cidade, UF, email, email2, rua, telefone, telefone2,
                numeroCasa, idade);
        this.modulos=modulos;
        this.numeroPIS=numeroPIS;
        this.salario=salario;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    public int getNumeroPIS() {
        return numeroPIS;
    }

    public void setNumeroPIS(int numeroPIS) {
        this.numeroPIS = numeroPIS;
    }
}
