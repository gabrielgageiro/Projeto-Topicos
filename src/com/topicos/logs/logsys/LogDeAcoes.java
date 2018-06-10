/*
Criado por Gabriel Gageiro;
Data:16/05/18
*/


package com.topicos.logs.logsys;

import java.awt.*;
import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public final class LogDeAcoes {


    private static String usuario;
    private static LocalDateTime localDateTime;
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
            .withLocale(new Locale("pt", "br"));

    public LogDeAcoes(String usuario) {
        this.usuario = usuario;

    }

    public static void salvarLog(String evento) {
        new Thread(() -> {
            localDateTime = LocalDateTime.now();
            String dados = localDateTime.format(FORMATADOR) + "\t" + "|" + "\t" + usuario +
                    "\t" + "\t" + "|" + "\t" + evento + "\n";

            try {
                FileWriter fileWriter = new FileWriter("log.log", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(dados);
                bufferedWriter.flush();
                bufferedWriter.close();


            } catch (IOException e) {
                e.printStackTrace();
                LogDeAcoes.salvarLog(e.getMessage());

            }
        }).start();

    }

    public static void lerLog() {
        //new Thread(() -> {
            try {
                FileReader fileReader = new FileReader("log.log");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (bufferedReader.ready()){
                    System.out.println(bufferedReader.readLine());
                }
                bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();
                LogDeAcoes.salvarLog(e.getMessage());
            }
       // }).start();

    }

}
