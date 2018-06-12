/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.aula;

import com.topicos.cadastro.Aluno;
import com.topicos.cadastro.Professor;
import com.topicos.cadastro.TipoDeCurso;

public class Aula {

    private Professor professor;
    private Aluno aluno;
    private TipoDeCurso tipoDeCurso;

    public Aula(Professor professor, Aluno aluno,TipoDeCurso tipoDeCurso) {
        this.professor = professor;
        this.tipoDeCurso=tipoDeCurso;
        this.aluno = aluno;
    }

    public TipoDeCurso getTipoDeCurso() {
        return tipoDeCurso;
    }

    public void setTipoDeCurso(TipoDeCurso tipoDeCurso) {
        this.tipoDeCurso = tipoDeCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
