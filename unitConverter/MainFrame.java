package unitConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class MainFrame extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	Toolkit toolkit = frame.getToolkit();
	Dimension position = toolkit.getScreenSize();
	ImageIcon logo = new ImageIcon("UnitConverter logo.jpg");
	ImageIcon ccs = new ImageIcon(new ImageIcon("DCT CCS logo.png").getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
	
	JPanel ttlPanel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	JLabel ttl = new JLabel();
	JLabel text1 = new JLabel();
	JLabel text2 = new JLabel();
	JLabel text3 = new JLabel();
	static JLabel answer = new JLabel();
	JLabel line = new JLabel();
	JLabel ccsLogo = new JLabel("", ccs, JLabel.CENTER);
	
	static JTextField box1 = new JTextField();
	
	JButton compute = new JButton();
	
	static JComboBox<String> cb1 = new JComboBox <String>();
	static JComboBox<String> cb2 = new JComboBox <String>();
	static JComboBox<String> cb3 = new JComboBox <String>();
	
	//Inputs
	
	public static String [] converter = {
		"Length", 
		"Temperature", 
		"Time", 
		"Weight"
		};

	public static String [] length = {
		"Millimeter", 
		"Centimeter", 
		"Meter", 
		"Kilometer", 
		"Mile(s)", 
		"Yard", 
		"Foot", 
		"inch(s)"
		};

	public static String [] temp = {
		"Celsius", 
		"Fahrenheit", 
		"Kelvin"
		};

	public static String [] time = {
		"Milisecond(s)", 
		"Second(s)", 
		"Minute(s)", 
		"Hour(s)", 
		"Day(s)", 
		"Week(s)", 
		"Month(s)", 
		"Year(s)"
		};

	public static String [] weight = {
		"Miligram(s)", 
		"Gram(s)", 
		"Kilogram(s)", 
		"Pound(s)", 
		"Ounce(s)"
		};
	
	
	//ComboBox inputs

	public static void converter() {
		for (int i = 0; i <= converter.length - 1; i++) {
			cb1.addItem(converter [i]);		
		}
	}
	
	public static void Length() {	
		for (int i = 0; i <= length.length - 1; i++) {	
			cb2.addItem(length [i]);
			cb3.addItem(length [i]);	
		}
	}
	
	public static void Temperature() {
		for (int i = 0; i <= temp.length - 1; i++) {	
			cb2.addItem(temp [i]);
			cb3.addItem(temp [i]);	
		}
	}
	
	public static void Time() {	
		for (int i = 0; i <= time.length - 1; i++) {
			cb2.addItem(time [i]);
			cb3.addItem(time [i]);
		}
	}
	
	public static void Weight() {
		for (int i = 0; i <= weight.length - 1; i++) {
			cb2.addItem(weight [i]);
			cb3.addItem(weight [i]);
		}
	}
	
	
	//Computations of length
	
	public static void mm() {	
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [0])) {
				answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum / 10;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum / 1000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [3])) {
			ans = inputNum / 1000000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 1609344;
			answer.setText(String.valueOf(String.format("%.8f", ans)));
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [5])) {
			ans = inputNum / 914.4;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum / 304.8;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [0]) && cb3.getSelectedItem().toString().equals(length [7])) {
			ans = inputNum / 25.4;
			answer.setText(String.valueOf(String.format("%.8f", ans)));		
		}
			
	}
	
		
	public static void cm() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [1])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 10;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum / 100;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum / 100000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 160900;
			answer.setText(String.valueOf(String.format("%.8f", ans)));
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum / 91.44;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum / 30.48;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [1]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum / 2.54;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
	}
	
	
	public static void meter() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 1000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 100;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum / 1000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 1609;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum * 1.094;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum * 3.281;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [2]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum * 39.97;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
			
	}
	
	
	public static void km() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [3])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 1000000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 100000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum * 1000;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 1.609;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum * 1094;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum * 3281;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [3]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum * 39370;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
	}
	
	
	public static void miles() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [4])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 0.000001609;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 160900;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum * 1609;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum * 1.609;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum * 1760;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum * 5280;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [4]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum * 63360;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
			
	}
	
	
	public static void yard() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [5])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 914.4;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 91.44;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum / 1.094;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum / 1094;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 1760;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum * 3;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [5]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum * 36;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
	}
	
	
	public static void foot() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [6])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 304.8;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 30.48;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum / 3.281;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum / 3281;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 1760;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum / 5280;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [6]) && cb3.getSelectedItem().toString().equals(length [7])) {	
			ans = inputNum * 12;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
	}
	
	
	public static void inch() {
		
		double inputNum = Double.parseDouble(box1.getText());
		double ans = 0.0;
		
		if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [7])) {
			answer.setText(String.format("%.8f", inputNum));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [0])) {	
			ans = inputNum * 25.4;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [1])) {	
			ans = inputNum * 2.54;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [2])) {	
			ans = inputNum / 39.37;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [3])) {	
			ans = inputNum / 39370;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [4])) {	
			ans = inputNum / 63360;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [5])) {	
			ans = inputNum / 36;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
		else if (cb2.getSelectedItem().toString().equals(length [7]) && cb3.getSelectedItem().toString().equals(length [6])) {	
			ans = inputNum / 12;
			answer.setText(String.valueOf(String.format("%.8f", ans)));	
		}
		
	}
	
	//Frame
	
	MainFrame() {
		
		frame.setSize(700, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(position.width/2 - frame.getWidth()/2,position.height/2 - frame.getHeight()/2);
		frame.setTitle("Unit Converter");
		frame.setIconImage(logo.getImage());
		frame.getContentPane().setBackground(new Color(0, 32, 63));
		
		
		//Panels
		
		ttlPanel.setBackground(new Color(0, 32, 63));
		ttlPanel.setBounds(40, 17, 460, 70);
		ttlPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 8));
		
		panel1.setBackground(new Color(173, 239, 209));
		panel1.setBounds(22, 110, 640, 300);
		
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(430, 265, 190, 40);
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		
		//Labels
		
		ttl.setText("Unit Converter");
		ttl.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		ttl.setForeground(Color.WHITE);
		ttl.setBounds(125, 12, 400, 80);
		
		text1.setText("Select a Converter:");
		text1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		text1.setForeground(new Color(0, 32, 63));
		text1.setBounds(80, 120, 200, 50);
		
		text2.setText("Convert");
		text2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		text2.setForeground(new Color(0, 32, 63));
		text2.setBounds(100, 217, 200, 50);
		
		text3.setText("Converted Value");
		text3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		text3.setForeground(new Color(0, 32, 63));
		text3.setBounds(438, 217, 200, 50);
		
		//answer.setText("*Answer");
		answer.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 15));
		answer.setForeground(Color.BLACK);
		answer.setBounds(435, 260, 200, 50);
		
		line.setText("___");
		line.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		line.setForeground(new Color(0, 32, 63));
		line.setBounds(300, 195, 300, 50);
		
		ccsLogo.setBounds(570, 5, 100, 100);
		
		
		//TextBox
		
		box1.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 15));
		box1.setForeground(Color.BLACK);
		box1.setBounds(50, 265, 190, 40);
		box1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		
		//ComboBox
				
		cb1.setBounds(300, 128, 230, 35);
		cb1.setFocusable(false);
		cb1.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 15));
		cb1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		cb1.addActionListener(this);
		converter();
		
		cb2.setBounds(50, 185, 190, 35);
		cb2.setFocusable(false);
		cb2.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 15));
		cb2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		cb3.setBounds(430, 185, 190, 35);
		cb3.setFocusable(false);
		cb3.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 15));
		cb3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		
		//Button
		
		compute.setText("Convert");
		compute.setBounds(250, 330, 170, 70);
		compute.setBackground(Color.WHITE);
		compute.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		compute.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 22));
		compute.setForeground(Color.BLACK);
		compute.setFocusable(false);
		compute.addActionListener(this);
		
		
		//Add
		
		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		
		frame.add(ttl);
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(answer);
		frame.add(line);
		frame.add(ccsLogo);
		
		frame.add(box1);
		
		frame.add(compute);
		
		frame.add(panel2);
		frame.add(ttlPanel);
		frame.add(panel1);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (cb1.getSelectedItem().toString().equals(converter [0])) {
			
			Length();
			
		}
			
		else if (cb1.getSelectedItem().toString().equals(converter [1])) {
				
			Temperature();
			
		}
			
		else if (cb1.getSelectedItem().toString().equals(converter [2])) {
			
			Time();
		
		}
			
		else if (cb1.getSelectedItem().toString().equals(converter [3])) {
				
			Weight();
		
		}
		
		if (e.getSource() == compute) {
			
			if (cb1.getSelectedItem().toString().equals(converter [0])) {
				
				mm();
				cm();
				meter();
				km();
				miles();
				yard();
				foot();
				inch();
					
			}		
		}
		
		
		
		
	}


}
