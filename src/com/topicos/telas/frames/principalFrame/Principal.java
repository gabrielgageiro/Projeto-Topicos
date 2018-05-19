package com.topicos.telas.frames.principalFrame;

import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;

import com.topicos.aula.AulaInternalFrame;
import com.topicos.pessoa.ListarAluno;
import com.topicos.pessoa.PessoaInternalFrame;

public class Principal extends JFrame {

    private JPanel contentPane;

    private JMenuBar menuBar = new JMenuBar();

    private JMenu ArquivoMenu = new JMenu("Arquivo");
    private JButton btnLogout;
    private JMenuItem SairArquivoItem = new JMenuItem("Sair");

    private JMenu AdminMenu = new JMenu("Admin");
    private JButton btnExit;
    private JMenuItem ListarAlunoItem = new JMenuItem("Listar Aluno");

    private JMenuItem RemoverUsuarioItem = new JMenuItem("Remover Usuario");

    private JMenu AjudaMenu = new JMenu("Ajuda");

    private PessoaInternalFrame pessoaInternalFrame = new PessoaInternalFrame();
    private ListarAluno listarAluno = new ListarAluno();

    private AulaInternalFrame aulaInternalFrame = new AulaInternalFrame();

    private ActionListener handle;
    private JMenuItem SobreItem = new JMenuItem("Sobre");

    /**
     * Create the frame.
     */
    public Principal() {

        setTitle("Topicos Especiais - I");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 811, 711);

        setJMenuBar(menuBar);

        menuBar.add(ArquivoMenu);

        ArquivoMenu.add(SairArquivoItem);

        menuBar.add(AdminMenu);

        AdminMenu.add(ListarAlunoItem);

        AdminMenu.add(RemoverUsuarioItem);

        menuBar.add(AjudaMenu);

        AjudaMenu.add(SobreItem);

        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelOpcoes = new JPanel();
        panelOpcoes.setBorder(new LineBorder(null));
        panelOpcoes.setBounds(0, 0, 1920, 53);
        contentPane.add(panelOpcoes);
        panelOpcoes.setLayout(null);

        btnExit = new JButton("Exit");

        btnExit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        btnExit.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnExit.setBackground(UIManager.getColor("Button.background"));
        btnExit.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/exit.png")));
        btnExit.setBounds(12, 6, 70, 45);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/floppy_disk_sh.png")));
        btnSalvar.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnSalvar.setIconTextGap(1);
        btnSalvar.setBounds(94, 6, 70, 45);
        panelOpcoes.add(btnSalvar);

        btnLogout = new JButton("Logout");
        btnLogout.setBorder(new LineBorder(new Color(0, 0, 0)));

        handle = new ListennerPrincipalFrame(SobreItem, btnLogout, btnExit, this);
        btnExit.addActionListener(handle);

        panelOpcoes.add(btnExit);

        btnLogout.addActionListener(handle);
        btnLogout.setBounds(176, 6, 81, 45);
        btnLogout.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/logout.png")));
        panelOpcoes.add(btnLogout);

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.setBorder(new LineBorder
                (new Color(0, 0, 0)));
        btnCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/telas/icones/register.png")));

        btnCadastrar.setBounds(269, 6, 131, 45);
        panelOpcoes.add(btnCadastrar);

        JButton btnCadastrarTurma = new JButton("Cadastrar Turma");
        btnCadastrarTurma.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnCadastrarTurma.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/register.png")));
        btnCadastrarTurma.setBounds(412, 6, 131, 45);
        panelOpcoes.add(btnCadastrarTurma);

        SobreItem.addActionListener(handle);

        contentPane.add(pessoaInternalFrame);
        contentPane.add(aulaInternalFrame);
        contentPane.add(listarAluno);

        setVisible(true);

        ListarAlunoItem.addActionListener(evt -> listarAluno.setVisible(true));

        SairArquivoItem.addActionListener(e -> {
            dispose();
        });

        btnCadastrar.addActionListener(e -> {
            pessoaInternalFrame.setVisible(true);
        });

        btnCadastrarTurma.addActionListener(e -> {
            aulaInternalFrame.setVisible(true);
        });

        btnSalvar.addActionListener(e ->{
            System.out.println("Salvar Principal");
        });

    }

    //public void ListarAluno(java.awt.event.ActionEvent evt){
        //listarAluno.setVisible(true);
    //}
}