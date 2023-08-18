package javaprac;
import java.util.Scanner;
public class javaprac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner read = new Scanner(System.in);
			
			String Operator;
			int x, y;
			
			System.out.print("Enter your 1st number: ");
			x = read.nextInt();
			
			System.out.print("Enter your Operator: ");
			Operator = read.next();
			
			System.out.print("Enter your 2nd number: ");
			y = read.nextInt();
			
			
			
			
			switch(Operator){
				case "+":
					System.out.println("The sum of " + x + " and " + y + " equates to " + (x+y));
				break;
				case "-":
					System.out.println("The difference of " + x + " and " + y + " equates to " + (x-y));
				break;
				case "*":
					System.out.println("The product of " + x + " and " + y + " equates to " + (x*y));
				break;
				case "/":
					
					switch (y) {
					case 0:
						System.out.println("Cannot divide by Zero ");
					break;
					default:
						
						double x1, y1;
						x1 = (double) (x);
						y1 = (double) (y);

						System.out.println("The quotient of " + x + " and " + y + " equates to " + String.format("%.2f", (x1/y1)));
					}
					
				break;

				default:
					System.out.println("Wtf is this operator");
				
				
			}
	}

}
