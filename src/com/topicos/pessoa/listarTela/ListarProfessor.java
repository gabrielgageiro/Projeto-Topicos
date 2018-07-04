/*
Criado por: Herick Maciel Maia
Data: 18/05/18.
 */
package com.topicos.pessoa.listarTela;

import javax.swing.*;
import java.awt.Font;
import java.util.regex.PatternSyntaxException;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListarProfessor extends JInternalFrame{
    private JTable tabelaProfessor;
    private JTextField txtProcurarProfessor;
    private TableModel val;
    private JCheckBox chckbxNome;
    private JCheckBox chckbxCurso;
    private boolean checkNome, checkCurso;

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

        chckbxNome = new JCheckBox("Nome");
        chckbxNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNome.setBounds(10, 7, 97, 23);
        getContentPane().add(chckbxNome);

        chckbxCurso = new JCheckBox("Curso");
        chckbxCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxCurso.setBounds(109, 7, 97, 23);
        getContentPane().add(chckbxCurso);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscar.setBounds(236, 37, 89, 21);
        getContentPane().add(btnBuscar);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAtualizar.setBounds(335, 37, 89, 21);
        getContentPane().add(btnAtualizar);

        txtProcurarProfessor = new JTextField();
        txtProcurarProfessor.setBounds(10, 37, 216, 20);
        getContentPane().add(txtProcurarProfessor);

        chckbxNome.addActionListener(evt -> checkBox());
        chckbxCurso.addActionListener(evt -> checkBox());
        btnBuscar.addActionListener(evt -> btnBuscarActionPerformed());
        btnAtualizar.addActionListener(evt -> btnAtualizarActionPerformed());
    }

    public void btnAtualizarActionPerformed(){
        val = tabelaProfessor.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
        tabelaProfessor.setRowSorter(sorter);
        sorter.setRowFilter(null);
    }

    public void checkBox(){
        if(chckbxNome.isSelected()) {
            checkNome = true;
        } else{
            checkNome = false;
        }

        if(chckbxCurso.isSelected()) {
            checkCurso = true;
        } else{
            checkCurso = false;
        }
    }

    private void btnBuscarActionPerformed() {
        if(checkNome && checkCurso == false) {
            val = tabelaProfessor.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
            tabelaProfessor.setRowSorter(sorter);
            String text = txtProcurarProfessor.getText().toUpperCase();
            if (text.length() == 0) {
                sorter.setRowFilter(null);
            } else {
                try {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0));
                } catch (PatternSyntaxException pse) {
                    System.err.println("Erro");
                }
            }
        }
        if(checkCurso && checkNome == false) {
            val = tabelaProfessor.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
            tabelaProfessor.setRowSorter(sorter);
            String text = txtProcurarProfessor.getText().toUpperCase();
            if (text.length() == 0) {
                sorter.setRowFilter(null);
            } else {
                try {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 1));

                } catch (PatternSyntaxException pse) {
                    System.err.println("Erro");
                }
            }
        }
        if(checkNome && checkCurso){
            JOptionPane.showMessageDialog(null, "Os dois filtros estão marcados");
        }
        if(checkNome == false && checkCurso == false){
            JOptionPane.showMessageDialog(null, "Nenhum filtro marcado");
        }
    }
}
