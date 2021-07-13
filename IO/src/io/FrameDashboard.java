package io;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FrameDashboard extends JFrame 
{

	protected static final HashMap<String, String> loginInfoOriginal = null;

	private JPanel contentPane;

	private PanelHome panelHome;
	private Panel1 panelTicTacToe;
	private Panel2 panelSnake;
	private Panel3 panelPingPong;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String userID = null;
					FrameDashboard frame = new FrameDashboard(userID);
					frame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameDashboard(String userID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 552);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelTicTacToe = new Panel1();
		panelSnake = new Panel2();
		panelPingPong = new Panel3();
		
		
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(Color.GRAY);
		paneMenu.setBounds(0, 0, 288, 552);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				menuClicked(panelHome);
			}
		});
		paneHome.setBounds(10, 183, 266, 55);
		paneMenu.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Panel g\u0142\u00F3wny");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(76, 11, 118, 33);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		paneHome.add(lblNewLabel_1);
		
//		JLabel lblNewLabel = new JLabel("");
//		ImageIcon imageIcon = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\Home.png");
//		Image image = imageIcon.getImage();
//		Image newImage = image.getScaledInstance(50, 50, ABORT);
//		imageIcon = new ImageIcon(newImage);
//		lblNewLabel.setIcon(imageIcon);
//		lblNewLabel.setBounds(0, 0, 55, 55);
//		paneHome.add(lblNewLabel);
		
		
		
		JPanel paneTicTacToe = new JPanel();
		paneTicTacToe.addMouseListener(new PanelButtonMouseAdapter(paneTicTacToe)
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				menuClicked(panelTicTacToe);
			}
		});
		paneTicTacToe.setBounds(10, 249, 266, 55);
		paneMenu.add(paneTicTacToe);
		paneTicTacToe.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Pracownik administracji");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 246, 33);
		paneTicTacToe.add(lblNewLabel_2);
		
//		JLabel lblNewLabel_5 = new JLabel("");
//		ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\katar\\Desktop\\Java\\LoginSystem\\TicTacToe1.png");
//		Image image1 = imageIcon1.getImage();
//		Image newImage1 = image1.getScaledInstance(55, 55, ABORT);
//		imageIcon1 = new ImageIcon(newImage1);
//		lblNewLabel_5.setIcon(imageIcon1);
//		lblNewLabel_5.setBounds(0, 0, 55, 55);		
//		paneTicTacToe.add(lblNewLabel_5);
		
		JPanel paneSnake = new JPanel();
		paneSnake.addMouseListener(new PanelButtonMouseAdapter(paneSnake)
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				menuClicked(panelSnake);
			}
		});
		paneSnake.setBounds(10, 315, 266, 55);
		paneMenu.add(paneSnake);
		paneSnake.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Pracownik nadzoruj\u0105cy");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 11, 246, 33);
		paneSnake.add(lblNewLabel_3);
		
		JPanel panePingPong = new JPanel();
		panePingPong.addMouseListener(new PanelButtonMouseAdapter(panePingPong)
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				menuClicked(panelPingPong);
			}
		});
		panePingPong.setBounds(10, 381, 266, 55);
		paneMenu.add(panePingPong);
		panePingPong.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Pracownik produkcyjny");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 11, 246, 33);
		panePingPong.add(lblNewLabel_4);
		
		JPanel paneSignOut = new JPanel();
		paneSignOut.addMouseListener(new PanelButtonMouseAdapter(paneSignOut)
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null, "Jesteœ pewien, ¿e chcesz siê wylogowaæ?") == 0) 
				{
					
					FrameDashboard.this.dispose();
					IDandPasswords idandPasswords = new IDandPasswords();
					LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
					loginPage.setVisible(true);
				}
				
			}
		});
		paneSignOut.setLayout(null);
		paneSignOut.setBounds(10, 447, 266, 55);
		paneMenu.add(paneSignOut);
		paneSignOut.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Wyloguj");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4_1.setBounds(60, 11, 133, 33);
		paneSignOut.add(lblNewLabel_4_1);
		panePingPong.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Firma XYZ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 53, 268, 55);
		paneMenu.add(lblNewLabel);
		
		JLabel lblExit = new JLabel("x");
		lblExit.setFont(new Font("MV Boli", Font.BOLD, 20));
		lblExit.setForeground(Color.WHITE);
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setBounds(809, 0, 27, 24);
		lblExit.addMouseListener(new MouseAdapter()
			{
			
				@Override
				public void mouseClicked(MouseEvent e)
				{
					if(JOptionPane.showConfirmDialog(null, "Jesteœ pewien, ¿e chesz opuœciæ aplikacjê?", "Potwierdzenie", JOptionPane.YES_NO_OPTION) == 0) {
						FrameDashboard.this.dispose();
						
					}
					
					
				}
			
				@Override
				public void mouseEntered(MouseEvent e)
				{
					lblExit.setForeground(Color.RED);
				}
				
				@Override
				public void mouseExited(MouseEvent e) 
				{
					lblExit.setForeground(Color.WHITE);
				}
			
			});
		contentPane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBounds(304, 11, 494, 530);
		contentPane.add(paneMainContent);
		paneMainContent.setLayout(null);
		
//		JLabel lblNewLabel_5 = new JLabel("Panel brygadzisty");
//		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
//		lblNewLabel_5.setForeground(Color.BLACK);
//		lblNewLabel_5.setBounds(20, 40, 464, 49);
//		paneMainContent.add(lblNewLabel_5);
//		
//		JButton btnNewButton = new JButton("Pobierz list\u0119 pracownik\u00F3w");
//		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
//		btnNewButton.setBounds(128, 188, 238, 49);
//		paneMainContent.add(btnNewButton);
//		
//		JButton btnWylijPrzypomnienie = new JButton("Edytuj protok\u00F3\u0142");
//		btnWylijPrzypomnienie.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
//		btnWylijPrzypomnienie.setBounds(128, 335, 238, 49);
//		paneMainContent.add(btnWylijPrzypomnienie);
//		
//		JButton btnWypenijRaport = new JButton("Wype\u0142nij protok\u00F3\u0142");
//		btnWypenijRaport.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
//		btnWypenijRaport.setBounds(128, 259, 238, 49);
//		paneMainContent.add(btnWypenijRaport);
//		
//		JButton btnWylijProtok = new JButton("Wy\u015Blij protok\u00F3\u0142");
//		btnWylijProtok.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
//		btnWylijProtok.setBounds(128, 408, 238, 49);
//		paneMainContent.add(btnWylijProtok);
		
		paneMainContent.add(panelHome);
		paneMainContent.add(panelTicTacToe);
		paneMainContent.add(panelSnake);
		paneMainContent.add(panelPingPong);
		
		
		menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) 
	{
		panelHome.setVisible(false);
		panelTicTacToe.setVisible(false);
		panelSnake.setVisible(false);
		panelPingPong.setVisible(false);
	
		
		panel.setVisible(true);
	}


	private class PanelButtonMouseAdapter extends MouseAdapter
	{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) 
		{
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e)
		{
			panel.setBackground(new Color(112, 128, 144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) 
		{
			panel.setBackground(Color.WHITE);
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			panel.setBackground(new Color(60, 179, 113));
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			panel.setBackground(new Color(112, 128, 144));
		}
		
		
	}
}
