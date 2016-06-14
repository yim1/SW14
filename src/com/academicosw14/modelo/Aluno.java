package com.academicosw14.modelo;

public class Aluno {
	
	private int id;
	private int disciplina;
	private String nome;
	private String identidade;
	private String cpf;
	private String telefone;
	private String matricula;
	private String curso;
	private String cre;
	private String rua;
	private String numero;
	private String cep;
	private String estado;
	private String pais;
	
	public Aluno(){
		this(null, null, null, null, null, null, null, null, null, null, null, null, 0);
	}
	
	public Aluno(String nome, String identidade, String cpf, String telefone ,String matricula, String curso, String cre, String rua, String numero, String cep, String estado, String pais, int disciplina){
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.matricula = matricula;
		this.curso = curso;
		this.cre = cre;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.estado = estado;
		this.pais = pais;
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(int disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCre() {
		return cre;
	}

	public void setCre(String cre) {
		this.cre = cre;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String toString() {
		return String.format("[Aluno %d - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s - %s]", id, nome, identidade, cpf, telefone, matricula, curso, cre,
				rua, numero, cep, estado, pais);
	}
}