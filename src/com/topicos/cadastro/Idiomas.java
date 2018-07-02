/*
Criado por: Herick Maciel Maia
Data: 25/03/18
 */

package com.topicos.cadastro;

public class Idiomas {

    private String nomeIdioma;
    private Integer id;


    public Idiomas(String nomeIdioma, double preco, int duracao, int horario, Integer id) {
        this.nomeIdioma = nomeIdioma;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeIdioma(String nomeIdioma){
        this.nomeIdioma = nomeIdioma;
    }

    public String getNomeIdioma(){
        return nomeIdioma;
    }

}