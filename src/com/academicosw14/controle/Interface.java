package com.academicosw14.controle;
	import java.awt.EventQueue;

	import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JList;

import com.academicosw14.modelo.Disciplina;

	public class Interface {

		private JFrame frmMenu;
		private JPanel panelMenu;
		private JPanel panelLista;
		private JPanel panelCadastro;
		private JPanel panelAltera;
		private JPanel panelRemove;
		private JTextField textField;
		private JTextField textFieldAlteraDisciplina1Nome;
		private JTextField textFieldAlteraAluno1Nome;
		private JTextField textFieldCadastroDisciplinaNome;
		private JTextField textFieldCadastroAlunoNome;		
		private JTextField textFieldAlteraDisciplina1Periodo;
		private JTextField textFieldAlteraAluno1Identidade;
		private JTextField textFieldCadastroDisciplinaPeriodo;
		private JTextField textFieldCadastroAlunoIdentidade;		
		private JTextField textFieldAlteraDisciplina1Ementa;
		private JTextField textFieldAlteraAluno1CPF;
		private JTextField textFieldCadastroDisciplinaEmenta;
		private JTextField textFieldCadastroAlunoCPF;		
		private JTextField textFieldAlteraDisciplina1Professor;
		private JTextField textFieldAlteraAluno1Telefone;
		private JTextField textFieldCadastroDisciplinaProfessor;
		private JTextField textFieldCadastroAlunoTelefone;		
		private JTextField textFieldAlteraAluno1Matricula;
		private JTextField textFieldCadastroAlunoMatricula;		
		private JTextField textFieldAlteraAluno1Rua;
		private JTextField textFieldCadastroAlunoCre;		
		private JTextField textFieldAlteraAluno1Curso;
		private JTextField textFieldCadastroAlunoCurso;		
		private JTextField textFieldAlteraAluno1Numero;
		private JTextField textFieldCadastroAlunoRua;		
		private JTextField textFieldAlteraAluno1Estado;
		private JTextField textFieldCadastroAlunoNumero;		
		private JTextField textFieldAlteraAluno1Pais;
		private JTextField textFieldCadastroAlunoEstado;
		private JLabel lblAlteraDisciplina1Nome;
		private JLabel lblAlteraDisciplina1Periodo;
		private JLabel lblAlteraDisciplina1Ementa;	
		private JLabel lblAlteraDisciplina1Professor;
		private JLabel lblAlteraAluno1Nome;
		private JLabel lblAlteraAluno1Identidade;
		private JLabel lblAlteraAluno1CPF;
		private JLabel lblAlteraAluno1Telefone;
		private JLabel lblAlteraAluno1Matricula;
		private JLabel lblAlteraAluno1Curso;
		private JLabel lblAlteraAluno1Rua;
		private JLabel lblAlteraAluno1Numero;
		private JLabel lblAlteraAluno1Estado;
		private JLabel lblAlteraAluno1Pais;
		private JLabel lblCadastroAlunoNome;
		private JLabel lblCadastroAlunoIdentidade;
		private JLabel lblCadastroAlunoCPF;
		private JLabel lblCadastroAlunoTelefone;
		private JLabel lblCadastroAlunoMatricula;
		private JLabel lblCadastroAlunoCurso;
		private JLabel lblCadastroAlunoRua;
		private JLabel lblCadastroAlunoNumero;
		private JLabel lblCadastroAlunoEstado;
		private JLabel lblCadastroAlunoPais;	
		private JTextField textFieldRemoveAlunoNome;
		private JTextField textFieldCadastroAlunoPais;
		private JTextField textFieldRmoveDisciplinaNome;
		private JTextField textFieldAlteraAluno1Cre;
		private JTextField textFieldCadastroAlunoDisciplina;
		private JTextField textFieldAlteraAluno1Disciplina;
		private JTextField textFieldAlteraAlunoNome;
		private JTextField textFieldAlteraDisciplinaNome;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Interface window = new Interface();
						window.frmMenu.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Interface() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmMenu = new JFrame();
			frmMenu.setTitle("Switch 14");
			frmMenu.setBounds(100, 100, 761, 490);
			frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmMenu.getContentPane().setLayout(new CardLayout(0, 0));
			
			JPanel panelMenu = new JPanel();
			frmMenu.getContentPane().add(panelMenu, "name_35328233018601");
			panelMenu.setLayout(null);
			panelMenu.setVisible(true);
			
			JPanel panelLista = new JPanel();
			frmMenu.getContentPane().add(panelLista, "name_35342287320523");
			panelLista.setLayout(null);
			panelLista.setVisible(false);
					
			JPanel panelCadastro = new JPanel();
			frmMenu.getContentPane().add(panelCadastro, "name_35343863892046");
			panelCadastro.setLayout(null);
			panelCadastro.setVisible(false);
			
			JPanel panelCadastroAluno = new JPanel();
			frmMenu.getContentPane().add(panelCadastroAluno, "name_40040947836680");
			panelCadastroAluno.setLayout(null);
			panelCadastroAluno.setVisible(false);
			
			JPanel panelCadastroDisciplina = new JPanel();
			frmMenu.getContentPane().add(panelCadastroDisciplina, "name_40042503587932");
			panelCadastroDisciplina.setLayout(null);
			panelCadastroDisciplina.setVisible(false);
							
			JPanel panelAltera = new JPanel();
			frmMenu.getContentPane().add(panelAltera, "name_35345325391183");
			panelAltera.setLayout(null);		
			panelAltera.setVisible(false);
			
			JPanel panelRemove = new JPanel();
			frmMenu.getContentPane().add(panelRemove, "name_35346619488727");
			panelRemove.setLayout(null);		
			panelRemove.setVisible(false);
			
			JPanel panelListaAluno = new JPanel();
			frmMenu.getContentPane().add(panelListaAluno, "name_39261663986714");
			panelListaAluno.setLayout(null);		
			panelListaAluno.setVisible(false);
			
			JPanel panelListaDisciplina = new JPanel();
			frmMenu.getContentPane().add(panelListaDisciplina, "name_39263833669500");
			panelListaDisciplina.setLayout(null);		
			panelListaDisciplina.setVisible(false);
			
			JPanel panelAlteraAluno1 = new JPanel();
			frmMenu.getContentPane().add(panelAlteraAluno1, "name_40500590141180");
			panelAlteraAluno1.setLayout(null);
			panelAlteraAluno1.setVisible(false);
			
			JPanel panelAlteraDisciplina1 = new JPanel();
			frmMenu.getContentPane().add(panelAlteraDisciplina1, "name_40502055786451");
			panelAlteraDisciplina1.setLayout(null);
			panelAlteraDisciplina1.setVisible(false);
			
			JPanel panelRemoveAluno = new JPanel();
			frmMenu.getContentPane().add(panelRemoveAluno, "name_40808148796210");
			panelRemoveAluno.setLayout(null);
			panelRemoveAluno.setVisible(false);
			
			JPanel panelRemoveDisciplina = new JPanel();
			frmMenu.getContentPane().add(panelRemoveDisciplina, "name_40810849215969");
			panelRemoveDisciplina.setLayout(null);
			panelRemoveDisciplina.setVisible(false);
			
			JPanel panelListaAlunoRelatorio = new JPanel();
			frmMenu.getContentPane().add(panelListaAlunoRelatorio, "name_42158780106899");
			panelListaAlunoRelatorio.setLayout(null);		
			panelListaAlunoRelatorio.setVisible(false);
			
			JPanel panelListaDisciplinaRelatorio = new JPanel();
			frmMenu.getContentPane().add(panelListaDisciplinaRelatorio, "name_42160091319920");
			panelListaDisciplinaRelatorio.setLayout(null);		
			panelListaDisciplinaRelatorio.setVisible(false);
			
			JButton btnLista = new JButton("Listar");
			btnLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnLista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelLista.setVisible(true);
					panelMenu.setVisible(false);
				}
			});
			btnLista.setBounds(449, 81, 115, 30);
			panelMenu.add(btnLista);
			
			JButton btnCadastro = new JButton("Cadastrar");
			btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCadastro.setVisible(true);
					panelMenu.setVisible(false);
				}
			});
			btnCadastro.setBounds(198, 81, 115, 30);
			panelMenu.add(btnCadastro);
			
			JButton btnAltera = new JButton("Alterar");
			btnAltera.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAltera.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAltera.setVisible(true);
					panelMenu.setVisible(false);
				}
			});
			btnAltera.setBounds(449, 194, 115, 30);
			panelMenu.add(btnAltera);
			
			JButton btnRemove = new JButton("Remover");
			btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemove.setVisible(true);
					panelMenu.setVisible(false);
				}
			});
			btnRemove.setBounds(198, 194, 115, 30);
			panelMenu.add(btnRemove);
			
			JButton btnListaAluno = new JButton("Listar aluno");
			btnListaAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaAluno.setVisible(true);
					panelLista.setVisible(false);				
				}
			});
			btnListaAluno.setToolTipText("Listar alunos");
			btnListaAluno.setBounds(322, 124, 135, 30);
			panelLista.add(btnListaAluno);
			
			JButton btnListaDisciplina = new JButton("Listar disciplina");
			btnListaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaDisciplina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaDisciplina.setVisible(true);
					panelLista.setVisible(false);				
				}
			});
			btnListaDisciplina.setToolTipText("Listar professores");
			btnListaDisciplina.setBounds(322, 187, 135, 30);
			panelLista.add(btnListaDisciplina);
			
			JButton btnListaVoltar = new JButton("Voltar");
			btnListaVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelLista.setVisible(false);
					panelMenu.setVisible(true);
				}
			});
			btnListaVoltar.setBounds(322, 337, 135, 30);
			panelLista.add(btnListaVoltar);
			
			JButton btnCadastroAluno = new JButton("Cadastrar aluno");
			btnCadastroAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCadastroAluno.setVisible(true);
					panelCadastro.setVisible(false);				
				}
			});
			btnCadastroAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroAluno.setBounds(311, 124, 158, 30);
			panelCadastro.add(btnCadastroAluno);
			
			JButton btnCadastroProfessor = new JButton("Cadastrar disciplina");
			btnCadastroProfessor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCadastroDisciplina.setVisible(true);
					panelCadastro.setVisible(false);				
				}
			});
			btnCadastroProfessor.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroProfessor.setBounds(311, 187, 158, 30);
			panelCadastro.add(btnCadastroProfessor);
			
			JButton btnCadastroVoltar = new JButton("Voltar");
			btnCadastroVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCadastro.setVisible(false);
					panelMenu.setVisible(true);
				}
			});
			btnCadastroVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroVoltar.setBounds(311, 337, 158, 30);
			panelCadastro.add(btnCadastroVoltar);
			
			JButton btnAlteraVoltar = new JButton("Voltar");
			btnAlteraVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlteraVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAltera.setVisible(false);
					panelMenu.setVisible(true);
				}
			});
			btnAlteraVoltar.setBounds(322, 336, 139, 30);
			panelAltera.add(btnAlteraVoltar);		
			
			JButton btnRemoveAluno = new JButton("Remover aluno");
			btnRemoveAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemoveAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemoveAluno.setVisible(true);
					panelRemove.setVisible(false);
				}
			});
			btnRemoveAluno.setBounds(308, 124, 151, 30);
			panelRemove.add(btnRemoveAluno);
			
			JButton btnRemoveDisciplina = new JButton("Remover disciplina");
			btnRemoveDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemoveDisciplina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemoveDisciplina.setVisible(true);
					panelRemove.setVisible(false);
				}
			});
			btnRemoveDisciplina.setBounds(308, 187, 151, 30);
			panelRemove.add(btnRemoveDisciplina);
			
			JButton btnRemoveVoltar = new JButton("Voltar");
			btnRemoveVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemoveVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemove.setVisible(false);
					panelMenu.setVisible(true);
				}
			});
			btnRemoveVoltar.setBounds(308, 337, 151, 30);
			panelRemove.add(btnRemoveVoltar);
			
			JButton btnListaAlunoRelatorio = new JButton("Relatorio");
			btnListaAlunoRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaAlunoRelatorio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaAlunoRelatorio.setVisible(true);
					panelListaAluno.setVisible(false);
				}
			});
			btnListaAlunoRelatorio.setBounds(237, 410, 115, 30);
			panelListaAluno.add(btnListaAlunoRelatorio);
			
			JButton btnListaAlunoVoltar = new JButton("Voltar");
			btnListaAlunoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaAlunoVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaAluno.setVisible(false);
					panelLista.setVisible(true);
				}
			});
			btnListaAlunoVoltar.setBounds(446, 410, 115, 30);
			panelListaAluno.add(btnListaAlunoVoltar);
			
			JList listListaAluno = new JList();
			listListaAluno.setBounds(237, 11, 324, 388);
			panelListaAluno.add(listListaAluno);
			
			JButton btnListaDisciplinaRelatorio = new JButton("Relatorio");
			btnListaDisciplinaRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaDisciplinaRelatorio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaDisciplinaRelatorio.setVisible(true);
					panelListaDisciplina.setVisible(false);
				}
			});
			btnListaDisciplinaRelatorio.setBounds(216, 410, 115, 30);
			panelListaDisciplina.add(btnListaDisciplinaRelatorio);
			
			JButton btnListaDisciplinaVoltar = new JButton("Voltar");
			btnListaDisciplinaVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListaDisciplinaVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaDisciplina.setVisible(false);
					panelLista.setVisible(true);
				}
			});
			btnListaDisciplinaVoltar.setBounds(437, 410, 115, 30);
			panelListaDisciplina.add(btnListaDisciplinaVoltar);
			
			JList listListaDisciplina = new JList();
			listListaDisciplina.setBounds(216, 11, 334, 388);
			panelListaDisciplina.add(listListaDisciplina);
			
			JButton btnListarAlunoRelatorioVoltar = new JButton("Voltar");
			btnListarAlunoRelatorioVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListarAlunoRelatorioVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panelListaAlunoRelatorio.setVisible(false);
					panelListaAluno.setVisible(true);
				}
			});
			btnListarAlunoRelatorioVoltar.setBounds(316, 410, 115, 30);
			panelListaAlunoRelatorio.add(btnListarAlunoRelatorioVoltar);
			
			JList list = new JList();
			list.setBounds(25, 11, 710, 388);
			panelListaAlunoRelatorio.add(list);
					
			JButton btnListarDisciplinaRelatorioVoltar = new JButton("Voltar");
			btnListarDisciplinaRelatorioVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnListarDisciplinaRelatorioVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelListaDisciplinaRelatorio.setVisible(false);
					panelListaDisciplina.setVisible(true);
				}
			});
			btnListarDisciplinaRelatorioVoltar.setBounds(357, 410, 115, 30);
			panelListaDisciplinaRelatorio.add(btnListarDisciplinaRelatorioVoltar);
			
			JList list_1 = new JList();
			list_1.setBounds(10, 11, 725, 388);
			panelListaDisciplinaRelatorio.add(list_1);
			
			JButton btnCadastroAlunoVoltar = new JButton("Voltar");
			btnCadastroAlunoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroAlunoVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panelCadastroAluno.setVisible(false);
					panelCadastro.setVisible(true);
				}
			});
			btnCadastroAlunoVoltar.setBounds(435, 410, 115, 30);
			panelCadastroAluno.add(btnCadastroAlunoVoltar);
			
			JLabel lblNome;
			lblCadastroAlunoNome = new JLabel("Nome:");
			lblCadastroAlunoNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoNome.setBounds(50, 71, 38, 30);
			panelCadastroAluno.add(lblCadastroAlunoNome);
			
			textFieldCadastroAlunoNome = new JTextField();
			textFieldCadastroAlunoNome.setBounds(91, 75, 480, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoNome);
			textFieldCadastroAlunoNome.setColumns(10);
			
			JLabel lblCpf;
			lblCadastroAlunoIdentidade = new JLabel("Identidade:");
			lblCadastroAlunoIdentidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoIdentidade.setBounds(23, 112, 65, 30);
			panelCadastroAluno.add(lblCadastroAlunoIdentidade);
			
			textFieldCadastroAlunoIdentidade = new JTextField();
			textFieldCadastroAlunoIdentidade.setBounds(91, 116, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoIdentidade);
			textFieldCadastroAlunoIdentidade.setColumns(10);
			
			JLabel lblTelefone;
			lblCadastroAlunoCPF = new JLabel("CPF:");
			lblCadastroAlunoCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoCPF.setBounds(50, 152, 38, 30);
			panelCadastroAluno.add(lblCadastroAlunoCPF);
			
			textFieldCadastroAlunoCPF = new JTextField();
			textFieldCadastroAlunoCPF.setBounds(91, 156, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoCPF);
			textFieldCadastroAlunoCPF.setColumns(10);
			
			JLabel lblEndereo;
			lblCadastroAlunoTelefone = new JLabel("Telefone:");
			lblCadastroAlunoTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoTelefone.setBounds(23, 194, 65, 30);
			panelCadastroAluno.add(lblCadastroAlunoTelefone);
			
			textFieldCadastroAlunoTelefone = new JTextField();
			textFieldCadastroAlunoTelefone.setBounds(91, 194, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoTelefone);
			textFieldCadastroAlunoTelefone.setColumns(10);
			
			JLabel lblCurso;
			lblCadastroAlunoMatricula = new JLabel("Matricula:");
			lblCadastroAlunoMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoMatricula.setBounds(23, 235, 65, 14);
			panelCadastroAluno.add(lblCadastroAlunoMatricula);
			
			textFieldCadastroAlunoMatricula = new JTextField();
			textFieldCadastroAlunoMatricula.setBounds(91, 232, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoMatricula);
			textFieldCadastroAlunoMatricula.setColumns(10);
			
			JLabel lblCurso_1;
			lblCadastroAlunoCurso = new JLabel("Curso:");
			lblCadastroAlunoCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoCurso.setBounds(33, 270, 49, 14);
			panelCadastroAluno.add(lblCadastroAlunoCurso);
			
			JLabel lblUa;
			lblCadastroAlunoRua = new JLabel("Rua:");
			lblCadastroAlunoRua.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoRua.setBounds(398, 160, 27, 14);
			panelCadastroAluno.add(lblCadastroAlunoRua);
			
			JLabel lblNumero;
			lblCadastroAlunoNumero = new JLabel("Numero:");
			lblCadastroAlunoNumero.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoNumero.setBounds(375, 202, 50, 14);
			panelCadastroAluno.add(lblCadastroAlunoNumero);
			
			JLabel lblEstado;
			lblCadastroAlunoEstado = new JLabel("Estado:");
			lblCadastroAlunoEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoEstado.setBounds(382, 235, 43, 14);
			panelCadastroAluno.add(lblCadastroAlunoEstado);
			
			JLabel lblPais;
			lblCadastroAlunoPais = new JLabel("Pais:");
			lblCadastroAlunoPais.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroAlunoPais.setBounds(387, 270, 38, 14);
			panelCadastroAluno.add(lblCadastroAlunoPais);
			
			textFieldCadastroAlunoCre = new JTextField();
			textFieldCadastroAlunoCre.setBounds(435, 116, 200, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoCre);
			textFieldCadastroAlunoCre.setColumns(10);
			
			textFieldCadastroAlunoCurso = new JTextField();
			textFieldCadastroAlunoCurso.setBounds(91, 265, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoCurso);
			textFieldCadastroAlunoCurso.setColumns(10);
			
			textFieldCadastroAlunoRua = new JTextField();
			textFieldCadastroAlunoRua.setBounds(435, 156, 200, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoRua);
			textFieldCadastroAlunoRua.setColumns(10);
			
			textFieldCadastroAlunoNumero = new JTextField();
			textFieldCadastroAlunoNumero.setBounds(435, 197, 200, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoNumero);
			textFieldCadastroAlunoNumero.setColumns(10);
			
			textFieldCadastroAlunoEstado = new JTextField();
			textFieldCadastroAlunoEstado.setBounds(435, 230, 200, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoEstado);
			textFieldCadastroAlunoEstado.setColumns(10);
			
			JButton btnCadastrar_1 = new JButton("Cadastrar");
			btnCadastrar_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {		
					
				}
			});
			btnCadastrar_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastrar_1.setBounds(220, 410, 115, 30);
			panelCadastroAluno.add(btnCadastrar_1);
			
			textFieldCadastroAlunoPais = new JTextField();
			textFieldCadastroAlunoPais.setBounds(435, 268, 200, 21);
			panelCadastroAluno.add(textFieldCadastroAlunoPais);
			textFieldCadastroAlunoPais.setColumns(10);
			
			JLabel lblCadastroCre = new JLabel("Cre:");
			lblCadastroCre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroCre.setBounds(398, 120, 27, 14);
			panelCadastroAluno.add(lblCadastroCre);
			
			JLabel lblCadastroDisciplina = new JLabel("Disciplina:");
			lblCadastroDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroDisciplina.setBounds(23, 299, 58, 24);
			panelCadastroAluno.add(lblCadastroDisciplina);
			
			textFieldCadastroAlunoDisciplina = new JTextField();
			textFieldCadastroAlunoDisciplina.setBounds(91, 300, 189, 24);
			panelCadastroAluno.add(textFieldCadastroAlunoDisciplina);
			textFieldCadastroAlunoDisciplina.setColumns(10);
					
			JLabel lblNome_1;
			lblAlteraAluno1Nome = new JLabel("Nome:");
			lblAlteraAluno1Nome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Nome.setBounds(50, 71, 38, 30);
			panelAlteraAluno1.add(lblAlteraAluno1Nome);
			
			textFieldAlteraAluno1Nome = new JTextField();
			textFieldAlteraAluno1Nome.setBounds(91, 75, 480, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Nome);
			textFieldAlteraAluno1Nome.setColumns(10);
			
			JLabel lblCpf_1;
			lblAlteraAluno1Identidade = new JLabel("Identidade:");
			lblAlteraAluno1Identidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Identidade.setBounds(23, 112, 65, 30);
			panelAlteraAluno1.add(lblAlteraAluno1Identidade);
			
			textFieldAlteraAluno1Identidade = new JTextField();
			textFieldAlteraAluno1Identidade.setBounds(91, 116, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Identidade);
			textFieldAlteraAluno1Identidade.setColumns(10);
			
			JLabel lblTelefone_1;
			lblAlteraAluno1CPF = new JLabel("CPF:");
			lblAlteraAluno1CPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1CPF.setBounds(50, 153, 38, 30);
			panelAlteraAluno1.add(lblAlteraAluno1CPF);
			
			textFieldAlteraAluno1CPF = new JTextField();
			textFieldAlteraAluno1CPF.setBounds(91, 156, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1CPF);
			textFieldAlteraAluno1CPF.setColumns(10);
			
			JLabel lblEndereo_1;
			lblAlteraAluno1Telefone = new JLabel("Telefone:");
			lblAlteraAluno1Telefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Telefone.setBounds(23, 194, 65, 30);
			panelAlteraAluno1.add(lblAlteraAluno1Telefone);
			
			textFieldAlteraAluno1Telefone = new JTextField();
			textFieldAlteraAluno1Telefone.setBounds(91, 194, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Telefone);
			textFieldAlteraAluno1Telefone.setColumns(10);
			
			JLabel lblCurso_2;
			lblAlteraAluno1Matricula = new JLabel("Matricula:");
			lblAlteraAluno1Matricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Matricula.setBounds(23, 235, 65, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Matricula);
			
			textFieldAlteraAluno1Matricula = new JTextField();
			textFieldAlteraAluno1Matricula.setBounds(91, 232, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Matricula);
			textFieldAlteraAluno1Matricula.setColumns(10);
			
			JLabel lblCurso_3;
			lblAlteraAluno1Curso = new JLabel("Curso:");
			lblAlteraAluno1Curso.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Curso.setBounds(33, 270, 49, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Curso);
			
			JLabel lblUa_1;
			lblAlteraAluno1Rua = new JLabel("Rua:");
			lblAlteraAluno1Rua.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Rua.setBounds(393, 161, 32, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Rua);
			
			JLabel lblNumero_1;
			lblAlteraAluno1Numero = new JLabel("Numero:");
			lblAlteraAluno1Numero.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Numero.setBounds(374, 198, 59, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Numero);
			
			JLabel lblEstado_1;
			lblAlteraAluno1Estado = new JLabel("Estado:");
			lblAlteraAluno1Estado.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Estado.setBounds(376, 235, 49, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Estado);
			
			JLabel lblPais_1;
			lblAlteraAluno1Pais = new JLabel("Pais:");
			lblAlteraAluno1Pais.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Pais.setBounds(393, 270, 32, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Pais);
			
			textFieldAlteraAluno1Rua = new JTextField();
			textFieldAlteraAluno1Rua.setBounds(435, 157, 200, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Rua);
			textFieldAlteraAluno1Rua.setColumns(10);
			
			textFieldAlteraAluno1Curso = new JTextField();
			textFieldAlteraAluno1Curso.setBounds(91, 265, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Curso);
			textFieldAlteraAluno1Curso.setColumns(10);
			
			textFieldAlteraAluno1Numero = new JTextField();
			textFieldAlteraAluno1Numero.setBounds(435, 194, 200, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Numero);
			textFieldAlteraAluno1Numero.setColumns(10);
			
			textFieldAlteraAluno1Estado = new JTextField();
			textFieldAlteraAluno1Estado.setBounds(435, 231, 200, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Estado);
			textFieldAlteraAluno1Estado.setColumns(10);
			
			textFieldAlteraAluno1Pais = new JTextField();
			textFieldAlteraAluno1Pais.setBounds(435, 266, 200, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Pais);
			textFieldAlteraAluno1Pais.setColumns(10);
			
			JButton btnAlteraAluno1Alterar = new JButton("Alterar");
			btnAlteraAluno1Alterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlteraAluno1Alterar.setBounds(165, 410, 115, 30);
			panelAlteraAluno1.add(btnAlteraAluno1Alterar);
			
			JLabel lblAlteraAluno1Cre = new JLabel("Cre:");
			lblAlteraAluno1Cre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Cre.setBounds(393, 121, 32, 14);
			panelAlteraAluno1.add(lblAlteraAluno1Cre);
			
			textFieldAlteraAluno1Cre = new JTextField();
			textFieldAlteraAluno1Cre.setBounds(435, 118, 200, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Cre);
			textFieldAlteraAluno1Cre.setColumns(10);
			
			JLabel lblAlteraAluno1Disciplina = new JLabel("Disciplina:");
			lblAlteraAluno1Disciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraAluno1Disciplina.setBounds(29, 299, 59, 24);
			panelAlteraAluno1.add(lblAlteraAluno1Disciplina);
			
			textFieldAlteraAluno1Disciplina = new JTextField();
			textFieldAlteraAluno1Disciplina.setBounds(91, 300, 189, 24);
			panelAlteraAluno1.add(textFieldAlteraAluno1Disciplina);
			textFieldAlteraAluno1Disciplina.setColumns(10);
			
			JButton btnCadastroDisciplinaVoltar = new JButton("Voltar");
			btnCadastroDisciplinaVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroDisciplinaVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCadastroDisciplina.setVisible(false);
					panelCadastro.setVisible(true);
				}
			});
			btnCadastroDisciplinaVoltar.setBounds(427, 391, 115, 30);
			panelCadastroDisciplina.add(btnCadastroDisciplinaVoltar);
							
			JLabel lblCadastroDisciplinaNome;
			lblCadastroDisciplinaNome = new JLabel("Nome:");
			lblCadastroDisciplinaNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroDisciplinaNome.setBounds(194, 71, 38, 30);
			panelCadastroDisciplina.add(lblCadastroDisciplinaNome);
			
			textFieldCadastroDisciplinaNome = new JTextField();
			textFieldCadastroDisciplinaNome.setBounds(242, 75, 300, 24);
			panelCadastroDisciplina.add(textFieldCadastroDisciplinaNome);
			textFieldCadastroDisciplinaNome.setColumns(10);
			
			JLabel lblCadastroDisciplinaIdentidade;
			lblCadastroDisciplinaIdentidade = new JLabel("Periodo:");
			lblCadastroDisciplinaIdentidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroDisciplinaIdentidade.setBounds(184, 112, 48, 30);
			panelCadastroDisciplina.add(lblCadastroDisciplinaIdentidade);
			
			textFieldCadastroDisciplinaPeriodo = new JTextField();
			textFieldCadastroDisciplinaPeriodo.setBounds(242, 119, 189, 24);
			panelCadastroDisciplina.add(textFieldCadastroDisciplinaPeriodo);
			textFieldCadastroDisciplinaPeriodo.setColumns(10);
			
			JLabel lblCadastroDisciplinaCPF;
			lblCadastroDisciplinaCPF = new JLabel("Ementa:");
			lblCadastroDisciplinaCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroDisciplinaCPF.setBounds(184, 165, 48, 30);
			panelCadastroDisciplina.add(lblCadastroDisciplinaCPF);
			
			textFieldCadastroDisciplinaEmenta = new JTextField();
			textFieldCadastroDisciplinaEmenta.setBounds(242, 169, 189, 24);
			panelCadastroDisciplina.add(textFieldCadastroDisciplinaEmenta);
			textFieldCadastroDisciplinaEmenta.setColumns(10);
			
			JLabel lblCadastroDisciplinaTelefone;
			lblCadastroDisciplinaTelefone = new JLabel("Professor:");
			lblCadastroDisciplinaTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCadastroDisciplinaTelefone.setBounds(173, 211, 59, 30);
			panelCadastroDisciplina.add(lblCadastroDisciplinaTelefone);
			
			textFieldCadastroDisciplinaProfessor = new JTextField();
			textFieldCadastroDisciplinaProfessor.setBounds(242, 215, 189, 24);
			panelCadastroDisciplina.add(textFieldCadastroDisciplinaProfessor);
			textFieldCadastroDisciplinaProfessor.setColumns(10);
			
			JButton btnCadastroDisciplinaCadastrar = new JButton("Cadastrar");
			btnCadastroDisciplinaCadastrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnCadastroDisciplinaCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnCadastroDisciplinaCadastrar.setBounds(194, 391, 115, 30);
			panelCadastroDisciplina.add(btnCadastroDisciplinaCadastrar);
					
			JLabel lblNome_2;
			lblAlteraDisciplina1Nome = new JLabel("Nome:");
			lblAlteraDisciplina1Nome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraDisciplina1Nome.setBounds(185, 71, 38, 30);
			panelAlteraDisciplina1.add(lblAlteraDisciplina1Nome);
			
			textFieldAlteraDisciplina1Nome = new JTextField();
			textFieldAlteraDisciplina1Nome.setBounds(233, 75, 300, 24);
			panelAlteraDisciplina1.add(textFieldAlteraDisciplina1Nome);
			textFieldAlteraDisciplina1Nome.setColumns(10);
			
			JLabel lblCpf_2;
			lblAlteraDisciplina1Periodo = new JLabel("Periodo:");
			lblAlteraDisciplina1Periodo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraDisciplina1Periodo.setBounds(175, 112, 48, 30);
			panelAlteraDisciplina1.add(lblAlteraDisciplina1Periodo);
			
			textFieldAlteraDisciplina1Periodo = new JTextField();
			textFieldAlteraDisciplina1Periodo.setBounds(233, 116, 189, 24);
			panelAlteraDisciplina1.add(textFieldAlteraDisciplina1Periodo);
			textFieldAlteraDisciplina1Periodo.setColumns(10);
			
			JLabel lblTelefone_2;
			lblAlteraDisciplina1Ementa = new JLabel("Ementa:");
			lblAlteraDisciplina1Ementa.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraDisciplina1Ementa.setBounds(175, 153, 48, 30);
			panelAlteraDisciplina1.add(lblAlteraDisciplina1Ementa);
			
			textFieldAlteraDisciplina1Ementa = new JTextField();
			textFieldAlteraDisciplina1Ementa.setBounds(233, 157, 189, 24);
			panelAlteraDisciplina1.add(textFieldAlteraDisciplina1Ementa);
			textFieldAlteraDisciplina1Ementa.setColumns(10);
			
			JLabel lblEndereo_2;
			lblAlteraDisciplina1Professor = new JLabel("Professor:");
			lblAlteraDisciplina1Professor.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblAlteraDisciplina1Professor.setBounds(164, 194, 59, 30);
			panelAlteraDisciplina1.add(lblAlteraDisciplina1Professor);
			
			textFieldAlteraDisciplina1Professor = new JTextField();
			textFieldAlteraDisciplina1Professor.setBounds(233, 198, 189, 24);
			panelAlteraDisciplina1.add(textFieldAlteraDisciplina1Professor);
			textFieldAlteraDisciplina1Professor.setColumns(10);
			
			JButton btnAlteraDisciplina1Alterar = new JButton("Alterar");
			btnAlteraDisciplina1Alterar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlteraDisciplina1Alterar.setBounds(185, 410, 115, 30);
			panelAlteraDisciplina1.add(btnAlteraDisciplina1Alterar);
			
			JButton btnRemoverAlunoVoltar = new JButton("Voltar");
			btnRemoverAlunoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemoverAlunoVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemoveAluno.setVisible(false);
					panelRemove.setVisible(true);
				}
			});
			btnRemoverAlunoVoltar.setBounds(321, 379, 115, 30);
			panelRemoveAluno.add(btnRemoverAlunoVoltar);
			
			JLabel lblRemoveAlunoNome = new JLabel("Nome do aluno:");
			lblRemoveAlunoNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblRemoveAlunoNome.setBounds(148, 121, 91, 22);
			panelRemoveAluno.add(lblRemoveAlunoNome);
			
			textFieldRemoveAlunoNome = new JTextField();
			textFieldRemoveAlunoNome.setBounds(249, 123, 280, 21);
			panelRemoveAluno.add(textFieldRemoveAlunoNome);
			textFieldRemoveAlunoNome.setColumns(10);
			
			JButton btnRemover = new JButton("Remover");
			btnRemover.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemover.setBounds(321, 197, 115, 30);
			panelRemoveAluno.add(btnRemover);
			
			JButton btnRemoverProfessorVoltar = new JButton("Voltar");
			btnRemoverProfessorVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemoverProfessorVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRemoveDisciplina.setVisible(false);
					panelRemove.setVisible(true);
				}
			});
			btnRemoverProfessorVoltar.setBounds(318, 410, 115, 30);
			panelRemoveDisciplina.add(btnRemoverProfessorVoltar);
			
			JLabel lblNome_3 = new JLabel("Nome da disciclina:");
			lblNome_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNome_3.setBounds(128, 121, 111, 30);
			panelRemoveDisciplina.add(lblNome_3);
			
			textFieldRmoveDisciplinaNome = new JTextField();
			textFieldRmoveDisciplinaNome.setBounds(249, 127, 280, 21);
			panelRemoveDisciplina.add(textFieldRmoveDisciplinaNome);
			textFieldRmoveDisciplinaNome.setColumns(10);
			
			JButton btnRemover_1 = new JButton("Remover");
			btnRemover_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRemover_1.setBounds(318, 235, 115, 30);
			panelRemoveDisciplina.add(btnRemover_1);
			
			JPanel panelAlteraAluno = new JPanel();
			frmMenu.getContentPane().add(panelAlteraAluno, "name_492015898483647");
			panelAlteraAluno.setLayout(null);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraAluno.setVisible(false);
					panelAltera.setVisible(true);
				}
			});
			btnVoltar.setBounds(315, 376, 115, 30);
			panelAlteraAluno.add(btnVoltar);
			
			JButton btnAvanar = new JButton("Avan\u00E7ar");
			btnAvanar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAvanar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panelAlteraAluno1.setVisible(true);
					panelAlteraAluno.setVisible(false);
				}
			});
			btnAvanar.setBounds(315, 190, 115, 30);
			panelAlteraAluno.add(btnAvanar);
			
			JLabel lblNome_4 = new JLabel("Nome do aluno:");
			lblNome_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNome_4.setBounds(136, 109, 91, 22);
			panelAlteraAluno.add(lblNome_4);
			
			textFieldAlteraAlunoNome = new JTextField();
			textFieldAlteraAlunoNome.setBounds(237, 111, 300, 20);
			panelAlteraAluno.add(textFieldAlteraAlunoNome);
			textFieldAlteraAlunoNome.setColumns(10);
			
			JButton btnAlteraAluno = new JButton("Alterar aluno");
			btnAlteraAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlteraAluno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraAluno.setVisible(true);
					panelAltera.setVisible(false);				
				}
			});
			btnAlteraAluno.setBounds(322, 124, 139, 30);
			panelAltera.add(btnAlteraAluno);
			
			JButton btnAlterarAluno1Voltar = new JButton("Voltar");
			btnAlterarAluno1Voltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlterarAluno1Voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraAluno1.setVisible(false);
					panelAlteraAluno.setVisible(true);
				}
			});
			btnAlterarAluno1Voltar.setBounds(435, 410, 115, 30);
			panelAlteraAluno1.add(btnAlterarAluno1Voltar);
			
			JPanel panelAlteraDisciplina = new JPanel();
			frmMenu.getContentPane().add(panelAlteraDisciplina, "name_492523323250832");
			panelAlteraDisciplina.setLayout(null);
			
			JButton btnAvanar_1 = new JButton("Avan\u00E7ar");
			btnAvanar_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAvanar_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraDisciplina1.setVisible(true);
					panelAlteraDisciplina.setVisible(false);
				}
			});
			btnAvanar_1.setBounds(308, 272, 115, 30);
			panelAlteraDisciplina.add(btnAvanar_1);
			
			JButton btnVoltar_1 = new JButton("Voltar");
			btnVoltar_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnVoltar_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraDisciplina.setVisible(false);
					panelAltera.setVisible(true);
				}
			});
			btnVoltar_1.setBounds(308, 417, 115, 30);
			panelAlteraDisciplina.add(btnVoltar_1);
			
			JLabel lblNome_5 = new JLabel("Nome da disciplina:");
			lblNome_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNome_5.setBounds(127, 95, 115, 22);
			panelAlteraDisciplina.add(lblNome_5);
			
			textFieldAlteraDisciplinaNome = new JTextField();
			textFieldAlteraDisciplinaNome.setBounds(252, 97, 300, 20);
			panelAlteraDisciplina.add(textFieldAlteraDisciplinaNome);
			textFieldAlteraDisciplinaNome.setColumns(10);
			
			JButton btnAlteraDisciplina = new JButton("Alterar disciplina");
			btnAlteraDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlteraDisciplina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraDisciplina.setVisible(true);
					panelAltera.setVisible(false);				
				}
			});
			btnAlteraDisciplina.setBounds(322, 187, 139, 30);
			panelAltera.add(btnAlteraDisciplina);
			
			JButton btnAlterarDisciplina1Voltar = new JButton("Voltar");
			btnAlterarDisciplina1Voltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnAlterarDisciplina1Voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelAlteraDisciplina1.setVisible(false);
					panelAlteraDisciplina.setVisible(true);
				}
			});
			btnAlterarDisciplina1Voltar.setBounds(418, 410, 115, 30);
			panelAlteraDisciplina1.add(btnAlterarDisciplina1Voltar);
			
			JPanel panelSobre = new JPanel();
			frmMenu.getContentPane().add(panelSobre, "name_493852119457792");
			panelSobre.setLayout(null);
			
			JButton btnVoltar_2 = new JButton("Voltar");
			btnVoltar_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnVoltar_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelSobre.setVisible(false);
					panelMenu.setVisible(true);
				}
			});
			btnVoltar_2.setBounds(330, 410, 115, 30);
			panelSobre.add(btnVoltar_2);
			
			JLabel lblGrupoFormadoPor = new JLabel("Grupo formado por:");
			lblGrupoFormadoPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblGrupoFormadoPor.setBounds(31, 57, 129, 30);
			panelSobre.add(lblGrupoFormadoPor);
			
			JLabel lblAnrafelDeMedeiros = new JLabel("Anrafel Lustosa Filho");
			lblAnrafelDeMedeiros.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblAnrafelDeMedeiros.setBounds(170, 140, 129, 30);
			panelSobre.add(lblAnrafelDeMedeiros);
			
			JLabel lblRobsonLuiz = new JLabel("Robson Luiz");
			lblRobsonLuiz.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblRobsonLuiz.setBounds(170, 58, 81, 30);
			panelSobre.add(lblRobsonLuiz);
			
			JLabel lblLuisPauloRamos = new JLabel("Luis Paulo Ramos");
			lblLuisPauloRamos.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblLuisPauloRamos.setBounds(170, 99, 119, 30);
			panelSobre.add(lblLuisPauloRamos);
			
			JButton btnSobre = new JButton("Sobre");
			btnSobre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelSobre.setVisible(true);
					panelMenu.setVisible(false);
				}
			});
			btnSobre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnSobre.setBounds(319, 300, 115, 30);
			panelMenu.add(btnSobre);
			
			JLabel label = new JLabel("");
			Image img = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
			label.setIcon(new ImageIcon(img));
			label.setBounds(40, 11, 54, 67);
			panelMenu.add(label);
			
		}
	}

