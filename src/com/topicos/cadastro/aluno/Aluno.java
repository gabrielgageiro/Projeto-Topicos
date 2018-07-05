/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.cadastro.aluno;

import com.topicos.cadastro.contato.Contato;
import com.topicos.cadastro.endereco.Endereco;
import com.topicos.comum.Pessoas;

public class Aluno extends Pessoas {
    private Integer pagamentoEmdia;
    private String curso;

    public Aluno(){}

    public Aluno(String nome, String sobrenome, String CPF, int idade, Endereco endereco, Contato contato,
                 Integer pagamentoEmdia, String curso) {
        super(nome, sobrenome, CPF, idade, endereco, contato);
        this.pagamentoEmdia = pagamentoEmdia;
        this.curso = curso;
    }

    public Integer getPagamentoEmdia() {
        return pagamentoEmdia;
    }

    public void setPagamentoEmdia(Integer pagamentoEmdia) {
        this.pagamentoEmdia = pagamentoEmdia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;

    }
}
