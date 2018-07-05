/*
Criado por Gabriel Gageiro;
Data:08/06/18
*/

package com.topicos.cadastro.aluno;

import com.topicos.bancoDeDados.Banco;
import com.topicos.cadastro.contato.Contato;
import com.topicos.cadastro.contato.ContatoDAO;

public class AlunoDAO{

    private AlunoDAO(){}


    public static void persistirDados(Aluno aluno) {
        String sql = "";

        aluno.setContato(new ContatoDAO().persistir(aluno.getContato()));

    }


}
