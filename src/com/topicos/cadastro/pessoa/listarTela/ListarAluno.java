/*
Criado por: Herick Maciel Maia
Data: 18/05/18
 */
package com.topicos.cadastro.pessoa.listarTela;

import com.topicos.cadastro.aluno.Aluno;
import com.topicos.cadastro.aluno.AlunoDAO;

import javax.swing.*;
import java.awt.Font;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListarAluno extends JInternalFrame {

    private JTable tabelaAluno;
    private JTextField txtProcurarAluno;
    private TableModel val;
    private JCheckBox chckbxNome;
    private JCheckBox chckbxCurso;
    private boolean checkNome, checkCurso;
    private JButton btnBuscar;
    private JButton btnAtualizar;

    public ListarAluno() {
        super("Listagem de Aluno");
        setClosable(true);
        setBounds(100, 100, 450, 422);
        getContentPane().setLayout(null);

        String [] colunas = {"Nome", "Curso", "Email", "Telefone"};

        Object [][] dados = {
                {"Ana Maria", "Ingles", "ana.monteiro@gmail.com", "48 99237898"},
                {"Joao da Silva", "Ingles", "joaosilva@hotmail.com", "48 88903345"},
                {"Pedro Pedras", "Espanhol", "pedrinho@gmail.com", "48 9870-5634"}
        };

        tabelaAluno = new JTable(dados, colunas);
        JScrollPane barraRolagem = new JScrollPane(tabelaAluno);
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

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnBuscar.setBounds(236, 37, 89, 21);
        getContentPane().add(btnBuscar);
        btnAtualizar= new JButton("Atualizar");
        btnAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAtualizar.setBounds(335, 37, 89, 21);
        getContentPane().add(btnAtualizar);

        txtProcurarAluno = new JTextField();
        txtProcurarAluno.setBounds(10, 37, 216, 20);
        getContentPane().add(txtProcurarAluno);
        txtProcurarAluno.setColumns(10);

        chckbxNome.addActionListener(evt -> checkBox());
        chckbxCurso.addActionListener(evt -> checkBox());
        btnBuscar.addActionListener(evt -> btnBuscarActionPerformed());
        btnAtualizar.addActionListener(evt -> btnAtualizarActionPerformed());
    }

    public void btnAtualizarActionPerformed(){
        val = tabelaAluno.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
        tabelaAluno.setRowSorter(sorter);
        new AlunoDAO().getObjetos(new Aluno());
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
            val = tabelaAluno.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
            tabelaAluno.setRowSorter(sorter);
            String text = txtProcurarAluno.getText().toUpperCase();
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
            val = tabelaAluno.getModel();
            final TableRowSorter<TableModel> sorter = new TableRowSorter<>(val);
            tabelaAluno.setRowSorter(sorter);
            String text = txtProcurarAluno.getText().toUpperCase();
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
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunos = alunoDAO.getObjetos(new Aluno());
        alunos.forEach(s -> System.out.println("curso" + s.getCurso() +"email "+s.getEmail() + " nome "+ s.getNome() +"Sobrenome"));
    }
}