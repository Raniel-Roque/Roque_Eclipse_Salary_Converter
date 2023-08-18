package converter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


//PROGAMMER: ROQUE, RANIEL CHRISTIAN B. BSIT 1A
//DATE: 22/02/2023
//UNIT CONVERTER 

public class MultiSystemFrame extends JFrame implements ActionListener{
	
	ImageIcon Logo = new ImageIcon("Unit_Con.png");
	ImageIcon CCS = new ImageIcon(new ImageIcon("CCS_Logo (1).png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
	JComboBox<String>  Unit, FromUnit, ToUnit;
	JTextField Input, Output;
	JButton Reset, Calculate;
	
	
	//ARRAYS FOR LIST
	String[] UnitMeasurements = {"Area", "Length", "Mass", "Temperature", "Time", "Volume" };
	String[] Area = {"Square Meter [m²]", "Square Kilometer [km²]", "Square Centimeter [cm²]", "Square Millimeter [mm²]",
						"Hectare [ha]", "Square Mile [mi.²]", "Square Yard [yd²]", "Square Foot [ft²]", "Square Inch [in²]", "Acre [ac]",};
	String[] Length = {"Meter [m]", "Kilometer [km]", "Centimeter [cm]", "Millimeter [mm]", 
						"Mile [mi.]", "Yard [yd]", "Foot [ft]", "Inch [in]", "Light Year [ly]"};
	String[] Mass = {"Gram [g]", "Kilogram [kg]", "Milligram [mg]", "Metric Ton [t]", "Imperial Ton [LT]", "US Ton [ST]", 
					"Pound [lb]", "Ounce [oz]", "Carat [ct]", "Atomic Mass Unit [amu]"};
	String[] Temp = {"Celsius [°C]", "Kelvin [K]", "Fahrenheit [°F]"};
	String[] Time = {"Second [s]", "Milisecond [ms]", "Minute [m]", "Hour [h]", "Day [d]", "Week [w]" , "Year [yr]", 
					"Decade [dec]", "Century [c]"};
	String[] Volume = {"Cubic Meter [m³]", "Cubic Kilometer [km³]", "Cubic Centimeter [cm³]", "Cubic Millimeter [mm³]",
						"Liter [L]", "Milliliter [mL]", "US Gallon [gal]", "US Quart [qt]", "US Pint [pt]", "US Cup [c]", "US Fluid Ounce [fl. oz]", "US Tablespoon [tbsp]", "US Teaspoon [tsp]",
						"Imperial Gallon [gal]", "Imperial Quart [qt]", "Imperial Pint [pt]", "Imperial Cup [c]", "Imp. Fluid Ounce [fl. oz]", "Imp. Tablespoon [tbsp]", "Imp. Teaspoon [tsp]", 
						"Cubic Mile [mi.³]", "Cubic Yard [yd³]", "Cubic Foot [ft³]", "Cubic Inch [in³]"};
	
	
	//STRING/NUMBER CHECKING FUNCTION ctto. Mahiwagang Google Amen <3
	
	public static boolean isNumeric(String string) {
	    double doubleValue;
	
	    if(string == null || string.equals("")) {
	        return false;
	    }
	    
	    try {
	    	doubleValue = Double.parseDouble(string);
	        return true;
	        
	    } catch (NumberFormatException e) {
	        
	    }
	    return false;
	    
	}
	
	
	
	MultiSystemFrame(){ //FRAME
		
		//FRAME SETS
		setSize(400, 330);
		setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
		getContentPane().setBackground(Color.decode("#fcd47c"));
		setResizable(false);
		setTitle("Unit Converter");
		setIconImage(Logo.getImage());
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//DECLARE
		Unit = new JComboBox<String>();
		FromUnit = new JComboBox<String>();
		ToUnit = new JComboBox<String>();
		
		JLabel DCT = new JLabel();
		JLabel Title = new JLabel();
		JLabel Subtitle = new JLabel();
		JLabel PickFrom = new JLabel();
		JLabel PickTo = new JLabel();
		JLabel InUnit = new JLabel();
		JLabel Out = new JLabel();
		JLabel Arr = new JLabel();

		Input = new JTextField();
		Output = new JTextField();
		
		Reset = new JButton();
		Calculate = new JButton();
		
		//ADD
		add(Unit);
		add(FromUnit);
		add(ToUnit);
		
		add(DCT);
		add(Title);
		add(Subtitle);
		add(PickFrom);
		add(PickTo);
		add(InUnit);
		add(Out);
		add(Arr);
		
		add(Input);
		add(Output);
		
		add(Reset);
		add(Calculate);
		
		//LABELS
		
		DCT.setBounds(315, 11, 50, 50);
		DCT.setIcon(CCS);
		
		Title.setBounds(10, 3, 350, 50);
		Title.setText("Unit Converter");
		Title.setFont(new Font("Arial", Font.BOLD, 35));
		Title.setHorizontalAlignment(JLabel.LEFT);
		
		Subtitle.setBounds(10, 33, 350, 50);
		Subtitle.setText("Select a Unit of Measurement:");
		Subtitle.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Subtitle.setHorizontalAlignment(JLabel.LEFT);
		
		PickFrom.setBounds(10, 95, 85, 50);
		PickFrom.setText("From: ");
		PickFrom.setFont(new Font("Arial", Font.BOLD, 15));
		
		PickTo.setBounds(162, 95, 100, 50);
		PickTo.setText("To: ");
		PickTo.setHorizontalAlignment(JLabel.CENTER);
		PickTo.setFont(new Font("Arial", Font.BOLD, 15));
		
		InUnit.setBounds(10, 155, 150, 50);
		InUnit.setText("Enter Number: ");
		InUnit.setFont(new Font("Arial", Font.BOLD, 15));
		
		Out.setBounds(180, 155, 100, 50);
		Out.setText("Output: ");
		Out.setHorizontalAlignment(JLabel.CENTER);
		Out.setFont(new Font("Arial", Font.BOLD, 15));
		
		Arr.setBounds(175, 193, 160, 30);
		Arr.setText("→");
		Arr.setFont(new Font(null, Font.BOLD, 25));
		
		//TEXTFIELDS
		
		Input.setBounds(10, 195, 160, 30);
		Input.setFont(new Font("Arial", Font.BOLD, 15));
		
		Output.setBounds(203, 195, 160, 30);
		Output.setFont(new Font("Arial", Font.BOLD, 15));
		Output.setEditable(false);
		
		//BUTTONS 
		
		Calculate.setBounds(10, 240, 160, 30);
		Calculate.setFont(new Font("Arial", Font.BOLD, 15));
		Calculate.setBackground(Color.decode("#b6bfd4"));
		Calculate.setFocusable(false);
		Calculate.setText("CALCULATE");
		Calculate.addActionListener(this);
		
		Reset.setBounds(203, 240, 160, 30);
		Reset.setFont(new Font("Arial", Font.BOLD, 15));
		Reset.setBackground(Color.decode("#b6bfd4"));
		Reset.setFocusable(false);
		Reset.setText("RESET");
		Reset.addActionListener(this);
		
		//LISTS
		Unit.setBounds(10, 73, 365, 30);
		Unit.setFocusable(false);
		Unit.setBackground(Color.decode("#dbd179"));
		Unit.setFont(new Font("Arial", Font.PLAIN, 17));
		Unit.addActionListener(this);
		
		for (int x = 0; x <= UnitMeasurements.length-1; x++) {
			Unit.addItem(UnitMeasurements[x]);
		}
		
		FromUnit.setBounds(10, 135, 175, 25);
		FromUnit.setFocusable(false);
		FromUnit.setBackground(Color.decode("#dbd179"));
		
		//INITIAL VALUES
		for (int x = 0; x <= Area.length-1; x++) {
			FromUnit.addItem(Area[x]);
		}
		
		ToUnit.setBounds(200, 135, 175, 25);
		ToUnit.setFocusable(false);
		ToUnit.setBackground(Color.decode("#dbd179"));
		
		//INITIAL VALUES
		for (int x = 0; x <= Area.length-1; x++) {
			ToUnit.addItem(Area[x]);
		}
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//COMBO BOX LIST
		if (e.getSource().equals(Unit)) {
			
			if (Unit.getSelectedIndex() == 0) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
				
				for (int x = 0; x <= Area.length-1; x++) {
					FromUnit.addItem(Area[x]);
				}
			
				for (int x = 0; x <= Area.length-1; x++) {
					ToUnit.addItem(Area[x]);
				}
			
			} else if (Unit.getSelectedIndex() == 1) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
				
				for (int x = 0; x <= Length.length-1; x++) {
					FromUnit.addItem(Length[x]);
				}
			
				for (int x = 0; x <= Length.length-1; x++) {
					ToUnit.addItem(Length[x]);
				}
				
			} else if (Unit.getSelectedIndex() == 2) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
				
				for (int x = 0; x <= Mass.length-1; x++) {
					FromUnit.addItem(Mass[x]);
				}
			
				for (int x = 0; x <= Mass.length-1; x++) {
					ToUnit.addItem(Mass[x]);
				}
			
			} else if (Unit.getSelectedIndex() == 3) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
				
				for (int x = 0; x <= Temp.length-1; x++) {
					FromUnit.addItem(Temp[x]);
				}
			
				for (int x = 0; x <= Temp.length-1; x++) {
					ToUnit.addItem(Temp[x]);
				}
				
			} else if (Unit.getSelectedIndex() == 4) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
				
				for (int x = 0; x <= Time.length-1; x++) {
					FromUnit.addItem(Time[x]);
				}
			
				for (int x = 0; x <= Time.length-1; x++) {
					ToUnit.addItem(Time[x]);
				}
				
			} else if (Unit.getSelectedIndex() == 5) {
				
				FromUnit.removeAllItems();
				ToUnit.removeAllItems();
					
				for (int x = 0; x <= Volume.length-1; x++) {
					FromUnit.addItem(Volume[x]);
				}
				
				for (int x = 0; x <= Volume.length-1; x++) {
					ToUnit.addItem(Volume[x]);
				}
				
			}
		}
	
			
		//CALCULATIONS
			
		//AREA = "Square Meter [m²]", "Square Kilometer [km²]", "Square Centimeter [cm²]", "Square Millimeter[mm²]","Hectare [ha]", "Square Mile [mi.²]", "Square Yard [yd²]", "Square Foot [ft²]", "Square Inch [in²]", "Acre [ac]",
		//Converts input to square meters then converts to corresponding output selected
		Double[] Aval = {1.0, 0.000001, 10000.0, 1000000.0, 0.0001, 3.8610215854781257E-7, 1.1959900463, 10.763910417, 1550.0031, 0.0002471054};
		
		//LENGTH = "Meter [m]", "Kilometer [km]", "Centimeter [cm]", "Millimeter [mm]", "Mile [mi.]", "Yard [yd]", "Foot [ft]", "Inch [in]", "Light Year [ly]"
		Double[] Lval = {1.0, 0.001, 100.0, 1000.0, 0.000621, 1.094, 3.28084, 39.37, 1.057e-16 };
		
		//MASS = {"Gram [g]", "Kilogram [kg]", "Milligram [mg]", "Metric Ton [t]", "Imperial Ton [LT]", "US Ton [ST]", "Pound [lb]", "Ounce [oz]", "Carat [ct]", "Atomic Mass Unit[amu]"};
		Double[] Mval = {1.0, 0.001, 1000.0, 1e-6, 9.84207e-7, 1.10231e-6, 0.00220462, 0.035274, 5.0, 6.022e+23};
		
		//TEMP = SEPERATE FORMULAS
		
		//TIME = {"Second [s]", "Milisecond [ms]", "Minute [m]", "Hour [h]", "Day [d]", "Week [w]" , "Year [yr]", "Decade [dec]", "Century [c]"};
		Double[] Tval = {1.0, 1000.0, 0.0167, 0.000278, 1.15741e-5, 1.65344285714e-6, 3.170986301364383803e-8, 3.170986301364383638e-9, 3.170986301364383431e-10};		
		
		/*VOLUME = {"Cubic Meter [m³]", "Cubic Kilometer [km³]", "Cubic Centimeter [cm³]", "Cubic Millimeter [mm³]", "Liter [L]", "Milliliter [mL]", 
		  					"US Gallon [gal]", "US Quart [qt]", "US Pint [pt]", "US Cup [c]", "US Fluid Ounce [fl. oz]", "US Tablespoon [tbsp]", "US Teaspoon [tsp]",
							"Imperial Gallon [gal]", "Imperial Quart [qt]", "Imperial Pint [pt]", "Imperial Cup [c]", "Imperial Fluid Ounce [fl. oz]", "Imperial Tablespoon [tbsp]", "Imperial Teaspoon [tsp]", 
							"Cubic Mile [mi.³]", "Cubic Yard [yd³]", "Cubic Foot [ft³]", "Cubic Inch [in³]"};*/
		
		Double[] Vval = {1.0, 1e-9, 1000000.0, 1e+9, 1000.0, 1e+6,
						264.172, 1056.69, 2113.38, 4166.67, 33814.0, 67628.0, 202884.0,
						219.969, 879.877, 1759.75, 3519.51, 35195.1, 56312.1, 168936.0,
						2.39913e-10, 1.347189, 35.3147, 61023.7};
		
		
		//ARRAYS LIST AND VALUE ARE 1:1 USED LATER IN FORMULAS, 1st value is standard unit/basis for formula conversions EXCEPT the temperatures
		
		
		if (e.getSource().equals(Calculate)) {    //Calculate Click
			
			if(isNumeric(Input.getText())) { //Checks Number/String, calls the Method earlier, if number then execute the rest of the code, if not skip to error/dialogue message
				
				double Inp = Double.parseDouble(Input.getText()); //Input to double
				
				//AREA
				if (Unit.getSelectedIndex() == 0) { 
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					Output.setText(String.format("%.8f", (Inp/Aval[x]) * Aval[y]));
				
				//LENGTH
				} else if (Unit.getSelectedIndex() == 1) {
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					Output.setText(String.format("%.8f", (Inp/Lval[x]) * Lval[y]));
				
				//MASS
				} else if (Unit.getSelectedIndex() == 2) {
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					Output.setText(String.format("%.8f", (Inp/Mval[x]) * Mval[y]));
				
				//TEMPERATURE
				} else if (Unit.getSelectedIndex() == 3) {
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					//FORMULAS FOR TEMPERATURE
					if (x == 0 && y == 0) {
						Output.setText(String.format("%.2f", (Inp)));
						
					} else if (x == 0 && y == 1) {
						Output.setText(String.format("%.2f", (Inp + 273.15)));
						
					} else if (x == 0 && y == 2) {
						Output.setText(String.format("%.2f", ((Inp * 9/5) + 32)));
						
					} else if (x == 1 && y == 0) {
						Output.setText(String.format("%.2f", (Inp - 273.15)));
						
					} else if (x == 1 && y == 1) {
						Output.setText(String.format("%.2f", (Inp)));
						
					} else if (x == 1 && y == 2) {
						Output.setText(String.format("%.2f", (((Inp - 273.15)* 9/5) + 32)));
						
					} else if (x == 2 && y == 0) {
						Output.setText(String.format("%.2f", ((Inp - 32) * 5/9)));
						
					} else if (x == 2 && y == 1) {
						Output.setText(String.format("%.2f", ((Inp - 32) * 5/9) + 273.15));
						
					} else if (x == 2 && y == 2) {
						Output.setText(String.format("%.2f", (Inp)));
						
					}
					
					//END OF FORMULA
				
				//TIME
				} else if (Unit.getSelectedIndex() == 4) {
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					Output.setText(String.format("%.8f", (Inp/Tval[x]) * Tval[y]));
					
				//VOLUME
				}  else if (Unit.getSelectedIndex() == 5) {
					
					int x = FromUnit.getSelectedIndex();
					int y = ToUnit.getSelectedIndex();
					
					Output.setText(String.format("%.8f", (Inp/Vval[x]) * Vval[y]));
				}	
				
			} else { 
				
				//ERROR MESSAGE
				JOptionPane.showMessageDialog(null, "Please enter a valid number", "Attention!", JOptionPane.ERROR_MESSAGE);
			}
		
		}
		
		
			//RESET BUTTON
			
			if (e.getSource().equals(Reset)) {
				Output.setText("");
				Input.setText("");
			}
			
			
			
			
	}
}
