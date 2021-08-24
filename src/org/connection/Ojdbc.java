package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ojdbc {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		String sql= "select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next()) {
			int i= executeQuery.getInt("employee_id");
			System.out.println(i);
			String string = executeQuery.getString("first_name");System.out.println(string);
			
		}
		
		

		
	}

}
