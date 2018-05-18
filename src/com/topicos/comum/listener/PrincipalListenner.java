/*
Criado por Gabriel Gageiro;
Data:04/04/18
*/


package com.topicos.comum.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PrincipalListenner implements ActionListener{

    private JMenuItem SobreItem, ListarAlunoItem;
    private JButton logoff,sair;

    public PrincipalListenner(JMenuItem SobreItem,JButton logoff,JButton sair){
        this.SobreItem=SobreItem;
        this.logoff=logoff;
        this.sair=sair;
    }
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == SobreItem)
            sobreItem();
        else if (evento.getSource() == logoff)
            logoff();
        else if(evento.getSource() == sair)
            sair();
    }


    public abstract void sobreItem();
    public abstract void sair();
    public abstract void logoff();


}