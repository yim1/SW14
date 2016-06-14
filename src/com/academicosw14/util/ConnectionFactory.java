package com.academicosw14.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() { 
		PersistenceConfig config = new PersistenceConfig();
		Connection c = null;

		try {
			c = DriverManager.getConnection(
					"jdbc:postgresql://" + config.getHost() + ":" + config.getPorta() + "/" + config.getDatabase(),
					config.getUsuario(), config.getSenha());
		} catch (SQLException e) {
			System.out.println("N�o foi poss�vel conectar ao banco de dados");
			e.printStackTrace();
		}

		return c;
	}
}