/*
Criado por Gabriel Gageiro;
Data:15/06/18
*/


package com.topicos.curso;

import com.topicos.aula.Aula;
import com.topicos.comum.cadastro.Idiomas;
import com.topicos.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private Aula aula;
    private Idiomas idiomas;
    private List<Professor> professores = new ArrayList<>();
    private double preco;
    private int duracao;
    private int horario;

    public Curso(Aula aula, Idiomas idiomas, Professor professor) {
        this.aula = aula;
        this.idiomas = idiomas;
        this.professores.add(professor);
        this.preco = preco;
        this.duracao = duracao;
        this.horario = horario;
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

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setHorario(int horario){
        this.horario = horario;
    }

    public int getHorario(){
        return horario;
    }
}
