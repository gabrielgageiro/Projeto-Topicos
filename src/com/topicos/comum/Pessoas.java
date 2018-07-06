/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.comum;


import com.topicos.cadastro.contato.Contato;
import com.topicos.cadastro.endereco.Endereco;

public class Pessoas extends Cadastro {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private int idade;

    public Pessoas(){}

    public Pessoas(String nome, String sobrenome, String CPF, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean eNovo(){
        return id == null;
    }
    @Override
    public String toString() {
        return nome + " " + sobrenome + "\n"+
        CPF+ " " +idade;
    }
}

