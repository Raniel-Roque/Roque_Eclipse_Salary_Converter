package guiproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate; 
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.time.LocalDate;

public class SalaryInputFrame extends JFrame implements ActionListener {
	
	//UNIVERSAL VARIABLES
	JTextField IDIn, NameIn, OccupationIn, WHIn, RateIn, OvertimeIn ;
	JButton Calculate, Back;
	LocalDate date = LocalDate.now();
	
public SalaryInputFrame(){
	
	ImageIcon Logo = new ImageIcon(new ImageIcon("PayCal Logo.png").getImage().getScaledInstance(488/8, 511/8, Image.SCALE_SMOOTH));
	ImageIcon PesoLogo = new ImageIcon(new ImageIcon("Peso.png").getImage().getScaledInstance(512/4, 512/4, Image.SCALE_SMOOTH));
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
	
	//NEW COMPONENTS
	IDIn = new JTextField();
	NameIn = new JTextField();
	OccupationIn = new JTextField();
	WHIn = new JTextField();
	RateIn = new JTextField();
	OvertimeIn = new JTextField();
	
	JLabel Title = new JLabel();
	JLabel Title2 = new JLabel();
	JLabel EnterID = new JLabel();
	JLabel EnterName = new JLabel();
	JLabel EnterOccupation = new JLabel();
	JLabel EnterWH  = new JLabel();
	JLabel EnterRate = new JLabel();
	JLabel EnterOvertime = new JLabel();
	
	Calculate = new JButton();
	Back = new JButton();
	
	//RATE + COMPONENTS
	JLabel Rates = new JLabel();
	JLabel $2023 = new JLabel();
	JLabel Philippine = new JLabel();
	JLabel TRate = new JLabel();
	JLabel SSS = new JLabel();
	JLabel Pag_Ibig = new JLabel();
	JLabel PhilHealth = new JLabel();
	JLabel Peso = new JLabel();
	

	//ADD COMPONENTS (INPUT)
	add(Title);
	add(Title2);
	add(Peso);
	add(EnterID);
	add(EnterName);
	add(EnterOccupation);
	add(EnterWH);
	add(EnterRate);
	add(EnterOvertime);
	
	add(IDIn);
	add(NameIn);
	add(OccupationIn);
	add(WHIn);
	add(RateIn);
	add(OvertimeIn);
	
	add(Calculate);
	add(Back);
	
	//RATE COMPONENTS
	add(Rates);
	Rates.add($2023);
	Rates.add(Philippine);
	Rates.add(TRate);
	Rates.add(SSS);
	Rates.add(Pag_Ibig);
	Rates.add(PhilHealth);
	
	//FRAME SETS
	setSize(360, 640);
	setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
	getContentPane().setBackground(Color.decode("#1c373d"));
	setVisible(true);
	setResizable(false);
	setTitle("PayCal - Basic Salary Calculator");
	setIconImage(Logo.getImage());
	setLayout(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//TITLE 
	Title.setText("Calculate Your");
	Title.setBounds(6, 15, 280, 50);
	Title.setFont(new Font("Arial", Font.BOLD, 40));
	Title.setForeground(Color.white);
	
	Title2.setText("Monthly Net Salary");
	Title2.setBounds(6, 65, 280, 50);
	Title2.setFont(new Font("Arial", Font.BOLD, 20));
	Title2.setForeground(Color.white);
	
	Peso.setIcon(PesoLogo);
	Peso.setBounds(200, 6, 512/4, 512/4);
	
	
	//NAME + INPUT
	EnterName.setText("Enter Employee Name: ");
	EnterName.setBounds(11, 130, 200, 15);
	EnterName.setFont(new Font("Arial", Font.BOLD, 14));
	EnterName.setForeground(Color.white);
	
	NameIn.setBounds(6, 147, 330, 35);
	NameIn.setFont(new Font("Arial", Font.BOLD, 15));
	NameIn.setForeground(Color.white);
	NameIn.setBackground(Color.decode("#172d59"));
	NameIn.setOpaque(true);
	NameIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	//ID + INPUT
	EnterID.setText("Enter Employee ID no.: ");
	EnterID.setBounds(11, 195, 300, 15);
	EnterID.setFont(new Font("Arial", Font.BOLD, 14));
	EnterID.setForeground(Color.white);
			
	IDIn.setBounds(6, 212, 330, 35);
	IDIn.setFont(new Font("Arial", Font.BOLD, 15));
	IDIn.setForeground(Color.white);
	IDIn.setBackground(Color.decode("#172d59"));
	IDIn.setOpaque(true);
	IDIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
			
	//DESIGNATION + INPUT
	EnterOccupation.setText("Enter Occupation: ");
	EnterOccupation.setBounds(11, 250, 200, 35);
	EnterOccupation.setFont(new Font("Arial", Font.BOLD, 14));
	EnterOccupation.setForeground(Color.white);
	
	OccupationIn.setBounds(6, 277, 330, 35);
	OccupationIn.setFont(new Font("Arial", Font.BOLD, 15));
	OccupationIn.setForeground(Color.white);
	OccupationIn.setBackground(Color.decode("#172d59"));
	OccupationIn.setOpaque(true);
	OccupationIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	//WORKING HOURS + INPUT
	EnterWH.setText("Enter Working Hour(s): ");
	EnterWH.setBounds(11, 325, 300, 15);
	EnterWH.setFont(new Font("Arial", Font.BOLD, 14));
	EnterWH.setForeground(Color.white);
	
	WHIn.setBounds(6, 342, 200, 35);
	WHIn.setFont(new Font("Arial", Font.BOLD, 15));
	WHIn.setForeground(Color.white);
	WHIn.setBackground(Color.decode("#172d59"));
	WHIn.setOpaque(true);
	WHIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	//HOURLY RATE + INPUT
	EnterRate.setText("Enter Hourly Rate: ");
	EnterRate.setBounds(11, 390, 300, 15);
	EnterRate.setFont(new Font("Arial", Font.BOLD, 14));
	EnterRate.setForeground(Color.white);
	
	RateIn.setBounds(6, 407, 200, 35);
	RateIn.setFont(new Font("Arial", Font.BOLD, 15));
	RateIn.setForeground(Color.white);
	RateIn.setBackground(Color.decode("#172d59"));
	RateIn.setOpaque(true);
	RateIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	//OVERTIME + INPUT
	EnterOvertime.setText("Enter Overtime Hour(s): ");
	EnterOvertime.setBounds(11, 455, 300, 15);
	EnterOvertime.setFont(new Font("Arial", Font.BOLD, 14));
	EnterOvertime.setForeground(Color.white);
	
	OvertimeIn.setBounds(6, 472, 200, 35);
	OvertimeIn.setFont(new Font("Arial", Font.BOLD, 15));
	OvertimeIn.setForeground(Color.white);
	OvertimeIn.setBackground(Color.decode("#172d59"));
	OvertimeIn.setOpaque(true);
	OvertimeIn.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	//RATE + CONTENT
	Rates.setBounds(220, 342, 115, 165);
	Rates.setBackground(Color.decode("#172d59"));
	Rates.setOpaque(true);
	Rates.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	$2023.setText("2023 Monthly");
	$2023.setBounds(6, 0, 100, 30);
	$2023.setFont(new Font("Arial", Font.BOLD, 15));
	$2023.setForeground(Color.white);
	
	Philippine.setText("Philippine");
	Philippine.setBounds(6, 20, 100, 30);
	Philippine.setFont(new Font("Arial", Font.BOLD, 15));
	Philippine.setForeground(Color.white);
	
	TRate.setText("Rates: ");
	TRate.setBounds(6, 40, 100, 30);
	TRate.setFont(new Font("Arial", Font.BOLD, 15));
	TRate.setForeground(Color.white);
	
	SSS.setText("SSS: 12%");
	SSS.setBounds(6, 70, 100, 30);
	SSS.setFont(new Font("Arial", Font.PLAIN, 15));
	SSS.setForeground(Color.white);
	
	Pag_Ibig.setText("Pag-Ibig: P200");
	Pag_Ibig.setBounds(6, 97, 100, 30);
	Pag_Ibig.setFont(new Font("Arial", Font.PLAIN, 15));
	Pag_Ibig.setForeground(Color.white);
	
	PhilHealth.setText("PhilHealth: 4%");
	PhilHealth.setBounds(6, 125, 100, 30);
	PhilHealth.setFont(new Font("Arial", Font.PLAIN, 14));
	PhilHealth.setForeground(Color.white);
	
	//CALCULATE BUTTON
	Calculate.setText("CALCULATE");
	Calculate.setBounds(6, 530, 200, 35);
	Calculate.setFont(new Font("Arial", Font.BOLD, 15));
	Calculate.setForeground(Color.black);
	Calculate.setBackground(Color.decode("#A9DCF6"));
	Calculate.setOpaque(true);
	Calculate.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	Calculate.setFocusable(false);
	Calculate.addActionListener(this); //--LINE 308 PROGRAM
	
	Back.setText("BACK");
	Back.setBounds(220, 530, 115, 35);
	Back.setFont(new Font("Arial", Font.BOLD, 15));
	Back.setForeground(Color.black);
	Back.setBackground(Color.decode("#A9DCF6"));
	Back.setOpaque(true);
	Back.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	Back.setFocusable(false);
	Back.addActionListener(this);
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == Calculate) {

			// TODO Auto-generated method stub
			//Outputs Name and Local Date
			
			Double RegPay, OverPay, GrossDou, Tax = 0.0, SSS, Pag, Phil, TotalDed, Net;
	
			RegPay = Double.parseDouble(WHIn.getText()) *  Double.parseDouble(RateIn.getText());
			OverPay = Double.parseDouble(OvertimeIn.getText()) * (Double.parseDouble(RateIn.getText()) * 1.5);
			GrossDou = RegPay + OverPay;
			
			//WITHHELD TAX (TRAIN TABLE CONVERTED TO MONTHLY)
			
			if (GrossDou <= 250000/12) {
				Tax = 0.0;
				
			} else if (GrossDou > 250000/12 && GrossDou <= 400000/12) {
				Tax = 0 + (GrossDou - 250000/12) * .15/12;
				
			} else if (GrossDou > 400000/12 && GrossDou <= 800000/12) {
				Tax = 22500/12 + (GrossDou - 400000/12) * .20/12;
				
			} else if (GrossDou > 800000/12 && GrossDou <= 2000000/12) {
				Tax = 102500/12 + (GrossDou - 800000/12) * .25/12;
				
			} else if (GrossDou > 2000000/12 && GrossDou <= 8000000/12) {
				Tax = 402500/12 + (GrossDou - 2000000/12) * .30/12;
				
			} else if (GrossDou > 8000000/12) {
				Tax = 2202500/12 + (GrossDou - 8000000/12) * .35/12;
			}
			
			//OTHER CALCULATIONS 
			String ID = IDIn.getText(), Name = NameIn.getText(), Date = String.valueOf(date), Occupation = OccupationIn.getText(), WH = WHIn.getText(), Rate = RateIn.getText(), Overtime = OvertimeIn.getText();
			Double GrIn = GrossDou;
			SSS = GrossDou * .12;
			Pag = 200.00;
			Phil = GrossDou * 0.04;
			TotalDed = Tax + SSS + Pag + Phil;
			Net = GrossDou - TotalDed;
			
			
			SalaryOutputFrame SOF = new SalaryOutputFrame();
			SOF.my_update(ID, Name, Date, Occupation, WH, Rate, Overtime, GrIn, SSS, Phil, Pag, Tax, TotalDed, Net);
			SOF.setVisible(true); 
			dispose(); 
			
		} else if (e.getSource() == Back) {
			SalaryFrontEnter SFE = new SalaryFrontEnter();
			SFE.setVisible(true);
			dispose();

		}
		
		//MADE BY RANIEL CHRISTIAN B ROQUE - BSIT-1A - February 3 2023
	}
}
