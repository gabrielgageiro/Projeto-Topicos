/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.app;

import com.topicos.bancoDeDados.Banco;
import com.topicos.login.Login;
import javax.swing.*;

public class App {

    public static void main(String[] args) {

/*

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        Banco.getConexao();
*/

        new Login();
    }

}
