package javaprac;
import java.util.Scanner;
public class javaprac7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int x;
		System.out.print("Enter a number: ");
		x = read.nextInt();
		
		if (x == 0) {
			System.out.println("Zero");
		} else if ((x % 2) == 1 || (x % 2) == -1) {
			System.out.println("Odd cubed: " + String.format("%.0f", Math.pow(x, 3)));
		} else if ((x % 2) == 0) {
			System.out.println("Even cubed: " + String.format("%.0f", Math.pow(x, 2)));
		}
		
	}

}
