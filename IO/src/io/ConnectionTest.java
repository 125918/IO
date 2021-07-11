package io;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class ConnectionTest 
{

	private static String connectionUrl = "jdbc:sqlserver://DESKTOP-IFL6H2E;database=Test1;integratedSecurity=true;";
	private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static Connection connection;

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		IDandPasswords idandPasswords = new IDandPasswords(); // tworzymy obiekt klasy IDandPasswords
		
		//jeœli chcemy coœ uzyskaæ z innej klasy nale¿y wpisaæ nazwê instancji tej klasy i po kropce wywo³aæ funkcjê, któr¹ zdefiniowaliœmy; ona zwraca logininfo:
		// idandPasswords.getLoginInfo(); wyœlemy to jako argument poni¿ej
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo()); //tworzymy obiekt klasy LoginPage i wysy³amy hash map logininfo jako argument
		
		
		
//		Class.forName(driverName);
//		
////		Connection con = DriverManager.getConnection(connectionUrl);
//		JOptionPane.showMessageDialog(null, "Connected");
//		
//		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();)
//		{
//			String SQL = "SELECT * FROM tbl_Users";
//			ResultSet rs = stmt.executeQuery(SQL);
//			
//			//Iterate through the data in the result set and display it
//			while(rs.next()) 
//			{
//				System.out.println(rs.getString("UserName") + " "+ rs.getString("Password"));
//			}
//		}
//		//Handle any errors that may have occured
//		catch(SQLException e) 
//		{
//			e.printStackTrace();
//		}		

	}
	
	public static Connection getConnection() 
	{
		try 
		{
			Class.forName(driverName);
			try 
			{
				connection = DriverManager.getConnection(connectionUrl);
				System.out.println("Connected");
			} catch (Exception e) 
			{
				System.out.println("Connection failed");
				e.printStackTrace();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Driver not found");
		}
		
		return connection;
		
	}
	
	
	
	
	

}
