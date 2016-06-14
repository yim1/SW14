package com.academicosw14.persistencia;

import com.academicosw14.modelo.Aluno;
import com.academicosw14.modelo.exceptions.CpfJaCadastradoException;
import com.academicosw14.modelo.exceptions.RegistroNaoEncontradoException;
import com.academicosw14.util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

	public void salvar(Aluno aluno) {
		Connection c = ConnectionFactory.getConnection();
		String sql = "INSERT INTO Aluno (nome, identidade, cpf, telefone, matricula, curso, cre, rua, numero, cep, estado, pais, disciplina) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;

		try {
			if (this.isDisponivel(aluno.getCpf())) {

				stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getIdentidade());
				stmt.setString(3, aluno.getCpf());
				stmt.setString(4, aluno.getTelefone());
				stmt.setString(5, aluno.getMatricula());
				stmt.setString(6, aluno.getCurso());
				stmt.setString(7, aluno.getCre());
				stmt.setString(8, aluno.getRua());
				stmt.setString(9, aluno.getNumero());
				stmt.setString(10, aluno.getCep());
				stmt.setString(11, aluno.getEstado());
				stmt.setString(12, aluno.getPais());
				stmt.setInt(13, aluno.getDisciplina());
				stmt.execute();
				
				System.out.println("Aluno cadastrado com sucesso!");
				
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						int id = rs.getInt("id");
						aluno.setId(id);
					}
				}
			} else {
				throw new CpfJaCadastradoException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (CpfJaCadastradoException e2) {
			e2.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}

	public List<Aluno> ListaAlunos() throws SQLException {
		List<Aluno> alunos = new ArrayList<>();
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Aluno";
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			stmt = c.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY, ResultSet.CONCUR_UPDATABLE);
			stmt.execute();
			
			result = stmt.getResultSet();
			if (!result.next()) {
				throw new RegistroNaoEncontradoException();
			}
			result.absolute(0);
			while (result.next()) {
				int id = result.getInt("id");
				int disciplina = result.getInt("disciplina");
				String nome = result.getString("nome");
				String identidade = result.getString("identidade");
				String cpf = result.getString("cpf");
				String telefone = result.getString("telefone");
				String matricula = result.getString("matricula");
				String curso = result.getString("curso");
				String cre = result.getString("cre");
				String rua = result.getString("rua");
				String numero = result.getString("numero");
				String cep = result.getString("cep");
				String estado = result.getString("estado");
				String pais = result.getString("pais");
				Aluno aluno = new Aluno(nome, identidade, cpf, telefone, matricula, curso, cre, rua, numero, cep,
						estado, pais, disciplina);
				aluno.setId(id);
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível realizar a consulta!");
			e.printStackTrace();
		} catch (RegistroNaoEncontradoException e2) {
			e2.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return alunos;
	}

	public void update(Aluno aluno){
		Connection c = ConnectionFactory.getConnection();
		String sql = "UPDATE Aluno SET nome = ?, identidade = ?, cpf = ?, telefone = ?, matricula = ?, curso = ?, cre = ?, rua = ?, numero = ?, cep = ?, estado = ?, pais = ?" + "WHERE id = ?";
		PreparedStatement stmt = null;
		
		try{
			stmt = c.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getIdentidade());
			stmt.setString(3, aluno.getCpf());
			stmt.setString(4, aluno.getTelefone());
			stmt.setString(5, aluno.getMatricula());
			stmt.setString(6, aluno.getCurso());
			stmt.setString(7, aluno.getCre());
			stmt.setString(8, aluno.getRua());
			stmt.setString(9, aluno.getNumero());
			stmt.setString(10, aluno.getCep());
			stmt.setString(11, aluno.getEstado());
			stmt.setString(12, aluno.getPais());
			stmt.setInt(13, aluno.getId());
			stmt.execute();
			
			if (stmt.executeUpdate() > 0) {
				System.out.println("Aluno atualizado com sucesso!");
			}else {
				throw new RegistroNaoEncontradoException();
			}
		}catch(SQLException e){
			System.out.println("Não foi possível atualizar a conta!");
		}catch(RegistroNaoEncontradoException e2){
			e2.printStackTrace();
		}finally{
			try{
				stmt.close();
				c.close();
			}catch(SQLException e){
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}
	
	public Aluno coletaAlunoNome(String nomeAluno){
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Aluno WHERE nome = ?";
		Aluno aluno =  new Aluno();
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try{
			stmt = c.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY, ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, nomeAluno);
			stmt.execute();
			
			result = stmt.getResultSet();
			if(!result.next()){
				throw new RegistroNaoEncontradoException();
			}
			result.absolute(0);
			
			while(result.next()){
				int id = result.getInt("id");
				int disciplina = result.getInt("disciplina");
				String nome = result.getString("nome");
				String identidade = result.getString("identidade");
				String cpf = result.getString("cpf");
				String telefone = result.getString("telefone");
				String matricula = result.getString("matricula");
				String curso = result.getString("curso");
				String cre = result.getString("cre");
				String rua = result.getString("rua");
				String numero = result.getString("numero");
				String cep = result.getString("cep");
				String estado = result.getString("estado");
				String pais = result.getString("pais");
				aluno = new Aluno(nome, identidade, cpf, telefone, matricula, curso, cre, rua, numero, cep, estado, pais, disciplina);
				aluno.setId(id);
			}
			return aluno;
		}catch(SQLException e){
			System.out.println("Não foi possível realizar a consulta!");
			e.printStackTrace();
		}catch(RegistroNaoEncontradoException e2){
			e2.printStackTrace();
		}finally{
			try{
				result.close();
				stmt.close();
				c.close();
			}catch(SQLException e){
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return null;
	}
	
	public void delete(int id){
		Connection c = ConnectionFactory.getConnection();
		String sql = "DELETE FROM Aluno where id = ?";
		PreparedStatement stmt = null;
		
		try{
			stmt = c.prepareStatement(sql);
			stmt.setInt(1, id);
			if(stmt.executeUpdate() > 0){
				System.out.println("Aluno removido com sucesso!");
			}else {
				throw new RegistroNaoEncontradoException();
			}
		}catch(SQLException e){
			System.out.println("Não foi possível remover o aluno!");
			e.printStackTrace();
		}catch(RegistroNaoEncontradoException e2){
			e2.printStackTrace();
		}finally{
			try{
				stmt.close();
				c.close();
			}catch(SQLException e){
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}

	public boolean isDisponivel(String cpf) {
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Aluno where cpf = ?";
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			stmt = c.prepareStatement(sql);
			stmt.setString(1, cpf);
			result = stmt.executeQuery();

			if (!result.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível fazer a consulta!");
			e.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return true;
	}
}