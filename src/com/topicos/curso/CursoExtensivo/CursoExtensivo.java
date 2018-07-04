/*
Criado por Gabriel Gageiro;
Data:15/06/18
*/


package com.topicos.curso.CursoExtensivo;

import com.topicos.aula.Aula;
import com.topicos.comum.cadastro.Idiomas;
import com.topicos.professor.Professor;
import com.topicos.comum.interfaces.CalcularValorDoSemestre;
import com.topicos.curso.Curso;

import java.math.BigDecimal;

public class CursoExtensivo extends Curso implements CalcularValorDoSemestre{

    private Integer horasAula;
    private BigDecimal ValorAula;
    private Integer duracao;

    public CursoExtensivo(Aula aula, Idiomas idiomas, Professor professor, Integer horasAula, BigDecimal valorAula, Integer duracao) {
        super(aula, idiomas, professor);
        this.horasAula = horasAula;
        ValorAula = valorAula;
        this.duracao = duracao;
    }

    public Integer getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(Integer horasAula) {
        this.horasAula = horasAula;
    }

    public BigDecimal getValorAula() {
        return ValorAula;
    }

    public void setValorAula(BigDecimal valorAula) {
        ValorAula = valorAula;
    }

//    public Integer getDuracao() {
//        return duracao;
//    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public BigDecimal calcularValor(BigDecimal valorAula, Integer numeroAula) {
        return null;
    }
}
