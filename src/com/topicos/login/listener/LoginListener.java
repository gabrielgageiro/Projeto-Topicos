/*
Criado por Gabriel Gageiro;
Data:08/05/18
*/


package com.topicos.login.listener;

import com.topicos.logs.login.LogLogin;
import com.topicos.logs.logsys.LogDeAcoes;
import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private JButton login;
    private JFrame tl;

    public LoginListener(JButton login,JFrame tl){
        this.login=login;
        this.tl=tl;
        login.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            validarLogin();
        }
        else
            sair();
    }


    private void validarLogin(){
        LogLogin.salvar(tl.toString());
        tl.dispose();
        new LogDeAcoes(tl.toString());
        LogDeAcoes.salvarLog("tela principal");
        new Principal();
    }

    private  void sair(){
        tl.dispose();
    }

}
