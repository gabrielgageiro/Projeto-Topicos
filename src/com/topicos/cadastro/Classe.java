/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro;

public class Classe {

    private Idiomas idiomas;
    private Aluno aluno;
    private Professor professor;

    public Classe(Idiomas idiomas, Aluno aluno, Professor professor) {
        this.idiomas = idiomas;
        this.aluno = aluno;
        this.professor = professor;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
