/*
Criado por Gabriel Gageiro;
Data:09/05/18
*/


package com.topicos.bancoDeDados;

import com.topicos.cadastro.Pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Banco {
    private static final String HOST = "db4free.net";
    private static final String BANCO = "aula_banco";
    private static final String USUARIO = "gabriel";
    private static final String SENHA = "gabriel123";
    private static final String URL = "jbdc:mysql://" + HOST + "/" + BANCO + "?useSSL=false";

    private static Connection connection = null;

    private Banco() {
    }

    public static Connection getConexao() {

        if (connection == null) {

            try {
                connection = DriverManager.getConnection(URL, USUARIO, SENHA);

            } catch (SQLException e) {
                System.err.println("Erro: " + e.getMessage());
            }

            if (connection == null)
                System.err.println("Não foi possivel realizar conexão");

        }

        return connection;
    }


    public static boolean fecharConexao() {
        if (connection != null) {
            try {
                connection.close();
                return true;

            } catch (SQLException e) {
                e.getMessage();
            }
        }

        return false;
    }

    public static void inserir(Pessoas p) {
        String sql;

        if (p.novo()) {
            sql = "INSERT INTO PESSOA (NM_PESSOA,VL_CPF,DS_RUA,DS_UF,DS_CIDADE,VL_CASA,VL_TELEFONE,VL_CELULAR) VALUES (" +
                    p.getNome() + "," + p.getCPF() + "," + p.getRua() + "," + p.getUF() + "," + p.getCidade() + "," +
                    p.getNumeroCasa() + "," + p.getTelefone() + "," + p.getTelefone2() + ")";

        } else {
            sql = "UPDATE PESSOA SET " + "(NM_PESSOA,VL_CPF,DS_RUA,DS_UF,DS_CIDADE,VL_CASA,VL_TELEFONE,VL_CELULAR)" + "(= ? WHERE id = " +
                    p.getId();
        }
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
        }
    }
}



