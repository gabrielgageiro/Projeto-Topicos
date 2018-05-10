/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.app;

import com.topicos.login.Login;
import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
//        new Login();
        new Principal();
    }

}
