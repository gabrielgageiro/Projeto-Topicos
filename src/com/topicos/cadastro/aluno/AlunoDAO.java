/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/

package com.topicos.cadastro.aluno;

import com.topicos.bancoDeDados.Banco;
import com.topicos.cadastro.contato.ContatoDAO;
import com.topicos.cadastro.endereco.EnderecoDAO;
import com.topicos.comum.interfaces.PersistirDados;
import com.topicos.logs.logsys.LogDeAcoes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends Banco implements PersistirDados<Aluno> {

    public AlunoDAO(){}

    @Override
    public List<Aluno> getObjetos(Aluno objeto) {
        return null;
    }

    @Override
    public List<Aluno> getObjetos() {
        String sql = "select nome,sobrenome,telefone,email FROM Pessoa INNER JOIN Contato ON Contato.Pessoa_idPessoa = Pessoa.idPessoa";
        List<Aluno> alunos = new ArrayList<>();
        try {
            connection = getConexao();
            PreparedStatement pstmPessoa = connection.prepareStatement(sql);

            ResultSet resultSet =  pstmPessoa.executeQuery();
        /*
            {"Ana Maria", "Ingles", "ana.monteiro@gmail.com", "48 99237898"},
            {"Joao da Silva", "Ingles", "joaosilva@hotmail.com", "48 88903345"},
            {"Pedro Pedras", "Espanhol", "pedrinho@gmail.com", "48 9870-5634"}*/

            while (resultSet.next()) {
                Aluno objeto = new Aluno();

                objeto.setNome(resultSet.getString("nome"));
                objeto.setSobrenome(resultSet.getString("sobrenome"));
                objeto.setEmail(resultSet.getString("email"));
                objeto.setTelefone(resultSet.getString("telefone"));

                alunos.add(objeto);
            }
            pstmPessoa.close();
        } catch (SQLException e) {
            e.printStackTrace();
            LogDeAcoes.salvarLog(e.getMessage());
        }

        LogDeAcoes.salvarLog("Dados carregado do banco");
        return alunos;
    }

    @Override
    public Aluno persistir(Aluno objeto) {

        String sql ="INSERT INTO Pessoa (nome, sobrenome, CPF) " +
                "VALUES(\"" +objeto.getNome() + "\",\""+objeto.getSobrenome()+"\",\"" +objeto.getCPF()
                +"\")";

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



