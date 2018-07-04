/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.professor;

import com.topicos.cadastro.Contato;
import com.topicos.cadastro.Endereco;
import com.topicos.comum.Pessoas;

import java.math.BigDecimal;

public class Professor extends Pessoas {

    private BigDecimal salario;
    private String modulo;
    private int numeroPIS;

    public Professor(String nome, String sobrenome, String CPF, int idade, Endereco endereco,
                     Contato contato, BigDecimal salario, String modulo, int numeroPIS) {
        super(nome, sobrenome, CPF, idade, endereco, contato);
        this.salario = salario;
        this.modulo = modulo;
        this.numeroPIS = numeroPIS;
    }


    public BigDecimal getSalario() {
        return salario;

    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getNumeroPIS() {
        return numeroPIS;
    }

    public void setNumeroPIS(int numeroPIS) {
        this.numeroPIS = numeroPIS;
    }
}
