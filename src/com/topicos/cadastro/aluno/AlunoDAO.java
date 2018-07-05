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

public class AlunoDAO extends Banco implements PersistirDados<Aluno> {

    public AlunoDAO(){}

    @Override
    public Aluno persistir(Aluno objeto) {

        objeto.setContato(new ContatoDAO().persistir(objeto.getContato()));
        objeto.setEndereco(new EnderecoDAO().persistir(objeto.getEndereco()));

        String sql ="INSERT INTO Pessoa (nome, sobrenome, CPF,Endereco_idEndereco,Contato_idCon) " +
                "VALUES(\"" +objeto.getNome() + "\",\""+objeto.getSobrenome()+"\",\'" +objeto.getCPF()+
                "\',\"" + objeto.getEndereco().getId() + "\",\"" + objeto.getContato().getId()
                +"\")";

        try {
            connection = getConexao();
            PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstm.execute();
            ResultSet resultSet = pstm.getGeneratedKeys();

            resultSet.next();
            objeto.setId(resultSet.getInt(1));
            pstm.close();/*
//`idAluno`, `pagamentoEmdia`, `curso`, `Pessoa_idPessoa`

            sql = "INSERT INTO Aluno (pagamentoEmdia,curso,Pessoa_idPessoa) " + "VALUES(\"" + objeto.getPagamentoEmdia() +
                    "\",\"" + objeto.getCurso() + "\",\"" + objeto.getId() + "\")";
            connection = getConexao();
            PreparedStatement pstm2 = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstm2.execute();
            ResultSet resultSet2 = pstm2.getGeneratedKeys();

            resultSet2.next();
            objeto.setId(resultSet.getInt(1));
            pstm2.close();*/
        } catch (SQLException e) {
            e.printStackTrace();
            LogDeAcoes.salvarLog(e.getMessage());
        }

        return null;
    }

    }



