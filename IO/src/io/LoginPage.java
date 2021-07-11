package io;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPage implements ActionListener 
{
	Connection connection = null;
	Statement st = null;
	ResultSet set = null;	
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Zaloguj");
	JButton resetButton = new JButton("Resetuj");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("Nazwa uzytkownika: ");
	JLabel userPasswordLabel = new JLabel("Haslo: ");
	JLabel messageLabel = new JLabel();
	JLabel label = new JLabel();
	JLabel info = new JLabel();	
		
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	//private final JLabel lblNewLabel_3 = new JLabel("Sit back, relax and have fun playing games");
	
	LoginPage(HashMap<String, String> loginInfoOriginal) // to jest tak jakby kopia logininfo dostêpna w LoginPage
	{
		logininfo = loginInfoOriginal;		
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);	
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		info.setText("Firma XYZ\r\n");
		
		info.setBounds(10, 11, 365, 30);
		info.setHorizontalAlignment(SwingConstants.CENTER);
		info.setForeground(Color.BLACK);
		info.setFont(new Font("MV Boli", Font.BOLD, 17));	
		frame.getContentPane().add(info);
	
		
		userIDLabel.setBounds(10, 126, 143, 25);
		userIDLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		userIDLabel.setForeground(Color.BLACK);
		userIDLabel.setFont(new Font("MV Boli", Font.BOLD, 12));	
		frame.getContentPane().add(userIDLabel);
		
		userPasswordLabel.setFont(new Font("MV Boli", Font.BOLD, 12));
		userPasswordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		userPasswordLabel.setForeground(Color.BLACK);
		userPasswordLabel.setBounds(31, 162, 122, 25);		
		frame.getContentPane().add(userPasswordLabel);
		
		
		messageLabel.setBounds(31, 196, 344, 35);
		messageLabel.setFont(new Font("Dialog", Font.ITALIC, 18));
		frame.getContentPane().add(messageLabel);	
		
		userIDField.setBounds(174,  128, 201, 20);
		userPasswordField.setBounds(174,  164, 201, 20);
		frame.getContentPane().add(userIDField);
		frame.getContentPane().add(userPasswordField);
		
		loginButton.setBounds(277, 276, 86, 25);
		frame.getContentPane().add(loginButton);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(277, 312, 86, 25);
		frame.getContentPane().add(resetButton);
		resetButton.setFocusable(false);
		
		JLabel lblSystemOkresowejOceny = new JLabel();
		lblSystemOkresowejOceny.setText("System okresowej oceny pracownik\u00F3w");
		lblSystemOkresowejOceny.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystemOkresowejOceny.setForeground(Color.BLACK);
		lblSystemOkresowejOceny.setFont(new Font("MV Boli", Font.BOLD, 17));
		lblSystemOkresowejOceny.setBounds(10, 52, 365, 30);
		frame.getContentPane().add(lblSystemOkresowejOceny);
		resetButton.addActionListener(this);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\TicTacToe1.png");
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(143, 92, Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newImage);
		ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\snake.png");
		Image image1 = imageIcon1.getImage();
		Image newImage1 = image1.getScaledInstance(154, 80, Image.SCALE_SMOOTH);
		imageIcon1 = new ImageIcon(newImage1);
		ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\Ping-Pong.png");
		Image image2 = imageIcon2.getImage();
		Image newImage2 = image2.getScaledInstance(154, 111, Image.SCALE_SMOOTH);
		imageIcon2 = new ImageIcon(newImage2);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == resetButton) 
		{
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) 
		{
			try 
			{
				connection = ConnectionTest.getConnection();
				String guery = "select * from tbl_Users where UserName = '" + userIDField.getText() +"' and Password = '" + userPasswordField.getText() +"'";
				st = connection.createStatement();
				set = st.executeQuery(guery);
				if(set.next()) 
				{
					JOptionPane.showMessageDialog(frame, "Login was succesful");
					frame.dispose();

					FrameDashboard frame = new FrameDashboard(guery);
					frame.setVisible(true);
				}
				else 
				{
					JOptionPane.showMessageDialog(frame, "Login failed");
				}
			} 
			catch (Exception e2) 
			{
				
			}
			
			
			
			
//			String userID = userIDField.getText();
//			String password = String.valueOf(userPasswordField.getPassword());
//			
//			if(logininfo.containsKey(userID)) 
//			{
//				if(logininfo.get(userID).equals(password)) 
//				{ //jeœli dostaniemy userID i powi¹zane z nim has³o wyœwietlamy komunikat i otwieramy okno
//					messageLabel.setForeground(Color.green);
//					messageLabel.setText("Logowanie zakoñczone sukcesem");
//					frame.dispose();
//					//WelcomePage welcomePage = new WelcomePage(userID);
//					FrameDashboard frame = new FrameDashboard(userID);
//					frame.setVisible(true);
//				}
//				else 
//				{
//					messageLabel.setForeground(Color.red);
//					messageLabel.setText("Niepoprawne haslo");
//				}			
//			
//			}
//			else 
//			{
//				messageLabel.setForeground(Color.red);
//				messageLabel.setText("Nie znaleziono uzytkownika");
//			}
			
			
		}
		
	}

	public void setVisible(boolean b) {

		
	}
}
