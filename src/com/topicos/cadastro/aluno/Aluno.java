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
    private String email;
    private String telefone;

    public Aluno(){}

    public Aluno(String nome, String sobrenome, String CPF, int idade, Endereco endereco, Contato contato,
                 Integer pagamentoEmdia, String curso) {
        super(nome, sobrenome, CPF, idade);
        this.pagamentoEmdia = pagamentoEmdia;
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
