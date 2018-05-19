/*
Criado por Gabriel Gageiro;
Data:16/05/18
*/


package com.topicos.comum.log;

public  abstract class Log {
    private String usuario;

    public Log(String usuario){
        this.usuario=usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public abstract void salvarLog();
}
