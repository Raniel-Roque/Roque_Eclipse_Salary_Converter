package unitConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UnitFormulas extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	Toolkit toolkit = frame.getToolkit();
	Dimension position = toolkit.getScreenSize();
	
	static JTextField box1 = new JTextField();
	static JLabel answer = new JLabel();
	
	JButton compute = new JButton();
	
	static JComboBox<String> cb1 = new JComboBox <String>();
	static JComboBox<String> cb2 = new JComboBox <String>();
	static JComboBox<String> cb3 = new JComboBox <String>();
	
	public static String [] converter = {
			"Length", 
			"Temperature", 
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
		
		
		
		public static void mm() {	
			double inputNum = Double.parseDouble(box1.getText());
			double ans = 0.0;
			
			if (cb2.getSelectedItem().toString().equals("MM") && cb3.getSelectedItem().toString().equals("MM")) {
					answer.setText(String.format("%.8f", inputNum));	
			}
			
			else if (cb2.getSelectedItem().toString().equals("MM") && cb3.getSelectedItem().toString().equals("CM")) {	
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

	UnitFormulas() {
		
		frame.setSize(700, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(position.width/2 - frame.getWidth()/2,position.height/2 - frame.getHeight()/2);
		frame.setTitle("Unit Converter");
		frame.getContentPane().setBackground(new Color(0, 32, 63));
		
		answer.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 15));
		answer.setForeground(Color.BLACK);
		answer.setBounds(435, 260, 200, 50);
		
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
				cb2.addActionListener(this);
				
				cb3.setBounds(430, 185, 190, 35);
				cb3.setFocusable(false);
				cb3.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 15));
				cb3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
				cb3.addActionListener(this);
				
				compute.setText("Convert");
				compute.setBounds(250, 330, 170, 70);
				compute.setBackground(Color.WHITE);
				compute.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				compute.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 22));
				compute.setForeground(Color.BLACK);
				compute.setFocusable(false);
				compute.addActionListener(this);
				
				frame.add(cb1);
				frame.add(cb2);
				frame.add(cb3);
				
				
				frame.add(answer);
				
				frame.add(box1);
				
				frame.add(compute);
				
				
				frame.setLayout(null);
				frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
if (cb1.getSelectedItem().toString().equals(converter [0])) {
	
	cb2.removeAllItems();
	cb2.setSelectedItem(null);
	
	cb3.removeAllItems();
	cb3.setSelectedItem(null);
			
			cb2.addItem("CM");
			cb2.addItem("MM");
			
			cb3.addItem("CM");
			cb3.addItem("MM");
			
		}
			
else if (cb1.getSelectedItem().toString().equals(converter [1])) {
	
	cb2.removeAllItems();
	cb2.setSelectedItem(null);
	
	cb3.removeAllItems();
	cb3.setSelectedItem(null);
				
	cb2.addItem("kM");
	cb2.addItem("kM");
	
	cb3.addItem("vM");
	cb3.addItem("vM");
			
		}

if (e.getSource() == compute) {
	
	if (cb1.getSelectedItem().toString().equals(converter [0])) {
		
		mm();
		cm();
		
			
	}		
}
		
	}

}
