package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class PanelTicTacToe extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelTicTacToe() 
	{
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setBounds(0, 0, 496, 545);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 47, 273, 50);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Start the game");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == btnNewButton) 
				{
//					TicTacToe gameTicTacToe = new TicTacToe();					
				}
			}
		});
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 15));
		btnNewButton.setBounds(261, 441, 164, 44);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\TicTacToe1.png"));
		lblNewLabel_1.setBounds(61, 73, 359, 362);
		add(lblNewLabel_1);
		
		
		
		
	}
}
