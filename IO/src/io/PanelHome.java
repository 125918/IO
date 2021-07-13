package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class PanelHome extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelHome() 
	{
		setBounds(0, 0, 496, 530);
		setBackground(SystemColor.controlHighlight);

		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Z menu po lewej stronie wybierz odpowiedni dzia\u0142:");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(39, 145, 421, 67);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<---");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setBounds(10, 239, 476, 48);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<---");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 310, 450, 40);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("System okresowej");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 29, 350, 48);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("oceny pracownik\u00F3w");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_4.setBounds(75, 59, 358, 50);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("<---");
		lblNewLabel_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2_1.setBounds(10, 374, 450, 40);
		add(lblNewLabel_2_1);
		//ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\Uni logo.jpg");
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\girl1.jpg");
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(225, 225, ABORT);
		imageIcon = new ImageIcon(newImage);
		
		
	}
}
