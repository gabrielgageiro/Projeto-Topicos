/*
Criado por Gabriel Gageiro;
Data:24/03/18
*/


package com.topicos.cadastro;


public class Pessoas {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private String cidade;
    private String UF;
    private String email;
    private String email2;
    private String rua;
    private String telefone;
    private String telefone2;
    private int numeroCasa;
    private int idade;

    public Pessoas(String nome, String sobrenome, String CEP, String cidade, String UF,
                   String email, String email2, String rua, String telefone, String telefone2,
                   int numeroCasa, int idade){

        this.nome=nome;
        this.sobrenome=sobrenome;
        this.CPF=CEP;
        this.cidade=cidade;
        this.UF=UF;
        this.email=email;
        this.email2=email2;
        this.rua=rua;
        this.telefone=telefone;
        this.telefone2=telefone2;
        this.numeroCasa=numeroCasa;
        this.idade=idade;
    }

    public boolean novo(){
       return id == null;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId() {
        return id;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
