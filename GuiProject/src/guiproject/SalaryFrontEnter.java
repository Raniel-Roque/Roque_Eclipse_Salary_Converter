package guiproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SalaryFrontEnter extends JFrame implements ActionListener {
	
	//UNIVERSAL VARIABLES
	JButton Enter;
	
SalaryFrontEnter(){
	
	ImageIcon Logo = new ImageIcon(new ImageIcon("PayCal Logo.png").getImage().getScaledInstance(488/2, 511/2, Image.SCALE_SMOOTH));
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
	
	
	setSize(360, 640);
	setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
	getContentPane().setBackground(Color.decode("#1c373d"));
	setVisible(true);
	setResizable(false);
	setTitle("PayCal - Basic Salary Calculator");
	setIconImage(Logo.getImage());
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel Title = new JLabel();
	JLabel SubTitle = new JLabel();
	JLabel Image = new JLabel();
	Enter = new JButton();
	
	add(Title);
	add(SubTitle);
	add(Image);
	add(Enter);
	
	Title.setText("PayCal");
	Title.setHorizontalAlignment(JLabel.CENTER);
	Title.setBounds(10, 40, 327, 100);
	Title.setFont(new Font("Arial", Font.BOLD, 50));
	Title.setForeground(Color.white);
	
	SubTitle.setText("Basic Salary Calculator");
	SubTitle.setHorizontalAlignment(JLabel.CENTER);
	SubTitle.setBounds(10, 85, 327, 100);
	SubTitle.setFont(new Font("Arial", Font.BOLD, 20));
	SubTitle.setForeground(Color.white);
	
	Image.setIcon(Logo);
	Image.setHorizontalAlignment(JLabel.CENTER);
	Image.setBounds(45, 160, 512/2, 512/2);
	
	Enter.setText("ENTER");
	Enter.setBounds(50, 420, 250, 50);
	Enter.setFont(new Font("Arial", Font.BOLD, 25));
	Enter.setForeground(Color.black);
	Enter.setBackground(Color.decode("#A9DCF6"));
	Enter.setOpaque(true);
	Enter.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	Enter.setFocusable(false);
	Enter.addActionListener(this);
	
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == Enter) {
		SalaryInputFrame SIF = new SalaryInputFrame();
		SIF.setVisible(true);
		dispose();
		
	}
	//MADE BY RANIEL CHRISTIAN B ROQUE - BSIT-1A - February 3 2023
  }
}