package finalActivities;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String Operation;
		int num1, num2;
		
		System.out.print("Enter a first number: ");
		num1 = read.nextInt();
		
		System.out.print("Enter a second number: ");
		num2 = read.nextInt();
		
		System.out.print("Enter your operation [+, -, *, /]: ");
		Operation = read.next();
		
		if (Operation.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (Operation.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (Operation.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 - num2));
		} else {
			if (num2 == 0) {
				System.out.println("You cannot divide by zero");
			} else {
				System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", ((double)num1 / (double)num2)));
			}
		}
		
	}

}
