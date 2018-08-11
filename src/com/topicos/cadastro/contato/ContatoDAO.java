/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/

package com.topicos.cadastro.contato;


import com.topicos.bancoDeDados.Banco;
import com.topicos.comum.interfaces.PersistirDados;
import com.topicos.logs.logsys.LogDeAcoes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ContatoDAO extends Banco implements PersistirDados<Contato>{

    public ContatoDAO(){}

    @Override
    public List<Contato> getObjetos() {
        return null;
    }

    @Override
    public List<Contato> getObjetos(Contato objeto) {
        return null;
    }

    @Override
    public Contato persistir(Contato objeto) {

        String sql ="INSERT INTO Contato (email, telefone, celular,Pessoa_idPessoa) " +
                "VALUES(\"" +objeto.getEmail() + "\",\""+objeto.getTelefone()+"\",\"" +objeto.getCelular()+
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
            LogDeAcoes.salvarLog(e.getMessage());
        }
        LogDeAcoes.salvarLog("Salvo com sucesso no banco");

        return objeto;
    }
}


