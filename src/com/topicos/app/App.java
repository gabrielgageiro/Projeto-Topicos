/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.app;

import com.topicos.login.Login;
import com.topicos.logs.logsys.LogDeAcoes;
import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
       new Login();
//        new Principal();
    }

}
