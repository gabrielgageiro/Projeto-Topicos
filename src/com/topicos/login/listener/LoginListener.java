/*
Criado por Gabriel Gageiro;
Data:08/05/18
*/


package com.topicos.login.listener;

import com.topicos.logs.login.LogLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private JButton login,cancelar;
    private JFrame tl;

    public LoginListener(JButton login, JButton cancelar,JFrame tl){
        this.login=login;
        this.cancelar=cancelar;
        this.tl=tl;

        cancelar.addActionListener(this);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            validarLogin();
            LogLogin.salvar(tl.toString());
        }
        else
            sair();
    }


    private void validarLogin(){
    }

    private  void sair(){
        tl.dispose();
    }

}
