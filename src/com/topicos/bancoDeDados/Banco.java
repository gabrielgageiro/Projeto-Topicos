/*
Criado por Gabriel Gageiro;
Data:09/05/18
*/


package com.topicos.bancoDeDados;

import com.topicos.cadastro.contato.Contato;
import com.topicos.comum.Cadastro;
import com.topicos.exceptions.Exceptions;
import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;
import java.sql.*;

public class Banco {


    private static final String HOST = "db4free.net";
    private static final String BANCO = "escola_idioma";
    private static final String USUARIO = "escola";
    private static final String SENHA = "12345678";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + BANCO + "?useSSL=false";

/*

    private static final String HOST = "localhost";
    private static final String BANCO = "escola_Idioma";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://" + HOST + "/" + BANCO + "?useSSL=false";
*/

    protected static Connection connection = null;

    protected Banco() {
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

    public static boolean validarUsuario(String usuario, String password){

        String sql = "SELECT usuario, password FROM Usuario";

        try  {
            Connection conn = getConexao();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                return rs.getString("usuario").equals(usuario) && rs.getString("password").equals(password);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            LogDeAcoes.salvarLog(e.getMessage());

        }
        return true;

    }

}