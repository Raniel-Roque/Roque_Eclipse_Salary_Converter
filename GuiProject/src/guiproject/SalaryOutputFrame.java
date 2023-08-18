package guiproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SalaryOutputFrame extends JFrame implements ActionListener {

	public void my_update(String ID,String Name,String Date,String Occupation,String WH,String Rate,String Overtime,Double GrIn,Double SSS,Double Phil,Double Pag,Double Tax,Double TotalDed,Double Net) {
		//IDOut.setText(ID);
		IDOut.setText(ID);
		NameOut.setText(Name);
		DateOut.setText(Date);
		OccupationOut.setText(Occupation);
		WHOut.setText(WH + " Hour(s)");
		RateOut.setText(Rate + " per Hour");
		OvertimeOut.setText(Overtime + " Hour(s)");
		GrossOut.setText(String.format("%.2f", GrIn));
		TaxOut.setText(String.format("%.2f", Tax));
		SSSOut.setText(String.format("%.2f", SSS));
		PagOut.setText(String.format("%.2f", Pag));
		PhilOut.setText(String.format("%.2f", Phil));
		TotalDedOut.setText(String.format("%.2f", TotalDed));
		PayOut.setText(String.format("%.2f", Net));
	}
	
	//UNIVERSAL VARIABLES
	JLabel IDOut, NameOut, DateOut, OccupationOut, WHOut, RateOut, OvertimeOut, GrossOut, SSSOut, PagOut, PhilOut, TaxOut, TotalDedOut;
	JButton Back;
	JTextField PayOut;
	
SalaryOutputFrame(){
	ImageIcon Logo = new ImageIcon(new ImageIcon("PayCal Logo.png").getImage().getScaledInstance(488/2, 511/2, 0));
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
	
	//OUTPUT COMPONENTS
	JLabel NetOut = new JLabel();
	JLabel NetTxTOut = new JLabel();
	JLabel IDTxTOut = new JLabel();
	JLabel NameTxTOut = new JLabel();
	JLabel OccupationTxTOut = new JLabel();
	JLabel DateTxTOut = new JLabel();
	JLabel WHTxTOut = new JLabel();
	JLabel RateTxTOut = new JLabel();
	JLabel OvertimeTxTOut = new JLabel();
	JLabel GrossTxTOut = new JLabel();
	JLabel SSSTxTOut = new JLabel();
	JLabel PhilTxTOut = new JLabel();
	JLabel PagTxTOut = new JLabel();
	JLabel TaxTxTOut = new JLabel();
	JLabel TotalDedTxTOut = new JLabel();
	JLabel PayTxTOut = new JLabel();
	
	IDOut = new JLabel();
	NameOut = new JLabel();
	OccupationOut = new JLabel();
	DateOut = new JLabel();
	WHOut = new JLabel();
	RateOut = new JLabel();
	OvertimeOut = new JLabel();
	GrossOut = new JLabel();
	JLabel DeductionTxTOut = new JLabel();
	SSSOut = new JLabel();
	PhilOut = new JLabel();
	PagOut = new JLabel();
	TaxOut = new JLabel();
	TotalDedOut = new JLabel();
	PayOut = new JTextField();
	
	
	JLabel Line = new JLabel();
	
	Back = new JButton();
	//OUTPUT + COMPONENTS
	add(NetOut);
	NetOut.add(NetTxTOut);
	NetOut.add(IDTxTOut);
	NetOut.add(NameTxTOut);
	NetOut.add(DateTxTOut);
	NetOut.add(OccupationTxTOut);
	NetOut.add(WHTxTOut);
	NetOut.add(RateTxTOut);
	NetOut.add(OvertimeTxTOut);
	NetOut.add(GrossTxTOut);
	NetOut.add(DeductionTxTOut);
	NetOut.add(SSSTxTOut);
	NetOut.add(PhilTxTOut);
	NetOut.add(PagTxTOut);
	NetOut.add(TaxTxTOut);
	NetOut.add(TotalDedTxTOut);
	NetOut.add(PayTxTOut);
	
	NetOut.add(IDOut);
	NetOut.add(NameOut);
	NetOut.add(DateOut);
	NetOut.add(OccupationOut);
	NetOut.add(WHOut);
	NetOut.add(RateOut);
	NetOut.add(OvertimeOut);
	NetOut.add(GrossOut);
	NetOut.add(SSSOut);
	NetOut.add(PhilOut);
	NetOut.add(PagOut);
	NetOut.add(TaxOut);
	NetOut.add(TotalDedOut);
	NetOut.add(PayOut);
	NetOut.add(Line);
	
	add(Back);
	//OUTPUT TABLE + COMPONENTS
	
	NetOut.setBounds(10, 25, 325, 515);
	NetOut.setBackground(Color.decode("#e3e1e1"));
	NetOut.setOpaque(true);
	NetOut.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	NetTxTOut.setText("Net Salary Report: ");
	NetTxTOut.setBounds(10, 5, 300, 40);
	NetTxTOut.setFont(new Font("Arial", Font.BOLD, 30));
	NetTxTOut.setForeground(Color.black);
	
	NameTxTOut.setText("Employee Name: ");
	NameTxTOut.setBounds(10, 55, 150, 20);
	NameTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	NameTxTOut.setForeground(Color.black);
	
	IDTxTOut.setText("Employee ID no: ");
	IDTxTOut.setBounds(10, 85, 150, 20);
	IDTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	IDTxTOut.setForeground(Color.black);
	
	DateTxTOut.setText("Date: ");
	DateTxTOut.setBounds(10, 115, 150, 20);
	DateTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	DateTxTOut.setForeground(Color.black);
	
	OccupationTxTOut.setText("Occupation: ");
	OccupationTxTOut.setBounds(10, 145, 150, 20);
	OccupationTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	OccupationTxTOut.setForeground(Color.black);
	
	WHTxTOut.setText("Working Hour(s): ");
	WHTxTOut.setBounds(10, 175, 150, 20);
	WHTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	WHTxTOut.setForeground(Color.black);
	
	RateTxTOut.setText("Hourly Rate: ");
	RateTxTOut.setBounds(10, 205, 200, 20);
	RateTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	RateTxTOut.setForeground(Color.black);
	
	OvertimeTxTOut.setText("Overtime Hour(s): ");
	OvertimeTxTOut.setBounds(10, 235, 200, 20);
	OvertimeTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	OvertimeTxTOut.setForeground(Color.black);
	
	GrossTxTOut.setText("Gross Income:                         P");
	GrossTxTOut.setBounds(10, 265, 230, 20);
	GrossTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	GrossTxTOut.setForeground(Color.black);
	
	DeductionTxTOut.setText("Deductions to Gross Pay: ");
	DeductionTxTOut.setBounds(10, 295, 200, 20);
	DeductionTxTOut.setFont(new Font("Arial", Font.ITALIC, 15));
	DeductionTxTOut.setForeground(Color.black);
	
	SSSTxTOut.setText("• Social Security Contribution: P");
	SSSTxTOut.setBounds(15, 325, 220, 20);
	SSSTxTOut.setFont(new Font("Arial", Font.PLAIN, 14));
	SSSTxTOut.setForeground(Color.black);
	
	PhilTxTOut.setText("• PhilHealth Contribution:        P");
	PhilTxTOut.setBounds(15, 355, 230, 20);
	PhilTxTOut.setFont(new Font("Arial", Font.PLAIN, 14));
	PhilTxTOut.setForeground(Color.black);
	
	PagTxTOut.setText("• Pag-Ibig Contribution:           P");
	PagTxTOut.setBounds(15, 385, 230, 20);
	PagTxTOut.setFont(new Font("Arial", Font.PLAIN, 14));
	PagTxTOut.setForeground(Color.black);
	
	TaxTxTOut.setText("• Income Tax:                          P");
	TaxTxTOut.setBounds(15, 415, 230, 20);
	TaxTxTOut.setFont(new Font("Arial", Font.PLAIN, 14));
	TaxTxTOut.setForeground(Color.black);
	
	TotalDedTxTOut.setText("Deduction Total:                      P");
	TotalDedTxTOut.setBounds(10, 445, 250, 20);
	TotalDedTxTOut.setFont(new Font("Arial", Font.PLAIN, 15));
	TotalDedTxTOut.setForeground(Color.black);
	
	PayTxTOut.setText("Net Pay: P");
	PayTxTOut.setBounds(10, 475, 250, 30);
	PayTxTOut.setFont(new Font("Arial", Font.BOLD, 20));
	PayTxTOut.setForeground(Color.black);
	
	//OUTPUTS WITH ANSWERS
	
	NameOut.setBounds(125, 55, 150, 20);
	NameOut.setFont(new Font("Arial", Font.PLAIN, 15));
	NameOut.setForeground(Color.black);
	
	IDOut.setBounds(120, 85, 150, 20);
	IDOut.setFont(new Font("Arial", Font.PLAIN, 15));
	IDOut.setForeground(Color.black);
	
	DateOut.setBounds(50, 115, 150, 20);
	DateOut.setFont(new Font("Arial", Font.PLAIN, 15));
	DateOut.setForeground(Color.black);
	
	OccupationOut.setBounds(95, 145, 150, 20);
	OccupationOut.setFont(new Font("Arial", Font.PLAIN, 15));
	OccupationOut.setForeground(Color.black);
	
	WHOut.setBounds(125, 175, 145, 20);
	WHOut.setFont(new Font("Arial", Font.PLAIN, 15));
	WHOut.setForeground(Color.black);
	
	RateOut.setBounds(95, 205, 150, 20);
	RateOut.setFont(new Font("Arial", Font.PLAIN, 15));
	RateOut.setForeground(Color.black);
	
	OvertimeOut.setBounds(130, 235, 150, 20);
	OvertimeOut.setFont(new Font("Arial", Font.PLAIN, 15));
	OvertimeOut.setForeground(Color.black);
	
	GrossOut.setHorizontalAlignment(SwingConstants.RIGHT);
	GrossOut.setBounds(120, 265, 200, 20);
	GrossOut.setFont(new Font("Arial", Font.PLAIN, 15));
	GrossOut.setForeground(Color.black);
	
	SSSOut.setHorizontalAlignment(SwingConstants.RIGHT);
	SSSOut.setBounds(170, 325, 150, 20);
	SSSOut.setFont(new Font("Arial", Font.PLAIN, 15));
	SSSOut.setForeground(Color.decode("#b31515"));
	
	PhilOut.setHorizontalAlignment(SwingConstants.RIGHT);
	PhilOut.setBounds(170, 355, 150, 20);
	PhilOut.setFont(new Font("Arial", Font.PLAIN, 15));
	PhilOut.setForeground(Color.decode("#b31515"));
	
	PagOut.setHorizontalAlignment(SwingConstants.RIGHT);
	PagOut.setBounds(170, 385, 150, 20);
	PagOut.setFont(new Font("Arial", Font.PLAIN, 15));
	PagOut.setForeground(Color.decode("#b31515"));
	
	TaxOut.setHorizontalAlignment(SwingConstants.RIGHT);
	TaxOut.setBounds(170, 415, 150, 20);
	TaxOut.setFont(new Font("Arial", Font.PLAIN, 15));
	TaxOut.setForeground(Color.decode("#b31515"));
	
	TotalDedOut.setHorizontalAlignment(SwingConstants.RIGHT);
	TotalDedOut.setBounds(170, 445, 150, 20);
	TotalDedOut.setFont(new Font("Arial", Font.PLAIN, 15));
	TotalDedOut.setForeground(Color.decode("#b31515"));

	PayOut.setHorizontalAlignment(SwingConstants.RIGHT);
	PayOut.setBounds(170, 475, 150, 25);
	PayOut.setFont(new Font("Aerial", Font.PLAIN, 20));
	PayOut.setForeground(Color.decode("#025908"));
	PayOut.setEditable(false);
	PayOut.setBackground(null);
	PayOut.setBorder(null);
	
	//DECORATIVE LINE
	Line.setBounds(220, 440, 100, 2);
	Line.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	Back.setText("RESET");
	Back.setBounds(220, 545, 115, 35);
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
		if (e.getSource() == Back) {
			SalaryInputFrame SIF = new SalaryInputFrame();
			SIF.setVisible(true);
			dispose();
		}
		//MADE BY RANIEL CHRISTIAN B ROQUE - BSIT-1A - February 3 2023
	}
}