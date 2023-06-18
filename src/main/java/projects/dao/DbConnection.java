package projects.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import projects.exception.DbException;
import java.sql.SQLException;

public class DbConnection {

	public DbConnection() {
		String HOST = "localhost";
		String PASSWORD = "projects";
		int PORT = 3306;
		String SCHEMA = "projects";
		String USER = "projects";
	}
    
    public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://localhost:3306/projects");
        
        try {
            Connection connection = (Connection) DriverManager.getConnection(uri);
            System.out.println("Connection successful!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            throw new DbException("Connection Failed at \" + uri");
        }

    }

}
