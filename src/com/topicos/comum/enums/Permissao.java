package com.topicos.comum.enums;

public enum Permissao {

    Matutino("Matutino"),
    Vespertino("Vespertino"),
    Noturno("Noturno");

    private String permissao;

    Permissao(String periodo) {
        this.permissao=periodo;
    }

    public String getPeriodo() {
        return permissao;
    }
}
