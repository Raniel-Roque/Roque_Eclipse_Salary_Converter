package hub;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import converter.MainConvert;
import converter.MultiSystemFrame;
import guiproject.SalaryInputFrame;
import guiproject.SalaryMain;

public class HubFrame extends JFrame implements ActionListener {
			
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
			
	JButton MetricSystem, USCUnit, UnitConverter, Imperial;
			
	HubFrame(){
			
	ImageIcon Logo = new ImageIcon("Unit_Con.png");
	ImageIcon MetricSystemLg = new ImageIcon(new ImageIcon("SI-Landing-graphic.png").getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH));
	ImageIcon USCUnitLg = new ImageIcon(new ImageIcon("2-23130_image-of-usa-flag-waving-gif-png-emoji.png").getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH));
	ImageIcon ImperialLg = new ImageIcon(new ImageIcon("360_F_61473310_GwaVCFCKeQdeRj05P88xlnO3dF5HiJRp-removebg-preview.png").getImage().getScaledInstance(135, 135, Image.SCALE_SMOOTH));		ImageIcon SystemLg = new ImageIcon(new ImageIcon("Ruler-PNG.png").getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH));
				
	//FRAME SETS
	setSize(450, 475);
	setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
	getContentPane().setBackground(Color.decode("#fcd47c"));
	setResizable(false);
	setTitle("Unit Converter");
	setIconImage(Logo.getImage());
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	//DECLARE
	JLabel Title = new JLabel();
	JLabel Subtitle = new JLabel();		
	JLabel MetricSystemTxT = new JLabel();
	JLabel USCUnitTxT = new JLabel();
	JLabel ImperialTxT = new JLabel();
	JLabel SystemTxT = new JLabel();
	MetricSystem = new JButton();
	USCUnit = new JButton();
	Imperial = new JButton();
	UnitConverter = new JButton();
			
	//ADD
	add(Title);
	add(Subtitle);
	add(MetricSystemTxT);
	add(USCUnitTxT);
	add(ImperialTxT);
	add(SystemTxT);
			
	add(MetricSystem);
	add(USCUnit);
	add(Imperial);
	add(UnitConverter);
			
	//TEXTS
	Title.setBounds(0, 5, 440, 50);
	Title.setText("App Compilation");
	Title.setHorizontalAlignment(JLabel.CENTER);
	Title.setFont(new Font("Arial", Font.BOLD, 40));
			
	Subtitle.setBounds(0, 45, 440, 50);
	Subtitle.setText("Select a system of measurement");
	Subtitle.setHorizontalAlignment(JLabel.CENTER);
	Subtitle.setFont(new Font("Arial", Font.ITALIC, 20));
			
	SystemTxT.setBounds(60, 220, 200, 50);
	SystemTxT.setText("Unit Converter");
	SystemTxT.setForeground(Color.black);
	SystemTxT.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
			
	MetricSystemTxT.setBounds(250, 390, 200, 50);
	MetricSystemTxT.setText("Metric Units");
	MetricSystemTxT.setForeground(Color.black);
	MetricSystemTxT.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
			
	USCUnitTxT.setBounds(68, 390, 200, 50);
	USCUnitTxT.setText("USC Units");
	USCUnitTxT.setForeground(Color.black);
	USCUnitTxT.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
			
	ImperialTxT.setBounds(240, 220, 200, 50);
	ImperialTxT.setText("Imperial Units");
	ImperialTxT.setForeground(Color.black);
	ImperialTxT.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
			
			
	//BUTTONS
			
	UnitConverter.setIcon(SystemLg);
	UnitConverter.setBounds(60, 100, 125, 125);
	UnitConverter.setFont(new Font("Arial", Font.BOLD, 15));
	UnitConverter.setOpaque(true);
	UnitConverter.setBackground(Color.decode("#6405bc"));
	UnitConverter.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	UnitConverter.setFocusable(false);
	UnitConverter.addActionListener(this);
			
	USCUnit.setIcon(USCUnitLg);
	USCUnit.setBounds(60, 270, 125, 125);
	USCUnit.setFont(new Font("Arial", Font.BOLD, 15));
	USCUnit.setBackground(Color.decode("#318a39"));
	USCUnit.setOpaque(true);
	USCUnit.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	USCUnit.setFocusable(false);
	USCUnit.addActionListener(this);
			
	Imperial.setIcon(ImperialLg);
	Imperial.setBounds(250, 100, 125, 125);
	Imperial.setFont(new Font("Arial", Font.BOLD, 15));
	Imperial.setOpaque(true);
	Imperial.setBackground(Color.decode("#ffa100"));
	Imperial.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	Imperial.setFocusable(false);
	Imperial.addActionListener(this);
			
	MetricSystem.setIcon(MetricSystemLg);
	MetricSystem.setBounds(250, 270, 125, 125);
	MetricSystem.setFont(new Font("Arial", Font.BOLD, 15));
	MetricSystem.setOpaque(true);
	MetricSystem.setBackground(Color.decode("#f64309"));
	MetricSystem.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	MetricSystem.setFocusable(false);
	MetricSystem.addActionListener(this);
			


	setVisible(true);
			
}
			
@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
				
		if (e.getSource().equals(UnitConverter)) {
			SalaryInputFrame SIF = new SalaryInputFrame();
			SIF.setVisible(true);
			dispose();

		} /*else if (e.getSource().equals(MetricSystem)) {
			new SalaryMain();
				
		} else if (e.getSource().equals(Imperial)) {
			Imperial Imp = new ImperialFrame();
			Imp.setVisible(true);
			dispose();
				
		} else if (e.getSource().equals(USCUnit)) {
			Imperial Imp = new ImperialFrame();
			Imp.setVisible(true);
			dispose();
				
		}*/

	}
}

			
