package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Panel2 extends JPanel 
{

	private static String connectionUrl = "jdbc:sqlserver://DESKTOP-IFL6H2E;database=Test1;integratedSecurity=true;";
	private static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static Connection connection;
	
	public Panel2() 
	{
		setBackground(SystemColor.controlHighlight);
		setBounds(0, 0, 496, 533);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Panel brygadzisty");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 80, 476, 50);
		add(lblNewLabel);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\snake.png");
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(346, 287, ABORT);
		imageIcon = new ImageIcon(newImage);
		
		JButton btnNewButton = new JButton("Pobierz list\u0119 pracownik\u00F3w");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == btnNewButton) 
				{
					
				
					try {
						Class.forName(driverName);
					} catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
				
					try {
						Connection connection = DriverManager.getConnection(connectionUrl);
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Connected");
					
					try (Connection connection = DriverManager.getConnection(connectionUrl); Statement stmt = connection.createStatement();)
					{
						String SQL = "SELECT * FROM tbl_Persons";
						ResultSet rs = stmt.executeQuery(SQL);
						
						//Iterate through the data in the result set and display it
						while(rs.next()) 
						{
							System.out.println(rs.getString("FirstName") + " "+ rs.getString("LastName"));
						}
					}
					//Handle any errors that may have occured
					catch(SQLException e1) 
					{
						e1.printStackTrace();
					}
					
					
					
					
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(113, 164, 258, 44);
		add(btnNewButton);
		
		JButton btnWylijProtok = new JButton("Wy\u015Blij protok\u00F3\u0142");
		btnWylijProtok.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnWylijProtok.setBounds(113, 399, 258, 44);
		add(btnWylijProtok);
		
		JButton btnNewButton_1_1 = new JButton("Wype\u0142nij protok\u00F3\u0142");
		btnNewButton_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_1.setBounds(113, 237, 258, 44);
		add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Edytuj protok\u00F3\u0142");
		btnNewButton_1_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1_2.setBounds(113, 320, 258, 44);
		add(btnNewButton_1_2);
	}
}
