/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/


package com.topicos.cadastro.endereco;

import com.topicos.bancoDeDados.Banco;
import com.topicos.comum.interfaces.PersistirDados;
import com.topicos.logs.logsys.LogDeAcoes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EnderecoDAO extends Banco implements PersistirDados<Endereco> {

    public EnderecoDAO(){}

    @Override
    public List<Endereco> getObjetos() {
        return null;
    }

    @Override
    public List<Endereco> getObjetos(Endereco objeto) {
        return null;
    }

    @Override
    public Endereco persistir(Endereco objeto) {

//String UF,String cidade, String rua, int numeroCasa

        String sql = "INSERT INTO Endereco (UF, rua, cidade, numeroCasa,Pessoa_idPessoa) " + "VALUES (\"" +
                objeto.getUF() + "\"," + "\"" + objeto.getRua() + "\"," + "\"" + objeto.getCidade() + "\"," + "\"" + objeto.getNumeroCasa() +
                "\",\"" + objeto.getPessoa_idPessoa() + "\")";

        try {
            connection = getConexao();
            PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstm.execute();
            ResultSet resultSet = pstm.getGeneratedKeys();

            resultSet.next();
            objeto.setId(resultSet.getInt(1));
            pstm.close();


        } catch (SQLException e) {
            e.printStackTrace();
            LogDeAcoes.salvarLog("Salvo com sucesso no banco");

        }        LogDeAcoes.salvarLog("Salvo com sucesso no banco");

        return objeto;
    }
}