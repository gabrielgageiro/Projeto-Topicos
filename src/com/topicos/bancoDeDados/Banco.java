/*
Criado por Gabriel Gageiro;
Data:09/05/18
*/


package com.topicos.bancoDeDados;

import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    private static final String HOST = "db4free.net";
    private static final String BANCO = "aula_banco";
    private static final String USUARIO = "gabriel";
    private static final String SENHA = "gabriel123";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + BANCO + "?useSSL=false";

    private static Connection connection = null;

    private Banco() {
    }

    public static Connection getConexao() {

        if (connection == null) {

            try {
                connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            } catch (SQLException e) {
                LogDeAcoes.salvarLog(e.getMessage());
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco"
                        , "Erro de conexao", JOptionPane.ERROR_MESSAGE);
            }

        }

        return connection;
    }


    public static boolean fecharConexao() {
        if (connection != null) {
            try {
                connection.close();
                return true;

            } catch (SQLException e) {
                LogDeAcoes.salvarLog(e.getMessage());
            }
        }

        return false;
    }

}