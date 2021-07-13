package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class PanelSnake extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelSnake() 
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
//					SnakeGameFrame frame = new SnakeGameFrame();
					
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
