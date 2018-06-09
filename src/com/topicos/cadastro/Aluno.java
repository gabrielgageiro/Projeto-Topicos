/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.cadastro;

public class Aluno extends Pessoas {
    private boolean pagamentoEmdia;
    private String curso;

    public Aluno(Integer id, String nome, String sobrenome, String CPF, int idade,
                 Endereco endereco, Contato contato, boolean pagamentoEmdia, String curso) {
        super(id, nome, sobrenome, CPF, idade, endereco, contato);
        this.pagamentoEmdia = pagamentoEmdia;
        this.curso = curso;
    }

    public boolean isPagamentoEmdia() {
        return pagamentoEmdia;
    }

    public void setPagamentoEmdia(boolean pagamentoEmdia) {
        this.pagamentoEmdia = pagamentoEmdia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
