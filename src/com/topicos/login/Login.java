/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.login;


import com.topicos.login.listener.LoginListener;
import com.topicos.logs.login.LogLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Login extends JFrame {
    private JTextField login;
    private JPasswordField senha;
    private JButton logar;
    private JButton cancelar;
    private ActionListener handle;
    public Login() {
        super("Tela de com.topicos.login");

        login = new JTextField();
        senha = new JPasswordField();

        logar = new JButton("Logar");
        cancelar = new JButton("Cancelar");

        //listener
//
//        handle = new LoginListener(logar,this);
//
//        logar.addActionListener(handle);
//        cancelar.addActionListener(handle);

        //set ultimo usuario
        setLogin();

        setLocationRelativeTo(null);
        Container c = getContentPane();

        c.setLayout(new GridLayout(3, 2, 3, 3));
        //Poe Fonte
        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 20);
        //com.topicos.icones
        ImageIcon iconeSenha = new ImageIcon("src/com/topicos/icones/senha.png");

        ImageIcon iconeLogin = new ImageIcon("src/com/topicos/icones/login_photo.png");

        //Da forma aos botoes
        JLabel log = new JLabel("Login: ");

        log.setIcon(iconeLogin);
        log.setToolTipText("Insira seu usuario");
        log.setFont(fonte);

        JLabel senh = new JLabel("Senha: ");
        senh.setIcon(iconeSenha);
        senh.setToolTipText("Insira sua senha");
        log.setFont(fonte);
        //Adiciona os labels e botoes
        c.add(log);
        c.add(login);

        c.add(senh);
        c.add(senha);
        c.add(logar);
        c.add(cancelar);
        //tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        setVisible(true);
        getRootPane().setDefaultButton(logar);
        new LoginListener(logar,this);
    }

    private void setLogin(){
        login.setText(LogLogin.lerUsuario());
    }
    public void fechar(){
        dispose();
    }

    @Override
    public String toString() {
        return login.getText();
    }
}


