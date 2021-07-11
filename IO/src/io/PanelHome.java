package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PanelHome extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelHome() 
	{
		setBounds(0, 0, 496, 530);
		setBackground(Color.WHITE);

		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Java");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(21, 150, 151, 67);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Katarzyna P\u0119drak");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setBounds(21, 351, 465, 48);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Informatyka, II rok, studia niestacjonarne");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 395, 450, 40);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Uniwersytet Opolski");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(21, 11, 223, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Wydzia\u0142 Matematyki, Fizyki i Informatyki");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setBounds(21, 28, 358, 15);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		//ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\Uni logo.jpg");
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\girl1.jpg");
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(225, 225, ABORT);
		imageIcon = new ImageIcon(newImage);
		lblNewLabel_5.setIcon(imageIcon);
		//lblNewLabel_5.setBounds(263, 0, 225, 225);
		lblNewLabel_5.setBounds(235, 81, 225, 225);	
		add(lblNewLabel_5);
		
		
	}

}
