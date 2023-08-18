package guiPrac;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener{
	
		JTextField TextB, TextB2, TextB3;
		JButton Button;
	Frame(){
		JFrame JF = new JFrame();
		ImageIcon Logo = new ImageIcon(new ImageIcon("Scara.png").getImage().getScaledInstance(340/2, 340/2, Image.SCALE_SMOOTH));
		Toolkit ToolK = JF.getToolkit();
		Dimension Size = ToolK.getScreenSize();
		JLabel Label = new JLabel();
		TextB = new JTextField();
		TextB2 = new JTextField();
		TextB3 = new JTextField();
		Button = new JButton();
		
		add(Label);
		add(TextB);
		add(TextB2);
		add(TextB3);
		add(Button);
		
		setTitle("Wanderer");
		setSize(500, 500);
		setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
		setVisible(true);
		setResizable(false);
		setIconImage(Logo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.gray);
		
		
		Label.setText("Scaramouche");
		Label.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		Label.setBounds(25, 25, 340/2, 340/2 + 10);
		Label.setForeground(new Color(232, 16, 16));
		Label.setFont(new Font("Sans Serif", Font.BOLD, 20));
		Label.setIcon(Logo);
		Label.setHorizontalTextPosition(JLabel.LEFT);
		Label.setVerticalTextPosition(JLabel.CENTER);
		Label.setBackground(Color.green);
		Label.setOpaque(true);
		Label.setIconTextGap(-20);
		
		TextB.setBounds(25, 220, 150, 30);
		TextB.setForeground(Color.black);
		TextB.setFont(new Font("Sans Serif", Font.BOLD, 20));
		TextB.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		TextB2.setBounds(25, 270, 150, 30);
		TextB2.setForeground(Color.black);
		TextB2.setFont(new Font("Sans Serif", Font.BOLD, 20));
		TextB2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		TextB3.setBounds(25, 320, 150, 30);
		TextB3.setForeground(Color.black);
		TextB3.setFont(new Font("Sans Serif", Font.BOLD, 20));
		TextB3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		TextB3.setEnabled(false);
		
		Button.setBounds(200, 225, 75, 75);
		Button.setText("ADD");
		Button.setForeground(Color.black);
		Button.setFont(new Font("Sans Serif", Font.BOLD, 25));
		Button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		Button.setEnabled(true);
		Button.setFocusable(false);
		Button.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == Button) {
			double TBNum1, TBNum2, sum;
			
			TBNum1 = Double.parseDouble(TextB.getText());
			TBNum2 = Double.parseDouble(TextB2.getText());
			sum = TBNum1 + TBNum2;
			
			TextB3.setText(String.valueOf(String.format("%.2f", sum)));
			
		}
		
	}
	
}
