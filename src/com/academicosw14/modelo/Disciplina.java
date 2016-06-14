package com.academicosw14.modelo;

public class Disciplina {
	
	private int id;
	private String nome;
	private String periodo;
	private String ementa;
	private String professor;
	
	public Disciplina(){
		this(null, null, null, null);
	}
	
	public Disciplina(String nome, String periodo, String ementa, String professor){
		this.nome = nome;
		this.periodo = periodo;
		this.ementa = ementa;
		this.professor = professor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String toString() {
		return String.format("[Disciplina %d - %s - P%s - %s - %s]", id, nome, periodo, ementa, professor);
	}
}