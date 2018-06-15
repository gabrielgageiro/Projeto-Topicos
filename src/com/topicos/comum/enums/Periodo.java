/*
Criado por Gabriel Gageiro;
Data:15/06/18
*/

package com.topicos.comum.enums;

public enum Periodo {

    Matutino("Matutino"),
    Vespertino("Vespertino"),
    Noturno("Noturno");

    private String periodo;

    Periodo(String periodo) {
        this.periodo=periodo;
    }

    public String getPeriodo() {
        return periodo;
    }
}
