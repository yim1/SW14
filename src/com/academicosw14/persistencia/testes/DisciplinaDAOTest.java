package com.academicosw14.persistencia.testes;

import com.academicosw14.modelo.Disciplina;
import com.academicosw14.persistencia.DisiciplinaDAO;

import junit.framework.TestCase;

public class DisciplinaDAOTest extends TestCase{
	
	private Disciplina disciplina;
	private DisiciplinaDAO disciplinaDAO;
	
	public void setUp(){
		disciplina = new Disciplina();
	}
	
	public void tearDown(){
		disciplina = null;
	}
	
	public void testSalvar(){
		disciplina.setNome("Testando");
		disciplina.setEmenta("Testando");
		disciplina.setPeriodo("Testando");
		disciplina.setProfessor("Testando");
		disciplinaDAO.salvar(disciplina);
		assertEquals("Testando", disciplina.getNome());
	}
}