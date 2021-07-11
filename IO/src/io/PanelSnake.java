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

public class PanelSnake extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelSnake() 
	{
		setBackground(Color.WHITE);
		setBounds(0, 0, 496, 533);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Snake");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 47, 273, 50);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\snake.png");
		Image image = imageIcon.getImage();
		Image newImage = image.getScaledInstance(346, 287, ABORT);
		imageIcon = new ImageIcon(newImage);
		lblNewLabel_1.setIcon(imageIcon);
		lblNewLabel_1.setBounds(79, 108, 346, 287);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start the game");
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
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 15));
		btnNewButton.setBounds(261, 441, 164, 44);
		add(btnNewButton);
	}
}
