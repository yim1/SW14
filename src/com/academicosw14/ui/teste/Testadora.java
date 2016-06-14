package com.academicosw14.ui.teste;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.academicosw14.modelo.Aluno;
import com.academicosw14.modelo.Disciplina;
import com.academicosw14.persistencia.AlunoDAO;
import com.academicosw14.persistencia.DisiciplinaDAO;

public class Testadora {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		//Testes para disciplina
		/*String nomeDisciplina;
		String periodo;
		String ementa;
		String professor;*/
		// CADASTRO DE DISCIPLINA
		/*System.out.println("Cadastro de Disciplina: ");
		System.out.println("");
		
		System.out.println("Nome da Disciplina: ");
		nomeDisciplina = scan.nextLine();
		System.out.println("Periodo: ");
		periodo = scan.nextLine();
		System.out.println("Ementa: ");
		ementa = scan.nextLine();
		System.out.println("Professor responsável: ");
		professor = scan.nextLine();
		
		Disciplina disciplina = new Disciplina(nomeDisciplina, periodo, ementa, professor);
		DisiciplinaDAO disciplinaDAO = new DisiciplinaDAO();
		//disciplinaDAO.salvar(disciplina);
		
		//EXIBIR A LISTA DE DISCIPLINAS
		List<Disciplina> disciplinas = disciplinaDAO.ListaDisciplina();
		for(Disciplina disciplina : disciplinas){
			System.out.println(disciplina);
		}
		
		//ATUALIZAÇÃO DOS DADOS DE DISCIPLINA
		System.out.println("Informe o nome da disciplina que deseja atualizar os dados: ");
		nomeDisciplina = scan.nextLine();
		Disciplina disciplina = new Disciplina();
		disciplina = disciplinaDAO.coletaDisciplinaId(nomeDisciplina);
		System.out.println(disciplina);
		System.out.println(disciplina.getId());
		
		System.out.println("Nome da Disciplina: ");
		nomeDisciplina = scan.nextLine();
		System.out.println("Periodo: ");
		periodo = scan.nextLine();
		System.out.println("Ementa: ");
		ementa = scan.nextLine();
		System.out.println("Professor responsável: ");
		professor = scan.nextLine();
		
		Disciplina disciplinaEdit = new Disciplina(nomeDisciplina, periodo, ementa, professor);
		disciplinaEdit.setId(disciplina.getId());
		disciplinaDAO.update(disciplinaEdit);
		
		// REMOVER DISCIPLINAS
		/*System.out.println("Informe o nome da disciplina que deseja remover os dados: ");
		nomeDisciplina = scan.nextLine();
		Disciplina disciplina = new Disciplina();
		disciplina = disciplinaDAO.coletaDisciplinaId(nomeDisciplina);
		System.out.println(disciplina);
		System.out.println(disciplina.getId());
		disciplinaDAO.delete(disciplina.getId());*/
		
		
		//Testes para AlunoDAO
		/*String nome;
		String identidade;
		String cpf;
		String telefone;
		String matricula;
		String curso;
		String cre;
		String rua;
		String numero;
		String cep;
		String estado;
		String pais;
		String nomeDisciplina;
		String nomeAluno;
		int idDisciplina = 0;
		AlunoDAO alunoDAO = new AlunoDAO();
		DisiciplinaDAO disciplinaDAO = new DisiciplinaDAO();
		Disciplina disciplina = new Disciplina();
		
		//CADASTRAR ALUNOS
		System.out.println("Cadastrar aluno: ");
		System.out.println("Nome:");
		nome = scan.nextLine();
		System.out.println("identidade:");
		identidade = scan.nextLine();
		System.out.println("cpf:");
		cpf = scan.nextLine();
		System.out.println("telefone:");
		telefone = scan.nextLine();
		System.out.println("matricula:");
		matricula = scan.nextLine();
		System.out.println("curso:");
		curso = scan.nextLine();
		System.out.println("cre:");
		cre = scan.nextLine();
		System.out.println("rua:");
		rua = scan.nextLine();
		System.out.println("numero:");
		numero = scan.nextLine();
		System.out.println("cep:");
		cep = scan.nextLine();
		System.out.println("estado:");
		estado = scan.nextLine();
		System.out.println("pais:");
		pais = scan.nextLine();
		System.out.println("disciplina:");
		nomeDisciplina = scan.nextLine();
		disciplina = disciplinaDAO.coletaDisciplinaId(nomeDisciplina);
		idDisciplina = disciplina.getId();
		
		Aluno aluno = new Aluno(nome, identidade, cpf, telefone, matricula, curso, cre, rua, numero, cep, estado, pais, idDisciplina);
		alunoDAO.salvar(aluno);*/
		
		// LISTAR ALUNOS
		/*List<Aluno> alunos = alunoDAO.ListaAlunos();
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println(disciplinaDAO.disciplinaId(aluno.getDisciplina()));
		}*/
		
		// ATUALIZAR DADOS DE ALUNOS
		/*System.out.println("Informe o nome do aluno que deseja atualizar os dados: ");
		nomeAluno = scan.nextLine();
		Aluno aluno = new Aluno();
		aluno = alunoDAO.coletaAlunoNome(nomeAluno);
		System.out.println(aluno);
		System.out.println(aluno.getId());
		
		System.out.println("Nome:");
		nome = scan.nextLine();
		System.out.println("identidade:");
		identidade = scan.nextLine();
		System.out.println("cpf:");
		cpf = scan.nextLine();
		System.out.println("telefone:");
		telefone = scan.nextLine();
		System.out.println("matricula:");
		matricula = scan.nextLine();
		System.out.println("curso:");
		curso = scan.nextLine();
		System.out.println("cre:");
		cre = scan.nextLine();
		System.out.println("rua:");
		rua = scan.nextLine();
		System.out.println("numero:");
		numero = scan.nextLine();
		System.out.println("cep:");
		cep = scan.nextLine();
		System.out.println("estado:");
		estado = scan.nextLine();
		System.out.println("pais:");
		pais = scan.nextLine();
		idDisciplina = aluno.getDisciplina();
		
		Aluno alunoEdit = new Aluno(nome, identidade, cpf, telefone, matricula, curso, cre, rua, numero, cep, estado, pais, idDisciplina);
		alunoEdit.setId(aluno.getId());
		alunoDAO.update(alunoEdit);*/
		
		// REMOVER ALUNOS
		/*System.out.println("Informe o nome do aluno que deseja remover os dados: ");
		nomeAluno = scan.nextLine();
		Aluno aluno = new Aluno();
		aluno = alunoDAO.coletaAlunoNome(nomeAluno);
		System.out.println(aluno);
		System.out.println(aluno.getId());
		alunoDAO.delete(aluno.getId());*/
	}

}