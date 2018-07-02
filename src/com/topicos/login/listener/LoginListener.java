/*
Criado por Gabriel Gageiro;
Data:08/05/18
*/


package com.topicos.login.listener;

import com.topicos.bancoDeDados.Banco;
import com.topicos.login.Login;
import com.topicos.logs.login.LogLogin;
import com.topicos.logs.logsys.LogDeAcoes;
import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private JButton btnlogin;
    private Login login;
    public LoginListener(JButton btnlogin, Login login) {
        this.btnlogin = btnlogin;
        this.login = login;
        btnlogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnlogin) {
            validarLogin();
        }
    }

    private void validarLogin() {
        LogLogin.salvar(login.getUsuario());
         String usuario,senha;

        usuario=login.getUsuario();
        senha = String.valueOf(login.getSenha());

        System.out.println(senha);
        if (Banco.validarUsuario(usuario, senha)) {
            new LogDeAcoes(usuario);
            LogDeAcoes.salvarLog("tela principal");
            login.dispose();
            new Principal();
        } else {
            JOptionPane.showMessageDialog(null, "Login inválido"
                    , "Erro de login", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}