package com.topicos.pessoa;

import javax.swing.*;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ListarAluno extends JInternalFrame {
    private JTable tabelaAluno;
    private JTextField txtProcurarAluno;
    private DefaultTableModel val;

    public ListarAluno() {
        super("Listagem de Aluno");
        setClosable(true);
        setBounds(100, 100, 450, 422);
        getContentPane().setLayout(null);

        String [] colunas = {"Nome", "Curso", "Email", "Telefone"};

        Object [][] dados = {
                {"Ana Maria", "Inglês", "ana.monteiro@gmail.com", "48 99237898"},
                {"João da Silva", "Inglês", "joaosilva@hotmail.com", "48 88903345"},
                {"Pedro Pedras", "Espanhol", "pedrinho@gmail.com", "48 9870-5634"}
        };

        tabelaAluno = new JTable(dados, colunas);
        JScrollPane barraRolagem = new JScrollPane(tabelaAluno);
        barraRolagem.setBounds(10, 68, 414, 313);

        getContentPane().add(barraRolagem);

        JCheckBox chckbxNome = new JCheckBox("Nome");
        chckbxNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNome.setBounds(10, 7, 97, 23);
        getContentPane().add(chckbxNome);

        JCheckBox chckbxCurso = new JCheckBox("Curso");
        chckbxCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxCurso.setBounds(109, 7, 97, 23);
        getContentPane().add(chckbxCurso);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscar.setBounds(216, 37, 89, 20);
        getContentPane().add(btnBuscar);

        txtProcurarAluno = new JTextField();
        txtProcurarAluno.setBounds(10, 37, 196, 20);
        getContentPane().add(txtProcurarAluno);
        txtProcurarAluno.setColumns(10);

    }
}