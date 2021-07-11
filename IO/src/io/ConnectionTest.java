package io;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class ConnectionTest 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://DESKTOP-IFL6H2E;database=Test1;integratedSecurity=true;";
		Connection con = DriverManager.getConnection(connectionUrl);
		JOptionPane.showMessageDialog(null, "Connected");

	}

}
