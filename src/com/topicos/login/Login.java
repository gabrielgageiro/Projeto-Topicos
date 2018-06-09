/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.login;


import com.topicos.login.listener.LoginListener;
import com.topicos.logs.login.LogLogin;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JTextField login;
    private JPasswordField senha;
    private JButton logar;
    public Login() {
        super("Tela de login");

        login = new JTextField();
        login.setBounds(140, 3, 148, 38);
        senha = new JPasswordField();
        senha.setBounds(140, 42, 148, 38);

        logar = new JButton("Logar");
        logar.setBounds(10, 82, 278, 38);

        setLogin();

        setLocationRelativeTo(null);
        Container c = getContentPane();

        c.setLayout(new GridLayout(3, 2, 3, 3));
        //Poe Fonte
        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 20);
        ImageIcon iconeSenha = new ImageIcon("src/com/topicos/icones/senha.png");

        ImageIcon iconeLogin = new ImageIcon("src/com/topicos/icones/login_photo.png");

        //Da forma aos botoes
        JLabel log = new JLabel("Login: ");
        log.setBounds(10, 0, 131, 38);

        log.setIcon(iconeLogin);
        log.setToolTipText("Insira seu usuario");
        log.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));

        JLabel senh = new JLabel("Senha: ");
        senh.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
        senh.setBounds(10, 39, 131, 38);
        senh.setIcon(iconeSenha);
        senh.setToolTipText("Insira sua senha");
        getContentPane().setLayout(null);
        log.setFont(fonte);
        //Adiciona os labels e botoes
        c.add(log);
        c.add(login);

        c.add(senh);
        c.add(senha);
        c.add(logar);

        //tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 130);
        setResizable(false);

        setVisible(true);
        getRootPane().setDefaultButton(logar);
        LoginListener loginListener = new LoginListener(logar,this);
    }

    private void setLogin(){
        login.setText(LogLogin.lerUsuario());
    }


    @Override
    public String toString() {
        return login.getText();
    }
}


