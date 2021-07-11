package io;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class PanelPingPong extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public PanelPingPong() 
	{
		setBackground(Color.WHITE);
		setBounds(0, 0, 496, 537);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Ping Pong");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 47, 273, 50);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\Ping-Pong.png"));
		lblNewLabel_1.setBounds(79, 108, 346, 287);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start the game");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource() == btnNewButton) 
				{
//					PongGameFrame frame = new PongGameFrame();				
				}
		}
		});
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD, 15));
		btnNewButton.setBounds(261, 441, 164, 44);
		add(btnNewButton);
	}

}
