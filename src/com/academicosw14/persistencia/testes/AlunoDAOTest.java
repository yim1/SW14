package com.academicosw14.persistencia.testes;

import junit.framework.TestCase;

import com.academicosw14.modelo.Aluno;
import com.academicosw14.modelo.Disciplina;
import com.academicosw14.persistencia.AlunoDAO;
import com.academicosw14.persistencia.DisiciplinaDAO;

public class AlunoDAOTest extends TestCase{
	
	private Aluno aluno;
	private Disciplina disciplina;
	private AlunoDAO alunoDAO;
	private DisiciplinaDAO disciplinaDAO;
	
	public void setUp(){
		aluno = new Aluno();
	}
	
	public void tearDown(){
		aluno = null;
	}
	
	public void testSalvar(){
		aluno.setNome("Testando");
		aluno.setIdentidade("Testando");
		aluno.setCpf("Testando");
		aluno.setTelefone("Testando");
		aluno.setMatricula("Testando");
		aluno.setCurso("Testando");
		aluno.setCre("Testando");
		aluno.setRua("Testando");
		aluno.setNumero("Testando");
		aluno.setCep("Testando");
		aluno.setEstado("Testando");
		aluno.setPais("Testando");
		disciplina = disciplinaDAO.coletaDisciplinaId("Novo");
		aluno.setDisciplina(disciplina.getId());
		alunoDAO.salvar(aluno);
		assertEquals("Testando", aluno.getNome());
	}
}