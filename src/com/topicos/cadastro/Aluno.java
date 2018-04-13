/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.cadastro;

public class Aluno extends Pessoas {
    private boolean pagamentoEmdia;
    private String curso;


    public Aluno(String nome, String sobrenome, String CEP, String cidade, String UF, String email,
                 String email2, String rua, String telefone, String telefone2, int numeroCasa,
                 int idade,boolean pagamentoEmdia,String curso) {

        super(nome, sobrenome, CEP, cidade, UF, email, email2, rua, telefone, telefone2,
                numeroCasa, idade);

        this.curso=curso;
        this.pagamentoEmdia=pagamentoEmdia;
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
