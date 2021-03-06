/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro.aula;

import com.topicos.cadastro.aluno.Aluno;
import com.topicos.cadastro.Idiomas;
import com.topicos.comum.Cadastro;
import com.topicos.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Aula extends Cadastro {

    private Idiomas idiomas;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Integer id;
    private String periodo;

    public Aula(Idiomas idiomas, Aluno aluno, Professor professor, Integer id, String periodo) {
        this.idiomas = idiomas;
        this.professor = professor;
        this.id = id;
        this.periodo = periodo;
        this.alunos.add(aluno);
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
