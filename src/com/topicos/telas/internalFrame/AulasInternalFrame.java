/*
Criado por Gabriel Gageiro;
Data:02/04/18
*/


package com.topicos.telas.internalFrame;

import javax.swing.*;

public class AulasInternalFrame extends JInternalFrame {
    private JComboBox idiomaCbx;
    private JComboBox professorCbx;
    private JComboBox alunosCbx;

    public AulasInternalFrame() {
        setClosable(true);
        setTitle("Cadastro de Turmas");
        setBounds(100, 100, 400, 501);
        getContentPane().setLayout(null);

        JLabel idiomaLabel = new JLabel("Idioma :");
        idiomaLabel.setBounds(35, 27, 70, 15);
        getContentPane().add(idiomaLabel);

        JLabel professorLabel = new JLabel("Professor :");
        professorLabel.setBounds(35, 77, 90, 15);
        getContentPane().add(professorLabel);

        JLabel alunoLabel = new JLabel("Alunos: ");
        alunoLabel.setBounds(35, 127, 70, 15);
        getContentPane().add(alunoLabel);


        idiomaCbx = new JComboBox();
        idiomaCbx.setBounds(100, 27, 199, 19);
        //Modificar com o Banco de Dados
        idiomaCbx.addItem("Espanhol");
        idiomaCbx.addItem("Inglês");
        idiomaCbx.addItem("Italiano");
        idiomaCbx.addItem("Português");
        //
        getContentPane().add(idiomaCbx);

        professorCbx = new JComboBox();
        professorCbx.setBounds(100, 77, 199, 19);
        //Modificar com o Banco de Dados
        professorCbx.addItem("Fulano");
        professorCbx.addItem("Ciclano");
        professorCbx.addItem("Beltrano");
        professorCbx.addItem("Zicrano");
        //
        getContentPane().add(professorCbx);

        alunosCbx = new JComboBox();
        alunosCbx.setBounds(100, 127, 199, 19);
        //Modificar com o Banco de Dados
        alunosCbx.addItem("Tu");
        alunosCbx.addItem("Ele");
        alunosCbx.addItem("Vós");
        alunosCbx.addItem("Eles");
        //
        getContentPane().add(alunosCbx);


    }
}