/*
Criado por: Herick Maciel Maia
Data: 18/05/18.
 */
package com.topicos.pessoa;

import javax.swing.*;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ListarProfessor extends JInternalFrame{
    private JTable tabelaProfessor;
    private JTextField txtProcurarProfessor;
    private DefaultTableModel val;

    public ListarProfessor(){
        super("Listagem de Professor");
        setClosable(true);
        setBounds(100, 100, 450, 422);
        getContentPane().setLayout(null);

        String [] colunas = {"Nome", "Curso", "Email", "Telefone"};

        Object [][] dados = {
                {"Jorge Maciel", "Ingles", "jorge.maciel@gmail.com", "48 99237898"},
                {"Maria Dolores", "Alemao", "doloresmaria@hotmail.com", "48 88903345"},
                {"Otavio Rubres", "Espanhol", "tavaorubres@gmail.com", "48 9870-5634"}
        };

        tabelaProfessor = new JTable(dados, colunas);
        JScrollPane barraRolagem = new JScrollPane(tabelaProfessor);
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

        txtProcurarProfessor = new JTextField();
        txtProcurarProfessor.setBounds(10, 37, 196, 20);
        getContentPane().add(txtProcurarProfessor);
        txtProcurarProfessor.setColumns(10);
    }
}
