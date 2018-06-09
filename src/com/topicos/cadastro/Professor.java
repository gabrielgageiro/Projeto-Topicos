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

    public Professor(Integer id, String nome, String sobrenome, String CPF, int idade,
                     Endereco endereco, Contato contato, BigDecimal salario, String modulos, int numeroPIS) {
        super(id, nome, sobrenome, CPF, idade, endereco, contato);
        this.salario = salario;
        this.modulos = modulos;
        this.numeroPIS = numeroPIS;
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
