/*
Criado por Gabriel Gageiro;
Data:04/04/18
*/


package com.topicos.comum.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PrincipalListenner implements ActionListener{

    private JMenuItem SobreItem;


    public PrincipalListenner(JMenuItem SobreItem){
        this.SobreItem=SobreItem;
    }
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == SobreItem)
            sobreItem();

    }


    public abstract void sobreItem();

}