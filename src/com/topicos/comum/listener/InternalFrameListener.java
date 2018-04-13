/*
Criado por Gabriel Gageiro;
Data:13/04/18
*/


package com.topicos.comum.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class InternalFrameListener implements ActionListener {
        private JButton btnCadastrar;
     private JButton btnCancelar;


        public InternalFrameListener(JButton btnCancelar,JButton btnCadastrar){
            this.btnCancelar=btnCancelar;
            this.btnCadastrar=btnCadastrar;
        }
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == btnCancelar)
                btnCancelar();
            else if(evento.getSource() == btnCadastrar)
                btnCadastrar();

        }

        public abstract void btnCadastrar();

        public abstract void btnCancelar();

}
