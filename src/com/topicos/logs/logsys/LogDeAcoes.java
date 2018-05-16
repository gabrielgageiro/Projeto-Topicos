/*
Criado por Gabriel Gageiro;
Data:16/05/18
*/


package com.topicos.logs.logsys;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;

public final class  LogDeAcoes {

    private static String usuario;
    private static ArrayList<String> log = new ArrayList<>();
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
            .withLocale(new Locale("pt","br"));

    public LogDeAcoes(String usuario){
        this.usuario=usuario;

    }


    public static void salvarLog(String evento){

        LocalDateTime localDateTime = LocalDateTime.now();
        String dados = localDateTime.format(FORMATADOR) + "\t" + "|" + "\t" + usuario +
                 "\t" +   "\t" + "|"  + "\t" +  evento +"\n";


        try {
            FileWriter fileWriter = new FileWriter("log.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dados);
            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
