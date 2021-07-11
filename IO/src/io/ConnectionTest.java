package io;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class ConnectionTest 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://DESKTOP-IFL6H2E;database=Test1;integratedSecurity=true;";
//		Connection con = DriverManager.getConnection(connectionUrl);
		JOptionPane.showMessageDialog(null, "Connected");
		
		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();)
		{
			String SQL = "SELECT * FROM tbl_Users";
			ResultSet rs = stmt.executeQuery(SQL);
			
			//Iterate through the data in the result set and display it
			while(rs.next()) 
			{
				System.out.println(rs.getString("UserName") + " "+ rs.getString("Password"));
			}
		}
		//Handle any errors that may have occured
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
