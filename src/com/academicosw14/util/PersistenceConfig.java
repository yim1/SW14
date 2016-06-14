package com.academicosw14.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PersistenceConfig {
	
	private String host;
	private String database;
	private String usuario;
	private String senha;
	private String porta;

	// Construtor
	public PersistenceConfig() {
		Properties prop = new Properties();
		FileInputStream file = null;

		try {
			file = new FileInputStream("database.properties.txt");
		} catch (FileNotFoundException e) {
			System.out.println("N�o foi poss�vel encontrar o arquivo de configura��es do banco de dados");
		}

		try {
			prop.load(file);
		} catch (IOException e) {
			System.out.println("Imposs�vel carregar arquivo de configura��o");
		}

		this.host = prop.getProperty("host");
		this.database = prop.getProperty("database");
		this.usuario = prop.getProperty("usuario");
		this.senha = prop.getProperty("senha");
		this.porta = prop.getProperty("porta");

	}

	// Getters
	public String getHost() {
		return host;
	}

	public String getDatabase() {
		return database;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public String getPorta() {
		return porta;
	}
}