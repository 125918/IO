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
import java.awt.SystemColor;

public class Panel3 extends JPanel 
{

	/**
	 * Create the panel.
	 */
	public Panel3() 
	{
		setBackground(SystemColor.controlHighlight);
		setBounds(0, 0, 496, 537);
		setLayout(null);
		//setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Panel pracownika produkcji");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 80, 486, 50);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Wy\u015Bwietl protok\u00F3\u0142 oceny");
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
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(124, 192, 254, 44);
		add(btnNewButton);
		
		JButton btnZgoSprzeciw = new JButton("Zg\u0142o\u015B sprzeciw");
		btnZgoSprzeciw.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnZgoSprzeciw.setBounds(121, 277, 257, 44);
		add(btnZgoSprzeciw);
	}

}
