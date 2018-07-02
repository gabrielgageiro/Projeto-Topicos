package com.topicos.telas.internalFrame.cadastroBase;

import com.topicos.comum.Cadastro;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;

public abstract class BaseInternalFrame <T extends Cadastro> extends JInternalFrame {

    private T obj;


    public BaseInternalFrame(String titulo,T obj){
        super(titulo, false, true, true, false);
        this.obj=obj;
        instanciarTela();
    }
    public BaseInternalFrame(){}

    public T getObjeto() {
        return obj;
    }

    public void setObjeto(T objeto){
        this.obj = obj;
    }

    public abstract void instanciarTela();

}
