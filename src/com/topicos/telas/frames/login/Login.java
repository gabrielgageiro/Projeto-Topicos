/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.telas.frames.login;


import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;



public class Login extends JFrame {
    private JTextField login;
    private JPasswordField senha;
    private JButton logar;
    private JButton cancelar;

    public Login() {
        super("Tela de login");

        login = new JTextField();
        senha = new JPasswordField();

        logar = new JButton("Logar");
        logar.addActionListener(new BotaoLogar());
        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new BotaoCancelar());

        setLocationRelativeTo(null);
        Container c = getContentPane();

        c.setLayout(new GridLayout(3, 2, 3, 3));
        //Poe Fonte
        Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 20);
        //icones
        ImageIcon iconeSenha = new ImageIcon("src/com/topicos/telas/icones/senha.png");

        ImageIcon iconeLogin = new ImageIcon("src/com/topicos/telas/icones/login_photo.png");

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

    }

    private class BotaoCancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            exit(0);
        }
    }

    private class BotaoLogar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

                new Principal();
                dispose();
        }
    }
}

