/*
Criado por Gabriel Gageiro;
Data:15/06/18
*/


package com.topicos.curso.cursointensivo;

import com.topicos.cadastro.aula.Aula;
import com.topicos.cadastro.Idiomas;
import com.topicos.professor.Professor;
import com.topicos.comum.interfaces.CalcularValorDoSemestre;
import com.topicos.curso.Curso;

import java.math.BigDecimal;

public class CursoIntensivo extends Curso implements CalcularValorDoSemestre {

    private Integer horasAula;
    private BigDecimal ValorAula;
    private Integer duracao;


    public CursoIntensivo(Aula aula, Idiomas idiomas, Professor professor) {
        super(aula, idiomas, professor);
    }

    @Override
    public BigDecimal calcularValor(BigDecimal valorAula, Integer numeroAula) {
        return null;
    }
}
