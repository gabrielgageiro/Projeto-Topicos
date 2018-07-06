/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro.contato;

import com.topicos.comum.Cadastro;

public class Contato extends Cadastro {

    private String email;
    private String telefone;
    private String celular;
    private Integer Pessoa_idPessoa;

    public Contato(String email, String telefone, String celular) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Integer getPessoa_idPessoa() {
        return Pessoa_idPessoa;
    }

    public void setPessoa_idPessoa(Integer pessoa_idPessoa) {
        Pessoa_idPessoa = pessoa_idPessoa;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Email : " + email + " telefone: " + telefone + " celular: " + celular;
    }
}
