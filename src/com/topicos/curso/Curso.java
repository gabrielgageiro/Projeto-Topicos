/*
Criado por Gabriel Gageiro;
Data:15/06/18
*/


package com.topicos.curso;

import com.topicos.aula.Aula;
import com.topicos.cadastro.Idiomas;
import com.topicos.cadastro.Professor;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private Aula aula;
    private Idiomas idiomas;
    private List<Professor> professores = new ArrayList<>();

    public Curso(Aula aula, Idiomas idiomas, Professor professor) {
        this.aula = aula;
        this.idiomas = idiomas;
        this.professores.add(professor);
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professor) {
        professores.add(professor);
    }
}
