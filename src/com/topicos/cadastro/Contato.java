/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro;

public class Contato {

    private String email;
    private String telefone;
    private String celular;
    private Integer id;

    public Contato(String email, String telefone, String celular, Integer id) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
