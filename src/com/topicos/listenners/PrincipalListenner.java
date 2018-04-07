/*
Criado por Gabriel Gageiro;
Data:04/04/18
*/


package com.topicos.listenners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PrincipalListenner implements ActionListener{

    private JMenuItem SobreItem;
    private JButton btnCadastrar;


    public PrincipalListenner(JMenuItem SobreItem,JButton btnCadastrar){
        this.SobreItem=SobreItem;
        this.btnCadastrar=btnCadastrar;
    }
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == SobreItem)
            sobreItem();
        else if(evento.getSource() == btnCadastrar)
            btnCadastrar();

    }

    public abstract void btnCadastrar();

    public abstract void sobreItem();
/*

*/


}