/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/

package com.topicos.comum;

public class Cadastro {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean eNovo(){
        return id != null;
    }

}
