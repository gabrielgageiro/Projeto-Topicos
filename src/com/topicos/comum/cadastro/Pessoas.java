/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.comum.cadastro;


import com.topicos.comum.Cadastro;

public class Pessoas extends Cadastro {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private int idade;
    private Endereco endereco;
    private Contato contato;

    public Pessoas(){}

    public Pessoas(String nome, String sobrenome, String CPF, int idade, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.idade = idade;
        this.endereco = endereco;
        this.contato = contato;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
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
        CPF+ " " +idade +"\n"+endereco.toString()+"\n"+contato.toString();
    }
}

