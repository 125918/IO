package io;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JFrame implements ActionListener
{
	JLabel lWprowadzDane, lImie, lNazwisko, lPESEL;	
	JTextField tImie, tNazwisko, tPESEL;	
	JButton bWyswietlDane;	
	JTextArea taDane;	
	
	public Panel_1() 
	{
		setSize(400, 400);
		setTitle("Formularz");
		setLayout(null);
		setLocation(1200, 100);
		
		lWprowadzDane = new JLabel("Wprowadz dane: ");
		lWprowadzDane.setBounds(50, 20, 100, 30);
		add(lWprowadzDane);		
		
		lImie = new JLabel("Imiê: ");
		lImie.setBounds(50, 70, 100, 30);
		add(lImie);
		
		lNazwisko = new JLabel("Nazwisko: ");
		lNazwisko.setBounds(50, 100, 100, 30);
		add(lNazwisko);
		
		lPESEL = new JLabel("PESEL: ");
		lPESEL.setBounds(50, 130, 100, 30);
		add(lPESEL);
		
		tImie = new JTextField();
		tImie.setBounds(160, 70, 170, 20);
		add(tImie);
		tImie.addActionListener(this);
		tImie.addFocusListener(new FocusListener() 
		{
			
			@Override
			public void focusLost(FocusEvent e) 
			{
				if(tImie.getText().length() == 0)
					tImie.setText("Imiê");			
			}
			
			@Override
			public void focusGained(FocusEvent e) 
			{
				if(tImie.getText().equals("Imiê"))
					tImie.setText("");				
			}
		});		
		
		tNazwisko = new JTextField();
		tNazwisko.setBounds(160, 100, 170, 20);
		add(tNazwisko);
		tNazwisko.addActionListener(this);
		tNazwisko.addFocusListener(new FocusListener() 
		{
			
			@Override
			public void focusLost(FocusEvent e) 
			{
				if(tNazwisko.getText().length() == 0)
					tNazwisko.setText("Nazwisko");			
			}
			
			@Override
			public void focusGained(FocusEvent e) 
			{
				if(tNazwisko.getText().equals("Nazwisko"))
					tNazwisko.setText("");				
			}
		});
				
		tPESEL = new JTextField();
		tPESEL.setBounds(160, 130, 170, 20);
		add(tPESEL);
		tPESEL.addActionListener(this);
		tPESEL.setToolTipText("PESEL musi mieæ 11 znaków");
		tPESEL.addFocusListener(new FocusListener() 
		{
			
			@Override
			public void focusLost(FocusEvent e) 
			{
				if(tPESEL.getText().length() == 0)
					tPESEL.setText("PESEL");			
			}
			
			@Override
			public void focusGained(FocusEvent e) 
			{
				if(tPESEL.getText().equals("PESEL"))
					tPESEL.setText("");				
			}
		});
		
		bWyswietlDane = new JButton("Wyœwietl dane ");
		bWyswietlDane.setBounds(50, 180, 130, 30);
		add(bWyswietlDane);
		bWyswietlDane.addActionListener(this);
		
		taDane = new JTextArea();
		taDane.setBounds(50, 230, 280, 90);
		add(taDane);
	}	

	public static void main(String[] args) 
	{
		Panel_1 formularz = new Panel_1();
		formularz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularz.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String PESEL = tPESEL.getText();
		String plec = "";
		String test = PESEL.substring(9, 10);
		if(((Integer.parseInt(test)) & 1) == 0)
			plec = "kobieta";
		else
			plec = "mê¿czyzna";
		
		String rok = "19" + PESEL.substring(0, 2);
		String miesiac = PESEL.substring(2, 4);
		String dzien = PESEL.substring(4, 6);
		
		taDane.setText("Imiê: "+ "\t" + tImie.getText() + "\nNazwisko: " + "\t" + tNazwisko.getText() + "\nData ur.: " + "\t" + rok + "." + miesiac + "." + dzien + "\nP³eæ: " + "\t" + plec);
	}
}

