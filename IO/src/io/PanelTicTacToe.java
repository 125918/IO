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
		setBackground(new Color(227, 227, 227));
		setForeground(Color.WHITE);
		setBounds(0, 0, 496, 545);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Panel pracownika administracji");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 78, 476, 50);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Drukuj raport");
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
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(157, 204, 164, 44);
		add(btnNewButton);
		
		JButton btnWylijPrzypomnienie = new JButton("Wy\u015Blij przypomnienie");
		btnWylijPrzypomnienie.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnWylijPrzypomnienie.setBounds(124, 305, 230, 44);
		add(btnWylijPrzypomnienie);
		
		
		
		
	}
}
